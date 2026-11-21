.class public abstract Lv4/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lk2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk2/b;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk2/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv4/c;->a:Lk2/b;

    .line 9
    .line 10
    return-void
.end method

.method public static a(ILv4/a;)La4/c;
    .locals 2

    .line 1
    new-instance v0, Ll0/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll0/d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, La4/c;

    .line 7
    .line 8
    sget-object v1, Lv4/c;->a:Lk2/b;

    .line 9
    .line 10
    invoke-direct {p0, v0, p1, v1}, La4/c;-><init>(Ll0/d;Lv4/a;Lk2/b;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
