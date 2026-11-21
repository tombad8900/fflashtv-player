package p195w4;

import android.os.Handler;
import android.util.Log;
import androidx.media3.common.C0251w1;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p006a5.C0107b;
import p024c5.C0651b1;
import p044e7.C0925b;
import p044e7.C0926c;
import p052f6.AbstractC0983m0;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1919n;
import p156s.C2331d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.r0 */
/* loaded from: classes.dex */
public final class C2686r0 implements InterfaceC0185b1 {

    /* renamed from: j */
    public final /* synthetic */ PlayerActivity f9755j;

    /* renamed from: k */
    public final /* synthetic */ ExoPlayer f9756k;

    public C2686r0(PlayerActivity playerActivity, ExoPlayer exoPlayer) {
        this.f9755j = playerActivity;
        this.f9756k = exoPlayer;
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onIsPlayingChanged(boolean z7) {
        if (z7) {
            this.f9755j.f2944O.f2576c = System.currentTimeMillis();
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onPlaybackStateChanged(int i) {
        PlayerActivity playerActivity = this.f9755j;
        RunnableC2664g0 runnableC2664g0 = playerActivity.f2951V;
        Handler handler = playerActivity.f2939J;
        if (i == 2) {
            int i4 = PlayerActivity.f2936z0;
            playerActivity.m1722P(true);
            handler.removeCallbacks(runnableC2664g0);
            handler.postDelayed(runnableC2664g0, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
            return;
        }
        if (i == 3) {
            C0651b1 c0651b1 = playerActivity.f2944O;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0651b1.f2577d = 0;
            c0651b1.f2575b = true;
            c0651b1.f2576c = jCurrentTimeMillis;
            playerActivity.f2946Q = -1L;
            handler.removeCallbacks(playerActivity.f2950U);
            handler.removeCallbacks(runnableC2664g0);
            playerActivity.m1722P(false);
            playerActivity.m1733x();
            PlayerActivity.m1707t(playerActivity);
            return;
        }
        if (i != 4) {
            return;
        }
        if (!playerActivity.f2966k0) {
            playerActivity.m1720N("ended");
            return;
        }
        playerActivity.m1722P(false);
        this.f9756k.pause();
        C0107b c0107b = playerActivity.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f527d.setImageResource(R.drawable.ic_play);
        playerActivity.m1723Q();
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onPlayerError(C0253x0 c0253x0) {
        AbstractC2980h.m5136e("error", c0253x0);
        Log.w("PlayerActivity", "playback error: " + c0253x0.getErrorCodeName(), c0253x0);
        PlayerActivity playerActivity = this.f9755j;
        playerActivity.f2948S = playerActivity.getString(R.string.player_error_generic);
        playerActivity.m1720N("error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onTracksChanged(C0254x1 c0254x1) {
        AbstractC2980h.m5136e("tracks", c0254x1);
        int i = PlayerActivity.f2936z0;
        AbstractC0983m0 abstractC0983m0 = c0254x1.f1547a;
        AbstractC2980h.m5135d("getGroups(...)", abstractC0983m0);
        ArrayList arrayList = new ArrayList();
        int size = abstractC0983m0.size();
        int i4 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC0983m0.get(i8);
            i8++;
            if (((C0251w1) obj).f1538b.f1321c == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            C0251w1 c0251w1 = (C0251w1) obj2;
            C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, c0251w1.f1537a);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = c0926cM1521g0.iterator();
            while (true) {
                C0925b c0925b = (C0925b) it;
                if (c0925b.f3991l) {
                    int i10 = c0251w1.m696a(c0925b.nextInt()).f1530v;
                    Integer numValueOf = Integer.valueOf(i10);
                    if (i10 <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList3.add(numValueOf);
                    }
                }
            }
            AbstractC1919n.m3757x0(arrayList2, arrayList3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size3 = arrayList2.size();
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            int iIntValue = ((Number) obj3).intValue();
            int i11 = 720;
            if (iIntValue > 720) {
                i11 = 1080;
            } else if (iIntValue <= 360) {
                i11 = 360;
            }
            Integer numValueOf2 = Integer.valueOf(i11);
            Object arrayList4 = linkedHashMap.get(numValueOf2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(numValueOf2, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            AbstractC2980h.m5136e("<this>", list);
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Comparable comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            arrayList5.add(new C2674l0(iIntValue2, ((Number) comparable).intValue()));
        }
        List listM3745J0 = AbstractC1913h.m3745J0(arrayList5, new C2331d(2));
        PlayerActivity playerActivity = this.f9755j;
        if (listM3745J0.equals(playerActivity.f2971p0)) {
            return;
        }
        playerActivity.f2971p0 = listM3745J0;
        if (playerActivity.f2972q0 != null) {
            if (listM3745J0.isEmpty()) {
                playerActivity.f2972q0 = null;
                playerActivity.m1730u();
            } else {
                Iterator it3 = listM3745J0.iterator();
                while (it3.hasNext()) {
                    int i12 = ((C2674l0) it3.next()).f9717a;
                    Integer num = playerActivity.f2972q0;
                    if (num != null && i12 == num.intValue()) {
                        break;
                    }
                }
                playerActivity.f2972q0 = null;
                playerActivity.m1730u();
            }
        }
        playerActivity.m1716J();
    }
}
