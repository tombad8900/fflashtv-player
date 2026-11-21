package p168t2;

import android.view.View;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p183v0.AbstractC2506f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.x */
/* loaded from: classes.dex */
public final class C2430x {

    /* renamed from: a */
    public final /* synthetic */ int f8758a = 1;

    /* renamed from: b */
    public int f8759b;

    /* renamed from: c */
    public int f8760c;

    /* renamed from: d */
    public boolean f8761d;

    /* renamed from: e */
    public boolean f8762e;

    /* renamed from: f */
    public Object f8763f;

    public C2430x(int i) {
        this.f8759b = i;
        byte[] bArr = new byte[131];
        this.f8763f = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m4316a(byte[] bArr, int i, int i4) {
        if (this.f8761d) {
            int i8 = i4 - i;
            byte[] bArr2 = (byte[]) this.f8763f;
            int length = bArr2.length;
            int i9 = this.f8760c;
            if (length < i9 + i8) {
                this.f8763f = Arrays.copyOf(bArr2, (i9 + i8) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f8763f, this.f8760c, i8);
            this.f8760c += i8;
        }
    }

    /* renamed from: b */
    public void m4317b() {
        this.f8760c = this.f8761d ? ((AbstractC2506f) this.f8763f).mo4512g() : ((AbstractC2506f) this.f8763f).mo4516k();
    }

    /* renamed from: c */
    public void m4318c(View view, int i) {
        if (this.f8761d) {
            int iMo4507b = ((AbstractC2506f) this.f8763f).mo4507b(view);
            AbstractC2506f abstractC2506f = (AbstractC2506f) this.f8763f;
            this.f8760c = (Integer.MIN_VALUE == abstractC2506f.f9138a ? 0 : abstractC2506f.mo4517l() - abstractC2506f.f9138a) + iMo4507b;
        } else {
            this.f8760c = ((AbstractC2506f) this.f8763f).mo4510e(view);
        }
        this.f8759b = i;
    }

    /* renamed from: d */
    public void m4319d(View view, int i) {
        AbstractC2506f abstractC2506f = (AbstractC2506f) this.f8763f;
        int iMo4517l = Integer.MIN_VALUE == abstractC2506f.f9138a ? 0 : abstractC2506f.mo4517l() - abstractC2506f.f9138a;
        if (iMo4517l >= 0) {
            m4318c(view, i);
            return;
        }
        this.f8759b = i;
        if (!this.f8761d) {
            int iMo4510e = ((AbstractC2506f) this.f8763f).mo4510e(view);
            int iMo4516k = iMo4510e - ((AbstractC2506f) this.f8763f).mo4516k();
            this.f8760c = iMo4510e;
            if (iMo4516k > 0) {
                int iMo4512g = (((AbstractC2506f) this.f8763f).mo4512g() - Math.min(0, (((AbstractC2506f) this.f8763f).mo4512g() - iMo4517l) - ((AbstractC2506f) this.f8763f).mo4507b(view))) - (((AbstractC2506f) this.f8763f).mo4508c(view) + iMo4510e);
                if (iMo4512g < 0) {
                    this.f8760c -= Math.min(iMo4516k, -iMo4512g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo4512g2 = (((AbstractC2506f) this.f8763f).mo4512g() - iMo4517l) - ((AbstractC2506f) this.f8763f).mo4507b(view);
        this.f8760c = ((AbstractC2506f) this.f8763f).mo4512g() - iMo4512g2;
        if (iMo4512g2 > 0) {
            int iMo4508c = this.f8760c - ((AbstractC2506f) this.f8763f).mo4508c(view);
            int iMo4516k2 = ((AbstractC2506f) this.f8763f).mo4516k();
            int iMin = iMo4508c - (Math.min(((AbstractC2506f) this.f8763f).mo4510e(view) - iMo4516k2, 0) + iMo4516k2);
            if (iMin < 0) {
                this.f8760c = Math.min(iMo4512g2, -iMin) + this.f8760c;
            }
        }
    }

    /* renamed from: e */
    public boolean m4320e(int i) {
        if (!this.f8761d) {
            return false;
        }
        this.f8760c -= i;
        this.f8761d = false;
        this.f8762e = true;
        return true;
    }

    /* renamed from: f */
    public final void m4321f() {
        switch (this.f8758a) {
            case 0:
                this.f8761d = false;
                this.f8762e = false;
                break;
            default:
                this.f8759b = -1;
                this.f8760c = Integer.MIN_VALUE;
                this.f8761d = false;
                this.f8762e = false;
                break;
        }
    }

    /* renamed from: g */
    public void m4322g(int i) {
        AbstractC1101a.m2359j(!this.f8761d);
        boolean z7 = i == this.f8759b;
        this.f8761d = z7;
        if (z7) {
            this.f8760c = 3;
            this.f8762e = false;
        }
    }

    public String toString() {
        switch (this.f8758a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f8759b + ", mCoordinate=" + this.f8760c + ", mLayoutFromEnd=" + this.f8761d + ", mValid=" + this.f8762e + '}';
            default:
                return super.toString();
        }
    }

    public C2430x() {
        m4321f();
    }
}
