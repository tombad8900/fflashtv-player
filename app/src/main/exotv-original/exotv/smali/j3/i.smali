.class public final Lj3/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Lv7/p;

.field public final b:Lj3/f;


# direct methods
.method public constructor <init>(JLi7/r;Lv7/p;Lv7/b0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lj3/i;->a:Lv7/p;

    .line 5
    .line 6
    new-instance v0, Lj3/f;

    .line 7
    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lj3/f;-><init>(JLi7/r;Lv7/p;Lv7/b0;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lj3/i;->b:Lj3/f;

    .line 16
    .line 17
    return-void
.end method
