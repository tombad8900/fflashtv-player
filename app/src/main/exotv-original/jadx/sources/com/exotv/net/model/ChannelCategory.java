package com.exotv.net.model;

import java.util.List;
import okhttp3.C2181z;
import p111m6.C1921p;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ChannelCategory {
    private final List<Channel> channels;

    /* renamed from: id */
    private final String f3034id;
    private final String idO;
    private final String title;

    public ChannelCategory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelCategory copy$default(ChannelCategory channelCategory, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelCategory.f3034id;
        }
        if ((i & 2) != 0) {
            str2 = channelCategory.idO;
        }
        if ((i & 4) != 0) {
            str3 = channelCategory.title;
        }
        if ((i & 8) != 0) {
            list = channelCategory.channels;
        }
        return channelCategory.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.f3034id;
    }

    public final String component2() {
        return this.idO;
    }

    public final String component3() {
        return this.title;
    }

    public final List<Channel> component4() {
        return this.channels;
    }

    public final ChannelCategory copy(String str, String str2, String str3, List<Channel> list) {
        AbstractC2980h.m5136e("channels", list);
        return new ChannelCategory(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelCategory)) {
            return false;
        }
        ChannelCategory channelCategory = (ChannelCategory) obj;
        return AbstractC2980h.m5132a(this.f3034id, channelCategory.f3034id) && AbstractC2980h.m5132a(this.idO, channelCategory.idO) && AbstractC2980h.m5132a(this.title, channelCategory.title) && AbstractC2980h.m5132a(this.channels, channelCategory.channels);
    }

    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final String getDisplayTitle() {
        String str = this.title;
        return str == null ? C2181z.FRAGMENT_ENCODE_SET : str;
    }

    public final String getId() {
        return this.f3034id;
    }

    public final String getIdO() {
        return this.idO;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.f3034id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idO;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        return this.channels.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ChannelCategory(id=" + this.f3034id + ", idO=" + this.idO + ", title=" + this.title + ", channels=" + this.channels + ")";
    }

    public ChannelCategory(String str, String str2, String str3, List<Channel> list) {
        AbstractC2980h.m5136e("channels", list);
        this.f3034id = str;
        this.idO = str2;
        this.title = str3;
        this.channels = list;
    }

    public /* synthetic */ ChannelCategory(String str, String str2, String str3, List list, int i, AbstractC2977e abstractC2977e) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C1921p.f7187j : list);
    }
}
