package p079j0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p029d0.AbstractC0786b;
import p130p.C2191j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.c */
/* loaded from: classes.dex */
public abstract class AbstractC1475c {

    /* renamed from: a */
    public static final C2191j f5687a = new C2191j(2);

    /* renamed from: b */
    public static final C1473a f5688b = new C1473a(0);

    /* renamed from: a */
    public static C1481i m3140a(Context context, List list) {
        AbstractC0715d.m1561g("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C1476d c1476d = (C1476d) list.get(i);
                ProviderInfo providerInfoM3141b = m3141b(context.getPackageManager(), c1476d, context.getResources());
                if (providerInfoM3141b == null) {
                    return new C1481i();
                }
                arrayList.add(m3142c(context, c1476d, providerInfoM3141b.authority));
            }
            return new C1481i(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static ProviderInfo m3141b(PackageManager packageManager, C1476d c1476d, Resources resources) {
        C1473a c1473a = f5688b;
        C2191j c2191j = f5687a;
        AbstractC0715d.m1561g("FontProvider.getProvider");
        try {
            List listM1938j = c1476d.f5692d;
            String str = c1476d.f5689a;
            String str2 = c1476d.f5690b;
            if (listM1938j == null) {
                listM1938j = AbstractC0786b.m1938j(resources, 0);
            }
            C1474b c1474b = new C1474b();
            c1474b.f5684a = str;
            c1474b.f5685b = str2;
            c1474b.f5686c = listM1938j;
            ProviderInfo providerInfo = (ProviderInfo) c2191j.m3979g(c1474b);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c1473a);
            for (int i = 0; i < listM1938j.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM1938j.get(i));
                Collections.sort(arrayList2, c1473a);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                            break;
                        }
                    }
                    c2191j.m3983k(c1474b, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    public static C1482j[] m3142c(Context context, C1476d c1476d, String str) {
        AbstractC0715d.m1561g("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0715d.m1561g("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c1476d.f5691c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C1482j(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (C1482j[]) arrayList.toArray(new C1482j[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
