package p197w6;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2980h;

/* renamed from: w6.a */
/* loaded from: classes.dex */
public abstract class AbstractC2704a extends AbstractC2429w {
    /* renamed from: u */
    public static String m4756u(File file) throws IOException {
        Charset charset = AbstractC1199a.f5077a;
        AbstractC2980h.m5136e("charset", charset);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            AbstractC2980h.m5135d("toString(...)", string);
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    /* renamed from: v */
    public static File m4757v(File file) {
        int length;
        int iM2627A0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        AbstractC2980h.m5135d("getPath(...)", path);
        char c8 = File.separatorChar;
        int iM2627A02 = AbstractC1206h.m2627A0(path, c8, 0, 4);
        if (iM2627A02 != 0) {
            length = (iM2627A02 <= 0 || path.charAt(iM2627A02 + (-1)) != ':') ? (iM2627A02 == -1 && AbstractC1206h.m2651w0(path, ':')) ? path.length() : 0 : iM2627A02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c8 || (iM2627A0 = AbstractC1206h.m2627A0(path, c8, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM2627A03 = AbstractC1206h.m2627A0(path, c8, iM2627A0 + 1, 4);
            length = iM2627A03 >= 0 ? iM2627A03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        if ((string.length() == 0) || AbstractC1206h.m2651w0(string, c8)) {
            return new File(string + file2);
        }
        return new File(string + c8 + file2);
    }

    /* renamed from: w */
    public static final void m4758w(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        AbstractC2980h.m5136e("charset", charset);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            AbstractC2980h.m5135d("getBytes(...)", bytes);
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
        AbstractC2980h.m5133b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        AbstractC2980h.m5135d("allocate(...)", byteBufferAllocate);
        int i = 0;
        int i4 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i4, str.length() - i);
            int i8 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC2980h.m5135d("array(...)", cArrArray);
            str.getChars(i, i8, cArrArray, i4);
            charBufferAllocate.limit(iMin + i4);
            i4 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i8 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i4 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i8;
        }
    }
}
