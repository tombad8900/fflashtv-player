.class public final Lk1/w;
.super Lk1/u;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final m:I

.field public final n:Ljava/util/Map;


# direct methods
.method public constructor <init>(ILk1/i;Ljava/util/Map;)V
    .locals 2

    .line 1
    const-string v0, "Response code: "

    .line 2
    .line 3
    invoke-static {p1, v0}, La1/a1;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x7d4

    .line 8
    .line 9
    invoke-direct {p0, v1, p2, v0}, Lk1/u;-><init>(ILjava/io/IOException;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput p1, p0, Lk1/w;->m:I

    .line 13
    .line 14
    iput-object p3, p0, Lk1/w;->n:Ljava/util/Map;

    .line 15
    .line 16
    return-void
.end method
