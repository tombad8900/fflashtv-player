package p003a2;

import androidx.media3.common.C0241t0;
import com.bumptech.glide.AbstractC0714c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p171t5.AbstractC2436a;
import p192w1.C2600b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class C0060a extends AbstractC2436a {

    /* renamed from: c */
    public static final Pattern f290c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f291a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f292b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p171t5.AbstractC2436a
    /* renamed from: d */
    public final C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f292b;
        CharsetDecoder charsetDecoder2 = this.f291a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C0241t0(new C0062c(bArr, null, null));
        }
        Matcher matcher = f290c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM1517e0 = AbstractC0714c.m1517e0(strGroup);
                strM1517e0.getClass();
                if (strM1517e0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM1517e0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C0241t0(new C0062c(bArr, str, str2));
    }
}
