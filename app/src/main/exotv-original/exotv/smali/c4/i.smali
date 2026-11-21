.class public final Lc4/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Lv4/b;


# instance fields
.field public final j:Ljava/security/MessageDigest;

.field public final k:Lv4/d;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv4/d;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lc4/i;->k:Lv4/d;

    .line 10
    .line 11
    iput-object p1, p0, Lc4/i;->j:Ljava/security/MessageDigest;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lv4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/i;->k:Lv4/d;

    .line 2
    .line 3
    return-object v0
.end method
