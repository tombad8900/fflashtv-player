package p085j6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.o */
/* loaded from: classes.dex */
public final class EnumC1525o implements Executor {

    /* renamed from: j */
    public static final EnumC1525o f5844j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1525o[] f5845k;

    static {
        EnumC1525o enumC1525o = new EnumC1525o("INSTANCE", 0);
        f5844j = enumC1525o;
        f5845k = new EnumC1525o[]{enumC1525o};
    }

    public static EnumC1525o valueOf(String str) {
        return (EnumC1525o) Enum.valueOf(EnumC1525o.class, str);
    }

    public static EnumC1525o[] values() {
        return (EnumC1525o[]) f5845k.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
