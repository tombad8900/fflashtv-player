package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p046f0.AbstractC0928a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f837k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f839b;

    /* renamed from: j */
    public String f847j;

    /* renamed from: a */
    public int f838a = -1;

    /* renamed from: c */
    public byte[] f840c = null;

    /* renamed from: d */
    public Parcelable f841d = null;

    /* renamed from: e */
    public int f842e = 0;

    /* renamed from: f */
    public int f843f = 0;

    /* renamed from: g */
    public ColorStateList f844g = null;

    /* renamed from: h */
    public PorterDuff.Mode f845h = f837k;

    /* renamed from: i */
    public String f846i = null;

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int iIntValue;
        if (this.f838a == -1) {
            return String.valueOf(this.f839b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f838a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f838a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f839b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f839b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f847j);
                sb.append(" id=");
                int i = this.f838a;
                if (i == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f839b;
                    if (i4 >= 28) {
                        iIntValue = AbstractC0928a.m2088c(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            iIntValue = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                            if (this.f844g != null) {
                            }
                            if (this.f845h != f837k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e8) {
                            Log.e("IconCompat", "Unable to get icon resource", e8);
                            iIntValue = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                            if (this.f844g != null) {
                            }
                            if (this.f845h != f837k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e9) {
                            Log.e("IconCompat", "Unable to get icon resource", e9);
                            iIntValue = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                            if (this.f844g != null) {
                            }
                            if (this.f845h != f837k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f842e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f842e);
                if (this.f843f != 0) {
                    sb.append(" off=");
                    sb.append(this.f843f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f839b);
                break;
        }
        if (this.f844g != null) {
            sb.append(" tint=");
            sb.append(this.f844g);
        }
        if (this.f845h != f837k) {
            sb.append(" mode=");
            sb.append(this.f845h);
        }
        sb.append(")");
        return sb.toString();
    }
}
