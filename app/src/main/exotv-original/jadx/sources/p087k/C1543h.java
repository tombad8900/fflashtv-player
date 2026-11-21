package p087k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import okhttp3.internal.http2.C2131o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p054g.AbstractC1026a;
import p095l.ActionProviderVisibilityListenerC1631q;
import p095l.MenuC1627m;
import p104m.AbstractC1714e1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.h */
/* loaded from: classes.dex */
public final class C1543h extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f5907e;

    /* renamed from: f */
    public static final Class[] f5908f;

    /* renamed from: a */
    public final Object[] f5909a;

    /* renamed from: b */
    public final Object[] f5910b;

    /* renamed from: c */
    public final Context f5911c;

    /* renamed from: d */
    public Object f5912d;

    static {
        Class[] clsArr = {Context.class};
        f5907e = clsArr;
        f5908f = clsArr;
    }

    public C1543h(Context context) {
        super(context);
        this.f5911c = context;
        Object[] objArr = {context};
        this.f5909a = objArr;
        this.f5910b = objArr;
    }

    /* renamed from: a */
    public static Object m3220a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3220a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void m3221b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C1542g c1542g = new C1542g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z7 = z7;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z8 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c1542g.f5882b = 0;
                            c1542g.f5883c = 0;
                            c1542g.f5884d = 0;
                            c1542g.f5885e = 0;
                            c1542g.f5886f = true;
                            c1542g.f5887g = true;
                        } else if (name2.equals("item")) {
                            if (!c1542g.f5888h) {
                                ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = c1542g.f5906z;
                                if (actionProviderVisibilityListenerC1631q == null || !actionProviderVisibilityListenerC1631q.f6260b.hasSubMenu()) {
                                    c1542g.f5888h = true;
                                    c1542g.m3219b(c1542g.f5881a.add(c1542g.f5882b, c1542g.f5889i, c1542g.f5890j, c1542g.f5891k));
                                } else {
                                    c1542g.f5888h = true;
                                    c1542g.m3219b(c1542g.f5881a.addSubMenu(c1542g.f5882b, c1542g.f5889i, c1542g.f5890j, c1542g.f5891k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z7 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z7 = z7;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z7 = z7;
                z8 = z8;
            } else {
                if (!z8) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f5911c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4323p);
                        c1542g.f5882b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c1542g.f5883c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c1542g.f5884d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c1542g.f5885e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c1542g.f5886f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c1542g.f5887g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4324q);
                            c1542g.f5889i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c1542g.f5890j = (typedArrayObtainStyledAttributes2.getInt(5, c1542g.f5883c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c1542g.f5884d) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
                            c1542g.f5891k = typedArrayObtainStyledAttributes2.getText(7);
                            c1542g.f5892l = typedArrayObtainStyledAttributes2.getText(8);
                            c1542g.f5893m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c1542g.f5894n = string == null ? (char) 0 : string.charAt(0);
                            c1542g.f5895o = typedArrayObtainStyledAttributes2.getInt(16, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c1542g.f5896p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1542g.f5897q = typedArrayObtainStyledAttributes2.getInt(20, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c1542g.f5898r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1542g.f5898r = c1542g.f5885e;
                            }
                            c1542g.f5899s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c1542g.f5900t = typedArrayObtainStyledAttributes2.getBoolean(4, c1542g.f5886f);
                            c1542g.f5901u = typedArrayObtainStyledAttributes2.getBoolean(1, c1542g.f5887g);
                            c1542g.f5902v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c1542g.f5905y = typedArrayObtainStyledAttributes2.getString(12);
                            c1542g.f5903w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c1542g.f5904x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z9 = string3 != null;
                            if (z9 && c1542g.f5903w == 0 && c1542g.f5904x == null) {
                                c1542g.f5906z = (ActionProviderVisibilityListenerC1631q) c1542g.m3218a(string3, f5908f, this.f5910b);
                            } else {
                                if (z9) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c1542g.f5906z = null;
                            }
                            c1542g.f5876A = typedArrayObtainStyledAttributes2.getText(17);
                            c1542g.f5877B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c1542g.f5879D = AbstractC1714e1.m3393b(typedArrayObtainStyledAttributes2.getInt(19, -1), c1542g.f5879D);
                            } else {
                                c1542g.f5879D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0120b.m424t(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c1542g.f5878C = colorStateList;
                            } else {
                                c1542g.f5878C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c1542g.f5888h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c1542g.f5888h = true;
                            SubMenu subMenuAddSubMenu = c1542g.f5881a.addSubMenu(c1542g.f5882b, c1542g.f5889i, c1542g.f5890j, c1542g.f5891k);
                            c1542g.m3219b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m3221b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z8 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z7 = z7;
                        z8 = z8;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z7 = z7;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z7 = z7;
            z8 = z8;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC1627m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z7 = false;
        try {
            try {
                layout = this.f5911c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC1627m) {
                    MenuC1627m menuC1627m = (MenuC1627m) menu;
                    if (!menuC1627m.f6224y) {
                        menuC1627m.m3320w();
                        z7 = true;
                    }
                }
                m3221b(layout, attributeSetAsAttributeSet, menu);
                if (z7) {
                    ((MenuC1627m) menu).m3319v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (z7) {
                ((MenuC1627m) menu).m3319v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
