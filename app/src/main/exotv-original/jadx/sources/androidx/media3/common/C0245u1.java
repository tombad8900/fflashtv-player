package androidx.media3.common;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.u1 */
/* loaded from: classes.dex */
public class C0245u1 {
    private C0242t1 audioOffloadPreferences;
    private HashSet<Integer> disabledTrackTypes;
    private boolean forceHighestSupportedBitrate;
    private boolean forceLowestBitrate;
    private int ignoredTextSelectionFlags;
    private boolean isPrioritizeImageOverVideoEnabled;
    private int maxAudioBitrate;
    private int maxAudioChannelCount;
    private int maxVideoBitrate;
    private int maxVideoFrameRate;
    private int maxVideoHeight;
    private int maxVideoWidth;
    private int minVideoBitrate;
    private int minVideoFrameRate;
    private int minVideoHeight;
    private int minVideoWidth;
    private HashMap<C0233q1, C0236r1> overrides;
    private AbstractC0983m0 preferredAudioLanguages;
    private AbstractC0983m0 preferredAudioMimeTypes;
    private int preferredAudioRoleFlags;
    private AbstractC0983m0 preferredTextLanguages;
    private int preferredTextRoleFlags;
    private AbstractC0983m0 preferredVideoMimeTypes;
    private int preferredVideoRoleFlags;
    private boolean selectUndeterminedTextLanguage;
    private int viewportHeight;
    private boolean viewportOrientationMayChange;
    private int viewportWidth;

    public C0245u1() {
        this.maxVideoWidth = Integer.MAX_VALUE;
        this.maxVideoHeight = Integer.MAX_VALUE;
        this.maxVideoFrameRate = Integer.MAX_VALUE;
        this.maxVideoBitrate = Integer.MAX_VALUE;
        this.viewportWidth = Integer.MAX_VALUE;
        this.viewportHeight = Integer.MAX_VALUE;
        this.viewportOrientationMayChange = true;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        C0981l1 c0981l1 = C0981l1.f4211n;
        this.preferredVideoMimeTypes = c0981l1;
        this.preferredVideoRoleFlags = 0;
        this.preferredAudioLanguages = c0981l1;
        this.preferredAudioRoleFlags = 0;
        this.maxAudioChannelCount = Integer.MAX_VALUE;
        this.maxAudioBitrate = Integer.MAX_VALUE;
        this.preferredAudioMimeTypes = c0981l1;
        this.audioOffloadPreferences = C0242t1.f1414d;
        this.preferredTextLanguages = c0981l1;
        this.preferredTextRoleFlags = 0;
        this.ignoredTextSelectionFlags = 0;
        this.selectUndeterminedTextLanguage = false;
        this.isPrioritizeImageOverVideoEnabled = false;
        this.forceLowestBitrate = false;
        this.forceHighestSupportedBitrate = false;
        this.overrides = new HashMap<>();
        this.disabledTrackTypes = new HashSet<>();
    }

    /* renamed from: b */
    public static C0981l1 m688b(String[] strArr) {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        strArr.getClass();
        for (String str : strArr) {
            str.getClass();
            c0974j0M2164i.m2141a(AbstractC1118i0.m2429T(str));
        }
        return c0974j0M2164i.m2159f();
    }

    /* renamed from: a */
    public final void m689a(C0248v1 c0248v1) {
        this.maxVideoWidth = c0248v1.maxVideoWidth;
        this.maxVideoHeight = c0248v1.maxVideoHeight;
        this.maxVideoFrameRate = c0248v1.maxVideoFrameRate;
        this.maxVideoBitrate = c0248v1.maxVideoBitrate;
        this.minVideoWidth = c0248v1.minVideoWidth;
        this.minVideoHeight = c0248v1.minVideoHeight;
        this.minVideoFrameRate = c0248v1.minVideoFrameRate;
        this.minVideoBitrate = c0248v1.minVideoBitrate;
        this.viewportWidth = c0248v1.viewportWidth;
        this.viewportHeight = c0248v1.viewportHeight;
        this.viewportOrientationMayChange = c0248v1.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = c0248v1.preferredVideoMimeTypes;
        this.preferredVideoRoleFlags = c0248v1.preferredVideoRoleFlags;
        this.preferredAudioLanguages = c0248v1.preferredAudioLanguages;
        this.preferredAudioRoleFlags = c0248v1.preferredAudioRoleFlags;
        this.maxAudioChannelCount = c0248v1.maxAudioChannelCount;
        this.maxAudioBitrate = c0248v1.maxAudioBitrate;
        this.preferredAudioMimeTypes = c0248v1.preferredAudioMimeTypes;
        this.audioOffloadPreferences = c0248v1.audioOffloadPreferences;
        this.preferredTextLanguages = c0248v1.preferredTextLanguages;
        this.preferredTextRoleFlags = c0248v1.preferredTextRoleFlags;
        this.ignoredTextSelectionFlags = c0248v1.ignoredTextSelectionFlags;
        this.selectUndeterminedTextLanguage = c0248v1.selectUndeterminedTextLanguage;
        this.isPrioritizeImageOverVideoEnabled = c0248v1.isPrioritizeImageOverVideoEnabled;
        this.forceLowestBitrate = c0248v1.forceLowestBitrate;
        this.forceHighestSupportedBitrate = c0248v1.forceHighestSupportedBitrate;
        this.disabledTrackTypes = new HashSet<>(c0248v1.disabledTrackTypes);
        this.overrides = new HashMap<>(c0248v1.overrides);
    }

