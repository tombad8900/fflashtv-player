package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.q0 */
/* loaded from: classes.dex */
public final class C0232q0 {

    /* renamed from: A */
    public CharSequence f1282A;

    /* renamed from: B */
    public Integer f1283B;

    /* renamed from: C */
    public Integer f1284C;

    /* renamed from: D */
    public CharSequence f1285D;

    /* renamed from: E */
    public CharSequence f1286E;

    /* renamed from: F */
    public CharSequence f1287F;

    /* renamed from: G */
    public Integer f1288G;

    /* renamed from: H */
    public Bundle f1289H;

    /* renamed from: I */
    public AbstractC0983m0 f1290I;

    /* renamed from: a */
    public CharSequence f1291a;

    /* renamed from: b */
    public CharSequence f1292b;

    /* renamed from: c */
    public CharSequence f1293c;

    /* renamed from: d */
    public CharSequence f1294d;

    /* renamed from: e */
    public CharSequence f1295e;

    /* renamed from: f */
    public CharSequence f1296f;

    /* renamed from: g */
    public CharSequence f1297g;

    /* renamed from: h */
    public Long f1298h;

    /* renamed from: i */
    public AbstractC0206h1 f1299i;

    /* renamed from: j */
    public AbstractC0206h1 f1300j;

    /* renamed from: k */
    public byte[] f1301k;

    /* renamed from: l */
    public Integer f1302l;

    /* renamed from: m */
    public Uri f1303m;

    /* renamed from: n */
    public Integer f1304n;

    /* renamed from: o */
    public Integer f1305o;

    /* renamed from: p */
    public Integer f1306p;

    /* renamed from: q */
    public Boolean f1307q;

    /* renamed from: r */
    public Boolean f1308r;

    /* renamed from: s */
    public Integer f1309s;

    /* renamed from: t */
    public Integer f1310t;

    /* renamed from: u */
    public Integer f1311u;

    /* renamed from: v */
    public Integer f1312v;

    /* renamed from: w */
    public Integer f1313w;

    /* renamed from: x */
    public Integer f1314x;

    /* renamed from: y */
    public CharSequence f1315y;

    /* renamed from: z */
    public CharSequence f1316z;

    public C0232q0() {
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        this.f1290I = C0981l1.f4211n;
    }

    /* renamed from: a */
    public final void m660a(byte[] bArr, int i) {
        if (this.f1301k != null) {
            Integer numValueOf = Integer.valueOf(i);
            int i4 = AbstractC1118i0.f4750a;
            if (!numValueOf.equals(3) && Objects.equals(this.f1302l, 3)) {
                return;
            }
        }
        this.f1301k = (byte[]) bArr.clone();
        this.f1302l = Integer.valueOf(i);
    }
}
