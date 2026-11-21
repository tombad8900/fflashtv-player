.class public final Le4/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Le4/x;

.field public final b:La4/c0;


# direct methods
.method public constructor <init>(La4/c;)V
    .locals 2

    .line 1
    new-instance v0, Le4/x;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Le4/x;-><init>(La4/c;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, La4/c0;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {p1, v1}, La4/c0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Le4/u;->b:La4/c0;

    .line 16
    .line 17
    iput-object v0, p0, Le4/u;->a:Le4/x;

    .line 18
    .line 19
    return-void
.end method
