package androidx.media3.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import p052f6.AbstractC0968h0;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p052f6.AbstractC1006u;
import p052f6.AbstractC1013w0;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.v1 */
/* loaded from: classes.dex */
public class C0248v1 {

    @Deprecated
    public static final C0248v1 DEFAULT;
    public static final C0248v1 DEFAULT_WITHOUT_CONTEXT;
    private static final String FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
    private static final String FIELD_AUDIO_OFFLOAD_PREFERENCES;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final String FIELD_DISABLED_TRACK_TYPE;
    private static final String FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE;
    private static final String FIELD_FORCE_LOWEST_BITRATE;
    private static final String FIELD_IGNORED_TEXT_SELECTION_FLAGS;
    private static final String FIELD_IS_GAPLESS_SUPPORT_REQUIRED;
    private static final String FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED;
    private static final String FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED;
    private static final String FIELD_MAX_AUDIO_BITRATE;
    private static final String FIELD_MAX_AUDIO_CHANNEL_COUNT;
    private static final String FIELD_MAX_VIDEO_BITRATE;
    private static final String FIELD_MAX_VIDEO_FRAMERATE;
    private static final String FIELD_MAX_VIDEO_HEIGHT;
    private static final String FIELD_MAX_VIDEO_WIDTH;
    private static final String FIELD_MIN_VIDEO_BITRATE;
    private static final String FIELD_MIN_VIDEO_FRAMERATE;
    private static final String FIELD_MIN_VIDEO_HEIGHT;
    private static final String FIELD_MIN_VIDEO_WIDTH;
    private static final String FIELD_PREFERRED_AUDIO_LANGUAGES;
    private static final String FIELD_PREFERRED_AUDIO_MIME_TYPES;
    private static final String FIELD_PREFERRED_AUDIO_ROLE_FLAGS;
    private static final String FIELD_PREFERRED_TEXT_LANGUAGES;
    private static final String FIELD_PREFERRED_TEXT_ROLE_FLAGS;
    private static final String FIELD_PREFERRED_VIDEO_MIMETYPES;
    private static final String FIELD_PREFERRED_VIDEO_ROLE_FLAGS;
    private static final String FIELD_SELECTION_OVERRIDES;
    private static final String FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE;
    private static final String FIELD_VIEWPORT_HEIGHT;
    private static final String FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE;
    private static final String FIELD_VIEWPORT_WIDTH;
    public final C0242t1 audioOffloadPreferences;
    public final AbstractC1013w0 disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final boolean isPrioritizeImageOverVideoEnabled;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final AbstractC0995q0 overrides;
    public final AbstractC0983m0 preferredAudioLanguages;
    public final AbstractC0983m0 preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final AbstractC0983m0 preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final AbstractC0983m0 preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    static {
        C0248v1 c0248v1 = new C0248v1(new C0245u1());
        DEFAULT_WITHOUT_CONTEXT = c0248v1;
        DEFAULT = c0248v1;
        int i = AbstractC1118i0.f4750a;
        FIELD_PREFERRED_AUDIO_LANGUAGES = Integer.toString(1, 36);
        FIELD_PREFERRED_AUDIO_ROLE_FLAGS = Integer.toString(2, 36);
        FIELD_PREFERRED_TEXT_LANGUAGES = Integer.toString(3, 36);
        FIELD_PREFERRED_TEXT_ROLE_FLAGS = Integer.toString(4, 36);
        FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = Integer.toString(5, 36);
        FIELD_MAX_VIDEO_WIDTH = Integer.toString(6, 36);
        FIELD_MAX_VIDEO_HEIGHT = Integer.toString(7, 36);
        FIELD_MAX_VIDEO_FRAMERATE = Integer.toString(8, 36);
        FIELD_MAX_VIDEO_BITRATE = Integer.toString(9, 36);
        FIELD_MIN_VIDEO_WIDTH = Integer.toString(10, 36);
        FIELD_MIN_VIDEO_HEIGHT = Integer.toString(11, 36);
        FIELD_MIN_VIDEO_FRAMERATE = Integer.toString(12, 36);
        FIELD_MIN_VIDEO_BITRATE = Integer.toString(13, 36);
        FIELD_VIEWPORT_WIDTH = Integer.toString(14, 36);
        FIELD_VIEWPORT_HEIGHT = Integer.toString(15, 36);
        FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = Integer.toString(16, 36);
        FIELD_PREFERRED_VIDEO_MIMETYPES = Integer.toString(17, 36);
        FIELD_MAX_AUDIO_CHANNEL_COUNT = Integer.toString(18, 36);
        FIELD_MAX_AUDIO_BITRATE = Integer.toString(19, 36);
        FIELD_PREFERRED_AUDIO_MIME_TYPES = Integer.toString(20, 36);
        FIELD_FORCE_LOWEST_BITRATE = Integer.toString(21, 36);
        FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = Integer.toString(22, 36);
        FIELD_SELECTION_OVERRIDES = Integer.toString(23, 36);
        FIELD_DISABLED_TRACK_TYPE = Integer.toString(24, 36);
        FIELD_PREFERRED_VIDEO_ROLE_FLAGS = Integer.toString(25, 36);
        FIELD_IGNORED_TEXT_SELECTION_FLAGS = Integer.toString(26, 36);
        FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE = Integer.toString(27, 36);
        FIELD_IS_GAPLESS_SUPPORT_REQUIRED = Integer.toString(28, 36);
        FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED = Integer.toString(29, 36);
        FIELD_AUDIO_OFFLOAD_PREFERENCES = Integer.toString(30, 36);
        FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED = Integer.toString(31, 36);
    }

