package p200x0;

import android.text.Editable;
import p183v0.C2521u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C2733a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f10100a = new Object();

    /* renamed from: b */
    public static volatile C2733a f10101b;

    /* renamed from: c */
    public static Class f10102c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f10102c;
        return cls != null ? new C2521u(cls, charSequence) : super.newEditable(charSequence);
    }
}
