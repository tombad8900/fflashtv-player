package p052f6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.z0 */
/* loaded from: classes.dex */
public final class EnumC1022z0 implements Iterator {

    /* renamed from: j */
    public static final EnumC1022z0 f4306j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1022z0[] f4307k;

    static {
        EnumC1022z0 enumC1022z0 = new EnumC1022z0("INSTANCE", 0);
        f4306j = enumC1022z0;
        f4307k = new EnumC1022z0[]{enumC1022z0};
    }

    public static EnumC1022z0 valueOf(String str) {
        return (EnumC1022z0) Enum.valueOf(EnumC1022z0.class, str);
    }

    public static EnumC1022z0[] values() {
        return (EnumC1022z0[]) f4307k.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
