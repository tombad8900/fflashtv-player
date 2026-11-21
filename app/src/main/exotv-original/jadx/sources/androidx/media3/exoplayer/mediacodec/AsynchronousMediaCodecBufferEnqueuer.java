package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p063h1.AbstractC1118i0;
import p063h1.C1109e;
import p106m1.C1868c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final MediaCodec codec;
    private final C1109e conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque<>();
    private static final Object QUEUE_SECURE_LOCK = new Object();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void setQueueParams(int i, int i4, int i8, long j, int i9) {
            this.index = i;
            this.offset = i4;
            this.size = i8;
            this.presentationTimeUs = j;
            this.flags = i9;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1109e());
    }

    private void blockUntilHandlerThreadIsIdle() {
        C1109e c1109e = this.conditionVariable;
        synchronized (c1109e) {
            c1109e.f4731a = false;
        }
        Handler handler = this.handler;
        handler.getClass();
        handler.obtainMessage(3).sendToTarget();
        this.conditionVariable.m2403a();
    }

    private static void copy(C1868c c1868c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c1868c.f6973f;
        cryptoInfo.numBytesOfClearData = copy(c1868c.f6971d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = copy(c1868c.f6972e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrCopy = copy(c1868c.f6969b, cryptoInfo.key);
        bArrCopy.getClass();
        cryptoInfo.key = bArrCopy;
        byte[] bArrCopy2 = copy(c1868c.f6968a, cryptoInfo.iv);
        bArrCopy2.getClass();
        cryptoInfo.iv = bArrCopy2;
        cryptoInfo.mode = c1868c.f6970c;
        if (AbstractC1118i0.f4750a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c1868c.f6974g, c1868c.f6975h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doHandleMessage(Message message) throws MediaCodec.CryptoException {
        MessageParams messageParams;
        MessageParams messageParams2;
        int i = message.what;
        if (i == 1) {
            messageParams = (MessageParams) message.obj;
            doQueueInputBuffer(messageParams.index, messageParams.offset, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
        } else {
            if (i != 2) {
                messageParams2 = null;
                if (i == 3) {
                    this.conditionVariable.m2405c();
                } else if (i != 4) {
                    AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    doSetParameters((Bundle) message.obj);
                }
                if (messageParams2 == null) {
                    recycleMessageParams(messageParams2);
                    return;
                }
                return;
            }
            messageParams = (MessageParams) message.obj;
            doQueueSecureInputBuffer(messageParams.index, messageParams.offset, messageParams.cryptoInfo, messageParams.presentationTimeUs, messageParams.flags);
        }
        messageParams2 = messageParams;
        if (messageParams2 == null) {
        }
    }

    private void doQueueInputBuffer(int i, int i4, int i8, long j, int i9) throws MediaCodec.CryptoException {
        try {
            this.codec.queueInputBuffer(i, i4, i8, j, i9);
        } catch (RuntimeException e) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    private void doQueueSecureInputBuffer(int i, int i4, MediaCodec.CryptoInfo cryptoInfo, long j, int i8) {
        try {
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i, i4, cryptoInfo, j, i8);
            }
        } catch (RuntimeException e) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    private void doSetParameters(Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (RuntimeException e) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    private void flushHandlerThread() {
        Handler handler = this.handler;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static MessageParams getMessageParams() {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(MessageParams messageParams) {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void maybeThrowException() {
        RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueInputBuffer(int i, int i4, int i8, long j, int i9) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i4, i8, j, i9);
        Handler handler = this.handler;
        int i10 = AbstractC1118i0.f4750a;
        handler.obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueSecureInputBuffer(int i, int i4, C1868c c1868c, long j, int i8) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i4, 0, j, i8);
        copy(c1868c, messageParams.cryptoInfo);
        Handler handler = this.handler;
        int i9 = AbstractC1118i0.f4750a;
        handler.obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        Handler handler = this.handler;
        int i = AbstractC1118i0.f4750a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    public void setPendingRuntimeException(RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) throws MediaCodec.CryptoException {
                AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void waitUntilQueueingComplete() {
        blockUntilHandlerThreadIsIdle();
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, C1109e c1109e) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = c1109e;
        this.pendingRuntimeException = new AtomicReference<>();
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
