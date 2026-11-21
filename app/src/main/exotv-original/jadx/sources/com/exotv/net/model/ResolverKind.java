package com.exotv.net.model;

import android.support.v4.media.session.AbstractC0120b;
import p163s6.InterfaceC2376a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ResolverKind {
    private static final /* synthetic */ InterfaceC2376a $ENTRIES;
    private static final /* synthetic */ ResolverKind[] $VALUES;
    public static final ResolverKind BACKUP = new ResolverKind("BACKUP", 0);
    public static final ResolverKind YTV = new ResolverKind("YTV", 1);

    /* renamed from: O */
    public static final ResolverKind f3035O = new ResolverKind("O", 2);
    public static final ResolverKind GEN = new ResolverKind("GEN", 3);
    public static final ResolverKind DEFAULT = new ResolverKind("DEFAULT", 4);

    private static final /* synthetic */ ResolverKind[] $values() {
        return new ResolverKind[]{BACKUP, YTV, f3035O, GEN, DEFAULT};
    }

    static {
        ResolverKind[] resolverKindArr$values = $values();
        $VALUES = resolverKindArr$values;
        $ENTRIES = AbstractC0120b.m421q(resolverKindArr$values);
    }

    private ResolverKind(String str, int i) {
    }

    public static InterfaceC2376a getEntries() {
        return $ENTRIES;
    }

    public static ResolverKind valueOf(String str) {
        return (ResolverKind) Enum.valueOf(ResolverKind.class, str);
    }

    public static ResolverKind[] values() {
        return (ResolverKind[]) $VALUES.clone();
    }
}
