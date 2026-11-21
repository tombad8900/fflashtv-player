package p069h7;

import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p006a5.C0106a;
import p044e7.C0926c;
import p102l6.C1687d;
import p102l6.C1693j;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C1215q implements InterfaceC2855p {

    /* renamed from: j */
    public final /* synthetic */ int f5095j;

    /* renamed from: k */
    public final /* synthetic */ Object f5096k;

    public /* synthetic */ C1215q(int i, Object obj) {
        this.f5095j = i;
        this.f5096k = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo576c(Object obj, Object obj2) {
        int i;
        Object next;
        C1687d c1687d;
        Object next2;
        switch (this.f5095j) {
            case 0:
                char[] cArr = (char[]) this.f5096k;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC2980h.m5136e("$this$DelimitedRangesSequence", charSequence);
                int iM2629C0 = AbstractC1206h.m2629C0(charSequence, cArr, iIntValue, false);
                if (iM2629C0 < 0) {
                    return null;
                }
                return new C1687d(Integer.valueOf(iM2629C0), 1);
            case 1:
                List list = (List) this.f5096k;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC2980h.m5136e("$this$DelimitedRangesSequence", charSequence2);
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int iM2628B0 = AbstractC1206h.m2628B0(charSequence2, str, iIntValue2, false, 4);
                    c1687d = iM2628B0 < 0 ? null : new C1687d(Integer.valueOf(iM2628B0), str);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    C0926c c0926c = new C0926c(iIntValue2, charSequence2.length(), 1);
                    boolean z7 = charSequence2 instanceof String;
                    int i4 = c0926c.f3988l;
                    int i8 = c0926c.f3987k;
                    if (z7) {
                        if ((i4 > 0 && iIntValue2 <= i8) || (i4 < 0 && i8 <= iIntValue2)) {
                            int i9 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (AbstractC1214p.m2662o0(0, i9, str2.length(), str2, (String) charSequence2, false)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    c1687d = new C1687d(Integer.valueOf(i9), str3);
                                } else if (i9 != i8) {
                                    i9 += i4;
                                }
                            }
                        }
                    } else if ((i4 > 0 && iIntValue2 <= i8) || (i4 < 0 && i8 <= iIntValue2)) {
                        int i10 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    i = i8;
                                    if (!AbstractC1206h.m2634H0(str4, 0, charSequence2, i10, str4.length(), false)) {
                                        i8 = i;
                                    }
                                } else {
                                    i = i8;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c1687d = new C1687d(Integer.valueOf(i10), str5);
                            } else if (i10 != i) {
                                i10 += i4;
                                i8 = i;
                            }
                        }
                    }
                }
                if (c1687d != null) {
                    return new C1687d(c1687d.f6486j, Integer.valueOf(((String) c1687d.f6487k).length()));
                }
                return null;
            default:
                MainActivity mainActivity = (MainActivity) this.f5096k;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (jLongValue2 <= 0) {
                    C0106a c0106a = mainActivity.f2892P;
                    if (c0106a == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a.f505f.setIndeterminate(true);
                    C0106a c0106a2 = mainActivity.f2892P;
                    if (c0106a2 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a2.f504e.setText(mainActivity.getString(R.string.downloading));
                } else {
                    C0106a c0106a3 = mainActivity.f2892P;
                    if (c0106a3 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a3.f505f.setIndeterminate(false);
                    int iM1534t = AbstractC0714c.m1534t((int) ((jLongValue * 100) / jLongValue2), 0, 100);
                    C0106a c0106a4 = mainActivity.f2892P;
                    if (c0106a4 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a4.f505f.setProgress(iM1534t);
                    C0106a c0106a5 = mainActivity.f2892P;
                    if (c0106a5 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a5.f504e.setText(mainActivity.getString(R.string.download_percent, Integer.valueOf(iM1534t)));
                }
                return C1693j.f6497a;
        }
    }
}
