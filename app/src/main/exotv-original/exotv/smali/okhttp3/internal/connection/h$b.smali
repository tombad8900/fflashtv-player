.class public final Lokhttp3/internal/connection/h$b;
.super Lokhttp3/internal/concurrent/a;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/h;-><init>(Lokhttp3/internal/concurrent/e;IJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/connection/h;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/h;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lokhttp3/internal/connection/h$b;->this$0:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p2, v1, p1, v0}, Lokhttp3/internal/concurrent/a;-><init>(Ljava/lang/String;ZILz6/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public runOnce()J
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/h$b;->this$0:Lokhttp3/internal/connection/h;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/connection/h;->cleanup(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
