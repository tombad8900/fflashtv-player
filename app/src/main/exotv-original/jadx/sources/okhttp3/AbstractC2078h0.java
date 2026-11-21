package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import p069h7.AbstractC1199a;
import p147q7.AbstractC2278c;
import p189v7.AbstractC2557b;
import p189v7.C2563e;
import p189v7.C2579m;
import p189v7.InterfaceC2575k;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC2078h0 {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.h0$a */
    public static final class a {

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.h0$a$a, reason: collision with other inner class name */
        public static final class C2992a extends AbstractC2078h0 {
            final /* synthetic */ C2070d0 $contentType;
            final /* synthetic */ File $this_asRequestBody;

            public C2992a(C2070d0 c2070d0, File file) {
                this.$contentType = c2070d0;
                this.$this_asRequestBody = file;
            }

            @Override // okhttp3.AbstractC2078h0
            public long contentLength() {
                return this.$this_asRequestBody.length();
            }

            @Override // okhttp3.AbstractC2078h0
            public C2070d0 contentType() {
                return this.$contentType;
            }

            @Override // okhttp3.AbstractC2078h0
            public void writeTo(InterfaceC2575k interfaceC2575k) {
                AbstractC2980h.m5136e("sink", interfaceC2575k);
                C2563e c2563eM4583h = AbstractC2557b.m4583h(this.$this_asRequestBody);
                try {
                    interfaceC2575k.mo4598f(c2563eM4583h);
                    c2563eM4583h.close();
                } finally {
                }
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.h0$a$b */
        public static final class b extends AbstractC2078h0 {
            final /* synthetic */ C2070d0 $contentType;
            final /* synthetic */ C2579m $this_toRequestBody;

            public b(C2070d0 c2070d0, C2579m c2579m) {
                this.$contentType = c2070d0;
                this.$this_toRequestBody = c2579m;
            }

            @Override // okhttp3.AbstractC2078h0
            public long contentLength() {
                return this.$this_toRequestBody.mo4634d();
            }

            @Override // okhttp3.AbstractC2078h0
            public C2070d0 contentType() {
                return this.$contentType;
            }

            @Override // okhttp3.AbstractC2078h0
            public void writeTo(InterfaceC2575k interfaceC2575k) {
                AbstractC2980h.m5136e("sink", interfaceC2575k);
                interfaceC2575k.mo4602w(this.$this_toRequestBody);
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.h0$a$c */
        public static final class c extends AbstractC2078h0 {
            final /* synthetic */ int $byteCount;
            final /* synthetic */ C2070d0 $contentType;
            final /* synthetic */ int $offset;
            final /* synthetic */ byte[] $this_toRequestBody;

            public c(C2070d0 c2070d0, int i, byte[] bArr, int i4) {
                this.$contentType = c2070d0;
                this.$byteCount = i;
                this.$this_toRequestBody = bArr;
                this.$offset = i4;
            }

            @Override // okhttp3.AbstractC2078h0
            public long contentLength() {
                return this.$byteCount;
            }

            @Override // okhttp3.AbstractC2078h0
            public C2070d0 contentType() {
                return this.$contentType;
            }

            @Override // okhttp3.AbstractC2078h0
            public void writeTo(InterfaceC2575k interfaceC2575k) {
                AbstractC2980h.m5136e("sink", interfaceC2575k);
                interfaceC2575k.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
            }
        }

        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public static /* synthetic */ AbstractC2078h0 create$default(a aVar, String str, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return aVar.create(str, c2070d0);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr) {
            AbstractC2980h.m5136e("content", bArr);
            return create$default(this, c2070d0, bArr, 0, 0, 12, (Object) null);
        }

        private a() {
        }

        public static /* synthetic */ AbstractC2078h0 create$default(a aVar, C2579m c2579m, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return aVar.create(c2579m, c2070d0);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr, int i) {
            AbstractC2980h.m5136e("content", bArr);
            return create$default(this, c2070d0, bArr, i, 0, 8, (Object) null);
        }

        public static /* synthetic */ AbstractC2078h0 create$default(a aVar, byte[] bArr, C2070d0 c2070d0, int i, int i4, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                c2070d0 = null;
            }
            if ((i8 & 2) != 0) {
                i = 0;
            }
            if ((i8 & 4) != 0) {
                i4 = bArr.length;
            }
            return aVar.create(bArr, c2070d0, i, i4);
        }

        public final AbstractC2078h0 create(byte[] bArr) {
            AbstractC2980h.m5136e("<this>", bArr);
            return create$default(this, bArr, (C2070d0) null, 0, 0, 7, (Object) null);
        }

        public final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", bArr);
            return create$default(this, bArr, c2070d0, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ AbstractC2078h0 create$default(a aVar, File file, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return aVar.create(file, c2070d0);
        }

        public final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0, int i) {
            AbstractC2980h.m5136e("<this>", bArr);
            return create$default(this, bArr, c2070d0, i, 0, 4, (Object) null);
        }

        public static /* synthetic */ AbstractC2078h0 create$default(a aVar, C2070d0 c2070d0, byte[] bArr, int i, int i4, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                i4 = bArr.length;
            }
            return aVar.create(c2070d0, bArr, i, i4);
        }

        public final AbstractC2078h0 create(String str, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", str);
            Charset charset = AbstractC1199a.f5077a;
            if (c2070d0 != null) {
                Charset charsetCharset$default = C2070d0.charset$default(c2070d0, null, 1, null);
                if (charsetCharset$default == null) {
                    c2070d0 = C2070d0.Companion.parse(c2070d0 + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            AbstractC2980h.m5135d("this as java.lang.String).getBytes(charset)", bytes);
            return create(bytes, c2070d0, 0, bytes.length);
        }

        public final AbstractC2078h0 create(C2579m c2579m, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", c2579m);
            return new b(c2070d0, c2579m);
        }

        public final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0, int i, int i4) {
            AbstractC2980h.m5136e("<this>", bArr);
            AbstractC2278c.checkOffsetAndCount(bArr.length, i, i4);
            return new c(c2070d0, i4, bArr, i);
        }

        public final AbstractC2078h0 create(File file, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", file);
            return new C2992a(c2070d0, file);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, String str) {
            AbstractC2980h.m5136e("content", str);
            return create(str, c2070d0);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, C2579m c2579m) {
            AbstractC2980h.m5136e("content", c2579m);
            return create(c2579m, c2070d0);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr, int i, int i4) {
            AbstractC2980h.m5136e("content", bArr);
            return create(bArr, c2070d0, i, i4);
        }

        public final AbstractC2078h0 create(C2070d0 c2070d0, File file) {
            AbstractC2980h.m5136e("file", file);
            return create(file, c2070d0);
        }
    }

    public static final AbstractC2078h0 create(File file, C2070d0 c2070d0) {
        return Companion.create(file, c2070d0);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C2070d0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC2575k interfaceC2575k);

    public static final AbstractC2078h0 create(String str, C2070d0 c2070d0) {
        return Companion.create(str, c2070d0);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, File file) {
        return Companion.create(c2070d0, file);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, String str) {
        return Companion.create(c2070d0, str);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, C2579m c2579m) {
        return Companion.create(c2070d0, c2579m);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr) {
        return Companion.create(c2070d0, bArr);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr, int i) {
        return Companion.create(c2070d0, bArr, i);
    }

    public static final AbstractC2078h0 create(C2070d0 c2070d0, byte[] bArr, int i, int i4) {
        return Companion.create(c2070d0, bArr, i, i4);
    }

    public static final AbstractC2078h0 create(C2579m c2579m, C2070d0 c2070d0) {
        return Companion.create(c2579m, c2070d0);
    }

    public static final AbstractC2078h0 create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0) {
        return Companion.create(bArr, c2070d0);
    }

    public static final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0, int i) {
        return Companion.create(bArr, c2070d0, i);
    }

    public static final AbstractC2078h0 create(byte[] bArr, C2070d0 c2070d0, int i, int i4) {
        return Companion.create(bArr, c2070d0, i, i4);
    }
}
