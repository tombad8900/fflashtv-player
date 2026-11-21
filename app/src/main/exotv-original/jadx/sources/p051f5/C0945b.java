package p051f5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C0249w;
import java.util.ArrayList;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p064h2.InterfaceC1138c;
import p071i1.C1224c;
import p199x.AbstractC2730q;
import p199x.C2727n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class C0945b implements InterfaceC1138c {

    /* renamed from: j */
    public int f4152j;

    /* renamed from: k */
    public int f4153k;

    /* renamed from: l */
    public final Object f4154l;

    public C0945b(View view) {
        this.f4154l = view;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: a */
    public int mo1856a() {
        return this.f4152j;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: b */
    public int mo1857b() {
        return this.f4153k;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: c */
    public int mo1858c() {
        int i = this.f4152j;
        return i == -1 ? ((C1132w) this.f4154l).m2539y() : i;
    }

    public C0945b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f4154l = new ArrayList();
        this.f4153k = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2730q.f10095h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4152j = typedArrayObtainStyledAttributes.getResourceId(index, this.f4152j);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4153k);
                this.f4153k = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2727n().m4802b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0945b(byte[] bArr, int i, int i4) {
        this.f4154l = bArr;
        this.f4152j = i;
        this.f4153k = i4;
    }

    public C0945b(int i, int i4, SparseArray sparseArray) {
        this.f4152j = i;
        this.f4153k = i4;
        this.f4154l = sparseArray;
    }

    public C0945b(C1224c c1224c, C0249w c0249w) {
        C1132w c1132w = c1224c.f5112c;
        this.f4154l = c1132w;
        c1132w.m2513G(12);
        int iM2539y = c1132w.m2539y();
        if ("audio/raw".equals(c0249w.f1522n)) {
            int iM2414E = AbstractC1118i0.m2414E(c0249w.f1500E, c0249w.f1498C);
            if (iM2539y == 0 || iM2539y % iM2414E != 0) {
                AbstractC1101a.m2348F("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iM2414E + ", stsz sample size: " + iM2539y);
                iM2539y = iM2414E;
            }
        }
        this.f4152j = iM2539y == 0 ? -1 : iM2539y;
        this.f4153k = c1132w.m2539y();
    }
}
