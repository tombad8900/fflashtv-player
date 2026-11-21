package p217z3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z3.a */
/* loaded from: classes.dex */
public final class C2929a implements InterfaceC2930b {

    /* renamed from: c */
    public static final String[] f10879c = {"_data"};

    /* renamed from: d */
    public static final String[] f10880d = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f10881a;

    /* renamed from: b */
    public final ContentResolver f10882b;

    public /* synthetic */ C2929a(ContentResolver contentResolver, int i) {
        this.f10881a = i;
        this.f10882b = contentResolver;
    }

    @Override // p217z3.InterfaceC2930b
    /* renamed from: a */
    public final Cursor mo5091a(Uri uri) {
        switch (this.f10881a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f10882b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f10879c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f10882b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f10880d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
