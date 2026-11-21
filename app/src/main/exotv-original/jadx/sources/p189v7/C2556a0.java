package p189v7;

import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import java.io.File;
import java.security.MessageDigest;
import okhttp3.C2181z;
import p069h7.AbstractC1214p;
import p183v0.C2523w;
import p198w7.AbstractC2707c;
import p198w7.C2710f;
import p200x0.C2734b;
import p202x2.InterfaceC2747c;
import p210y3.InterfaceC2802f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.a0 */
/* loaded from: classes.dex */
public final class C2556a0 implements InterfaceC2747c, InterfaceC2802f {

    /* renamed from: k */
    public static C2556a0 f9269k;

    /* renamed from: j */
    public final /* synthetic */ int f9270j;

    public /* synthetic */ C2556a0(int i) {
        this.f9270j = i;
    }

    /* renamed from: b */
    public static final boolean m4570b(C2558b0 c2558b0) {
        C2558b0 c2558b02 = C2710f.f9834e;
        C2579m c2579mM4673o = c2558b0.f9273j;
        int iM4672k = C2579m.m4672k(c2579mM4673o, AbstractC2707c.f9824a);
        if (iM4672k == -1) {
            iM4672k = C2579m.m4672k(c2558b0.f9273j, AbstractC2707c.f9825b);
        }
        if (iM4672k != -1) {
            c2579mM4673o = C2579m.m4673o(c2579mM4673o, iM4672k + 1, 0, 2);
        } else if (c2558b0.m4592f() != null && c2579mM4673o.mo4634d() == 2) {
            c2579mM4673o = C2579m.f9316m;
        }
        return !AbstractC1214p.m2660m0(c2579mM4673o.m4675q(), ".class", true);
    }

    /* renamed from: c */
    public static C2558b0 m4571c(String str) {
        AbstractC2980h.m5136e("<this>", str);
        C2579m c2579m = AbstractC2707c.f9824a;
        C2573j c2573j = new C2573j();
        c2573j.m4661Q(str);
        return AbstractC2707c.m4771d(c2573j, false);
    }

    /* renamed from: e */
    public static C2558b0 m4572e(File file) {
        String str = C2558b0.f9272k;
        String string = file.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return m4571c(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4573f(C2734b c2734b, Editable editable, int i, int i4, boolean z7) {
        int iMin;
        if (editable != null && i >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z7) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i4, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z8 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z8) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z8) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z8 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z9 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z9) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z9 = true;
                                    }
                                } else {
                                    if (z9) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i4, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i4, editable.length());
                }
                C2523w[] c2523wArr = (C2523w[]) editable.getSpans(selectionStart, iMin, C2523w.class);
                if (c2523wArr != null && c2523wArr.length > 0) {
                    for (C2523w c2523w : c2523wArr) {
                        int spanStart = editable.getSpanStart(c2523w);
                        int spanEnd = editable.getSpanEnd(c2523w);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c2734b.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c2734b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m4574g() {
    }

    /* renamed from: h */
    private final void m4575h(int i, Object obj) {
    }

    @Override // p210y3.InterfaceC2802f
    /* renamed from: a */
    public void mo2589a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p202x2.InterfaceC2747c
    /* renamed from: d */
    public void mo3322d() {
        switch (this.f9270j) {
            case 5:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p202x2.InterfaceC2747c
    /* renamed from: j */
    public void mo3323j(int i, Object obj) {
        String str;
        switch (this.f9270j) {
            case 5:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = C2181z.FRAGMENT_ENCODE_SET;
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }
}
