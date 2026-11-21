package p066h4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p002a1.C0048u;
import p015b4.InterfaceC0567a;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.c0 */
/* loaded from: classes.dex */
public final class C1169c0 implements InterfaceC2806j {

    /* renamed from: d */
    public static final C2803g f5012d = new C2803g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1175i(1));

    /* renamed from: e */
    public static final C2803g f5013e = new C2803g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1175i(2));

    /* renamed from: f */
    public static final C2819f f5014f = new C2819f(25);

    /* renamed from: g */
    public static final List f5015g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final C2819f f5016a;

    /* renamed from: b */
    public final InterfaceC0567a f5017b;

    /* renamed from: c */
    public final C2819f f5018c = f5014f;

    public C1169c0(InterfaceC0567a interfaceC0567a, C2819f c2819f) {
        this.f5017b = interfaceC0567a;
        this.f5016a = c2819f;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        return true;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final p005a4.InterfaceC0080f0 mo2584b(java.lang.Object r19, int r20, int r21, p210y3.C2804h r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p066h4.C1169c0.mo2584b(java.lang.Object, int, int, y3.h):a4.f0");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m2586c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i4, int i8, C1179m c1179m) throws NumberFormatException {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    switch (this.f5016a.f10457j) {
                        case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                            break;
                        case 24:
                            mediaExtractor.setDataSource(new C1167b0((ByteBuffer) obj));
                            break;
                        default:
                            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                            break;
                    }
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i14 = 0; i14 < trackCount; i14++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i14).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                        }
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i13 != 90) {
                                    i12 = i11;
                                    i11 = i12;
                                    float fM2599b = c1179m.m2599b(i11, i12, i4, i8);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i11 * fM2599b), Math.round(fM2599b * i12));
                                }
                            } catch (Throwable th3) {
                                if (Log.isLoggable("VideoDecoder", 3)) {
                                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i10 = Integer.parseInt(strExtractMetadata);
                                    int i15 = Integer.parseInt(strExtractMetadata2);
                                    if (i10 == 7) {
                                    }
                                } catch (NumberFormatException unused) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                    }
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                    } catch (Throwable th4) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th4;
                    }
                }
                mediaExtractor.release();
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i4 != Integer.MIN_VALUE && i8 != Integer.MIN_VALUE && c1179m != C1179m.f5032e) {
            i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i13 != 90 || i13 == 270) {
                i12 = i11;
                i11 = i12;
            }
            float fM2599b2 = c1179m.m2599b(i11, i12, i4, i8);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i11 * fM2599b2), Math.round(fM2599b2 * i12));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30 && i9 < 33) {
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata22 = mediaMetadataRetriever.extractMetadata(35);
                i10 = Integer.parseInt(strExtractMetadata3);
                int i152 = Integer.parseInt(strExtractMetadata22);
                if ((i10 == 7 || i10 == 6) && i152 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                    }
                }
            }
        } else {
            Iterator it = f5015g.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith((String) it.next())) {
                    String strExtractMetadata32 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata222 = mediaMetadataRetriever.extractMetadata(35);
                    i10 = Integer.parseInt(strExtractMetadata32);
                    int i1522 = Integer.parseInt(strExtractMetadata222);
                    if (i10 == 7) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        }
                    } else if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    }
                }
            }
        }
        if (bitmapCreateBitmap == null) {
            return bitmapCreateBitmap;
        }
        throw new C0048u("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
