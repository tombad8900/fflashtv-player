package p057g2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p013b2.InterfaceC0555g;
import p043e6.InterfaceC0916d;
import p056g1.AbstractC1031d;
import p056g1.C1029b;
import p056g1.C1032e;
import p056g1.C1034g;
import p056g1.C1035h;
import p056g1.C1036i;
import p063h1.AbstractC1101a;
import p064h2.C1152q;
import p090k2.C1585c;
import p097l1.InterfaceC1648d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1040d implements InterfaceC0555g, InterfaceC0916d, InterfaceC1648d {

    /* renamed from: j */
    public final /* synthetic */ int f4421j;

    public /* synthetic */ C1040d(int i) {
        this.f4421j = i;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m2233d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02eb  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // p043e6.InterfaceC0916d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmapDecodeByteArray;
        float f8;
        int i;
        float f9;
        int i4;
        int i8;
        boolean z7;
        int i9 = 2;
        int i10 = 1;
        switch (this.f4421j) {
            case 5:
                return (C1152q) obj;
            case 12:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(C1029b.f4361r);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1029b.f4362s);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = parcelableArrayList.get(i11);
                            i11++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i12 = bundle2.getInt(AbstractC1031d.f4389a);
                            int i13 = bundle2.getInt(AbstractC1031d.f4390b);
                            int i14 = bundle2.getInt(AbstractC1031d.f4391c);
                            int i15 = bundle2.getInt(AbstractC1031d.f4392d, -1);
                            Bundle bundle3 = bundle2.getBundle(AbstractC1031d.f4393e);
                            if (i15 == i10) {
                                bundle3.getClass();
                                String string = bundle3.getString(C1034g.f4394c);
                                string.getClass();
                                charSequence2.setSpan(new C1034g(string, bundle3.getInt(C1034g.f4395d)), i12, i13, i14);
                            } else if (i15 == i9) {
                                bundle3.getClass();
                                charSequence2.setSpan(new C1035h(bundle3.getInt(C1035h.f4398d), bundle3.getInt(C1035h.f4399e), bundle3.getInt(C1035h.f4400f)), i12, i13, i14);
                            } else if (i15 == 3) {
                                charSequence2.setSpan(new C1032e(), i12, i13, i14);
                            } else if (i15 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(C1036i.f4404b);
                                string2.getClass();
                                charSequence2.setSpan(new C1036i(string2), i12, i13, i14);
                            }
                            i9 = 2;
                            i10 = 1;
                        }
                    }
                    charSequence = charSequence2;
                } else {
                    charSequence = null;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C1029b.f4363t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C1029b.f4364u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C1029b.f4365v);
                if (bitmap != null) {
                    bitmapDecodeByteArray = bitmap;
                } else {
                    byte[] byteArray = bundle.getByteArray(C1029b.f4366w);
                    bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length) : null;
                }
                String str = C1029b.f4367x;
                if (bundle.containsKey(str)) {
                    String str2 = C1029b.f4368y;
                    if (bundle.containsKey(str2)) {
                        f8 = bundle.getFloat(str);
                        i = bundle.getInt(str2);
                    } else {
                        f8 = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                }
                String str3 = C1029b.f4369z;
                int i16 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C1029b.f4351A;
                float f10 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C1029b.f4352B;
                int i17 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C1029b.f4354D;
                if (bundle.containsKey(str6)) {
                    String str7 = C1029b.f4353C;
                    if (bundle.containsKey(str7)) {
                        f9 = bundle.getFloat(str6);
                        i4 = bundle.getInt(str7);
                    } else {
                        f9 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                }
                String str8 = C1029b.f4355E;
                float f11 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C1029b.f4356F;
                float f12 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C1029b.f4357G;
                if (bundle.containsKey(str10)) {
                    i8 = bundle.getInt(str10);
                    z7 = true;
                } else {
                    i8 = -16777216;
                    z7 = false;
                }
                int i18 = i8;
                boolean z8 = !bundle.getBoolean(C1029b.f4358H, false) ? false : z7;
                String str11 = C1029b.f4359I;
                int i19 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C1029b.f4360J;
                return new C1029b(charSequence, alignment2, alignment4, bitmapDecodeByteArray, f8, i, i16, f10, i17, i4, f9, f11, f12, z8, i18, i19, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            case 13:
                C1029b c1029b = (C1029b) obj;
                Bitmap bitmap2 = c1029b.f4373d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence3 = c1029b.f4370a;
                if (charSequence3 != null) {
                    bundle4.putCharSequence(C1029b.f4361r, charSequence3);
                    if (charSequence3 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence3;
                        String str13 = AbstractC1031d.f4389a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (C1034g c1034g : (C1034g[]) spanned.getSpans(0, spanned.length(), C1034g.class)) {
                            c1034g.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(C1034g.f4394c, c1034g.f4396a);
                            bundle5.putInt(C1034g.f4395d, c1034g.f4397b);
                            arrayList.add(AbstractC1031d.m2227a(spanned, c1034g, 1, bundle5));
                        }
                        for (C1035h c1035h : (C1035h[]) spanned.getSpans(0, spanned.length(), C1035h.class)) {
                            c1035h.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(C1035h.f4398d, c1035h.f4401a);
                            bundle6.putInt(C1035h.f4399e, c1035h.f4402b);
                            bundle6.putInt(C1035h.f4400f, c1035h.f4403c);
                            arrayList.add(AbstractC1031d.m2227a(spanned, c1035h, 2, bundle6));
                        }
                        for (C1032e c1032e : (C1032e[]) spanned.getSpans(0, spanned.length(), C1032e.class)) {
                            arrayList.add(AbstractC1031d.m2227a(spanned, c1032e, 3, null));
                        }
                        for (C1036i c1036i : (C1036i[]) spanned.getSpans(0, spanned.length(), C1036i.class)) {
                            c1036i.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(C1036i.f4404b, c1036i.f4405a);
                            arrayList.add(AbstractC1031d.m2227a(spanned, c1036i, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(C1029b.f4362s, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(C1029b.f4363t, c1029b.f4371b);
                bundle4.putSerializable(C1029b.f4364u, c1029b.f4372c);
                bundle4.putFloat(C1029b.f4367x, c1029b.f4374e);
                bundle4.putInt(C1029b.f4368y, c1029b.f4375f);
                bundle4.putInt(C1029b.f4369z, c1029b.f4376g);
                bundle4.putFloat(C1029b.f4351A, c1029b.f4377h);
                bundle4.putInt(C1029b.f4352B, c1029b.f4378i);
                bundle4.putInt(C1029b.f4353C, c1029b.f4383n);
                bundle4.putFloat(C1029b.f4354D, c1029b.f4384o);
                bundle4.putFloat(C1029b.f4355E, c1029b.f4379j);
                bundle4.putFloat(C1029b.f4356F, c1029b.f4380k);
                bundle4.putBoolean(C1029b.f4358H, c1029b.f4381l);
                bundle4.putInt(C1029b.f4357G, c1029b.f4382m);
                bundle4.putInt(C1029b.f4359I, c1029b.f4385p);
                bundle4.putFloat(C1029b.f4360J, c1029b.f4386q);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC1101a.m2359j(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(C1029b.f4366w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            default:
                long j = ((C1585c) obj).f6054b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // p013b2.InterfaceC0555g
    /* renamed from: b */
    public boolean mo647b(int i, int i4, int i8, int i9, int i10) {
        if (i4 == 67 && i8 == 79 && i9 == 77 && (i10 == 77 || i == 2)) {
            return true;
        }
        if (i4 == 77 && i8 == 76 && i9 == 76) {
            return i10 == 84 || i == 2;
        }
        return false;
    }
}
