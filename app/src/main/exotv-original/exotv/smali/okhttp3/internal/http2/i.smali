.class public interface abstract Lokhttp3/internal/http2/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# virtual methods
.method public abstract ackSettings()V
.end method

.method public abstract alternateService(ILjava/lang/String;Lv7/m;Ljava/lang/String;IJ)V
.end method

.method public abstract data(ZILv7/l;I)V
.end method

.method public abstract goAway(ILokhttp3/internal/http2/b;Lv7/m;)V
.end method

.method public abstract headers(ZIILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract ping(ZII)V
.end method

.method public abstract priority(IIIZ)V
.end method

.method public abstract pushPromise(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lokhttp3/internal/http2/c;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract rstStream(ILokhttp3/internal/http2/b;)V
.end method

.method public abstract settings(ZLokhttp3/internal/http2/o;)V
.end method

.method public abstract windowUpdate(IJ)V
.end method
