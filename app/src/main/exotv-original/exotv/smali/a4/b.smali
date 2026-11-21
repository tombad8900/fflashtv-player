.class public final La4/b;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final a:Ly3/e;

.field public final b:Z

.field public c:La4/f0;


# direct methods
.method public constructor <init>(Ly3/e;La4/y;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p3, p1}, Lu4/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La4/b;->a:Ly3/e;

    .line 10
    .line 11
    iget-boolean p1, p2, La4/y;->j:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, La4/b;->c:La4/f0;

    .line 15
    .line 16
    iput-boolean p1, p0, La4/b;->b:Z

    .line 17
    .line 18
    return-void
.end method
