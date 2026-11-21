.class public final Lj3/h;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final j:Lj3/c;


# direct methods
.method public constructor <init>(Lj3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/h;->j:Lj3/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/h;->j:Lj3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj3/c;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
