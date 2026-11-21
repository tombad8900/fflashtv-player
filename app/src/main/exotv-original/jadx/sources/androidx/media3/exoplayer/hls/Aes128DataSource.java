package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p089k1.C1566j;
import p089k1.C1568l;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class Aes128DataSource implements InterfaceC1564h {
    private CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final InterfaceC1564h upstream;

    public Aes128DataSource(InterfaceC1564h interfaceC1564h, byte[] bArr, byte[] bArr2) {
        this.upstream = interfaceC1564h;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // p089k1.InterfaceC1564h
    public final void addTransferListener(InterfaceC1557c0 interfaceC1557c0) {
        interfaceC1557c0.getClass();
        this.upstream.addTransferListener(interfaceC1557c0);
    }

    @Override // p089k1.InterfaceC1564h
    public void close() {
        if (this.cipherInputStream != null) {
            this.cipherInputStream = null;
            this.upstream.close();
        }
    }

    public Cipher getCipherInstance() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p089k1.InterfaceC1564h
    public final Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new SecretKeySpec(this.encryptionKey, "AES"), new IvParameterSpec(this.encryptionIv));
                C1566j c1566j = new C1566j(this.upstream, c1568l);
                this.cipherInputStream = new CipherInputStream(c1566j, cipherInstance);
                c1566j.m3232b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        this.cipherInputStream.getClass();
        int i8 = this.cipherInputStream.read(bArr, i, i4);
        if (i8 < 0) {
            return -1;
        }
        return i8;
    }
}
