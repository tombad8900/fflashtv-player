package p164s7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.EnumC2074f0;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.e */
/* loaded from: classes.dex */
public final class C2382e extends C2385h {
    public static final b Companion = new b(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.e$a */
    public static final class a implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public a(List<String> list) {
            AbstractC2980h.m5136e("protocols", list);
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC2980h.m5136e("proxy", obj);
            AbstractC2980h.m5136e("method", method);
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC2980h.m5132a(name, "supports") && AbstractC2980h.m5132a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC2980h.m5132a(name, "unsupported") && AbstractC2980h.m5132a(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (AbstractC2980h.m5132a(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((AbstractC2980h.m5132a(name, "selectProtocol") || AbstractC2980h.m5132a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.collections.List<*>", obj2);
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.String", obj3);
                            String str = (String) obj3;
                            if (!this.protocols.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!AbstractC2980h.m5132a(name, "protocolSelected") && !AbstractC2980h.m5132a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.String", obj4);
            this.selected = (String) obj4;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z7) {
            this.unsupported = z7;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2385h buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC2980h.m5135d("jvmVersion", property);
            } catch (NumberFormatException unused) {
            }
            if (Integer.parseInt(property) < 9) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    AbstractC2980h.m5135d("putMethod", method);
                    AbstractC2980h.m5135d("getMethod", method2);
                    AbstractC2980h.m5135d("removeMethod", method3);
                    AbstractC2980h.m5135d("clientProviderClass", cls3);
                    AbstractC2980h.m5135d("serverProviderClass", cls4);
                    return new C2382e(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                }
            }
            return null;
        }

        private b() {
        }
    }

    public C2382e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        AbstractC2980h.m5136e("putMethod", method);
        AbstractC2980h.m5136e("getMethod", method2);
        AbstractC2980h.m5136e("removeMethod", method3);
        AbstractC2980h.m5136e("clientProviderClass", cls);
        AbstractC2980h.m5136e("serverProviderClass", cls2);
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // p164s7.C2385h
    public void afterHandshake(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(C2385h.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new a(C2385h.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // p164s7.C2385h
    public String getSelectedProtocol(SSLSocket sSLSocket) throws IllegalArgumentException {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            AbstractC2980h.m5134c("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider", invocationHandler);
            a aVar = (a) invocationHandler;
            if (!aVar.getUnsupported() && aVar.getSelected() == null) {
                C2385h.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.getUnsupported()) {
                return null;
            }
            return aVar.getSelected();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
