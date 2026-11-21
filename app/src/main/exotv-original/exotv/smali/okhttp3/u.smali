.class public interface abstract Lokhttp3/u;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final Companion:Lokhttp3/t;

.field public static final SYSTEM:Lokhttp3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/t;->$$INSTANCE:Lokhttp3/t;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/u;->Companion:Lokhttp3/t;

    .line 4
    .line 5
    new-instance v0, Lokhttp3/t$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lokhttp3/t$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lokhttp3/u;->SYSTEM:Lokhttp3/u;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract lookup(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end method