    public C0245u1 addOverride(C0236r1 c0236r1) {
        this.overrides.put(c0236r1.f1403a, c0236r1);
        return this;
    }

    public C0248v1 build() {
        return new C0248v1(this);
    }

    public C0245u1 clearOverride(C0233q1 c0233q1) {
        this.overrides.remove(c0233q1);
        return this;
    }

    public C0245u1 clearOverrides() {
        this.overrides.clear();
        return this;
    }

    public C0245u1 clearOverridesOfType(int i) {
        Iterator<C0236r1> it = this.overrides.values().iterator();
        while (it.hasNext()) {
            if (it.next().f1403a.f1321c == i) {
                it.remove();
            }
        }
        return this;
    }

    public C0245u1 clearVideoSizeConstraints() {
        return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public C0245u1 setAudioOffloadPreferences(C0242t1 c0242t1) {
        this.audioOffloadPreferences = c0242t1;
        return this;
    }

    public C0245u1 setDisabledTrackTypes(Set set) {
        this.disabledTrackTypes.clear();
        this.disabledTrackTypes.addAll(set);
        return this;
    }

    public C0245u1 setForceHighestSupportedBitrate(boolean z7) {
        this.forceHighestSupportedBitrate = z7;
        return this;
    }

    public C0245u1 setForceLowestBitrate(boolean z7) {
        this.forceLowestBitrate = z7;
        return this;
    }

    public C0245u1 setIgnoredTextSelectionFlags(int i) {
        this.ignoredTextSelectionFlags = i;
        return this;
    }

    public C0245u1 setMaxAudioBitrate(int i) {
        this.maxAudioBitrate = i;
        return this;
    }

    public C0245u1 setMaxAudioChannelCount(int i) {
        this.maxAudioChannelCount = i;
        return this;
    }

    public C0245u1 setMaxVideoBitrate(int i) {
        this.maxVideoBitrate = i;
        return this;
    }

    public C0245u1 setMaxVideoFrameRate(int i) {
        this.maxVideoFrameRate = i;
        return this;
    }

    public C0245u1 setMaxVideoSize(int i, int i4) {
        this.maxVideoWidth = i;
        this.maxVideoHeight = i4;
        return this;
    }

    public C0245u1 setMinVideoBitrate(int i) {
        this.minVideoBitrate = i;
        return this;
    }

    public C0245u1 setMinVideoFrameRate(int i) {
        this.minVideoFrameRate = i;
        return this;
    }

    public C0245u1 setMinVideoSize(int i, int i4) {
        this.minVideoWidth = i;
        this.minVideoHeight = i4;
        return this;
    }

    public C0245u1 setOverrideForType(C0236r1 c0236r1) {
        clearOverridesOfType(c0236r1.f1403a.f1321c);
        this.overrides.put(c0236r1.f1403a, c0236r1);
        return this;
    }

    public C0245u1 setPreferredAudioLanguages(String... strArr) {
        this.preferredAudioLanguages = m688b(strArr);
        return this;
    }

    public C0245u1 setPreferredAudioMimeTypes(String... strArr) {
        this.preferredAudioMimeTypes = AbstractC0983m0.m2166k(strArr);
        return this;
    }

    public C0245u1 setPreferredAudioRoleFlags(int i) {
        this.preferredAudioRoleFlags = i;
        return this;
    }

    public C0245u1 setPreferredTextLanguage(String str) {
        return str == null ? setPreferredTextLanguages(new String[0]) : setPreferredTextLanguages(str);
    }

    public C0245u1 setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC1118i0.f4750a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.preferredTextRoleFlags = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.preferredTextLanguages = AbstractC0983m0.m2168n(locale.toLanguageTag());
            }
        }
        return this;
    }

    public C0245u1 setPreferredTextLanguages(String... strArr) {
        this.preferredTextLanguages = m688b(strArr);
        return this;
    }

    public C0245u1 setPreferredTextRoleFlags(int i) {
        this.preferredTextRoleFlags = i;
        return this;
    }

    public C0245u1 setPreferredVideoMimeTypes(String... strArr) {
        this.preferredVideoMimeTypes = AbstractC0983m0.m2166k(strArr);
        return this;
    }

    public C0245u1 setPreferredVideoRoleFlags(int i) {
        this.preferredVideoRoleFlags = i;
        return this;
    }

    public C0245u1 setPrioritizeImageOverVideoEnabled(boolean z7) {
        this.isPrioritizeImageOverVideoEnabled = z7;
        return this;
    }

    public C0245u1 setSelectUndeterminedTextLanguage(boolean z7) {
        this.selectUndeterminedTextLanguage = z7;
        return this;
    }

    public C0245u1 setTrackTypeDisabled(int i, boolean z7) {
        if (z7) {
            this.disabledTrackTypes.add(Integer.valueOf(i));
            return this;
        }
        this.disabledTrackTypes.remove(Integer.valueOf(i));
        return this;
    }

    public C0245u1 setViewportSize(int i, int i4, boolean z7) {
        this.viewportWidth = i;
        this.viewportHeight = i4;
        this.viewportOrientationMayChange = z7;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0245u1 setViewportSizeToPhysicalDisplaySize(Context context, boolean z7) {
        Point point;
        Point point2;
        int i = AbstractC1118i0.f4750a;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        int i4 = AbstractC1118i0.f4750a;
        if (display.getDisplayId() == 0 && AbstractC1118i0.m2426Q(context)) {
            String strM2417H = i4 < 28 ? AbstractC1118i0.m2417H("sys.display-size") : AbstractC1118i0.m2417H("vendor.display-size");
            if (!TextUtils.isEmpty(strM2417H)) {
                try {
                    String[] strArrSplit = strM2417H.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        if (i8 > 0 && i9 > 0) {
                            point2 = new Point(i8, i9);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC1101a.m2364o("Util", "Invalid display size: " + strM2417H);
            }
            if ("Sony".equals(AbstractC1118i0.f4752c) && AbstractC1118i0.f4753d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            }
            point2 = point;
        } else {
            point = new Point();
            if (i4 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
            point2 = point;
        }
        return setViewportSize(point2.x, point2.y, z7);
    }

    public C0245u1(Context context) {
        this();
        setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
        setViewportSizeToPhysicalDisplaySize(context, true);
    }

    public C0245u1(Bundle bundle) {
        C0242t1 c0242t1;
        C0981l1 c0981l1M2159f;
        String str = C0248v1.FIELD_MAX_VIDEO_WIDTH;
        C0248v1 c0248v1 = C0248v1.DEFAULT_WITHOUT_CONTEXT;
        this.maxVideoWidth = bundle.getInt(str, c0248v1.maxVideoWidth);
        this.maxVideoHeight = bundle.getInt(C0248v1.FIELD_MAX_VIDEO_HEIGHT, c0248v1.maxVideoHeight);
        this.maxVideoFrameRate = bundle.getInt(C0248v1.FIELD_MAX_VIDEO_FRAMERATE, c0248v1.maxVideoFrameRate);
        this.maxVideoBitrate = bundle.getInt(C0248v1.FIELD_MAX_VIDEO_BITRATE, c0248v1.maxVideoBitrate);
        this.minVideoWidth = bundle.getInt(C0248v1.FIELD_MIN_VIDEO_WIDTH, c0248v1.minVideoWidth);
        this.minVideoHeight = bundle.getInt(C0248v1.FIELD_MIN_VIDEO_HEIGHT, c0248v1.minVideoHeight);
        this.minVideoFrameRate = bundle.getInt(C0248v1.FIELD_MIN_VIDEO_FRAMERATE, c0248v1.minVideoFrameRate);
        this.minVideoBitrate = bundle.getInt(C0248v1.FIELD_MIN_VIDEO_BITRATE, c0248v1.minVideoBitrate);
        this.viewportWidth = bundle.getInt(C0248v1.FIELD_VIEWPORT_WIDTH, c0248v1.viewportWidth);
        this.viewportHeight = bundle.getInt(C0248v1.FIELD_VIEWPORT_HEIGHT, c0248v1.viewportHeight);
        this.viewportOrientationMayChange = bundle.getBoolean(C0248v1.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, c0248v1.viewportOrientationMayChange);
        this.preferredVideoMimeTypes = AbstractC0983m0.m2166k((String[]) AbstractC0715d.m1573y(bundle.getStringArray(C0248v1.FIELD_PREFERRED_VIDEO_MIMETYPES), new String[0]));
        this.preferredVideoRoleFlags = bundle.getInt(C0248v1.FIELD_PREFERRED_VIDEO_ROLE_FLAGS, c0248v1.preferredVideoRoleFlags);
        this.preferredAudioLanguages = m688b((String[]) AbstractC0715d.m1573y(bundle.getStringArray(C0248v1.FIELD_PREFERRED_AUDIO_LANGUAGES), new String[0]));
        this.preferredAudioRoleFlags = bundle.getInt(C0248v1.FIELD_PREFERRED_AUDIO_ROLE_FLAGS, c0248v1.preferredAudioRoleFlags);
        this.maxAudioChannelCount = bundle.getInt(C0248v1.FIELD_MAX_AUDIO_CHANNEL_COUNT, c0248v1.maxAudioChannelCount);
        this.maxAudioBitrate = bundle.getInt(C0248v1.FIELD_MAX_AUDIO_BITRATE, c0248v1.maxAudioBitrate);
        this.preferredAudioMimeTypes = AbstractC0983m0.m2166k((String[]) AbstractC0715d.m1573y(bundle.getStringArray(C0248v1.FIELD_PREFERRED_AUDIO_MIME_TYPES), new String[0]));
        Bundle bundle2 = bundle.getBundle(C0248v1.FIELD_AUDIO_OFFLOAD_PREFERENCES);
        if (bundle2 != null) {
            C0239s1 c0239s1 = new C0239s1();
            String str2 = C0242t1.f1415e;
            C0242t1 c0242t12 = C0242t1.f1414d;
            c0239s1.f1409a = bundle2.getInt(str2, c0242t12.f1418a);
            c0239s1.f1410b = bundle2.getBoolean(C0242t1.f1416f, c0242t12.f1419b);
            c0239s1.f1411c = bundle2.getBoolean(C0242t1.f1417g, c0242t12.f1420c);
            c0242t1 = new C0242t1(c0239s1);
        } else {
            C0239s1 c0239s12 = new C0239s1();
            String str3 = C0248v1.FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
            C0242t1 c0242t13 = C0242t1.f1414d;
            c0239s12.f1409a = bundle.getInt(str3, c0242t13.f1418a);
            c0239s12.f1410b = bundle.getBoolean(C0248v1.FIELD_IS_GAPLESS_SUPPORT_REQUIRED, c0242t13.f1419b);
            c0239s12.f1411c = bundle.getBoolean(C0248v1.FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, c0242t13.f1420c);
            c0242t1 = new C0242t1(c0239s12);
        }
        this.audioOffloadPreferences = c0242t1;
        this.preferredTextLanguages = m688b((String[]) AbstractC0715d.m1573y(bundle.getStringArray(C0248v1.FIELD_PREFERRED_TEXT_LANGUAGES), new String[0]));
        this.preferredTextRoleFlags = bundle.getInt(C0248v1.FIELD_PREFERRED_TEXT_ROLE_FLAGS, c0248v1.preferredTextRoleFlags);
        this.ignoredTextSelectionFlags = bundle.getInt(C0248v1.FIELD_IGNORED_TEXT_SELECTION_FLAGS, c0248v1.ignoredTextSelectionFlags);
        this.selectUndeterminedTextLanguage = bundle.getBoolean(C0248v1.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, c0248v1.selectUndeterminedTextLanguage);
        this.isPrioritizeImageOverVideoEnabled = bundle.getBoolean(C0248v1.FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, c0248v1.isPrioritizeImageOverVideoEnabled);
        this.forceLowestBitrate = bundle.getBoolean(C0248v1.FIELD_FORCE_LOWEST_BITRATE, c0248v1.forceLowestBitrate);
        this.forceHighestSupportedBitrate = bundle.getBoolean(C0248v1.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, c0248v1.forceHighestSupportedBitrate);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0248v1.FIELD_SELECTION_OVERRIDES);
        if (parcelableArrayList == null) {
            c0981l1M2159f = C0981l1.f4211n;
        } else {
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(C0236r1.f1401c);
                bundle4.getClass();
                C0233q1 c0233q1M661a = C0233q1.m661a(bundle4);
                int[] intArray = bundle3.getIntArray(C0236r1.f1402d);
                intArray.getClass();
                c0974j0M2164i.m2141a(new C0236r1(c0233q1M661a, AbstractC0715d.m1559f(intArray)));
            }
            c0981l1M2159f = c0974j0M2164i.m2159f();
        }
        this.overrides = new HashMap<>();
        for (int i4 = 0; i4 < c0981l1M2159f.f4213m; i4++) {
            C0236r1 c0236r1 = (C0236r1) c0981l1M2159f.get(i4);
            this.overrides.put(c0236r1.f1403a, c0236r1);
        }
        int[] iArr = (int[]) AbstractC0715d.m1573y(bundle.getIntArray(C0248v1.FIELD_DISABLED_TRACK_TYPE), new int[0]);
        this.disabledTrackTypes = new HashSet<>();
        for (int i8 : iArr) {
            this.disabledTrackTypes.add(Integer.valueOf(i8));
        }
    }
}
