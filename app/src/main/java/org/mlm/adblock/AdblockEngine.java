package org.mlm.adblock;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class AdblockEngine implements AutoCloseable {
    static {
        System.loadLibrary("adblock_ffi");
    }

    private static native long nativeCreate();
    private static native void nativeDestroy(long ptr);
    private static native boolean nativeLoadResources(long ptr, String json);
    private static native boolean nativeLoadFilterList(long ptr, String rules);
    private static native String nativeCheckNetworkUrls(long ptr, String url, String sourceUrl, String requestType);

    private final AtomicBoolean closed = new AtomicBoolean(false);
    private long nativePtr;

    private AdblockEngine(long ptr) {
        nativePtr = ptr;
        if (ptr == 0) throw new IllegalStateException("Brave native engine creation failed");
    }

    public static AdblockEngine create() {
        return new AdblockEngine(nativeCreate());
    }

    public synchronized boolean loadResources(String json) {
        if (closed.get()) return false;
        return nativeLoadResources(nativePtr, json);
    }

    public synchronized boolean loadFilterList(String rules) {
        if (closed.get()) return false;
        return nativeLoadFilterList(nativePtr, rules);
    }

    public BlockDecision checkNetworkRequest(String url, String sourceUrl, String requestType) {
        if (closed.get() || nativePtr == 0) return new BlockDecision(false, false, null, null, false);
        try {
            String result = nativeCheckNetworkUrls(nativePtr, url, sourceUrl, requestType);
            if (result == null) return new BlockDecision(false, false, null, null, false);
            JSONObject obj = new JSONObject(result);
            return new BlockDecision(
                obj.optBoolean("matched"),
                obj.optBoolean("important"),
                obj.isNull("redirect") ? null : obj.optString("redirect"),
                obj.isNull("rewritten_url") ? null : obj.optString("rewritten_url"),
                obj.optBoolean("exception")
            );
        } catch (Throwable ignored) {
            return new BlockDecision(false, false, null, null, false);
        }
    }

    @Override
    public synchronized void close() {
        if (closed.compareAndSet(false, true)) {
            long ptr = nativePtr;
            nativePtr = 0;
            if (ptr != 0) nativeDestroy(ptr);
        }
    }
}
