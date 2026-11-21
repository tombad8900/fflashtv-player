package p175u0;

import p092k5.C1606e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C2455g {

    /* renamed from: a */
    public double f9006a;

    /* renamed from: b */
    public double f9007b;

    /* renamed from: c */
    public boolean f9008c;

    /* renamed from: d */
    public double f9009d;

    /* renamed from: e */
    public double f9010e;

    /* renamed from: f */
    public double f9011f;

    /* renamed from: g */
    public double f9012g;

    /* renamed from: h */
    public double f9013h;

    /* renamed from: i */
    public double f9014i;

    /* renamed from: j */
    public final C1606e f9015j;

    public C2455g() {
        this.f9006a = Math.sqrt(1500.0d);
        this.f9007b = 0.5d;
        this.f9008c = false;
        this.f9014i = Double.MAX_VALUE;
        this.f9015j = new C1606e();
    }

    /* renamed from: a */
    public final C1606e m4434a(double d8, double d9, long j) {
        double dSin;
        double dCos;
        if (!this.f9008c) {
            if (this.f9014i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.f9007b;
            if (d10 > 1.0d) {
                double d11 = this.f9006a;
                this.f9011f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.f9007b;
                double d13 = this.f9006a;
                this.f9012g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f9013h = Math.sqrt(1.0d - (d10 * d10)) * this.f9006a;
            }
            this.f9008c = true;
        }
        double d14 = j / 1000.0d;
        double d15 = d8 - this.f9014i;
        double d16 = this.f9007b;
        if (d16 > 1.0d) {
            double d17 = this.f9012g;
            double d18 = ((d17 * d15) - d9) / (d17 - this.f9011f);
            double d19 = d15 - d18;
            dSin = (Math.pow(2.718281828459045d, this.f9011f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f9012g;
            double dPow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f9011f;
            dCos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + dPow;
        } else if (d16 == 1.0d) {
            double d22 = this.f9006a;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double dPow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f9006a) * d14) * d24;
            double d25 = -this.f9006a;
            dCos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (dPow3 * d25);
            dSin = dPow2;
        } else {
            double d26 = 1.0d / this.f9013h;
            double d27 = this.f9006a;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            dSin = ((Math.sin(this.f9013h * d14) * d28) + (Math.cos(this.f9013h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f9006a;
            double d30 = this.f9007b;
            double d31 = (-d29) * dSin * d30;
            double dPow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.f9013h;
            double dSin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.f9013h;
            dCos = (((Math.cos(d33 * d14) * d28 * d33) + dSin2) * dPow4) + d31;
        }
        float f8 = (float) (dSin + this.f9014i);
        C1606e c1606e = this.f9015j;
        c1606e.f6106a = f8;
        c1606e.f6107b = (float) dCos;
        return c1606e;
    }

    public C2455g(float f8) {
        this.f9006a = Math.sqrt(1500.0d);
        this.f9007b = 0.5d;
        this.f9008c = false;
        this.f9015j = new C1606e();
        this.f9014i = f8;
    }
}
