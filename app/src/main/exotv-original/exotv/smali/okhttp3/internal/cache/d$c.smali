.class public final Lokhttp3/internal/cache/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/cache/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final cleanFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private currentEditor:Lokhttp3/internal/cache/d$b;

.field private final dirtyFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private final key:Ljava/lang/String;

.field private final lengths:[J

.field private lockingSourceCount:I

.field private readable:Z

.field private sequenceNumber:J

.field final synthetic this$0:Lokhttp3/internal/cache/d;

.field private zombie:Z


# direct methods
.method public constructor <init>(Lokhttp3/internal/cache/d;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/cache/d$c;->key:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/internal/cache/d;->getValueCount$okhttp()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-array v0, v0, [J

    .line 18
    .line 19
    iput-object v0, p0, Lokhttp3/internal/cache/d$c;->lengths:[J

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lokhttp3/internal/cache/d$c;->cleanFiles:Ljava/util/List;

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lokhttp3/internal/cache/d$c;->dirtyFiles:Ljava/util/List;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 p2, 0x2e

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p1}, Lokhttp3/internal/cache/d;->getValueCount$okhttp()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_0
    if-ge v1, p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lokhttp3/internal/cache/d$c;->cleanFiles:Ljava/util/List;

    .line 60
    .line 61
    new-instance v3, Ljava/io/File;

    .line 62
    .line 63
    iget-object v4, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 64
    .line 65
    invoke-virtual {v4}, Lokhttp3/internal/cache/d;->getDirectory()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    const-string v2, ".tmp"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lokhttp3/internal/cache/d$c;->dirtyFiles:Ljava/util/List;

    .line 85
    .line 86
    new-instance v3, Ljava/io/File;

    .line 87
    .line 88
    iget-object v4, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 89
    .line 90
    invoke-virtual {v4}, Lokhttp3/internal/cache/d;->getDirectory()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method

.method private final invalidLengths(Ljava/util/List;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "unexpected journal line: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method private final newSource(I)Lv7/k0;
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/cache/d;->getFileSystem$okhttp()Lokhttp3/internal/io/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lokhttp3/internal/cache/d$c;->cleanFiles:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/io/File;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lokhttp3/internal/io/b;->source(Ljava/io/File;)Lv7/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 20
    .line 21
    invoke-static {v0}, Lokhttp3/internal/cache/d;->access$getCivilizedFileSystem$p(Lokhttp3/internal/cache/d;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    iget v0, p0, Lokhttp3/internal/cache/d$c;->lockingSourceCount:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    iput v0, p0, Lokhttp3/internal/cache/d$c;->lockingSourceCount:I

    .line 33
    .line 34
    new-instance v0, Lokhttp3/internal/cache/d$c$a;

    .line 35
    .line 36
    iget-object v1, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 37
    .line 38
    invoke-direct {v0, p1, v1, p0}, Lokhttp3/internal/cache/d$c$a;-><init>(Lv7/k0;Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$c;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method


# virtual methods
.method public final getCleanFiles$okhttp()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->cleanFiles:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentEditor$okhttp()Lokhttp3/internal/cache/d$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->currentEditor:Lokhttp3/internal/cache/d$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDirtyFiles$okhttp()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->dirtyFiles:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKey$okhttp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLengths$okhttp()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->lengths:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLockingSourceCount$okhttp()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/cache/d$c;->lockingSourceCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReadable$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/d$c;->readable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSequenceNumber$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/cache/d$c;->sequenceNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getZombie$okhttp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/cache/d$c;->zombie:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setCurrentEditor$okhttp(Lokhttp3/internal/cache/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/cache/d$c;->currentEditor:Lokhttp3/internal/cache/d$b;

    .line 2
    .line 3
    return-void
.end method

.method public final setLengths$okhttp(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "strings"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 11
    .line 12
    invoke-virtual {v1}, Lokhttp3/internal/cache/d;->getValueCount$okhttp()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lokhttp3/internal/cache/d$c;->lengths:[J

    .line 26
    .line 27
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    aput-wide v3, v2, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void

    .line 43
    :catch_0
    invoke-direct {p0, p1}, Lokhttp3/internal/cache/d$c;->invalidLengths(Ljava/util/List;)Ljava/lang/Void;

    .line 44
    .line 45
    .line 46
    new-instance p1, La1/u;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    invoke-direct {p0, p1}, Lokhttp3/internal/cache/d$c;->invalidLengths(Ljava/util/List;)Ljava/lang/Void;

    .line 53
    .line 54
    .line 55
    new-instance p1, La1/u;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final setLockingSourceCount$okhttp(I)V
    .locals 0

    .line 1
    iput p1, p0, Lokhttp3/internal/cache/d$c;->lockingSourceCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setReadable$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/internal/cache/d$c;->readable:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSequenceNumber$okhttp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lokhttp3/internal/cache/d$c;->sequenceNumber:J

    .line 2
    .line 3
    return-void
.end method

.method public final setZombie$okhttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/internal/cache/d$c;->zombie:Z

    .line 2
    .line 3
    return-void
.end method

.method public final snapshot$okhttp()Lokhttp3/internal/cache/d$d;
    .locals 9

    .line 1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 2
    .line 3
    sget-boolean v1, Lq7/c;->assertionsEnabled:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "Thread "

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, " MUST hold lock on "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lokhttp3/internal/cache/d$c;->readable:Z

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 57
    .line 58
    invoke-static {v0}, Lokhttp3/internal/cache/d;->access$getCivilizedFileSystem$p(Lokhttp3/internal/cache/d;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->currentEditor:Lokhttp3/internal/cache/d$b;

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    iget-boolean v0, p0, Lokhttp3/internal/cache/d$c;->zombie:Z

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    :cond_3
    return-object v1

    .line 73
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->lengths:[J

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v8, v0

    .line 85
    check-cast v8, [J

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    :try_start_0
    iget-object v2, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 89
    .line 90
    invoke-virtual {v2}, Lokhttp3/internal/cache/d;->getValueCount$okhttp()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    move v3, v0

    .line 95
    :goto_1
    if-ge v3, v2, :cond_5

    .line 96
    .line 97
    invoke-direct {p0, v3}, Lokhttp3/internal/cache/d$c;->newSource(I)Lv7/k0;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    new-instance v2, Lokhttp3/internal/cache/d$d;

    .line 108
    .line 109
    iget-object v3, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 110
    .line 111
    iget-object v4, p0, Lokhttp3/internal/cache/d$c;->key:Ljava/lang/String;

    .line 112
    .line 113
    iget-wide v5, p0, Lokhttp3/internal/cache/d$c;->sequenceNumber:J

    .line 114
    .line 115
    invoke-direct/range {v2 .. v8}, Lokhttp3/internal/cache/d$d;-><init>(Lokhttp3/internal/cache/d;Ljava/lang/String;JLjava/util/List;[J)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :catch_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    :goto_2
    if-ge v0, v2, :cond_6

    .line 124
    .line 125
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    add-int/lit8 v0, v0, 0x1

    .line 130
    .line 131
    check-cast v3, Lv7/k0;

    .line 132
    .line 133
    invoke-static {v3}, Lq7/c;->closeQuietly(Ljava/io/Closeable;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->this$0:Lokhttp3/internal/cache/d;

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Lokhttp3/internal/cache/d;->removeEntry$okhttp(Lokhttp3/internal/cache/d$c;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    .line 141
    .line 142
    :catch_1
    return-object v1
.end method

.method public final writeLengths$okhttp(Lv7/k;)V
    .locals 6

    .line 1
    const-string v0, "writer"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/cache/d$c;->lengths:[J

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-wide v3, v0, v2

    .line 13
    .line 14
    const/16 v5, 0x20

    .line 15
    .line 16
    invoke-interface {p1, v5}, Lv7/k;->writeByte(I)Lv7/k;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-interface {v5, v3, v4}, Lv7/k;->z(J)Lv7/k;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
