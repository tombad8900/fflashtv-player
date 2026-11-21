package p069h7;

import java.nio.charset.Charset;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.a */
/* loaded from: classes.dex */
public abstract class AbstractC1199a {

    /* renamed from: a */
    public static final Charset f5077a;

    /* renamed from: b */
    public static volatile Charset f5078b;

    /* renamed from: c */
    public static volatile Charset f5079c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC2980h.m5135d("forName(...)", charsetForName);
        f5077a = charsetForName;
        AbstractC2980h.m5135d("forName(...)", Charset.forName("UTF-16"));
        AbstractC2980h.m5135d("forName(...)", Charset.forName("UTF-16BE"));
        AbstractC2980h.m5135d("forName(...)", Charset.forName("UTF-16LE"));
        AbstractC2980h.m5135d("forName(...)", Charset.forName("US-ASCII"));
        AbstractC2980h.m5135d("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
