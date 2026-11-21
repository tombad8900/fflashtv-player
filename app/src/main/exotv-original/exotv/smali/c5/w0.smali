.class public final enum Lc5/w0;
.super Ljava/lang/Enum;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final enum l:Lc5/w0;

.field public static final enum m:Lc5/w0;

.field public static final synthetic n:[Lc5/w0;


# instance fields
.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lc5/w0;

    .line 2
    .line 3
    const-string v1, "Movies"

    .line 4
    .line 5
    const-string v2, "/search/movie"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "MOVIES"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lc5/w0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lc5/w0;->l:Lc5/w0;

    .line 14
    .line 15
    new-instance v1, Lc5/w0;

    .line 16
    .line 17
    const-string v2, "Series"

    .line 18
    .line 19
    const-string v3, "/search/tv"

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const-string v5, "SERIES"

    .line 23
    .line 24
    invoke-direct {v1, v4, v5, v2, v3}, Lc5/w0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lc5/w0;->m:Lc5/w0;

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Lc5/w0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lc5/w0;->n:[Lc5/w0;

    .line 34
    .line 35
    invoke-static {v0}, Landroid/support/v4/media/session/b;->q([Ljava/lang/Enum;)Ls6/b;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lc5/w0;->j:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lc5/w0;->k:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc5/w0;
    .locals 1

    .line 1
    const-class v0, Lc5/w0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc5/w0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lc5/w0;
    .locals 1

    .line 1
    sget-object v0, Lc5/w0;->n:[Lc5/w0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lc5/w0;

    .line 8
    .line 9
    return-object v0
.end method
