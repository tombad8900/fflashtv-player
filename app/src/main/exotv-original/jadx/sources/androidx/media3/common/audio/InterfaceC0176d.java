package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.d */
/* loaded from: classes.dex */
public interface InterfaceC0176d {

    /* renamed from: a */
    public static final ByteBuffer f985a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    C0174b configure(C0174b c0174b);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
