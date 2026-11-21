package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0249w;
import com.bumptech.glide.AbstractC0715d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p052f6.AbstractC1006u;
import p052f6.AbstractC1013w0;
import p052f6.AbstractC1023z1;
import p052f6.C0974j0;
import p052f6.C0992p0;
import p052f6.C1010v0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class AudioCapabilities {
    static final AbstractC0995q0 ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(AbstractC0983m0.m2168n(AudioProfile.DEFAULT_AUDIO_PROFILE));
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;

    @SuppressLint({"InlinedApi"})
    private static final AbstractC0983m0 EXTERNAL_SURROUND_SOUND_ENCODINGS;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api23 {
        private Api23() {
        }

        private static AbstractC1013w0 getAllBluetoothDeviceTypes() {
            C1010v0 c1010v0 = new C1010v0(4);
            Integer[] numArr = {8, 7};
            AbstractC1006u.m2187b(2, numArr);
            c1010v0.m2144d(2);
            System.arraycopy(numArr, 0, c1010v0.f4191a, c1010v0.f4192b, 2);
            c1010v0.f4192b += 2;
            int i = AbstractC1118i0.f4750a;
            if (i >= 31) {
                Integer[] numArr2 = {26, 27};
                AbstractC1006u.m2187b(2, numArr2);
                c1010v0.m2144d(2);
                System.arraycopy(numArr2, 0, c1010v0.f4191a, c1010v0.f4192b, 2);
                c1010v0.f4192b += 2;
            }
            if (i >= 33) {
                c1010v0.m2141a(30);
            }
            return c1010v0.m2207f();
        }

        public static boolean isBluetoothConnected(AudioManager audioManager, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            AudioDeviceInfo[] devices;
            if (audioDeviceInfoApi23 == null) {
                audioManager.getClass();
                devices = audioManager.getDevices(2);
            } else {
                devices = new AudioDeviceInfo[]{audioDeviceInfoApi23.audioDeviceInfo};
            }
            AbstractC1013w0 allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api29 {
        private Api29() {
        }

        public static AbstractC0983m0 getDirectPlaybackSupportedEncodings(C0201g c0201g) {
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            AbstractC1023z1 it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (AbstractC1118i0.f4750a >= AbstractC1118i0.m2460s(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(AudioCapabilities.DEFAULT_SAMPLE_RATE_HZ).build(), (AudioAttributes) c0201g.m619a().f143k)) {
                    c0974j0M2164i.m2141a(num);
                }
            }
            c0974j0M2164i.m2141a(2);
            return c0974j0M2164i.m2159f();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i4, C0201g c0201g) {
            for (int i8 = 10; i8 > 0; i8--) {
                int iM2462u = AbstractC1118i0.m2462u(i8);
                if (iM2462u != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i4).setChannelMask(iM2462u).build(), (AudioAttributes) c0201g.m619a().f143k)) {
                    return i8;
                }
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, C0201g c0201g) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes((AudioAttributes) c0201g.m619a().f143k)));
        }

        public static AudioDeviceInfoApi23 getDefaultRoutedDeviceForAttributes(AudioManager audioManager, C0201g c0201g) {
            try {
                audioManager.getClass();
                List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c0201g.m619a().f143k);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new AudioDeviceInfoApi23(audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC1006u.m2187b(3, objArr);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = AbstractC0983m0.m2163h(3, objArr);
        C0992p0 c0992p0 = new C0992p0(4);
        c0992p0.m2180b(5, 6);
        c0992p0.m2180b(17, 6);
        c0992p0.m2180b(7, 6);
        c0992p0.m2180b(30, 10);
        c0992p0.m2180b(18, 6);
        c0992p0.m2180b(6, 8);
        c0992p0.m2180b(8, 8);
        c0992p0.m2180b(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = c0992p0.m2179a();
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = AbstractC1118i0.f4752c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static AbstractC0983m0 getAudioProfiles(List<android.media.AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC0715d.m1559f(12)));
        for (int i = 0; i < list.size(); i++) {
            android.media.AudioProfile audioProfile = list.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (AbstractC1118i0.m2423N(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC0715d.m1559f(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC0715d.m1559f(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (Map.Entry entry : map.entrySet()) {
            c0974j0M2164i.m2141a(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return c0974j0M2164i.m2159f();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, C0201g.f1098b, null);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, C0201g c0201g, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0201g, audioDeviceInfoApi23);
    }

    private static int getChannelConfigForPassthrough(int i) {
        int i4 = AbstractC1118i0.f4750a;
        if (i4 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i4 <= 26 && "fugu".equals(AbstractC1118i0.f4751b) && i == 1) {
            i = 2;
        }
        return AbstractC1118i0.m2462u(i);
    }

    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return AbstractC1118i0.m2454m(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(C0249w c0249w) {
        return getEncodingAndChannelConfigForPassthrough(c0249w, C0201g.f1098b);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return (AbstractC1118i0.m2455n(this.encodingToAudioProfile) * 31) + this.maxChannelCount;
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(C0249w c0249w) {
        return isPassthroughPlaybackSupported(c0249w, C0201g.f1098b);
    }

    public boolean supportsEncoding(int i) {
        SparseArray<AudioProfile> sparseArray = this.encodingToAudioProfile;
        int i4 = AbstractC1118i0.f4750a;
        return sparseArray.indexOfKey(i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + "]";
    }

    @Deprecated
    public AudioCapabilities(int[] iArr, int i) {
        this(getAudioProfiles(iArr, i));
    }

    public static AudioCapabilities getCapabilities(Context context, C0201g c0201g, AudioDeviceInfo audioDeviceInfo) {
        return getCapabilitiesInternal(context, c0201g, (AbstractC1118i0.f4750a < 23 || audioDeviceInfo == null) ? null : new AudioDeviceInfoApi23(audioDeviceInfo));
    }

    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(C0249w c0249w, C0201g c0201g) {
        String str = c0249w.f1522n;
        str.getClass();
        int iM675d = AbstractC0244u0.m675d(str, c0249w.f1519k);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(iM675d))) {
            return null;
        }
        if (iM675d == 18 && !supportsEncoding(18)) {
            iM675d = 6;
        } else if ((iM675d == 8 && !supportsEncoding(8)) || (iM675d == 30 && !supportsEncoding(30))) {
            iM675d = 7;
        }
        if (!supportsEncoding(iM675d)) {
            return null;
        }
        AudioProfile audioProfile = this.encodingToAudioProfile.get(iM675d);
        audioProfile.getClass();
        int maxSupportedChannelCountForPassthrough = c0249w.f1498C;
        if (maxSupportedChannelCountForPassthrough == -1 || iM675d == 18) {
            int i = c0249w.f1499D;
            if (i == -1) {
                i = DEFAULT_SAMPLE_RATE_HZ;
            }
            maxSupportedChannelCountForPassthrough = audioProfile.getMaxSupportedChannelCountForPassthrough(i, c0201g);
        } else if (!c0249w.f1522n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC1118i0.f4750a >= 33) {
            if (!audioProfile.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM675d), Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(C0249w c0249w, C0201g c0201g) {
        return getEncodingAndChannelConfigForPassthrough(c0249w, c0201g) != null;
    }

    private AudioCapabilities(List<AudioProfile> list) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = list.get(i);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i4 = 0; i4 < this.encodingToAudioProfile.size(); i4++) {
            iMax = Math.max(iMax, this.encodingToAudioProfile.valueAt(i4).maxChannelCount);
        }
        this.maxChannelCount = iMax;
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, Intent intent, C0201g c0201g, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (audioDeviceInfoApi23 == null) {
            audioDeviceInfoApi23 = AbstractC1118i0.f4750a >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, c0201g) : null;
        }
        int i = AbstractC1118i0.f4750a;
        if (i >= 33 && (AbstractC1118i0.m2426Q(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, c0201g);
        }
        if (i >= 23 && Api23.isBluetoothConnected(audioManager, audioDeviceInfoApi23)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        C1010v0 c1010v0 = new C1010v0(4);
        c1010v0.m2141a(2);
        if (i >= 29 && (AbstractC1118i0.m2426Q(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            AbstractC0983m0 directPlaybackSupportedEncodings = Api29.getDirectPlaybackSupportedEncodings(c0201g);
            directPlaybackSupportedEncodings.getClass();
            c1010v0.m2143c(directPlaybackSupportedEncodings);
            return new AudioCapabilities(getAudioProfiles(AbstractC0715d.m1569p0(c1010v0.m2207f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z7 = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z7 || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            AbstractC0983m0 abstractC0983m0 = EXTERNAL_SURROUND_SOUND_ENCODINGS;
            abstractC0983m0.getClass();
            c1010v0.m2143c(abstractC0983m0);
        }
        if (intent != null && !z7 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                List listM1559f = AbstractC0715d.m1559f(intArrayExtra);
                listM1559f.getClass();
                c1010v0.m2143c(listM1559f);
            }
            return new AudioCapabilities(getAudioProfiles(AbstractC0715d.m1569p0(c1010v0.m2207f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new AudioCapabilities(getAudioProfiles(AbstractC0715d.m1569p0(c1010v0.m2207f()), 10));
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;
        private final AbstractC1013w0 channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = AbstractC1118i0.f4750a >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        public AudioProfile(int i, Set<Integer> set) {
            this.encoding = i;
            AbstractC1013w0 abstractC1013w0M2210j = AbstractC1013w0.m2210j(set);
            this.channelMasks = abstractC1013w0M2210j;
            AbstractC1023z1 it = abstractC1013w0M2210j.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.maxChannelCount = iMax;
        }

        private static AbstractC1013w0 getAllChannelMasksForMaxChannelCount(int i) {
            C1010v0 c1010v0 = new C1010v0(4);
            for (int i4 = 1; i4 <= i; i4++) {
                c1010v0.m2141a(Integer.valueOf(AbstractC1118i0.m2462u(i4)));
            }
            return c1010v0.m2207f();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            if (this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount) {
                AbstractC1013w0 abstractC1013w0 = this.channelMasks;
                AbstractC1013w0 abstractC1013w02 = audioProfile.channelMasks;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(abstractC1013w0, abstractC1013w02)) {
                    return true;
                }
            }
            return false;
        }

        public int getMaxSupportedChannelCountForPassthrough(int i, C0201g c0201g) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            if (AbstractC1118i0.f4750a >= 29) {
                return Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i, c0201g);
            }
            Object obj = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.get(Integer.valueOf(this.encoding));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }

        public int hashCode() {
            int i = ((this.encoding * 31) + this.maxChannelCount) * 31;
            AbstractC1013w0 abstractC1013w0 = this.channelMasks;
            return i + (abstractC1013w0 == null ? 0 : abstractC1013w0.hashCode());
        }

        public boolean supportsChannelCount(int i) {
            if (this.channelMasks == null) {
                return i <= this.maxChannelCount;
            }
            int iM2462u = AbstractC1118i0.m2462u(i);
            if (iM2462u == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(iM2462u));
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i, int i4) {
            this.encoding = i;
            this.maxChannelCount = i4;
            this.channelMasks = null;
        }
    }

    private static AbstractC0983m0 getAudioProfiles(int[] iArr, int i) {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i4 : iArr) {
            c0974j0M2164i.m2141a(new AudioProfile(i4, i));
        }
        return c0974j0M2164i.m2159f();
    }
}
