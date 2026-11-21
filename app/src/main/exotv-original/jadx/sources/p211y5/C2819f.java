package p211y5;

import android.graphics.Bitmap;
import android.graphics.Path;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p005a4.C0073c;
import p005a4.C0078e0;
import p015b4.InterfaceC0567a;
import p023c4.C0645i;
import p023c4.InterfaceC0637a;
import p041e4.C0891h;
import p041e4.C0907x;
import p041e4.C0909z;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p066h4.InterfaceC1180n;
import p072i2.InterfaceC1247g;
import p089k1.C1574r;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p115n1.C1992s;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1988o;
import p186v4.InterfaceC2545a;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.f */
/* loaded from: classes.dex */
public class C2819f implements InterfaceC2545a, InterfaceC0567a, InterfaceC0637a, InterfaceC0902s, InterfaceC1180n, InterfaceC1247g, InterfaceC1563g {

    /* renamed from: j */
    public final /* synthetic */ int f10457j;

    public /* synthetic */ C2819f(int i) {
        this.f10457j = i;
    }

    /* renamed from: o */
    public static final int m4927o(int i) {
        return (i & 2) != 0 ? i | 64 : i;
    }

    /* renamed from: p */
    public static Path m4928p(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f8, f9);
        path.lineTo(f10, f11);
        return path;
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: a */
    public void mo1307a(int i) {
    }

    @Override // p023c4.InterfaceC0637a
    /* renamed from: b */
    public File mo1420b(InterfaceC2801e interfaceC2801e) {
        return null;
    }

    @Override // p066h4.InterfaceC1180n
    /* renamed from: c */
    public void mo46c(Bitmap bitmap, InterfaceC0567a interfaceC0567a) {
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: d */
    public Bitmap mo1308d(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    /* renamed from: e */
    public void mo1309e(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p186v4.InterfaceC2545a
    /* renamed from: f */
    public Object mo167f() {
        switch (this.f10457j) {
            case 4:
                return new C0078e0();
            default:
                try {
                    return new C0645i(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        return new C0909z(c0907x.m2070a(C0891h.class, InputStream.class), 1);
    }

    @Override // p023c4.InterfaceC0637a
    /* renamed from: h */
    public void mo1421h(InterfaceC2801e interfaceC2801e, C0073c c0073c) {
    }

    @Override // p066h4.InterfaceC1180n
    /* renamed from: i */
    public void mo52i() {
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: j */
    public InterfaceC1968c0 mo2543j() {
        return new C1992s(-9223372036854775807L);
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: k */
    public Bitmap mo1310k(int i, int i4, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i4, config);
    }

    @Override // p089k1.InterfaceC1563g
    /* renamed from: l */
    public InterfaceC1564h mo55l() {
        return new C1574r(false);
    }

    @Override // p015b4.InterfaceC0567a
    /* renamed from: m */
    public void mo1311m() {
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: n */
    public void mo2544n(long j) {
    }

    @Override // p072i2.InterfaceC1247g
    public long read(InterfaceC1988o interfaceC1988o) {
        return -1L;
    }
}
