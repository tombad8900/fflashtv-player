package com.exotv.net.model;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.List;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2131o;
import p069h7.AbstractC1206h;
import p111m6.C1921p;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class Channel {
    private final List<BackupSource> backups;
    private final String catO;
    private final String catRealName;
    private final String chRealName;
    private final String icon;

    /* renamed from: id */
    private final String f3033id;
    private final String idGen;
    private final String idO;
    private final boolean isBackup;
    private final boolean isSub;
    private final String name;
    private final String parent;
    private final String server;
    private final String title;
    private final String type;
    private final String xCatInfo;

    public Channel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, C2131o.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final String component1() {
        return this.f3033id;
    }

    public final String component10() {
        return this.idGen;
    }

    public final String component11() {
        return this.parent;
    }

    public final String component12() {
        return this.server;
    }

    public final boolean component13() {
        return this.isSub;
    }

    public final boolean component14() {
        return this.isBackup;
    }

    public final List<BackupSource> component15() {
        return this.backups;
    }

    public final String component16() {
        return this.xCatInfo;
    }

    public final String component2() {
        return this.idO;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.icon;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.catO;
    }

    public final String component8() {
        return this.catRealName;
    }

    public final String component9() {
        return this.chRealName;
    }

    public final Channel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z7, boolean z8, List<BackupSource> list, String str13) {
        AbstractC2980h.m5136e("backups", list);
        return new Channel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z7, z8, list, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return AbstractC2980h.m5132a(this.f3033id, channel.f3033id) && AbstractC2980h.m5132a(this.idO, channel.idO) && AbstractC2980h.m5132a(this.name, channel.name) && AbstractC2980h.m5132a(this.title, channel.title) && AbstractC2980h.m5132a(this.icon, channel.icon) && AbstractC2980h.m5132a(this.type, channel.type) && AbstractC2980h.m5132a(this.catO, channel.catO) && AbstractC2980h.m5132a(this.catRealName, channel.catRealName) && AbstractC2980h.m5132a(this.chRealName, channel.chRealName) && AbstractC2980h.m5132a(this.idGen, channel.idGen) && AbstractC2980h.m5132a(this.parent, channel.parent) && AbstractC2980h.m5132a(this.server, channel.server) && this.isSub == channel.isSub && this.isBackup == channel.isBackup && AbstractC2980h.m5132a(this.backups, channel.backups) && AbstractC2980h.m5132a(this.xCatInfo, channel.xCatInfo);
    }

    public final List<BackupSource> getBackups() {
        return this.backups;
    }

    public final String getCatO() {
        return this.catO;
    }

    public final String getCatRealName() {
        return this.catRealName;
    }

    public final String getChRealName() {
        return this.chRealName;
    }

    public final String getDisplayName() {
        String str = this.name;
        if (str != null) {
            if (AbstractC1206h.m2630D0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = this.title;
        return str2 == null ? C2181z.FRAGMENT_ENCODE_SET : str2;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f3033id;
    }

    public final String getIdGen() {
        return this.idGen;
    }

    public final String getIdO() {
        return this.idO;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParent() {
        return this.parent;
    }

    public final ResolverKind getResolverKind() {
        return (!this.isBackup || this.backups.isEmpty()) ? (AbstractC2980h.m5132a(this.type, "ytv") || !(this.catRealName == null || this.chRealName == null)) ? ResolverKind.YTV : (this.idO == null || this.catO == null) ? (this.idGen == null || this.parent == null) ? ResolverKind.DEFAULT : ResolverKind.GEN : ResolverKind.f3035O : ResolverKind.BACKUP;
    }

    public final String getSelectionKey() {
        String str = this.f3033id;
        if (str != null) {
            if (AbstractC1206h.m2630D0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return getDisplayName();
    }

    public final String getServer() {
        return this.server;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getXCatInfo() {
        return this.xCatInfo;
    }

    public int hashCode() {
        String str = this.f3033id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idO;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.catO;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.catRealName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chRealName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.idGen;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.parent;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.server;
        int iHashCode12 = (this.backups.hashCode() + ((Boolean.hashCode(this.isBackup) + ((Boolean.hashCode(this.isSub) + ((iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str13 = this.xCatInfo;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final boolean isBackup() {
        return this.isBackup;
    }

    public final boolean isSub() {
        return this.isSub;
    }

    public String toString() {
        return "Channel(id=" + this.f3033id + ", idO=" + this.idO + ", name=" + this.name + ", title=" + this.title + ", icon=" + this.icon + ", type=" + this.type + ", catO=" + this.catO + ", catRealName=" + this.catRealName + ", chRealName=" + this.chRealName + ", idGen=" + this.idGen + ", parent=" + this.parent + ", server=" + this.server + ", isSub=" + this.isSub + ", isBackup=" + this.isBackup + ", backups=" + this.backups + ", xCatInfo=" + this.xCatInfo + ")";
    }

    public Channel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z7, boolean z8, List<BackupSource> list, String str13) {
        AbstractC2980h.m5136e("backups", list);
        this.f3033id = str;
        this.idO = str2;
        this.name = str3;
        this.title = str4;
        this.icon = str5;
        this.type = str6;
        this.catO = str7;
        this.catRealName = str8;
        this.chRealName = str9;
        this.idGen = str10;
        this.parent = str11;
        this.server = str12;
        this.isSub = z7;
        this.isBackup = z8;
        this.backups = list;
        this.xCatInfo = str13;
    }

    public /* synthetic */ Channel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z7, boolean z8, List list, String str13, int i, AbstractC2977e abstractC2977e) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED) != 0 ? false : z7, (i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED) == 0 ? z8 : false, (i & 16384) != 0 ? C1921p.f7187j : list, (i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE) != 0 ? null : str13);
    }
}
