package androidx.media3.common;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.ArrayList;
import p013b2.InterfaceC0555g;
import p017b6.InterfaceC0606h0;
import p032d3.AbstractC0829n;
import p032d3.InterfaceC0827l;
import p032d3.InterfaceC0828m;
import p043e6.InterfaceC0916d;
import p063h1.InterfaceC1123n;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0222n implements InterfaceC0225o, InterfaceC0916d, InterfaceC1123n, HlsPlaylistTracker.Factory, BitmapFactoryImageDecoder.BitmapDecoder, InterfaceC0555g, InterfaceC0606h0, InterfaceC1833o, InterfaceC0828m {

    /* renamed from: j */
    public final /* synthetic */ int f1211j;

    public /* synthetic */ C0222n(int i) {
        this.f1211j = i;
    }

    @Override // p032d3.InterfaceC0828m
    /* renamed from: a */
    public void mo646a(InterfaceC0827l interfaceC0827l, AbstractC0829n abstractC0829n) {
        switch (this.f1211j) {
            case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                interfaceC0827l.mo1981e(abstractC0829n);
                break;
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                interfaceC0827l.mo1973d(abstractC0829n);
                break;
            case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                interfaceC0827l.mo1972b(abstractC0829n);
                break;
            case 24:
                interfaceC0827l.mo1971a();
                break;
            default:
                interfaceC0827l.mo1974f();
                break;
        }
    }

    @Override // p043e6.InterfaceC0916d
    public Object apply(Object obj) {
        C0187c c0187c;
        C0183b[] c0183bArr;
        switch (this.f1211j) {
            case 1:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString(C0258z.f1553c);
                String string2 = bundle.getString(C0258z.f1554d);
                string2.getClass();
                return new C0258z(string, string2);
            case 2:
                C0258z c0258z = (C0258z) obj;
                return c0258z.f1555a + ": " + c0258z.f1556b;
            case 3:
                C0212j1 c0212j1 = (C0212j1) obj;
                c0212j1.getClass();
                Bundle bundle2 = new Bundle();
                int i = c0212j1.f1159j;
                if (i != 0) {
                    bundle2.putInt(C0212j1.f1156m, i);
                }
                int i4 = c0212j1.f1160k;
                if (i4 != 0) {
                    bundle2.putInt(C0212j1.f1157n, i4);
                }
                int i8 = c0212j1.f1161l;
                if (i8 != 0) {
                    bundle2.putInt(C0212j1.f1158o, i8);
                }
                return bundle2;
            case 4:
                C0223n0 c0223n0 = (C0223n0) obj;
                c0223n0.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(C0223n0.f1212h, c0223n0.f1219a);
                String str = c0223n0.f1220b;
                if (str != null) {
                    bundle3.putString(C0223n0.f1213i, str);
                }
                String str2 = c0223n0.f1221c;
                if (str2 != null) {
                    bundle3.putString(C0223n0.f1214j, str2);
                }
                int i9 = c0223n0.f1222d;
                if (i9 != 0) {
                    bundle3.putInt(C0223n0.f1215k, i9);
                }
                int i10 = c0223n0.f1223e;
                if (i10 != 0) {
                    bundle3.putInt(C0223n0.f1216l, i10);
                }
                String str3 = c0223n0.f1224f;
                if (str3 != null) {
                    bundle3.putString(C0223n0.f1217m, str3);
                }
                String str4 = c0223n0.f1225g;
                if (str4 != null) {
                    bundle3.putString(C0223n0.f1218n, str4);
                }
                return bundle3;
            case 5:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(C0223n0.f1212h);
                uri.getClass();
                String string3 = bundle4.getString(C0223n0.f1213i);
                String string4 = bundle4.getString(C0223n0.f1214j);
                int i11 = bundle4.getInt(C0223n0.f1215k, 0);
                int i12 = bundle4.getInt(C0223n0.f1216l, 0);
                String string5 = bundle4.getString(C0223n0.f1217m);
                String string6 = bundle4.getString(C0223n0.f1218n);
                C0220m0 c0220m0 = new C0220m0();
                c0220m0.f1192a = uri;
                c0220m0.f1193b = AbstractC0244u0.m687p(string3);
                c0220m0.f1194c = string4;
                c0220m0.f1195d = i11;
                c0220m0.f1196e = i12;
                c0220m0.f1197f = string5;
                c0220m0.f1198g = string6;
                return new C0223n0(c0220m0);
            case 6:
                Bundle bundle5 = (Bundle) obj;
                Bundle bundle6 = bundle5.getBundle(C0227o1.f1253t);
                C0226o0 c0226o0M650b = bundle6 != null ? C0226o0.m650b(bundle6) : C0226o0.f1231g;
                long j = bundle5.getLong(C0227o1.f1254u, -9223372036854775807L);
                long j8 = bundle5.getLong(C0227o1.f1255v, -9223372036854775807L);
                long j9 = bundle5.getLong(C0227o1.f1256w, -9223372036854775807L);
                boolean z7 = bundle5.getBoolean(C0227o1.f1257x, false);
                boolean z8 = bundle5.getBoolean(C0227o1.f1258y, false);
                Bundle bundle7 = bundle5.getBundle(C0227o1.f1259z);
                C0208i0 c0208i0M625b = bundle7 != null ? C0208i0.m625b(bundle7) : null;
                boolean z9 = bundle5.getBoolean(C0227o1.f1244A, false);
                long j10 = bundle5.getLong(C0227o1.f1245B, 0L);
                long j11 = bundle5.getLong(C0227o1.f1246C, -9223372036854775807L);
                int i13 = bundle5.getInt(C0227o1.f1247D, 0);
                int i14 = bundle5.getInt(C0227o1.f1248E, 0);
                long j12 = bundle5.getLong(C0227o1.f1249F, 0L);
                C0227o1 c0227o1 = new C0227o1();
                c0227o1.m655b(C0227o1.f1251r, c0226o0M650b, null, j, j8, j9, z7, z8, c0208i0M625b, j10, j11, i13, i14, j12);
                c0227o1.f1270k = z9;
                return c0227o1;
            case 7:
                Bundle bundle8 = (Bundle) obj;
                int i15 = bundle8.getInt(C0221m1.f1199h, 0);
                long j13 = bundle8.getLong(C0221m1.f1200i, -9223372036854775807L);
                long j14 = bundle8.getLong(C0221m1.f1201j, 0L);
                boolean z10 = bundle8.getBoolean(C0221m1.f1202k, false);
                Bundle bundle9 = bundle8.getBundle(C0221m1.f1203l);
                if (bundle9 != null) {
                    ArrayList parcelableArrayList = bundle9.getParcelableArrayList(C0187c.f1046i);
                    if (parcelableArrayList == null) {
                        c0183bArr = new C0183b[0];
                    } else {
                        C0183b[] c0183bArr2 = new C0183b[parcelableArrayList.size()];
                        for (int i16 = 0; i16 < parcelableArrayList.size(); i16++) {
                            c0183bArr2[i16] = C0183b.m604a((Bundle) parcelableArrayList.get(i16));
                        }
                        c0183bArr = c0183bArr2;
                    }
                    c0187c = new C0187c(null, c0183bArr, bundle9.getLong(C0187c.f1047j, 0L), bundle9.getLong(C0187c.f1048k, -9223372036854775807L), bundle9.getInt(C0187c.f1049l, 0));
                } else {
                    c0187c = C0187c.f1044g;
                }
                C0221m1 c0221m1 = new C0221m1();
                c0221m1.m644i(null, null, i15, j13, j14, c0187c, z10);
                return c0221m1;
            default:
                return C0249w.m690b((Bundle) obj);
        }
    }

    @Override // p013b2.InterfaceC0555g
    /* renamed from: b */
    public boolean mo647b(int i, int i4, int i8, int i9, int i10) {
        return false;
    }

    @Override // p063h1.InterfaceC1123n
    /* renamed from: c */
    public void mo648c(Object obj, C0243u c0243u) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, c0243u);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
    public HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
    }

    @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
    public Bitmap decode(byte[] bArr, int i) {
        return BitmapFactoryImageDecoder.access$100(bArr, i);
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        AbstractC2980h.m5133b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = c1844r1.f6934a.mo3563f(1).f3770b;
        view.setLayoutParams(layoutParams);
        return c1844r1;
    }
}
