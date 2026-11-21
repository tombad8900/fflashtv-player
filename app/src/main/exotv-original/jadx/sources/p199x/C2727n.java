package p199x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.AbstractC0008a1;
import p156s.AbstractC2334g;
import p165t.AbstractC2386a;
import p174u.C2439a;
import p190w.AbstractC2596a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.n */
/* loaded from: classes.dex */
public final class C2727n {

    /* renamed from: d */
    public static final int[] f10082d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f10083e;

    /* renamed from: f */
    public static final SparseIntArray f10084f;

    /* renamed from: a */
    public final HashMap f10085a = new HashMap();

    /* renamed from: b */
    public final boolean f10086b = true;

    /* renamed from: c */
    public final HashMap f10087c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10083e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f10084f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m4796c(C2714a c2714a, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c2714a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i4 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC2729p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c2714a.isInEditMode() && (c2714a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c2714a.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f797v;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f797v.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = iIntValue;
            i++;
            i4++;
        }
        return i4 != strArrSplit.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* renamed from: d */
    public static C2722i m4797d(Context context, AttributeSet attributeSet, boolean z7) {
        int i;
        int i4;
        C2722i c2722i = new C2722i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? AbstractC2730q.f10090c : AbstractC2730q.f10088a);
        C2725l c2725l = c2722i.f9981b;
        C2726m c2726m = c2722i.f9984e;
        C2724k c2724k = c2722i.f9982c;
        C2723j c2723j = c2722i.f9983d;
        int[] iArr = f10082d;
        String[] strArr = AbstractC2386a.f8375a;
        SparseIntArray sparseIntArray = f10083e;
        if (z7) {
            C2721h c2721h = new C2721h();
            c2721h.f9968a = new int[10];
            c2721h.f9969b = new int[10];
            c2721h.f9970c = 0;
            c2721h.f9971d = new int[10];
            c2721h.f9972e = new float[10];
            c2721h.f9973f = 0;
            c2721h.f9974g = new int[5];
            c2721h.f9975h = new String[5];
            c2721h.f9976i = 0;
            c2721h.f9977j = new int[4];
            c2721h.f9978k = new boolean[4];
            c2721h.f9979l = 0;
            c2724k.getClass();
            c2723j.getClass();
            c2726m.getClass();
            int i8 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i8 < indexCount; indexCount = i4) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = i8;
                switch (f10084f.get(index)) {
                    case 2:
                        i4 = indexCount;
                        c2721h.m4788b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9995I));
                        continue;
                        i8 = i9 + 1;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                    case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                    case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                    case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i4 = indexCount;
                        c2721h.m4789c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i8 = i9 + 1;
                    case 6:
                        i4 = indexCount;
                        c2721h.m4788b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2723j.f9989C));
                        break;
                    case 7:
                        i4 = indexCount;
                        c2721h.m4788b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2723j.f9990D));
                        break;
                    case 8:
                        i4 = indexCount;
                        c2721h.m4788b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9996J));
                        break;
                    case 11:
                        i4 = indexCount;
                        c2721h.m4788b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10002P));
                        break;
                    case 12:
                        i4 = indexCount;
                        c2721h.m4788b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10003Q));
                        break;
                    case 13:
                        i4 = indexCount;
                        c2721h.m4788b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9999M));
                        break;
                    case 14:
                        i4 = indexCount;
                        c2721h.m4788b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10001O));
                        break;
                    case 15:
                        i4 = indexCount;
                        c2721h.m4788b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10004R));
                        break;
                    case 16:
                        i4 = indexCount;
                        c2721h.m4788b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10000N));
                        break;
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        i4 = indexCount;
                        c2721h.m4788b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2723j.f10019d));
                        break;
                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        i4 = indexCount;
                        c2721h.m4788b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2723j.f10021e));
                        break;
                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                        i4 = indexCount;
                        c2721h.m4787a(19, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f10023f));
                        break;
                    case 20:
                        i4 = indexCount;
                        c2721h.m4787a(20, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f10050w));
                        break;
                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                        i4 = indexCount;
                        c2721h.m4788b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c2723j.f10017c));
                        break;
                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                        i4 = indexCount;
                        c2721h.m4788b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c2725l.f10064a)]);
                        break;
                    case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                        i4 = indexCount;
                        c2721h.m4788b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c2723j.f10015b));
                        break;
                    case 24:
                        i4 = indexCount;
                        c2721h.m4788b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9992F));
                        break;
                    case AnalyticsListener.EVENT_CUES /* 27 */:
                        i4 = indexCount;
                        c2721h.m4788b(27, typedArrayObtainStyledAttributes.getInt(index, c2723j.f9991E));
                        break;
                    case AnalyticsListener.EVENT_METADATA /* 28 */:
                        i4 = indexCount;
                        c2721h.m4788b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9993G));
                        break;
                    case 31:
                        i4 = indexCount;
                        c2721h.m4788b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9997K));
                        break;
                    case 34:
                        i4 = indexCount;
                        c2721h.m4788b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9994H));
                        break;
                    case 37:
                        i4 = indexCount;
                        c2721h.m4787a(37, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f10051x));
                        break;
                    case 38:
                        i4 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c2722i.f9980a);
                        c2722i.f9980a = resourceId;
                        c2721h.m4788b(38, resourceId);
                        break;
                    case 39:
                        i4 = indexCount;
                        c2721h.m4787a(39, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f10007U));
                        break;
                    case 40:
                        i4 = indexCount;
                        c2721h.m4787a(40, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f10006T));
                        break;
                    case 41:
                        i4 = indexCount;
                        c2721h.m4788b(41, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10008V));
                        break;
                    case 42:
                        i4 = indexCount;
                        c2721h.m4788b(42, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10009W));
                        break;
                    case 43:
                        i4 = indexCount;
                        c2721h.m4787a(43, typedArrayObtainStyledAttributes.getFloat(index, c2725l.f10066c));
                        break;
                    case 44:
                        i4 = indexCount;
                        c2721h.m4790d(44, true);
                        c2721h.m4787a(44, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10081m));
                        break;
                    case 45:
                        i4 = indexCount;
                        c2721h.m4787a(45, typedArrayObtainStyledAttributes.getFloat(index, c2726m.f10070b));
                        break;
                    case 46:
                        i4 = indexCount;
                        c2721h.m4787a(46, typedArrayObtainStyledAttributes.getFloat(index, c2726m.f10071c));
                        break;
                    case 47:
                        i4 = indexCount;
                        c2721h.m4787a(47, typedArrayObtainStyledAttributes.getFloat(index, c2726m.f10072d));
                        break;
                    case 48:
                        i4 = indexCount;
                        c2721h.m4787a(48, typedArrayObtainStyledAttributes.getFloat(index, c2726m.f10073e));
                        break;
                    case 49:
                        i4 = indexCount;
                        c2721h.m4787a(49, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10074f));
                        break;
                    case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                        i4 = indexCount;
                        c2721h.m4787a(50, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10075g));
                        break;
                    case 51:
                        i4 = indexCount;
                        c2721h.m4787a(51, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10077i));
                        break;
                    case 52:
                        i4 = indexCount;
                        c2721h.m4787a(52, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10078j));
                        break;
                    case 53:
                        i4 = indexCount;
                        c2721h.m4787a(53, typedArrayObtainStyledAttributes.getDimension(index, c2726m.f10079k));
                        break;
                    case 54:
                        i4 = indexCount;
                        c2721h.m4788b(54, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10010X));
                        break;
                    case 55:
                        i4 = indexCount;
                        c2721h.m4788b(55, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10011Y));
                        break;
                    case 56:
                        i4 = indexCount;
                        c2721h.m4788b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10012Z));
                        break;
                    case 57:
                        i4 = indexCount;
                        c2721h.m4788b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10014a0));
                        break;
                    case 58:
                        i4 = indexCount;
                        c2721h.m4788b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10016b0));
                        break;
                    case 59:
                        i4 = indexCount;
                        c2721h.m4788b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10018c0));
                        break;
                    case 60:
                        i4 = indexCount;
                        c2721h.m4787a(60, typedArrayObtainStyledAttributes.getFloat(index, c2726m.f10069a));
                        break;
                    case 62:
                        i4 = indexCount;
                        c2721h.m4788b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9987A));
                        break;
                    case 63:
                        i4 = indexCount;
                        c2721h.m4787a(63, typedArrayObtainStyledAttributes.getFloat(index, c2723j.f9988B));
                        break;
                    case 64:
                        i4 = indexCount;
                        c2721h.m4788b(64, m4798f(typedArrayObtainStyledAttributes, index, c2724k.f10055a));
                        break;
                    case 65:
                        i4 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c2721h.m4789c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c2721h.m4789c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i4 = indexCount;
                        c2721h.m4788b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i4 = indexCount;
                        c2721h.m4787a(67, typedArrayObtainStyledAttributes.getFloat(index, c2724k.f10059e));
                        break;
                    case 68:
                        i4 = indexCount;
                        c2721h.m4787a(68, typedArrayObtainStyledAttributes.getFloat(index, c2725l.f10067d));
                        break;
                    case 69:
                        i4 = indexCount;
                        c2721h.m4787a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i4 = indexCount;
                        c2721h.m4787a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i4 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount;
                        c2721h.m4788b(72, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10024f0));
                        break;
                    case 73:
                        i4 = indexCount;
                        c2721h.m4788b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10026g0));
                        break;
                    case 74:
                        i4 = indexCount;
                        c2721h.m4789c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i4 = indexCount;
                        c2721h.m4790d(75, typedArrayObtainStyledAttributes.getBoolean(index, c2723j.f10040n0));
                        break;
                    case 76:
                        i4 = indexCount;
                        c2721h.m4788b(76, typedArrayObtainStyledAttributes.getInt(index, c2724k.f10057c));
                        break;
                    case 77:
                        i4 = indexCount;
                        c2721h.m4789c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i4 = indexCount;
                        c2721h.m4788b(78, typedArrayObtainStyledAttributes.getInt(index, c2725l.f10065b));
                        break;
                    case 79:
                        i4 = indexCount;
                        c2721h.m4787a(79, typedArrayObtainStyledAttributes.getFloat(index, c2724k.f10058d));
                        break;
                    case 80:
                        i4 = indexCount;
                        c2721h.m4790d(80, typedArrayObtainStyledAttributes.getBoolean(index, c2723j.f10036l0));
                        break;
                    case 81:
                        i4 = indexCount;
                        c2721h.m4790d(81, typedArrayObtainStyledAttributes.getBoolean(index, c2723j.f10038m0));
                        break;
                    case 82:
                        i4 = indexCount;
                        c2721h.m4788b(82, typedArrayObtainStyledAttributes.getInteger(index, c2724k.f10056b));
                        break;
                    case 83:
                        i4 = indexCount;
                        c2721h.m4788b(83, m4798f(typedArrayObtainStyledAttributes, index, c2726m.f10076h));
                        break;
                    case 84:
                        i4 = indexCount;
                        c2721h.m4788b(84, typedArrayObtainStyledAttributes.getInteger(index, c2724k.f10061g));
                        break;
                    case 85:
                        i4 = indexCount;
                        c2721h.m4787a(85, typedArrayObtainStyledAttributes.getFloat(index, c2724k.f10060f));
                        break;
                    case 86:
                        i4 = indexCount;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i10 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c2724k.f10063i = resourceId2;
                            c2721h.m4788b(89, resourceId2);
                            if (c2724k.f10063i != -1) {
                                c2721h.m4788b(88, -2);
                                break;
                            }
                        } else if (i10 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c2724k.f10062h = string;
                            c2721h.m4789c(90, string);
                            if (c2724k.f10062h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c2724k.f10063i = resourceId3;
                                c2721h.m4788b(89, resourceId3);
                                c2721h.m4788b(88, -2);
                                break;
                            } else {
                                c2721h.m4788b(88, -1);
                                break;
                            }
                        } else {
                            c2721h.m4788b(88, typedArrayObtainStyledAttributes.getInteger(index, c2724k.f10063i));
                            break;
                        }
                        break;
                    case 87:
                        i4 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i4 = indexCount;
                        c2721h.m4788b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f9998L));
                        break;
                    case 94:
                        i4 = indexCount;
                        c2721h.m4788b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2723j.f10005S));
                        break;
                    case 95:
                        i4 = indexCount;
                        m4799g(c2721h, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i4 = indexCount;
                        m4799g(c2721h, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i4 = indexCount;
                        c2721h.m4788b(97, typedArrayObtainStyledAttributes.getInt(index, c2723j.f10042o0));
                        break;
                    case 98:
                        i4 = indexCount;
                        int i11 = AbstractC2596a.f9348z;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            c2722i.f9980a = typedArrayObtainStyledAttributes.getResourceId(index, c2722i.f9980a);
                            break;
                        }
                    case 99:
                        i4 = indexCount;
                        c2721h.m4790d(99, typedArrayObtainStyledAttributes.getBoolean(index, c2723j.f10025g));
                        break;
                }
                i8 = i9 + 1;
            }
        } else {
            int i12 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c2724k.getClass();
                        c2723j.getClass();
                        c2726m.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c2723j.f10043p = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10043p);
                        continue;
                        i12++;
                    case 2:
                        i = indexCount2;
                        c2723j.f9995I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9995I);
                        continue;
                        i12++;
                    case 3:
                        i = indexCount2;
                        c2723j.f10041o = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10041o);
                        continue;
                        i12++;
                    case 4:
                        i = indexCount2;
                        c2723j.f10039n = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10039n);
                        continue;
                        i12++;
                    case 5:
                        i = indexCount2;
                        c2723j.f10052y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i12++;
                    case 6:
                        i = indexCount2;
                        c2723j.f9989C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2723j.f9989C);
                        continue;
                        i12++;
                    case 7:
                        i = indexCount2;
                        c2723j.f9990D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2723j.f9990D);
                        continue;
                        i12++;
                    case 8:
                        i = indexCount2;
                        c2723j.f9996J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9996J);
                        continue;
                        i12++;
                    case 9:
                        i = indexCount2;
                        c2723j.f10049v = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10049v);
                        continue;
                        i12++;
                    case 10:
                        i = indexCount2;
                        c2723j.f10048u = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10048u);
                        continue;
                        i12++;
                    case 11:
                        i = indexCount2;
                        c2723j.f10002P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10002P);
                        continue;
                        i12++;
                    case 12:
                        i = indexCount2;
                        c2723j.f10003Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10003Q);
                        continue;
                        i12++;
                    case 13:
                        i = indexCount2;
                        c2723j.f9999M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9999M);
                        continue;
                        i12++;
                    case 14:
                        i = indexCount2;
                        c2723j.f10001O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10001O);
                        continue;
                        i12++;
                    case 15:
                        i = indexCount2;
                        c2723j.f10004R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10004R);
                        continue;
                        i12++;
                    case 16:
                        i = indexCount2;
                        c2723j.f10000N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10000N);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        i = indexCount2;
                        c2723j.f10019d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2723j.f10019d);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        i = indexCount2;
                        c2723j.f10021e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c2723j.f10021e);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                        i = indexCount2;
                        c2723j.f10023f = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f10023f);
                        continue;
                        i12++;
                    case 20:
                        i = indexCount2;
                        c2723j.f10050w = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f10050w);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                        i = indexCount2;
                        c2723j.f10017c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c2723j.f10017c);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                        i = indexCount2;
                        int i13 = typedArrayObtainStyledAttributes.getInt(index2, c2725l.f10064a);
                        c2725l.f10064a = i13;
                        c2725l.f10064a = iArr[i13];
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                        i = indexCount2;
                        c2723j.f10015b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c2723j.f10015b);
                        continue;
                        i12++;
                    case 24:
                        i = indexCount2;
                        c2723j.f9992F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9992F);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                        i = indexCount2;
                        c2723j.f10027h = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10027h);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                        i = indexCount2;
                        c2723j.f10029i = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10029i);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_CUES /* 27 */:
                        i = indexCount2;
                        c2723j.f9991E = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f9991E);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_METADATA /* 28 */:
                        i = indexCount2;
                        c2723j.f9993G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9993G);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                        i = indexCount2;
                        c2723j.f10031j = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10031j);
                        continue;
                        i12++;
                    case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                        i = indexCount2;
                        c2723j.f10033k = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10033k);
                        continue;
                        i12++;
                    case 31:
                        i = indexCount2;
                        c2723j.f9997K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9997K);
                        continue;
                        i12++;
                    case 32:
                        i = indexCount2;
                        c2723j.f10046s = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10046s);
                        continue;
                        i12++;
                    case 33:
                        i = indexCount2;
                        c2723j.f10047t = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10047t);
                        continue;
                        i12++;
                    case 34:
                        i = indexCount2;
                        c2723j.f9994H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9994H);
                        continue;
                        i12++;
                    case 35:
                        i = indexCount2;
                        c2723j.f10037m = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10037m);
                        continue;
                        i12++;
                    case 36:
                        i = indexCount2;
                        c2723j.f10035l = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10035l);
                        continue;
                        i12++;
                    case 37:
                        i = indexCount2;
                        c2723j.f10051x = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f10051x);
                        continue;
                        i12++;
                    case 38:
                        i = indexCount2;
                        c2722i.f9980a = typedArrayObtainStyledAttributes.getResourceId(index2, c2722i.f9980a);
                        continue;
                        i12++;
                    case 39:
                        i = indexCount2;
                        c2723j.f10007U = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f10007U);
                        continue;
                        i12++;
                    case 40:
                        i = indexCount2;
                        c2723j.f10006T = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f10006T);
                        continue;
                        i12++;
                    case 41:
                        i = indexCount2;
                        c2723j.f10008V = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10008V);
                        continue;
                        i12++;
                    case 42:
                        i = indexCount2;
                        c2723j.f10009W = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10009W);
                        continue;
                        i12++;
                    case 43:
                        i = indexCount2;
                        c2725l.f10066c = typedArrayObtainStyledAttributes.getFloat(index2, c2725l.f10066c);
                        continue;
                        i12++;
                    case 44:
                        i = indexCount2;
                        c2726m.f10080l = true;
                        c2726m.f10081m = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10081m);
                        continue;
                        i12++;
                    case 45:
                        i = indexCount2;
                        c2726m.f10070b = typedArrayObtainStyledAttributes.getFloat(index2, c2726m.f10070b);
                        continue;
                        i12++;
                    case 46:
                        i = indexCount2;
                        c2726m.f10071c = typedArrayObtainStyledAttributes.getFloat(index2, c2726m.f10071c);
                        continue;
                        i12++;
                    case 47:
                        i = indexCount2;
                        c2726m.f10072d = typedArrayObtainStyledAttributes.getFloat(index2, c2726m.f10072d);
                        continue;
                        i12++;
                    case 48:
                        i = indexCount2;
                        c2726m.f10073e = typedArrayObtainStyledAttributes.getFloat(index2, c2726m.f10073e);
                        continue;
                        i12++;
                    case 49:
                        i = indexCount2;
                        c2726m.f10074f = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10074f);
                        continue;
                        i12++;
                    case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                        i = indexCount2;
                        c2726m.f10075g = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10075g);
                        continue;
                        i12++;
                    case 51:
                        i = indexCount2;
                        c2726m.f10077i = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10077i);
                        continue;
                        i12++;
                    case 52:
                        i = indexCount2;
                        c2726m.f10078j = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10078j);
                        continue;
                        i12++;
                    case 53:
                        i = indexCount2;
                        c2726m.f10079k = typedArrayObtainStyledAttributes.getDimension(index2, c2726m.f10079k);
                        continue;
                        i12++;
                    case 54:
                        i = indexCount2;
                        c2723j.f10010X = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10010X);
                        continue;
                        i12++;
                    case 55:
                        i = indexCount2;
                        c2723j.f10011Y = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10011Y);
                        continue;
                        i12++;
                    case 56:
                        i = indexCount2;
                        c2723j.f10012Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10012Z);
                        continue;
                        i12++;
                    case 57:
                        i = indexCount2;
                        c2723j.f10014a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10014a0);
                        continue;
                        i12++;
                    case 58:
                        i = indexCount2;
                        c2723j.f10016b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10016b0);
                        continue;
                        i12++;
                    case 59:
                        i = indexCount2;
                        c2723j.f10018c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10018c0);
                        continue;
                        i12++;
                    case 60:
                        i = indexCount2;
                        c2726m.f10069a = typedArrayObtainStyledAttributes.getFloat(index2, c2726m.f10069a);
                        continue;
                        i12++;
                    case 61:
                        i = indexCount2;
                        c2723j.f10053z = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10053z);
                        continue;
                        i12++;
                    case 62:
                        i = indexCount2;
                        c2723j.f9987A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9987A);
                        continue;
                        i12++;
                    case 63:
                        i = indexCount2;
                        c2723j.f9988B = typedArrayObtainStyledAttributes.getFloat(index2, c2723j.f9988B);
                        continue;
                        i12++;
                    case 64:
                        i = indexCount2;
                        c2724k.f10055a = m4798f(typedArrayObtainStyledAttributes, index2, c2724k.f10055a);
                        continue;
                        i12++;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c2724k.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c2724k.getClass();
                            i12++;
                        }
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c2724k.getClass();
                        continue;
                        i12++;
                    case 67:
                        i = indexCount2;
                        c2724k.f10059e = typedArrayObtainStyledAttributes.getFloat(index2, c2724k.f10059e);
                        break;
                    case 68:
                        i = indexCount2;
                        c2725l.f10067d = typedArrayObtainStyledAttributes.getFloat(index2, c2725l.f10067d);
                        break;
                    case 69:
                        i = indexCount2;
                        c2723j.f10020d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c2723j.f10022e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c2723j.f10024f0 = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10024f0);
                        break;
                    case 73:
                        i = indexCount2;
                        c2723j.f10026g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10026g0);
                        break;
                    case 74:
                        i = indexCount2;
                        c2723j.f10032j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c2723j.f10040n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2723j.f10040n0);
                        break;
                    case 76:
                        i = indexCount2;
                        c2724k.f10057c = typedArrayObtainStyledAttributes.getInt(index2, c2724k.f10057c);
                        break;
                    case 77:
                        i = indexCount2;
                        c2723j.f10034k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c2725l.f10065b = typedArrayObtainStyledAttributes.getInt(index2, c2725l.f10065b);
                        break;
                    case 79:
                        i = indexCount2;
                        c2724k.f10058d = typedArrayObtainStyledAttributes.getFloat(index2, c2724k.f10058d);
                        break;
                    case 80:
                        i = indexCount2;
                        c2723j.f10036l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2723j.f10036l0);
                        break;
                    case 81:
                        i = indexCount2;
                        c2723j.f10038m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c2723j.f10038m0);
                        break;
                    case 82:
                        i = indexCount2;
                        c2724k.f10056b = typedArrayObtainStyledAttributes.getInteger(index2, c2724k.f10056b);
                        break;
                    case 83:
                        i = indexCount2;
                        c2726m.f10076h = m4798f(typedArrayObtainStyledAttributes, index2, c2726m.f10076h);
                        break;
                    case 84:
                        i = indexCount2;
                        c2724k.f10061g = typedArrayObtainStyledAttributes.getInteger(index2, c2724k.f10061g);
                        break;
                    case 85:
                        i = indexCount2;
                        c2724k.f10060f = typedArrayObtainStyledAttributes.getFloat(index2, c2724k.f10060f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i14 == 1) {
                            c2724k.f10063i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i14 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c2724k.f10062h = string2;
                            if (string2.indexOf("/") > 0) {
                                c2724k.f10063i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c2724k.f10063i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c2723j.f10044q = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10044q);
                        break;
                    case 92:
                        i = indexCount2;
                        c2723j.f10045r = m4798f(typedArrayObtainStyledAttributes, index2, c2723j.f10045r);
                        break;
                    case 93:
                        i = indexCount2;
                        c2723j.f9998L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f9998L);
                        break;
                    case 94:
                        i = indexCount2;
                        c2723j.f10005S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c2723j.f10005S);
                        break;
                    case 95:
                        i = indexCount2;
                        m4799g(c2723j, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i12++;
                    case 96:
                        i = indexCount2;
                        m4799g(c2723j, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c2723j.f10042o0 = typedArrayObtainStyledAttributes.getInt(index2, c2723j.f10042o0);
                        break;
                }
                i12++;
            }
            if (c2723j.f10032j0 != null) {
                c2723j.f10030i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c2722i;
    }

    /* renamed from: f */
    public static int m4798f(TypedArray typedArray, int i, int i4) {
        int resourceId = typedArray.getResourceId(i, i4);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4799g(Object obj, TypedArray typedArray, int i, int i4) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i8 = typedArray.peekValue(i).type;
        boolean z7 = true;
        int i9 = 0;
        if (i8 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof C2718e) {
                        C2718e c2718e = (C2718e) obj;
                        if (i4 == 0) {
                            ((ViewGroup.MarginLayoutParams) c2718e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c2718e).height = 0;
                        }
                        m4800h(c2718e, strTrim2);
                        return;
                    }
                    if (obj instanceof C2723j) {
                        ((C2723j) obj).f10052y = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C2721h) {
                            ((C2721h) obj).m4789c(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f8 = Float.parseFloat(strTrim2);
                        if (obj instanceof C2718e) {
                            C2718e c2718e2 = (C2718e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) c2718e2).width = 0;
                                c2718e2.f9894H = f8;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c2718e2).height = 0;
                                c2718e2.f9895I = f8;
                                return;
                            }
                        }
                        if (obj instanceof C2723j) {
                            C2723j c2723j = (C2723j) obj;
                            if (i4 == 0) {
                                c2723j.f10015b = 0;
                                c2723j.f10007U = f8;
                                return;
                            } else {
                                c2723j.f10017c = 0;
                                c2723j.f10006T = f8;
                                return;
                            }
                        }
                        if (obj instanceof C2721h) {
                            C2721h c2721h = (C2721h) obj;
                            if (i4 == 0) {
                                c2721h.m4788b(23, 0);
                                c2721h.m4787a(39, f8);
                                return;
                            } else {
                                c2721h.m4788b(21, 0);
                                c2721h.m4787a(40, f8);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C2718e) {
                            C2718e c2718e3 = (C2718e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) c2718e3).width = 0;
                                c2718e3.f9904R = fMax;
                                c2718e3.f9898L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c2718e3).height = 0;
                                c2718e3.f9905S = fMax;
                                c2718e3.f9899M = 2;
                                return;
                            }
                        }
                        if (obj instanceof C2723j) {
                            C2723j c2723j2 = (C2723j) obj;
                            if (i4 == 0) {
                                c2723j2.f10015b = 0;
                                c2723j2.f10020d0 = fMax;
                                c2723j2.f10010X = 2;
                                return;
                            } else {
                                c2723j2.f10017c = 0;
                                c2723j2.f10022e0 = fMax;
                                c2723j2.f10011Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof C2721h) {
                            C2721h c2721h2 = (C2721h) obj;
                            if (i4 == 0) {
                                c2721h2.m4788b(23, 0);
                                c2721h2.m4788b(54, 2);
                                return;
                            } else {
                                c2721h2.m4788b(21, 0);
                                c2721h2.m4788b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i8 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i9 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z7 = false;
            }
            if (!(obj instanceof C2718e)) {
                C2718e c2718e4 = (C2718e) obj;
                if (i4 == 0) {
                    ((ViewGroup.MarginLayoutParams) c2718e4).width = i9;
                    c2718e4.f9909W = z7;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c2718e4).height = i9;
                    c2718e4.f9910X = z7;
                    return;
                }
            }
            if (obj instanceof C2723j) {
                C2723j c2723j3 = (C2723j) obj;
                if (i4 == 0) {
                    c2723j3.f10015b = i9;
                    c2723j3.f10036l0 = z7;
                    return;
                } else {
                    c2723j3.f10017c = i9;
                    c2723j3.f10038m0 = z7;
                    return;
                }
            }
            if (obj instanceof C2721h) {
                C2721h c2721h3 = (C2721h) obj;
                if (i4 == 0) {
                    c2721h3.m4788b(23, i9);
                    c2721h3.m4790d(80, z7);
                    return;
                } else {
                    c2721h3.m4788b(21, i9);
                    c2721h3.m4790d(81, z7);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z7 = false;
        i9 = dimensionPixelSize;
        if (!(obj instanceof C2718e)) {
        }
    }

    /* renamed from: h */
    public static void m4800h(C2718e c2718e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f8 = Float.parseFloat(strSubstring3);
                        float f9 = Float.parseFloat(strSubstring4);
                        if (f8 > 0.0f && f9 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f9 / f8);
                            } else {
                                Math.abs(f8 / f9);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c2718e.f9893G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void m4801a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        C2727n c2727n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c2727n.f10087c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c2727n.f10086b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C2722i c2722i = (C2722i) map2.get(Integer.valueOf(id));
                        if (c2722i != null) {
                            C2725l c2725l = c2722i.f9981b;
                            C2723j c2723j = c2722i.f9983d;
                            C2726m c2726m = c2722i.f9984e;
                            if (childAt instanceof C2714a) {
                                c2723j.f10028h0 = 1;
                                C2714a c2714a = (C2714a) childAt;
                                c2714a.setId(id);
                                c2714a.setType(c2723j.f10024f0);
                                c2714a.setMargin(c2723j.f10026g0);
                                c2714a.setAllowsGoneWidget(c2723j.f10040n0);
                                int[] iArr = c2723j.f10030i0;
                                if (iArr != null) {
                                    c2714a.setReferencedIds(iArr);
                                } else {
                                    String str = c2723j.f10032j0;
                                    if (str != null) {
                                        int[] iArrM4796c = m4796c(c2714a, str);
                                        c2723j.f10030i0 = iArrM4796c;
                                        c2714a.setReferencedIds(iArrM4796c);
                                    }
                                }
                            }
                            C2718e c2718e = (C2718e) childAt.getLayoutParams();
                            c2718e.m4784a();
                            c2722i.m4791a(c2718e);
                            HashMap map3 = c2722i.f9985f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                C2715b c2715b = (C2715b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strM25u = !c2715b.f9872a ? AbstractC0008a1.m25u("set", str2) : str2;
                                int i8 = i4;
                                try {
                                    int iM4162a = AbstractC2334g.m4162a(c2715b.f9873b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iM4162a) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strM25u, cls3).invoke(childAt, Integer.valueOf(c2715b.f9874c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strM25u, cls2).invoke(childAt, Float.valueOf(c2715b.f9875d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strM25u, cls3).invoke(childAt, Integer.valueOf(c2715b.f9878g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strM25u, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c2715b.f9878g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i4 = i8;
                                                map3 = map;
                                            } catch (NoSuchMethodException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM25u, e);
                                                hashSet2 = hashSet3;
                                                i4 = i8;
                                                map3 = map;
                                            } catch (InvocationTargetException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i4 = i8;
                                                map3 = map;
                                            }
                                        case 4:
                                            cls.getMethod(strM25u, CharSequence.class).invoke(childAt, c2715b.f9876e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strM25u, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c2715b.f9877f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strM25u, cls2).invoke(childAt, Float.valueOf(c2715b.f9875d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strM25u, cls3).invoke(childAt, Integer.valueOf(c2715b.f9874c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e10) {
                                    e = e10;
                                    map = map3;
                                } catch (NoSuchMethodException e11) {
                                    e = e11;
                                    map = map3;
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i4 = i8;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i4;
                            childAt.setLayoutParams(c2718e);
                            if (c2725l.f10065b == 0) {
                                childAt.setVisibility(c2725l.f10064a);
                            }
                            childAt.setAlpha(c2725l.f10066c);
                            childAt.setRotation(c2726m.f10069a);
                            childAt.setRotationX(c2726m.f10070b);
                            childAt.setRotationY(c2726m.f10071c);
                            childAt.setScaleX(c2726m.f10072d);
                            childAt.setScaleY(c2726m.f10073e);
                            if (c2726m.f10076h != -1) {
                                if (((View) childAt.getParent()).findViewById(c2726m.f10076h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c2726m.f10074f)) {
                                    childAt.setPivotX(c2726m.f10074f);
                                }
                                if (!Float.isNaN(c2726m.f10075g)) {
                                    childAt.setPivotY(c2726m.f10075g);
                                }
                            }
                            childAt.setTranslationX(c2726m.f10077i);
                            childAt.setTranslationY(c2726m.f10078j);
                            childAt.setTranslationZ(c2726m.f10079k);
                            if (c2726m.f10080l) {
                                childAt.setElevation(c2726m.f10081m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i + 1;
                c2727n = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i4;
            i4 = i + 1;
            c2727n = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C2722i c2722i2 = (C2722i) map2.get(num);
            if (c2722i2 != null) {
                C2723j c2723j2 = c2722i2.f9983d;
                if (c2723j2.f10028h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C2714a c2714a2 = new C2714a(context);
                    c2714a2.f9879j = new int[32];
                    c2714a2.f9885p = new HashMap();
                    c2714a2.f9881l = context;
                    C2439a c2439a = new C2439a();
                    c2439a.f8790s0 = 0;
                    c2439a.f8791t0 = true;
                    c2439a.f8792u0 = 0;
                    c2439a.f8793v0 = false;
                    c2714a2.f9871s = c2439a;
                    c2714a2.f9882m = c2439a;
                    c2714a2.m4783i();
                    c2714a2.setVisibility(8);
                    c2714a2.setId(num.intValue());
                    int[] iArr2 = c2723j2.f10030i0;
                    if (iArr2 != null) {
                        c2714a2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c2723j2.f10032j0;
                        if (str3 != null) {
                            int[] iArrM4796c2 = m4796c(c2714a2, str3);
                            c2723j2.f10030i0 = iArrM4796c2;
                            c2714a2.setReferencedIds(iArrM4796c2);
                        }
                    }
                    c2714a2.setType(c2723j2.f10024f0);
                    c2714a2.setMargin(c2723j2.f10026g0);
                    C2718e c2718eM496g = ConstraintLayout.m496g();
                    c2714a2.m4783i();
                    c2722i2.m4791a(c2718eM496g);
                    constraintLayout.addView(c2714a2, c2718eM496g);
                }
                if (c2723j2.f10013a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C2718e c2718eM496g2 = ConstraintLayout.m496g();
                    c2722i2.m4791a(c2718eM496g2);
                    constraintLayout.addView(guideline, c2718eM496g2);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof AbstractC2716c) {
                ((AbstractC2716c) childAt2).mo4780e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m4802b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i4;
        C2727n c2727n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c2727n.f10087c;
        map2.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            C2718e c2718e = (C2718e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c2727n.f10086b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C2722i());
            }
            C2722i c2722i = (C2722i) map2.get(Integer.valueOf(id));
            if (c2722i == null) {
                i = childCount;
                map = map2;
                i4 = i8;
            } else {
                C2725l c2725l = c2722i.f9981b;
                C2723j c2723j = c2722i.f9983d;
                C2726m c2726m = c2722i.f9984e;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i4 = i8;
                HashMap map4 = c2727n.f10085a;
                for (String str : map4.keySet()) {
                    C2715b c2715b = (C2715b) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C2715b(c2715b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C2715b(c2715b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                    } catch (NoSuchMethodException e8) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e8);
                    } catch (InvocationTargetException e9) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e9);
                    }
                    map4 = map5;
                }
                c2722i.f9985f = map3;
                c2722i.f9980a = id;
                c2723j.f10027h = c2718e.f9921e;
                c2723j.f10029i = c2718e.f9923f;
                c2723j.f10031j = c2718e.f9925g;
                c2723j.f10033k = c2718e.f9927h;
                c2723j.f10035l = c2718e.f9929i;
                c2723j.f10037m = c2718e.f9931j;
                c2723j.f10039n = c2718e.f9933k;
                c2723j.f10041o = c2718e.f9935l;
                c2723j.f10043p = c2718e.f9937m;
                c2723j.f10044q = c2718e.f9939n;
                c2723j.f10045r = c2718e.f9941o;
                c2723j.f10046s = c2718e.f9947s;
                c2723j.f10047t = c2718e.f9948t;
                c2723j.f10048u = c2718e.f9949u;
                c2723j.f10049v = c2718e.f9950v;
                c2723j.f10050w = c2718e.f9891E;
                c2723j.f10051x = c2718e.f9892F;
                c2723j.f10052y = c2718e.f9893G;
                c2723j.f10053z = c2718e.f9943p;
                c2723j.f9987A = c2718e.f9945q;
                c2723j.f9988B = c2718e.f9946r;
                c2723j.f9989C = c2718e.f9906T;
                c2723j.f9990D = c2718e.f9907U;
                c2723j.f9991E = c2718e.f9908V;
                c2723j.f10023f = c2718e.f9917c;
                c2723j.f10019d = c2718e.f9913a;
                c2723j.f10021e = c2718e.f9915b;
                c2723j.f10015b = ((ViewGroup.MarginLayoutParams) c2718e).width;
                c2723j.f10017c = ((ViewGroup.MarginLayoutParams) c2718e).height;
                c2723j.f9992F = ((ViewGroup.MarginLayoutParams) c2718e).leftMargin;
                c2723j.f9993G = ((ViewGroup.MarginLayoutParams) c2718e).rightMargin;
                c2723j.f9994H = ((ViewGroup.MarginLayoutParams) c2718e).topMargin;
                c2723j.f9995I = ((ViewGroup.MarginLayoutParams) c2718e).bottomMargin;
                c2723j.f9998L = c2718e.f9890D;
                c2723j.f10006T = c2718e.f9895I;
                c2723j.f10007U = c2718e.f9894H;
                c2723j.f10009W = c2718e.f9897K;
                c2723j.f10008V = c2718e.f9896J;
                c2723j.f10036l0 = c2718e.f9909W;
                c2723j.f10038m0 = c2718e.f9910X;
                c2723j.f10010X = c2718e.f9898L;
                c2723j.f10011Y = c2718e.f9899M;
                c2723j.f10012Z = c2718e.f9902P;
                c2723j.f10014a0 = c2718e.f9903Q;
                c2723j.f10016b0 = c2718e.f9900N;
                c2723j.f10018c0 = c2718e.f9901O;
                c2723j.f10020d0 = c2718e.f9904R;
                c2723j.f10022e0 = c2718e.f9905S;
                c2723j.f10034k0 = c2718e.f9911Y;
                c2723j.f10000N = c2718e.f9952x;
                c2723j.f10002P = c2718e.f9954z;
                c2723j.f9999M = c2718e.f9951w;
                c2723j.f10001O = c2718e.f9953y;
                c2723j.f10004R = c2718e.f9887A;
                c2723j.f10003Q = c2718e.f9888B;
                c2723j.f10005S = c2718e.f9889C;
                c2723j.f10042o0 = c2718e.f9912Z;
                c2723j.f9996J = c2718e.getMarginEnd();
                c2723j.f9997K = c2718e.getMarginStart();
                c2725l.f10064a = childAt.getVisibility();
                c2725l.f10066c = childAt.getAlpha();
                c2726m.f10069a = childAt.getRotation();
                c2726m.f10070b = childAt.getRotationX();
                c2726m.f10071c = childAt.getRotationY();
                c2726m.f10072d = childAt.getScaleX();
                c2726m.f10073e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c2726m.f10074f = pivotX;
                    c2726m.f10075g = pivotY;
                }
                c2726m.f10077i = childAt.getTranslationX();
                c2726m.f10078j = childAt.getTranslationY();
                c2726m.f10079k = childAt.getTranslationZ();
                if (c2726m.f10080l) {
                    c2726m.f10081m = childAt.getElevation();
                }
                if (childAt instanceof C2714a) {
                    C2714a c2714a = (C2714a) childAt;
                    c2723j.f10040n0 = c2714a.getAllowsGoneWidget();
                    c2723j.f10030i0 = c2714a.getReferencedIds();
                    c2723j.f10024f0 = c2714a.getType();
                    c2723j.f10026g0 = c2714a.getMargin();
                }
            }
            i8 = i4 + 1;
            c2727n = this;
            childCount = i;
            map2 = map;
        }
    }

    /* renamed from: e */
    public final void m4803e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C2722i c2722iM4797d = m4797d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2722iM4797d.f9983d.f10013a = true;
                    }
                    this.f10087c.put(Integer.valueOf(c2722iM4797d.f9980a), c2722iM4797d);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e8);
        }
    }
}
