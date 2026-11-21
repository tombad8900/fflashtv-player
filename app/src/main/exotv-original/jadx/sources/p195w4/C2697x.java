package p195w4;

import android.content.Intent;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.widget.Toast;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import com.exotv.net.model.BackupSource;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ResolvedStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p095l.C1629o;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.x */
/* loaded from: classes.dex */
public final class C2697x extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f9797n = 0;

    /* renamed from: o */
    public int f9798o;

    /* renamed from: p */
    public final /* synthetic */ Channel f9799p;

    /* renamed from: q */
    public final /* synthetic */ MainActivity f9800q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2697x(MainActivity mainActivity, Channel channel, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9800q = mainActivity;
        this.f9799p = channel;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f9797n) {
        }
        return ((C2697x) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f9797n) {
            case 0:
                return new C2697x(this.f9800q, this.f9799p, interfaceC2222c);
            default:
                return new C2697x(this.f9799p, this.f9800q, interfaceC2222c);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        List<ResolvedStream> list;
        int i = this.f9797n;
        MainActivity mainActivity = this.f9800q;
        Channel channel = this.f9799p;
        switch (i) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i4 = this.f9798o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                C1629o c1629o = mainActivity.f2893Q;
                if (c1629o == null) {
                    AbstractC2980h.m5139h("resolver");
                    throw null;
                }
                this.f9798o = 1;
                Object objM3332x = c1629o.m3332x(channel, this);
                return objM3332x == enumC2273a ? enumC2273a : objM3332x;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i8 = this.f9798o;
                try {
                    if (i8 == 0) {
                        AbstractC0714c.m1516d0(obj);
                        C2054e c2054e = AbstractC1290e0.f5316a;
                        ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                        C2697x c2697x = new C2697x(mainActivity, channel, (InterfaceC2222c) null);
                        this.f9798o = 1;
                        obj = AbstractC1339x.m2857r(executorC2053d, c2697x, this);
                        if (obj == enumC2273a2) {
                            return enumC2273a2;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                    }
                    list = (List) obj;
                } catch (Throwable th) {
                    Log.w("MainActivity", "resolve threw for '" + channel.getDisplayName() + "'", th);
                    list = C1921p.f7187j;
                }
                int i9 = 0;
                mainActivity.f2899W = false;
                mainActivity.m1690T(false, null, false, EnumC2683q.f9746j);
                ResolvedStream resolvedStream = (ResolvedStream) AbstractC1913h.m3737B0(list);
                C1693j c1693j = C1693j.f6497a;
                if (resolvedStream == null || AbstractC1206h.m2630D0(resolvedStream.getUrl())) {
                    Toast.makeText(mainActivity, mainActivity.getString(R.string.resolve_failed, channel.getDisplayName()), 1).show();
                } else {
                    Intent intent = new Intent(mainActivity, (Class<?>) PlayerActivity.class);
                    intent.putExtra("exo_url", resolvedStream.getUrl());
                    intent.putExtra("exo_title", channel.getDisplayName());
                    String string = new JSONObject(resolvedStream.getHeaders()).toString();
                    AbstractC2980h.m5135d("toString(...)", string);
                    intent.putExtra("exo_headers", string);
                    List<BackupSource> backups = channel.getBackups();
                    AbstractC2980h.m5136e("apiBackups", backups);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList(backups.size() + list.size());
                    for (ResolvedStream resolvedStream2 : list) {
                        if (!AbstractC1206h.m2630D0(resolvedStream2.getUrl()) && hashSet.add(resolvedStream2.getUrl())) {
                            arrayList.add(new BackupSource(resolvedStream2.getUrl(), resolvedStream2.getHeaders(), resolvedStream2.getName()));
                        }
                    }
                    for (BackupSource backupSource : backups) {
                        if (!AbstractC1206h.m2630D0(backupSource.getUrl()) && hashSet.add(backupSource.getUrl())) {
                            arrayList.add(backupSource);
                        }
                    }
                    JSONArray jSONArray = new JSONArray();
                    int size = arrayList.size();
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        BackupSource backupSource2 = (BackupSource) obj2;
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : backupSource2.getHeaders().entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        JSONObject jSONObjectPut = new JSONObject().put("url", backupSource2.getUrl()).put("headers", jSONObject);
                        if (backupSource2.getName() != null) {
                            jSONObjectPut.put("name", backupSource2.getName());
                        }
                        jSONArray.put(jSONObjectPut);
                    }
                    String string2 = jSONArray.toString();
                    AbstractC2980h.m5135d("toString(...)", string2);
                    intent.putExtra("exo_backups", string2);
                    AbstractC0120b.m401L(mainActivity, intent);
                }
                return c1693j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2697x(Channel channel, MainActivity mainActivity, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9799p = channel;
        this.f9800q = mainActivity;
    }
}
