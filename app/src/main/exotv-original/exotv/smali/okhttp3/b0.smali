.class public final Lokhttp3/b0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field static final synthetic $$INSTANCE:Lokhttp3/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/b0;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/b0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokhttp3/b0;->$$INSTANCE:Lokhttp3/b0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invoke(Ly6/l;)Lokhttp3/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/l;",
            ")",
            "Lokhttp3/c0;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/b0$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/b0$a;-><init>(Ly6/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
