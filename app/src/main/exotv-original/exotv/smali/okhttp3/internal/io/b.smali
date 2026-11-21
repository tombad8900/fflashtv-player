.class public interface abstract Lokhttp3/internal/io/b;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final Companion:Lokhttp3/internal/io/a;

.field public static final SYSTEM:Lokhttp3/internal/io/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/internal/io/a;->$$INSTANCE:Lokhttp3/internal/io/a;

    .line 2
    .line 3
    sput-object v0, Lokhttp3/internal/io/b;->Companion:Lokhttp3/internal/io/a;

    .line 4
    .line 5
    new-instance v0, Lokhttp3/internal/io/a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lokhttp3/internal/io/a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lokhttp3/internal/io/b;->SYSTEM:Lokhttp3/internal/io/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract appendingSink(Ljava/io/File;)Lv7/i0;
.end method

.method public abstract delete(Ljava/io/File;)V
.end method

.method public abstract deleteContents(Ljava/io/File;)V
.end method

.method public abstract exists(Ljava/io/File;)Z
.end method

.method public abstract rename(Ljava/io/File;Ljava/io/File;)V
.end method

.method public abstract sink(Ljava/io/File;)Lv7/i0;
.end method

.method public abstract size(Ljava/io/File;)J
.end method

.method public abstract source(Ljava/io/File;)Lv7/k0;
.end method
