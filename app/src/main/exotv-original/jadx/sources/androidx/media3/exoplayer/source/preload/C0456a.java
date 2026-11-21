package androidx.media3.exoplayer.source.preload;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.media3.common.C0233q1;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;
import java.util.List;
import okhttp3.AbstractC2177v;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2178w;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;
import p017b6.AbstractC0622v;
import p017b6.C0596c0;
import p037e0.C0851b;
import p052f6.C0974j0;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p063h1.InterfaceC1122m;
import p071i1.InterfaceC1239r;
import p090k2.C1584b;
import p090k2.C1585c;
import p090k2.C1593k;
import p090k2.C1594l;
import p095l.C1629o;
import p104m.C1776v;
import p105m0.AbstractC1828m0;
import p105m0.C1800d;
import p105m0.C1806f;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1803e;
import p105m0.InterfaceC1833o;
import p115n1.AbstractC1965b;
import p115n1.C1993t;
import p115n1.InterfaceC1975g;
import p115n1.InterfaceC1980i0;
import p121o0.InterfaceC2040f;
import p131p0.C2194a;
import p131p0.C2197d;
import p147q7.AbstractC2278c;
import p162s5.InterfaceC2363a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0456a implements InterfaceC1122m, DefaultTrackSelector.TrackInfo.Factory, TrackSelectionUtil.AdaptiveTrackSelectionFactory, InterfaceC2363a, InterfaceC1111f, InterfaceC1833o, InterfaceC2178w, InterfaceC1975g, InterfaceC1239r {

    /* renamed from: j */
    public final /* synthetic */ int f1849j;

    /* renamed from: k */
    public final /* synthetic */ Object f1850k;

    public /* synthetic */ C0456a(int i, Object obj) {
        this.f1849j = i;
        this.f1850k = obj;
    }

    @Override // p071i1.InterfaceC1239r
    /* renamed from: a */
    public void mo995a(long j, C1132w c1132w) {
        AbstractC1965b.m3829e(j, c1132w, (InterfaceC1980i0[]) ((C0073c) this.f1850k).f325l);
    }

    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        switch (this.f1849j) {
            case 7:
                C1594l c1594l = (C1594l) this.f1850k;
                C1585c c1585c = (C1585c) obj;
                C1593k c1593k = new C1593k(c1585c.f6054b, C1584b.m3250o(c1585c.f6053a, c1585c.f6055c));
                c1594l.f6066c.add(c1593k);
                long j = c1594l.f6073j;
                if (j == -9223372036854775807L || c1585c.f6054b >= j) {
                    c1594l.m3263a(c1593k);
                    break;
                }
                break;
            default:
                ((C0974j0) this.f1850k).m2141a((C1585c) obj);
                break;
        }
    }

    @Override // p162s5.InterfaceC2363a
    /* renamed from: b */
    public void mo996b() {
        C0596c0 c0596c0 = (C0596c0) this.f1850k;
        CheckableImageButton checkableImageButton = c0596c0.f2381m;
        AbstractC0622v.m1407s(checkableImageButton, c0596c0.f2386r, checkableImageButton.getContentDescription());
    }

    /* renamed from: c */
    public boolean m997c(C1629o c1629o, int i, Bundle bundle) {
        InterfaceC1803e c1800d;
        C1776v c1776v = (C1776v) this.f1850k;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC2040f) c1629o.f6229j).mo288j();
                Parcelable parcelable = (Parcelable) ((InterfaceC2040f) c1629o.f6229j).mo293o();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InterfaceC2040f interfaceC2040f = (InterfaceC2040f) c1629o.f6229j;
        ClipData clipData = new ClipData(interfaceC2040f.getDescription(), new ClipData.Item(interfaceC2040f.mo287i()));
        if (i4 >= 31) {
            c1800d = new C1800d(clipData, 2);
        } else {
            C1806f c1806f = new C1806f();
            c1806f.f6870b = clipData;
            c1806f.f6871c = 2;
            c1800d = c1806f;
        }
        c1800d.mo3522b(interfaceC2040f.mo289k());
        c1800d.setExtras(bundle);
        return AbstractC1828m0.m3604i(c1776v, c1800d.build()) == null;
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, C0233q1 c0233q1, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$4((DefaultTrackSelector.Parameters) this.f1850k, i, c0233q1, iArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.f1850k).lambda$createTrackSelections$0(definition);
    }

    @Override // p115n1.InterfaceC1975g
    /* renamed from: d */
    public long mo998d(long j) {
        return AbstractC1118i0.m2452k((j * r0.f7382e) / 1000000, 0L, ((C1993t) this.f1850k).f7387j - 1);
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1849j) {
            case 0:
                BasePreloadManager.lambda$onPreloadCompleted$1((MediaSource) this.f1850k, (BasePreloadManager.Listener) obj);
                break;
            default:
                ((BasePreloadManager.Listener) obj).onError((PreloadException) this.f1850k);
                break;
        }
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        C2197d c2197d = (C2197d) this.f1850k;
        ArrayList arrayList = c2197d.f7669b;
        C1835o1 c1835o1 = c1844r1.f6934a;
        C0851b c0851bM2021b = C0851b.m2021b(c1835o1.mo3563f(519), c1835o1.mo3563f(64));
        C0851b c0851bM2021b2 = C0851b.m2021b(c1835o1.mo3564g(519), c1835o1.mo3564g(64));
        if (!c0851bM2021b.equals(c2197d.f7670c) || !c0851bM2021b2.equals(c2197d.f7671d)) {
            c2197d.f7670c = c0851bM2021b;
            c2197d.f7671d = c0851bM2021b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((C2194a) arrayList.get(size)).f7660a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw AbstractC0008a1.m10f(size2, arrayList2);
                }
            }
        }
        return c1844r1;
    }

    @Override // okhttp3.InterfaceC2178w
    public AbstractC2177v create(InterfaceC2075g interfaceC2075g) {
        return AbstractC2278c.asFactory$lambda$8((AbstractC2177v) this.f1850k, interfaceC2075g);
    }
}
