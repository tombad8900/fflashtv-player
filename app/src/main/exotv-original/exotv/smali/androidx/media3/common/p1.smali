.class public abstract Landroidx/media3/common/p1;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final EMPTY:Landroidx/media3/common/p1;

.field private static final FIELD_PERIODS:Ljava/lang/String;

.field private static final FIELD_SHUFFLED_WINDOW_INDICES:Ljava/lang/String;

.field private static final FIELD_WINDOWS:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/common/l1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/common/p1;->EMPTY:Landroidx/media3/common/p1;

    .line 7
    .line 8
    sget v0, Lh1/i0;->a:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0x24

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/media3/common/p1;->FIELD_WINDOWS:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Landroidx/media3/common/p1;->FIELD_PERIODS:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/media3/common/p1;->FIELD_SHUFFLED_WINDOW_INDICES:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public static a(Le6/d;Landroid/os/IBinder;)Lf6/l1;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lf6/m0;->k:Lf6/k0;

    .line 4
    .line 5
    sget-object p0, Lf6/l1;->n:Lf6/l1;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p1, Landroidx/media3/common/j;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p1, Landroidx/media3/common/j;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/media3/common/j;->b:Lf6/m0;

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_1
    sget v0, Landroidx/media3/common/j;->c:I

    .line 18
    .line 19
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    move v4, v1

    .line 26
    move v3, v2

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :try_start_0
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-interface {p1, v2, v3, v5, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    :goto_1
    :try_start_2
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ne v6, v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v6}, Lf6/g0;->a(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    move v3, v6

    .line 71
    goto :goto_0

    .line 72
    :catch_0
    move-exception p0

    .line 73
    :try_start_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 74
    .line 75
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :goto_2
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_3
    invoke-virtual {v0}, Lf6/j0;->f()Lf6/l1;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :goto_3
    invoke-static {p0, p1}, Lh1/a;->q(Le6/d;Ljava/util/List;)Lf6/l1;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static fromBundle(Landroid/os/Bundle;)Landroidx/media3/common/p1;
    .locals 5

    .line 1
    new-instance v0, Landroidx/media3/common/n;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Landroidx/media3/common/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Landroidx/media3/common/p1;->FIELD_WINDOWS:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Landroidx/media3/common/p1;->a(Le6/d;Landroid/os/IBinder;)Lf6/l1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroidx/media3/common/n;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, v2}, Landroidx/media3/common/n;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Landroidx/media3/common/p1;->FIELD_PERIODS:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v1, v2}, Landroidx/media3/common/p1;->a(Le6/d;Landroid/os/IBinder;)Lf6/l1;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Landroidx/media3/common/p1;->FIELD_SHUFFLED_WINDOW_INDICES:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v2, Landroidx/media3/common/n1;

    .line 40
    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    iget p0, v0, Lf6/l1;->m:I

    .line 44
    .line 45
    new-array v3, p0, [I

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-ge v4, p0, :cond_0

    .line 49
    .line 50
    aput v4, v3, v4

    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object p0, v3

    .line 56
    :cond_1
    invoke-direct {v2, v0, v1, p0}, Landroidx/media3/common/n1;-><init>(Lf6/l1;Lf6/l1;[I)V

    .line 57
    .line 58
    .line 59
    return-object v2
.end method


# virtual methods
.method public final copyWithSingleWindow(I)Landroidx/media3/common/p1;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Landroidx/media3/common/o1;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/media3/common/o1;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0, v2, v3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lf6/m0;->i()Lf6/j0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v2, p1, Landroidx/media3/common/o1;->n:I

    .line 25
    .line 26
    :goto_0
    iget v3, p1, Landroidx/media3/common/o1;->o:I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-gt v2, v3, :cond_1

    .line 30
    .line 31
    new-instance v3, Landroidx/media3/common/m1;

    .line 32
    .line 33
    invoke-direct {v3}, Landroidx/media3/common/m1;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v2, v3, v1}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iput v4, v3, Landroidx/media3/common/m1;->c:I

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lf6/g0;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v1, p1, Landroidx/media3/common/o1;->n:I

    .line 49
    .line 50
    sub-int/2addr v3, v1

    .line 51
    iput v3, p1, Landroidx/media3/common/o1;->o:I

    .line 52
    .line 53
    iput v4, p1, Landroidx/media3/common/o1;->n:I

    .line 54
    .line 55
    new-instance v1, Landroidx/media3/common/n1;

    .line 56
    .line 57
    invoke-static {p1}, Lf6/m0;->n(Ljava/lang/Object;)Lf6/l1;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0}, Lf6/j0;->f()Lf6/l1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    filled-new-array {v4}, [I

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v1, p1, v0, v2}, Landroidx/media3/common/n1;-><init>(Lf6/l1;Lf6/l1;[I)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/media3/common/p1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Landroidx/media3/common/p1;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v1, v3, :cond_b

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eq v1, v3, :cond_2

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_2
    new-instance v1, Landroidx/media3/common/o1;

    .line 36
    .line 37
    invoke-direct {v1}, Landroidx/media3/common/o1;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v3, Landroidx/media3/common/m1;

    .line 41
    .line 42
    invoke-direct {v3}, Landroidx/media3/common/m1;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v4, Landroidx/media3/common/o1;

    .line 46
    .line 47
    invoke-direct {v4}, Landroidx/media3/common/o1;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v5, Landroidx/media3/common/m1;

    .line 51
    .line 52
    invoke-direct {v5}, Landroidx/media3/common/m1;-><init>()V

    .line 53
    .line 54
    .line 55
    move v6, v2

    .line 56
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-ge v6, v7, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0, v6, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {p1, v6, v4}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v7, v8}, Landroidx/media3/common/o1;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_3

    .line 75
    .line 76
    return v2

    .line 77
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    move v1, v2

    .line 81
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-ge v1, v4, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0, v1, v3, v0}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {p1, v1, v5, v0}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v4, v6}, Landroidx/media3/common/m1;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_5

    .line 100
    .line 101
    return v2

    .line 102
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-virtual {p0, v0}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eq v1, v3, :cond_7

    .line 114
    .line 115
    return v2

    .line 116
    :cond_7
    invoke-virtual {p0, v0}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-virtual {p1, v0}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eq v3, v4, :cond_8

    .line 125
    .line 126
    return v2

    .line 127
    :cond_8
    :goto_2
    if-eq v1, v3, :cond_a

    .line 128
    .line 129
    invoke-virtual {p0, v1, v2, v0}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-virtual {p1, v1, v2, v0}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eq v4, v1, :cond_9

    .line 138
    .line 139
    return v2

    .line 140
    :cond_9
    move v1, v4

    .line 141
    goto :goto_2

    .line 142
    :cond_a
    return v0

    .line 143
    :cond_b
    :goto_3
    return v2
