.class public interface abstract Lokhttp3/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final Companion:Lokhttp3/p;

.field public static final NO_COOKIES:Lokhttp3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/p;->$$INSTANCE:Lokhttp3/p;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/q;->Companion:Lokhttp3/p;

    .line 4
    .line 5
    new-instance v0, Lokhttp3/p$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lokhttp3/p$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lokhttp3/q;->NO_COOKIES:Lokhttp3/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract loadForRequest(Lokhttp3/z;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/z;",
            ")",
            "Ljava/util/List<",
            "Lokhttp3/o;",
            ">;"
        }
    .end annotation
.end method

.method public abstract saveFromResponse(Lokhttp3/z;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/z;",
            "Ljava/util/List<",
            "Lokhttp3/o;",
            ">;)V"
        }
    .end annotation
.end method