    public C0248v1(C0245u1 c0245u1) {
        this.maxVideoWidth = c0245u1.maxVideoWidth;
        this.maxVideoHeight = c0245u1.maxVideoHeight;
        this.maxVideoFrameRate = c0245u1.maxVideoFrameRate;
        this.maxVideoBitrate = c0245u1.maxVideoBitrate;
        this.minVideoWidth = c0245u1.minVideoWidth;
        this.minVideoHeight = c0245u1.minVideoHeight;
        this.minVideoFrameRate = c0245u1.minVideoFrameRate;
        this.minVideoBitrate = c0245u1.minVideoBitrate;
        this.viewportWidth = c0245u1.viewportWidth;
        this.viewportHeight = c0245u1.viewportHeight;
        this.viewportOrientationMayChange = c0245u1.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = c0245u1.preferredVideoMimeTypes;
        this.preferredVideoRoleFlags = c0245u1.preferredVideoRoleFlags;
        this.preferredAudioLanguages = c0245u1.preferredAudioLanguages;
        this.preferredAudioRoleFlags = c0245u1.preferredAudioRoleFlags;
        this.maxAudioChannelCount = c0245u1.maxAudioChannelCount;
        this.maxAudioBitrate = c0245u1.maxAudioBitrate;
        this.preferredAudioMimeTypes = c0245u1.preferredAudioMimeTypes;
        this.audioOffloadPreferences = c0245u1.audioOffloadPreferences;
        this.preferredTextLanguages = c0245u1.preferredTextLanguages;
        this.preferredTextRoleFlags = c0245u1.preferredTextRoleFlags;
        this.ignoredTextSelectionFlags = c0245u1.ignoredTextSelectionFlags;
        this.selectUndeterminedTextLanguage = c0245u1.selectUndeterminedTextLanguage;
        this.isPrioritizeImageOverVideoEnabled = c0245u1.isPrioritizeImageOverVideoEnabled;
        this.forceLowestBitrate = c0245u1.forceLowestBitrate;
        this.forceHighestSupportedBitrate = c0245u1.forceHighestSupportedBitrate;
        this.overrides = AbstractC0995q0.m2182a(c0245u1.overrides);
        this.disabledTrackTypes = AbstractC1013w0.m2210j(c0245u1.disabledTrackTypes);
    }

