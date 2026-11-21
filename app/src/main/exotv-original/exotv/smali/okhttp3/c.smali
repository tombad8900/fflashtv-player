.class public interface abstract Lokhttp3/c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final Companion:Lokhttp3/b;

.field public static final JAVA_NET_AUTHENTICATOR:Lokhttp3/c;

.field public static final NONE:Lokhttp3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lokhttp3/b;->$$INSTANCE:Lokhttp3/b;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/c;->Companion:Lokhttp3/b;

    .line 4
    .line 5
    new-instance v0, Lokhttp3/b$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lokhttp3/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lokhttp3/c;->NONE:Lokhttp3/c;

    .line 11
    .line 12
    new-instance v0, Lr7/b;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lr7/b;-><init>(Lokhttp3/u;ILz6/e;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lokhttp3/c;->JAVA_NET_AUTHENTICATOR:Lokhttp3/c;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public abstract authenticate(Lokhttp3/k0;Lokhttp3/i0;)Lokhttp3/g0;
.end method
