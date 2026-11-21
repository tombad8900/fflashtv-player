.class public final Ll3/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ll3/h;


# instance fields
.field public final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll3/i;->a:Ljava/io/File;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lp6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance p1, Ll3/n;

    .line 2
    .line 3
    sget-object v0, Lv7/b0;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Ll3/i;->a:Ljava/io/File;

    .line 6
    .line 7
    invoke-static {v0}, Lv7/a0;->e(Ljava/io/File;)Lv7/b0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lv7/p;->a:Lv7/w;

    .line 12
    .line 13
    new-instance v3, Li3/n;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v3, v1, v2, v4, v4}, Li3/n;-><init>(Lv7/b0;Lv7/p;Ljava/lang/String;Ljava/io/Closeable;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "getName(...)"

    .line 28
    .line 29
    invoke-static {v2, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/16 v2, 0x2e

    .line 33
    .line 34
    const-string v4, ""

    .line 35
    .line 36
    invoke-static {v0, v2, v4}, Lh7/h;->O0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Li3/f;->l:Li3/f;

    .line 45
    .line 46
    invoke-direct {p1, v3, v0, v1}, Ll3/n;-><init>(Li3/o;Ljava/lang/String;Li3/f;)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method
