package p002a1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p004a3.C0067e;
import p008a7.InterfaceC0113a;
import p008a7.InterfaceC0115c;
import p010b.AbstractActivityC0522l;
import p010b.C0520j;
import p018c.InterfaceC0627a;
import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2989q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C0056y implements InterfaceC0627a {

    /* renamed from: a */
    public final /* synthetic */ int f272a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC1083i f273b;

    public /* synthetic */ C0056y(AbstractActivityC1083i abstractActivityC1083i, int i) {
        this.f272a = i;
        this.f273b = abstractActivityC1083i;
    }

    @Override // p018c.InterfaceC0627a
    /* renamed from: a */
    public final void mo242a(AbstractActivityC0522l abstractActivityC0522l) {
        switch (this.f272a) {
            case 0:
                C0058z c0058z = (C0058z) this.f273b.f4599B.f143k;
                c0058z.f280s.m134b(c0058z, c0058z, null);
                return;
            default:
                AbstractC2980h.m5136e("it", abstractActivityC0522l);
                AbstractActivityC1083i abstractActivityC1083i = this.f273b;
                Bundle bundleM252c = ((C0067e) abstractActivityC1083i.f2140m.f7451m).m252c("android:support:activity-result");
                if (bundleM252c != null) {
                    C0520j c0520j = abstractActivityC1083i.f2144q;
                    LinkedHashMap linkedHashMap = c0520j.f2129b;
                    LinkedHashMap linkedHashMap2 = c0520j.f2128a;
                    Bundle bundle = c0520j.f2134g;
                    ArrayList<Integer> integerArrayList = bundleM252c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM252c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleM252c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0520j.f2131d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleM252c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof InterfaceC0113a) && !(linkedHashMap2 instanceof InterfaceC0115c)) {
                                    AbstractC2989q.m5147d("kotlin.collections.MutableMap", linkedHashMap2);
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        AbstractC2980h.m5135d("rcs[i]", num2);
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        AbstractC2980h.m5135d("keys[i]", str2);
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        c0520j.f2129b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
        }
    }
}
