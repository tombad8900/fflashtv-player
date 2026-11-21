package p199x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p156s.AbstractC2334g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.b */
/* loaded from: classes.dex */
public final class C2715b {

    /* renamed from: a */
    public boolean f9872a = false;

    /* renamed from: b */
    public int f9873b;

    /* renamed from: c */
    public int f9874c;

    /* renamed from: d */
    public float f9875d;

    /* renamed from: e */
    public String f9876e;

    /* renamed from: f */
    public boolean f9877f;

    /* renamed from: g */
    public int f9878g;

    public C2715b(C2715b c2715b, Object obj) {
        c2715b.getClass();
        this.f9873b = c2715b.f9873b;
        m4775b(obj);
    }

    /* renamed from: a */
    public static void m4774a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2730q.f10091d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z7 = false;
        Object objValueOf = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            int i8 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i9 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i9 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i9 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i8 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i8;
                            }
                        }
                        i = 7;
                    }
                }
                i = i9;
            }
        }
        if (string != null && objValueOf != null) {
            C2715b c2715b = new C2715b();
            c2715b.f9873b = i;
            c2715b.f9872a = z7;
            c2715b.m4775b(objValueOf);
            map.put(string, c2715b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m4775b(Object obj) {
        switch (AbstractC2334g.m4162a(this.f9873b)) {
            case 0:
            case 7:
                this.f9874c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f9875d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f9878g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f9876e = (String) obj;
                break;
            case 5:
                this.f9877f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f9875d = ((Float) obj).floatValue();
                break;
        }
    }
}