    public static C0248v1 fromBundle(Bundle bundle) {
        return new C0248v1(new C0245u1(bundle));
    }

    public static C0248v1 getDefaults(Context context) {
        return new C0248v1(new C0245u1(context));
    }

    public C0245u1 buildUpon() {
        C0245u1 c0245u1 = new C0245u1();
        c0245u1.m689a(this);
        return c0245u1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0248v1 c0248v1 = (C0248v1) obj;
            if (this.maxVideoWidth == c0248v1.maxVideoWidth && this.maxVideoHeight == c0248v1.maxVideoHeight && this.maxVideoFrameRate == c0248v1.maxVideoFrameRate && this.maxVideoBitrate == c0248v1.maxVideoBitrate && this.minVideoWidth == c0248v1.minVideoWidth && this.minVideoHeight == c0248v1.minVideoHeight && this.minVideoFrameRate == c0248v1.minVideoFrameRate && this.minVideoBitrate == c0248v1.minVideoBitrate && this.viewportOrientationMayChange == c0248v1.viewportOrientationMayChange && this.viewportWidth == c0248v1.viewportWidth && this.viewportHeight == c0248v1.viewportHeight && this.preferredVideoMimeTypes.equals(c0248v1.preferredVideoMimeTypes) && this.preferredVideoRoleFlags == c0248v1.preferredVideoRoleFlags && this.preferredAudioLanguages.equals(c0248v1.preferredAudioLanguages) && this.preferredAudioRoleFlags == c0248v1.preferredAudioRoleFlags && this.maxAudioChannelCount == c0248v1.maxAudioChannelCount && this.maxAudioBitrate == c0248v1.maxAudioBitrate && this.preferredAudioMimeTypes.equals(c0248v1.preferredAudioMimeTypes) && this.audioOffloadPreferences.equals(c0248v1.audioOffloadPreferences) && this.preferredTextLanguages.equals(c0248v1.preferredTextLanguages) && this.preferredTextRoleFlags == c0248v1.preferredTextRoleFlags && this.ignoredTextSelectionFlags == c0248v1.ignoredTextSelectionFlags && this.selectUndeterminedTextLanguage == c0248v1.selectUndeterminedTextLanguage && this.isPrioritizeImageOverVideoEnabled == c0248v1.isPrioritizeImageOverVideoEnabled && this.forceLowestBitrate == c0248v1.forceLowestBitrate && this.forceHighestSupportedBitrate == c0248v1.forceHighestSupportedBitrate) {
                AbstractC0995q0 abstractC0995q0 = this.overrides;
                AbstractC0995q0 abstractC0995q02 = c0248v1.overrides;
                abstractC0995q0.getClass();
                if (AbstractC1006u.m2190e(abstractC0995q0, abstractC0995q02) && this.disabledTrackTypes.equals(c0248v1.disabledTrackTypes)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.disabledTrackTypes.hashCode() + ((this.overrides.hashCode() + ((((((((((((((this.preferredTextLanguages.hashCode() + ((this.audioOffloadPreferences.hashCode() + ((this.preferredAudioMimeTypes.hashCode() + ((((((((this.preferredAudioLanguages.hashCode() + ((((this.preferredVideoMimeTypes.hashCode() + ((((((((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31)) * 31) + this.preferredVideoRoleFlags) * 31)) * 31) + this.preferredAudioRoleFlags) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31)) * 31)) * 31)) * 31) + this.preferredTextRoleFlags) * 31) + this.ignoredTextSelectionFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + (this.isPrioritizeImageOverVideoEnabled ? 1 : 0)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31)) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_MAX_VIDEO_WIDTH, this.maxVideoWidth);
        bundle.putInt(FIELD_MAX_VIDEO_HEIGHT, this.maxVideoHeight);
        bundle.putInt(FIELD_MAX_VIDEO_FRAMERATE, this.maxVideoFrameRate);
        bundle.putInt(FIELD_MAX_VIDEO_BITRATE, this.maxVideoBitrate);
        bundle.putInt(FIELD_MIN_VIDEO_WIDTH, this.minVideoWidth);
        bundle.putInt(FIELD_MIN_VIDEO_HEIGHT, this.minVideoHeight);
        bundle.putInt(FIELD_MIN_VIDEO_FRAMERATE, this.minVideoFrameRate);
        bundle.putInt(FIELD_MIN_VIDEO_BITRATE, this.minVideoBitrate);
        bundle.putInt(FIELD_VIEWPORT_WIDTH, this.viewportWidth);
        bundle.putInt(FIELD_VIEWPORT_HEIGHT, this.viewportHeight);
        bundle.putBoolean(FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, this.viewportOrientationMayChange);
        bundle.putStringArray(FIELD_PREFERRED_VIDEO_MIMETYPES, (String[]) this.preferredVideoMimeTypes.toArray(new String[0]));
        bundle.putInt(FIELD_PREFERRED_VIDEO_ROLE_FLAGS, this.preferredVideoRoleFlags);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_LANGUAGES, (String[]) this.preferredAudioLanguages.toArray(new String[0]));
        bundle.putInt(FIELD_PREFERRED_AUDIO_ROLE_FLAGS, this.preferredAudioRoleFlags);
        bundle.putInt(FIELD_MAX_AUDIO_CHANNEL_COUNT, this.maxAudioChannelCount);
        bundle.putInt(FIELD_MAX_AUDIO_BITRATE, this.maxAudioBitrate);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_MIME_TYPES, (String[]) this.preferredAudioMimeTypes.toArray(new String[0]));
        bundle.putStringArray(FIELD_PREFERRED_TEXT_LANGUAGES, (String[]) this.preferredTextLanguages.toArray(new String[0]));
        bundle.putInt(FIELD_PREFERRED_TEXT_ROLE_FLAGS, this.preferredTextRoleFlags);
        bundle.putInt(FIELD_IGNORED_TEXT_SELECTION_FLAGS, this.ignoredTextSelectionFlags);
        bundle.putBoolean(FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, this.selectUndeterminedTextLanguage);
        bundle.putInt(FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, this.audioOffloadPreferences.f1418a);
        bundle.putBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, this.audioOffloadPreferences.f1419b);
        bundle.putBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, this.audioOffloadPreferences.f1420c);
        String str = FIELD_AUDIO_OFFLOAD_PREFERENCES;
        C0242t1 c0242t1 = this.audioOffloadPreferences;
        c0242t1.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0242t1.f1415e, c0242t1.f1418a);
        bundle2.putBoolean(C0242t1.f1416f, c0242t1.f1419b);
        bundle2.putBoolean(C0242t1.f1417g, c0242t1.f1420c);
        bundle.putBundle(str, bundle2);
        bundle.putBoolean(FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, this.isPrioritizeImageOverVideoEnabled);
        bundle.putBoolean(FIELD_FORCE_LOWEST_BITRATE, this.forceLowestBitrate);
        bundle.putBoolean(FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, this.forceHighestSupportedBitrate);
        String str2 = FIELD_SELECTION_OVERRIDES;
        AbstractC0968h0<C0236r1> abstractC0968h0M2185d = this.overrides.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC0968h0M2185d.size());
        for (C0236r1 c0236r1 : abstractC0968h0M2185d) {
            c0236r1.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(C0236r1.f1401c, c0236r1.f1403a.m664d());
            bundle3.putIntArray(C0236r1.f1402d, AbstractC0715d.m1569p0(c0236r1.f1404b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(str2, arrayList);
        bundle.putIntArray(FIELD_DISABLED_TRACK_TYPE, AbstractC0715d.m1569p0(this.disabledTrackTypes));
        return bundle;
    }
}
