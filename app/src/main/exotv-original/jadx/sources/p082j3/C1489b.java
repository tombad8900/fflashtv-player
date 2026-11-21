package p082j3;

import java.io.IOException;
import java.util.ArrayList;
import p189v7.C2558b0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j3.b */
/* loaded from: classes.dex */
public final class C1489b {

    /* renamed from: a */
    public final String f5725a;

    /* renamed from: b */
    public final long[] f5726b = new long[2];

    /* renamed from: c */
    public final ArrayList f5727c = new ArrayList(2);

    /* renamed from: d */
    public final ArrayList f5728d = new ArrayList(2);

    /* renamed from: e */
    public boolean f5729e;

    /* renamed from: f */
    public boolean f5730f;

    /* renamed from: g */
    public C1488a f5731g;

    /* renamed from: h */
    public int f5732h;

    /* renamed from: i */
    public final /* synthetic */ C1493f f5733i;

    public C1489b(C1493f c1493f, String str) {
        this.f5733i = c1493f;
        this.f5725a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f5727c.add(this.f5733i.f5741j.m4590d(sb.toString()));
            sb.append(".tmp");
            this.f5728d.add(this.f5733i.f5741j.m4590d(sb.toString()));
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final C1490c m3154a() {
        if (!this.f5729e || this.f5731g != null || this.f5730f) {
            return null;
        }
        ArrayList arrayList = this.f5727c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C1493f c1493f = this.f5733i;
            if (i >= size) {
                this.f5732h++;
                return new C1490c(c1493f, this);
            }
            if (!c1493f.f5756y.m4678f((C2558b0) arrayList.get(i))) {
                try {
                    c1493f.m3168F(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