.end method

.method public getFirstWindowIndex(Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public abstract getIndexOfPeriod(Ljava/lang/Object;)I
.end method

.method public getLastWindowIndex(Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    return p1
.end method

.method public final getNextPeriodIndex(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p2, p2, Landroidx/media3/common/m1;->c:I

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroidx/media3/common/o1;->o:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p2, p4, p5}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 p2, -0x1

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return p2

    .line 23
    :cond_0
    invoke-virtual {p0, p1, p3}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget p1, p1, Landroidx/media3/common/o1;->n:I

    .line 28
    .line 29
    return p1

    .line 30
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    return p1
.end method

.method public getNextWindowIndex(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    if-eq p2, v0, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne p2, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/2addr p1, v0

    .line 21
    return p1

    .line 22
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_2
    return p1

    .line 29
    :cond_3
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-ne p1, p2, :cond_4

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :cond_4
    add-int/2addr p1, v0

    .line 38
    return p1
.end method

.method public final getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    move-result-object p1

    return-object p1
.end method

.method public abstract getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;
.end method

.method public getPeriodByUid(Ljava/lang/Object;Landroidx/media3/common/m1;)Landroidx/media3/common/m1;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/common/p1;->getIndexOfPeriod(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public abstract getPeriodCount()I
.end method

.method public final getPeriodPosition(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o1;",
            "Landroidx/media3/common/m1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final getPeriodPosition(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o1;",
            "Landroidx/media3/common/m1;",
            "IJJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-virtual/range {p0 .. p7}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJ)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o1;",
            "Landroidx/media3/common/m1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    .line 1
    invoke-virtual/range {v0 .. v7}, Landroidx/media3/common/p1;->getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final getPeriodPositionUs(Landroidx/media3/common/o1;Landroidx/media3/common/m1;IJJ)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/media3/common/o1;",
            "Landroidx/media3/common/m1;",
            "IJJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    move-result v0

    invoke-static {p3, v0}, Lh1/a;->g(II)V

    .line 4
    invoke-virtual {p0, p3, p1, p6, p7}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;

    const-wide p6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    .line 5
    iget-wide p4, p1, Landroidx/media3/common/o1;->l:J

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 6
    :cond_0
    iget p3, p1, Landroidx/media3/common/o1;->n:I

    .line 7
    invoke-virtual {p0, p3, p2}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    .line 8
    :goto_0
    iget v0, p1, Landroidx/media3/common/o1;->o:I

    if-ge p3, v0, :cond_1

    iget-wide v0, p2, Landroidx/media3/common/m1;->e:J

    cmp-long v0, v0, p4

    if-eqz v0, :cond_1

    add-int/lit8 v0, p3, 0x1

    .line 9
    invoke-virtual {p0, v0, p2}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;)Landroidx/media3/common/m1;

    move-result-object v1

    iget-wide v1, v1, Landroidx/media3/common/m1;->e:J

    cmp-long v1, v1, p4

    if-gtz v1, :cond_1

    move p3, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p3, p2, p1}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 11
    iget-wide v0, p2, Landroidx/media3/common/m1;->e:J

    sub-long/2addr p4, v0

    .line 12
    iget-wide v0, p2, Landroidx/media3/common/m1;->d:J

    cmp-long p1, v0, p6

    if-eqz p1, :cond_2

    const-wide/16 p6, 0x1

    sub-long/2addr v0, p6

    .line 13
    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    :cond_2
    const-wide/16 p6, 0x0

    .line 14
    invoke-static {p6, p7, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    .line 15
    iget-object p1, p2, Landroidx/media3/common/m1;->b:Ljava/lang/Object;

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public getPreviousWindowIndex(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    if-eq p2, v0, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne p2, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getLastWindowIndex(Z)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    sub-int/2addr p1, v0

    .line 21
    return p1

    .line 22
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_2
    return p1

    .line 29
    :cond_3
    invoke-virtual {p0, p3}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-ne p1, p2, :cond_4

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :cond_4
    sub-int/2addr p1, v0

    .line 38
    return p1
.end method

.method public abstract getUidOfPeriod(I)Ljava/lang/Object;
.end method

.method public final getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;

    move-result-object p1

    return-object p1
.end method

.method public abstract getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;
.end method

.method public abstract getWindowCount()I
.end method

.method public hashCode()I
    .locals 6

    .line 1
    new-instance v0, Landroidx/media3/common/o1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/o1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/media3/common/m1;

    .line 7
    .line 8
    invoke-direct {v1}, Landroidx/media3/common/m1;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/lit16 v2, v2, 0xd9

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-ge v4, v5, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x1f

    .line 26
    .line 27
    invoke-virtual {p0, v4, v0}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;)Landroidx/media3/common/o1;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Landroidx/media3/common/o1;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    add-int/2addr v2, v5

    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    mul-int/lit8 v2, v2, 0x1f

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v0, v2

    .line 46
    move v2, v3

    .line 47
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x1

    .line 52
    if-ge v2, v4, :cond_1

    .line 53
    .line 54
    mul-int/lit8 v0, v0, 0x1f

    .line 55
    .line 56
    invoke-virtual {p0, v2, v1, v5}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Landroidx/media3/common/m1;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/2addr v0, v4

    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p0, v5}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    :goto_2
    const/4 v2, -0x1

    .line 73
    if-eq v1, v2, :cond_2

    .line 74
    .line 75
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    .line 77
    add-int/2addr v0, v1

    .line 78
    invoke-virtual {p0, v1, v3, v5}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final isLastPeriod(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)Z
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Landroidx/media3/common/p1;->getNextPeriodIndex(ILandroidx/media3/common/m1;Landroidx/media3/common/o1;IZ)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, -0x1

    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final toBundle()Landroid/os/Bundle;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getWindowCount()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    new-instance v3, Landroidx/media3/common/o1;

    .line 13
    .line 14
    invoke-direct {v3}, Landroidx/media3/common/o1;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide/16 v8, 0x0

    .line 25
    .line 26
    if-ge v5, v2, :cond_d

    .line 27
    .line 28
    invoke-virtual {v0, v5, v3, v8, v9}, Landroidx/media3/common/p1;->getWindow(ILandroidx/media3/common/o1;J)Landroidx/media3/common/o1;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v11, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v12, Landroidx/media3/common/o0;->g:Landroidx/media3/common/o0;

    .line 41
    .line 42
    iget-object v13, v10, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 43
    .line 44
    invoke-virtual {v12, v13}, Landroidx/media3/common/o0;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-nez v12, :cond_0

    .line 49
    .line 50
    sget-object v12, Landroidx/media3/common/o1;->t:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v13, v10, Landroidx/media3/common/o1;->c:Landroidx/media3/common/o0;

    .line 53
    .line 54
    invoke-virtual {v13, v4}, Landroidx/media3/common/o0;->d(Z)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    invoke-virtual {v11, v12, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-wide v12, v10, Landroidx/media3/common/o1;->e:J

    .line 62
    .line 63
    cmp-long v14, v12, v6

    .line 64
    .line 65
    if-eqz v14, :cond_1

    .line 66
    .line 67
    sget-object v14, Landroidx/media3/common/o1;->u:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v11, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-wide v12, v10, Landroidx/media3/common/o1;->f:J

    .line 73
    .line 74
    cmp-long v14, v12, v6

    .line 75
    .line 76
    if-eqz v14, :cond_2

    .line 77
    .line 78
    sget-object v14, Landroidx/media3/common/o1;->v:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v11, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-wide v12, v10, Landroidx/media3/common/o1;->g:J

    .line 84
    .line 85
    cmp-long v14, v12, v6

    .line 86
    .line 87
    if-eqz v14, :cond_3

    .line 88
    .line 89
    sget-object v14, Landroidx/media3/common/o1;->w:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v11, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-boolean v12, v10, Landroidx/media3/common/o1;->h:Z

    .line 95
    .line 96
    if-eqz v12, :cond_4

    .line 97
    .line 98
    sget-object v13, Landroidx/media3/common/o1;->x:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v11, v13, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-boolean v12, v10, Landroidx/media3/common/o1;->i:Z

    .line 104
    .line 105
    if-eqz v12, :cond_5

    .line 106
    .line 107
    sget-object v13, Landroidx/media3/common/o1;->y:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v11, v13, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    :cond_5
    iget-object v12, v10, Landroidx/media3/common/o1;->j:Landroidx/media3/common/i0;

    .line 113
    .line 114
    if-eqz v12, :cond_6

    .line 115
    .line 116
    sget-object v13, Landroidx/media3/common/o1;->z:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v12}, Landroidx/media3/common/i0;->c()Landroid/os/Bundle;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v11, v13, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    iget-boolean v12, v10, Landroidx/media3/common/o1;->k:Z

    .line 126
    .line 127
    if-eqz v12, :cond_7

    .line 128
    .line 129
    sget-object v13, Landroidx/media3/common/o1;->A:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v11, v13, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    :cond_7
    iget-wide v12, v10, Landroidx/media3/common/o1;->l:J

    .line 135
    .line 136
    cmp-long v14, v12, v8

    .line 137
    .line 138
    if-eqz v14, :cond_8

    .line 139
    .line 140
    sget-object v14, Landroidx/media3/common/o1;->B:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v11, v14, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 143
    .line 144
    .line 145
    :cond_8
    iget-wide v12, v10, Landroidx/media3/common/o1;->m:J

    .line 146
    .line 147
    cmp-long v6, v12, v6

    .line 148
    .line 149
    if-eqz v6, :cond_9

    .line 150
    .line 151
    sget-object v6, Landroidx/media3/common/o1;->C:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v11, v6, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 154
    .line 155
    .line 156
    :cond_9
    iget v6, v10, Landroidx/media3/common/o1;->n:I

    .line 157
    .line 158
    if-eqz v6, :cond_a

    .line 159
    .line 160
    sget-object v7, Landroidx/media3/common/o1;->D:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v11, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    :cond_a
    iget v6, v10, Landroidx/media3/common/o1;->o:I

    .line 166
    .line 167
    if-eqz v6, :cond_b

    .line 168
    .line 169
    sget-object v7, Landroidx/media3/common/o1;->E:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v11, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    :cond_b
    iget-wide v6, v10, Landroidx/media3/common/o1;->p:J

    .line 175
    .line 176
    cmp-long v8, v6, v8

    .line 177
    .line 178
    if-eqz v8, :cond_c

    .line 179
    .line 180
    sget-object v8, Landroidx/media3/common/o1;->F:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v11, v8, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 183
    .line 184
    .line 185
    :cond_c
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    add-int/lit8 v5, v5, 0x1

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_d
    new-instance v3, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/media3/common/p1;->getPeriodCount()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    new-instance v10, Landroidx/media3/common/m1;

    .line 202
    .line 203
    invoke-direct {v10}, Landroidx/media3/common/m1;-><init>()V

    .line 204
    .line 205
    .line 206
    move v11, v4

    .line 207
    :goto_1
    if-ge v11, v5, :cond_1a

    .line 208
    .line 209
    invoke-virtual {v0, v11, v10, v4}, Landroidx/media3/common/p1;->getPeriod(ILandroidx/media3/common/m1;Z)Landroidx/media3/common/m1;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance v14, Landroid/os/Bundle;

    .line 217
    .line 218
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 219
    .line 220
    .line 221
    iget v15, v13, Landroidx/media3/common/m1;->c:I

    .line 222
    .line 223
    move-wide/from16 v16, v6

    .line 224
    .line 225
    if-eqz v15, :cond_e

    .line 226
    .line 227
    sget-object v6, Landroidx/media3/common/m1;->h:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v14, v6, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 230
    .line 231
    .line 232
    :cond_e
    iget-wide v6, v13, Landroidx/media3/common/m1;->d:J

    .line 233
    .line 234
    cmp-long v15, v6, v16

    .line 235
    .line 236
    if-eqz v15, :cond_f

    .line 237
    .line 238
    sget-object v15, Landroidx/media3/common/m1;->i:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v14, v15, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 241
    .line 242
    .line 243
    :cond_f
    iget-wide v6, v13, Landroidx/media3/common/m1;->e:J

    .line 244
    .line 245
    cmp-long v15, v6, v8

    .line 246
    .line 247
    if-eqz v15, :cond_10

    .line 248
    .line 249
    sget-object v15, Landroidx/media3/common/m1;->j:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v14, v15, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 252
    .line 253
    .line 254
    :cond_10
    iget-boolean v6, v13, Landroidx/media3/common/m1;->f:Z

    .line 255
    .line 256
    if-eqz v6, :cond_11

    .line 257
    .line 258
    sget-object v7, Landroidx/media3/common/m1;->k:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v14, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 261
    .line 262
    .line 263
    :cond_11
    iget-object v6, v13, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 264
    .line 265
    sget-object v7, Landroidx/media3/common/c;->g:Landroidx/media3/common/c;

    .line 266
    .line 267
    invoke-virtual {v6, v7}, Landroidx/media3/common/c;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-nez v6, :cond_19

    .line 272
    .line 273
    sget-object v6, Landroidx/media3/common/m1;->l:Ljava/lang/String;

    .line 274
    .line 275
    iget-object v7, v13, Landroidx/media3/common/m1;->g:Landroidx/media3/common/c;

    .line 276
    .line 277
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    new-instance v13, Landroid/os/Bundle;

    .line 281
    .line 282
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 283
    .line 284
    .line 285
    new-instance v15, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .line 289
    .line 290
    move-wide/from16 v18, v8

    .line 291
    .line 292
    iget-object v8, v7, Landroidx/media3/common/c;->f:[Landroidx/media3/common/b;

    .line 293
    .line 294
    array-length v9, v8

    .line 295
    move/from16 v20, v4

    .line 296
    .line 297
    :goto_2
    if-ge v4, v9, :cond_14

    .line 298
    .line 299
    aget-object v12, v8, v4

    .line 300
    .line 301
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move/from16 v21, v4

    .line 305
    .line 306
    new-instance v4, Landroid/os/Bundle;

    .line 307
    .line 308
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 309
    .line 310
    .line 311
    move/from16 v22, v5

    .line 312
    .line 313
    sget-object v5, Landroidx/media3/common/b;->j:Ljava/lang/String;

    .line 314
    .line 315
    move-object/from16 v23, v8

    .line 316
    .line 317
    move/from16 v24, v9

    .line 318
    .line 319
    iget-wide v8, v12, Landroidx/media3/common/b;->a:J

    .line 320
    .line 321
    invoke-virtual {v4, v5, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 322
    .line 323
    .line 324
    sget-object v5, Landroidx/media3/common/b;->k:Ljava/lang/String;

    .line 325
    .line 326
    iget v8, v12, Landroidx/media3/common/b;->b:I

    .line 327
    .line 328
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 329
    .line 330
    .line 331
    sget-object v5, Landroidx/media3/common/b;->q:Ljava/lang/String;

    .line 332
    .line 333
    iget v8, v12, Landroidx/media3/common/b;->c:I

    .line 334
    .line 335
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 336
    .line 337
    .line 338
    sget-object v5, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 339
    .line 340
    new-instance v8, Ljava/util/ArrayList;

    .line 341
    .line 342
    iget-object v9, v12, Landroidx/media3/common/b;->d:[Landroid/net/Uri;

    .line 343
    .line 344
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4, v5, v8}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 352
    .line 353
    .line 354
    sget-object v5, Landroidx/media3/common/b;->r:Ljava/lang/String;

    .line 355
    .line 356
    new-instance v8, Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 359
    .line 360
    .line 361
    iget-object v9, v12, Landroidx/media3/common/b;->e:[Landroidx/media3/common/o0;

    .line 362
    .line 363
    move-object/from16 v25, v10

    .line 364
    .line 365
    array-length v10, v9

    .line 366
    move-object/from16 v26, v9

    .line 367
    .line 368
    move/from16 v9, v20

    .line 369
    .line 370
    :goto_3
    if-ge v9, v10, :cond_13

    .line 371
    .line 372
    move/from16 v27, v9

    .line 373
    .line 374
    aget-object v9, v26, v27

    .line 375
    .line 376
    if-nez v9, :cond_12

    .line 377
    .line 378
    const/4 v9, 0x0

    .line 379
    move/from16 v28, v10

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :cond_12
    move/from16 v28, v10

    .line 383
    .line 384
    const/4 v10, 0x1

    .line 385
    invoke-virtual {v9, v10}, Landroidx/media3/common/o0;->d(Z)Landroid/os/Bundle;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    :goto_4
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    add-int/lit8 v9, v27, 0x1

    .line 393
    .line 394
    move/from16 v10, v28

    .line 395
    .line 396
    goto :goto_3

    .line 397
    :cond_13
    invoke-virtual {v4, v5, v8}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 398
    .line 399
    .line 400
    sget-object v5, Landroidx/media3/common/b;->m:Ljava/lang/String;

    .line 401
    .line 402
    iget-object v8, v12, Landroidx/media3/common/b;->f:[I

    .line 403
    .line 404
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 405
    .line 406
    .line 407
    sget-object v5, Landroidx/media3/common/b;->n:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v8, v12, Landroidx/media3/common/b;->g:[J

    .line 410
    .line 411
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 412
    .line 413
    .line 414
    sget-object v5, Landroidx/media3/common/b;->o:Ljava/lang/String;

    .line 415
    .line 416
    iget-wide v8, v12, Landroidx/media3/common/b;->h:J

    .line 417
    .line 418
    invoke-virtual {v4, v5, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 419
    .line 420
    .line 421
    sget-object v5, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 422
    .line 423
    iget-boolean v8, v12, Landroidx/media3/common/b;->i:Z

    .line 424
    .line 425
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    add-int/lit8 v4, v21, 0x1

    .line 432
    .line 433
    move/from16 v5, v22

    .line 434
    .line 435
    move-object/from16 v8, v23

    .line 436
    .line 437
    move/from16 v9, v24

    .line 438
    .line 439
    move-object/from16 v10, v25

    .line 440
    .line 441
    goto/16 :goto_2

    .line 442
    .line 443
    :cond_14
    move/from16 v22, v5

    .line 444
    .line 445
    move-object/from16 v25, v10

    .line 446
    .line 447
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-nez v4, :cond_15

    .line 452
    .line 453
    sget-object v4, Landroidx/media3/common/c;->i:Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v13, v4, v15}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 456
    .line 457
    .line 458
    :cond_15
    iget-wide v4, v7, Landroidx/media3/common/c;->c:J

    .line 459
    .line 460
    cmp-long v8, v4, v18

    .line 461
    .line 462
    if-eqz v8, :cond_16

    .line 463
    .line 464
    sget-object v8, Landroidx/media3/common/c;->j:Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v13, v8, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 467
    .line 468
    .line 469
    :cond_16
    iget-wide v4, v7, Landroidx/media3/common/c;->d:J

    .line 470
    .line 471
    cmp-long v8, v4, v16

    .line 472
    .line 473
    if-eqz v8, :cond_17

    .line 474
    .line 475
    sget-object v8, Landroidx/media3/common/c;->k:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v13, v8, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 478
    .line 479
    .line 480
    :cond_17
    iget v4, v7, Landroidx/media3/common/c;->e:I

    .line 481
    .line 482
    if-eqz v4, :cond_18

    .line 483
    .line 484
    sget-object v5, Landroidx/media3/common/c;->l:Ljava/lang/String;

    .line 485
    .line 486
    invoke-virtual {v13, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 487
    .line 488
    .line 489
    :cond_18
    invoke-virtual {v14, v6, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 490
    .line 491
    .line 492
    goto :goto_5

    .line 493
    :cond_19
    move/from16 v20, v4

    .line 494
    .line 495
    move/from16 v22, v5

    .line 496
    .line 497
    move-wide/from16 v18, v8

    .line 498
    .line 499
    move-object/from16 v25, v10

    .line 500
    .line 501
    :goto_5
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    add-int/lit8 v11, v11, 0x1

    .line 505
    .line 506
    move-wide/from16 v6, v16

    .line 507
    .line 508
    move-wide/from16 v8, v18

    .line 509
    .line 510
    move/from16 v4, v20

    .line 511
    .line 512
    move/from16 v5, v22

    .line 513
    .line 514
    move-object/from16 v10, v25

    .line 515
    .line 516
    goto/16 :goto_1

    .line 517
    .line 518
    :cond_1a
    move/from16 v20, v4

    .line 519
    .line 520
    new-array v4, v2, [I

    .line 521
    .line 522
    const/4 v10, 0x1

    .line 523
    if-lez v2, :cond_1b

    .line 524
    .line 525
    invoke-virtual {v0, v10}, Landroidx/media3/common/p1;->getFirstWindowIndex(Z)I

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    aput v5, v4, v20

    .line 530
    .line 531
    :cond_1b
    move v5, v10

    .line 532
    :goto_6
    if-ge v5, v2, :cond_1c

    .line 533
    .line 534
    add-int/lit8 v6, v5, -0x1

    .line 535
    .line 536
    aget v6, v4, v6

    .line 537
    .line 538
    move/from16 v7, v20

    .line 539
    .line 540
    invoke-virtual {v0, v6, v7, v10}, Landroidx/media3/common/p1;->getNextWindowIndex(IIZ)I

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    aput v6, v4, v5

    .line 545
    .line 546
    add-int/lit8 v5, v5, 0x1

    .line 547
    .line 548
    goto :goto_6

    .line 549
    :cond_1c
    new-instance v2, Landroid/os/Bundle;

    .line 550
    .line 551
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 552
    .line 553
    .line 554
    sget-object v5, Landroidx/media3/common/p1;->FIELD_WINDOWS:Ljava/lang/String;

    .line 555
    .line 556
    new-instance v6, Landroidx/media3/common/j;

    .line 557
    .line 558
    invoke-direct {v6, v1}, Landroidx/media3/common/j;-><init>(Ljava/util/ArrayList;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v5, v6}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 562
    .line 563
    .line 564
    sget-object v1, Landroidx/media3/common/p1;->FIELD_PERIODS:Ljava/lang/String;

    .line 565
    .line 566
    new-instance v5, Landroidx/media3/common/j;

    .line 567
    .line 568
    invoke-direct {v5, v3}, Landroidx/media3/common/j;-><init>(Ljava/util/ArrayList;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v1, v5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 572
    .line 573
    .line 574
    sget-object v1, Landroidx/media3/common/p1;->FIELD_SHUFFLED_WINDOW_INDICES:Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v2, v1, v4}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 577
    .line 578
    .line 579
    return-object v2
.end method
