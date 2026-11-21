package p024c5;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Log;
import android.widget.Toast;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p010b.AbstractActivityC0522l;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2855p;
import p218z4.C2945g0;
import p218z4.C2958n;
import p218z4.EnumC2954l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.i */
/* loaded from: classes.dex */
public final class C0670i extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public long f2627n;

    /* renamed from: o */
    public int f2628o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2840a f2629p;

    /* renamed from: q */
    public final /* synthetic */ String f2630q;

    /* renamed from: r */
    public final /* synthetic */ int f2631r;

    /* renamed from: s */
    public final /* synthetic */ int f2632s;

    /* renamed from: t */
    public final /* synthetic */ AbstractActivityC0522l f2633t;

    /* renamed from: u */
    public final /* synthetic */ String f2634u;

    /* renamed from: v */
    public final /* synthetic */ int f2635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670i(InterfaceC2840a interfaceC2840a, String str, int i, int i4, AbstractActivityC0522l abstractActivityC0522l, String str2, int i8, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f2629p = interfaceC2840a;
        this.f2630q = str;
        this.f2631r = i;
        this.f2632s = i4;
        this.f2633t = abstractActivityC0522l;
        this.f2634u = str2;
        this.f2635v = i8;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C0670i) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C0670i(this.f2629p, this.f2630q, this.f2631r, this.f2632s, this.f2633t, this.f2634u, this.f2635v, interfaceC2222c);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        long j;
        C1693j c1693j = C1693j.f6497a;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f2628o;
        try {
            if (i == 0) {
                AbstractC0714c.m1516d0(obj);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C0667h c0667h = new C0667h(this.f2633t, this.f2630q, this.f2631r, this.f2632s, (InterfaceC2222c) null);
                this.f2627n = jElapsedRealtime;
                this.f2628o = 1;
                obj = AbstractC1339x.m2858s(90000L, c0667h, this);
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
                j = jElapsedRealtime;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.f2627n;
                AbstractC0714c.m1516d0(obj);
            }
            C2958n c2958n = (C2958n) obj;
            this.f2629p.invoke();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            if (c2958n == null) {
                Log.i("AutoPlay", "resolve gave nothing after " + jElapsedRealtime2 + "ms");
            }
            if (c2958n == null && jElapsedRealtime2 >= 90000) {
                Log.w("AutoPlay", "resolve was cut off at its 90000ms ceiling: " + this.f2630q + " s" + this.f2631r + " e" + this.f2632s);
            }
            if (!this.f2633t.isFinishing() && !this.f2633t.isDestroyed()) {
                if (c2958n != null && !c2958n.f11026a.isEmpty()) {
                    AbstractActivityC0522l abstractActivityC0522l = this.f2633t;
                    String str = this.f2630q;
                    String str2 = this.f2634u;
                    int i4 = this.f2631r;
                    int i8 = this.f2632s;
                    int i9 = this.f2635v;
                    Intent intent = new Intent(abstractActivityC0522l, (Class<?>) PlayerActivity.class);
                    List list = c2958n.f11026a;
                    Map map = c2958n.f11028c;
                    intent.putExtra("exo_url", (String) AbstractC1913h.m3736A0(list));
                    intent.putExtra("exo_backups", new JSONArray((Collection) c2958n.f11026a).toString());
                    intent.putExtra("exo_referer", c2958n.f11027b);
                    intent.putExtra("exo_title", str2);
                    intent.putExtra("exo_tmdb_id", str);
                    intent.putExtra("exo_season", i4);
                    intent.putExtra("exo_episode", i8);
                    if (i9 > 0) {
                        intent.putExtra("exo_episode_tmdb", i9);
                    }
                    String str3 = c2958n.f11029d;
                    if (str3 != null) {
                        intent.putExtra("exo_file_name", str3);
                    }
                    String str4 = c2958n.f11030e;
                    if (str4 != null) {
                        intent.putExtra("exo_imdb_id", str4);
                    }
                    if (!map.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        intent.putExtra("exo_headers", jSONObject.toString());
                    }
                    AbstractC0120b.m401L(abstractActivityC0522l, intent);
                    return c1693j;
                }
                C2945g0 c2945g0 = C2945g0.f10965a;
                EnumC2954l enumC2954l = C2945g0.f10967c;
                Toast.makeText(this.f2633t, (enumC2954l == null ? -1 : AbstractC0664g.f2602a[enumC2954l.ordinal()]) == 1 ? R.string.auto_resolve_rate_limited : R.string.auto_resolve_failed, 1).show();
            }
            return c1693j;
        } catch (Throwable th) {
            this.f2629p.invoke();
            throw th;
        }
    }
}
