.class public final synthetic Lh2/k;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/q;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lh2/k;->b:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()[Ln1/n;
    .locals 9

    .line 1
    iget v0, p0, Lh2/k;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lu2/c;

    .line 9
    .line 10
    invoke-direct {v0}, Lu2/c;-><init>()V

    .line 11
    .line 12
    .line 13
    new-array v1, v1, [Ln1/n;

    .line 14
    .line 15
    aput-object v0, v1, v2

    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    new-instance v3, Lt2/e0;

    .line 19
    .line 20
    new-instance v7, Lh1/d0;

    .line 21
    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    invoke-direct {v7, v4, v5}, Lh1/d0;-><init>(J)V

    .line 25
    .line 26
    .line 27
    new-instance v8, Lj0/i;

    .line 28
    .line 29
    sget-object v0, Lf6/m0;->k:Lf6/k0;

    .line 30
    .line 31
    sget-object v0, Lf6/l1;->n:Lf6/l1;

    .line 32
    .line 33
    invoke-direct {v8, v2, v0}, Lj0/i;-><init>(ILjava/util/List;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x1

    .line 38
    sget-object v6, Lk2/o;->g:Lk2/b;

    .line 39
    .line 40
    invoke-direct/range {v3 .. v8}, Lt2/e0;-><init>(IILk2/o;Lh1/d0;Lj0/i;)V

    .line 41
    .line 42
    .line 43
    new-array v0, v1, [Ln1/n;

    .line 44
    .line 45
    aput-object v3, v0, v2

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    new-instance v0, Lt2/b0;

    .line 49
    .line 50
    invoke-direct {v0}, Lt2/b0;-><init>()V

    .line 51
    .line 52
    .line 53
    new-array v1, v1, [Ln1/n;

    .line 54
    .line 55
    aput-object v0, v1, v2

    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_2
    new-instance v0, Lt2/d;

    .line 59
    .line 60
    invoke-direct {v0, v2}, Lt2/d;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-array v1, v1, [Ln1/n;

    .line 64
    .line 65
    aput-object v0, v1, v2

    .line 66
    .line 67
    return-object v1

    .line 68
    :pswitch_3
    new-instance v0, Lt2/c;

    .line 69
    .line 70
    invoke-direct {v0}, Lt2/c;-><init>()V

    .line 71
    .line 72
    .line 73
    new-array v1, v1, [Ln1/n;

    .line 74
    .line 75
    aput-object v0, v1, v2

    .line 76
    .line 77
    return-object v1

    .line 78
    :pswitch_4
    new-instance v0, Lt2/a;

    .line 79
    .line 80
    invoke-direct {v0}, Lt2/a;-><init>()V

    .line 81
    .line 82
    .line 83
    new-array v1, v1, [Ln1/n;

    .line 84
    .line 85
    aput-object v0, v1, v2

    .line 86
    .line 87
    return-object v1

    .line 88
    :pswitch_5
    new-instance v0, Lt1/b;

    .line 89
    .line 90
    invoke-direct {v0}, Lt1/b;-><init>()V

    .line 91
    .line 92
    .line 93
    new-array v1, v1, [Ln1/n;

    .line 94
    .line 95
    aput-object v0, v1, v2

    .line 96
    .line 97
    return-object v1

    .line 98
    :pswitch_6
    new-instance v0, Ls1/c;

    .line 99
    .line 100
    invoke-direct {v0}, Ls1/c;-><init>()V

    .line 101
    .line 102
    .line 103
    new-array v1, v1, [Ln1/n;

    .line 104
    .line 105
    aput-object v0, v1, v2

    .line 106
    .line 107
    return-object v1

    .line 108
    :pswitch_7
    new-instance v0, Lo1/a;

    .line 109
    .line 110
    invoke-direct {v0}, Lo1/a;-><init>()V

    .line 111
    .line 112
    .line 113
    new-array v1, v1, [Ln1/n;

    .line 114
    .line 115
    aput-object v0, v1, v2

    .line 116
    .line 117
    return-object v1

    .line 118
    :pswitch_8
    new-array v0, v2, [Ln1/n;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_9
    new-instance v0, Li2/d;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 124
    .line 125
    .line 126
    new-array v1, v1, [Ln1/n;

    .line 127
    .line 128
    aput-object v0, v1, v2

    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_a
    new-instance v0, Lh2/m;

    .line 132
    .line 133
    sget-object v3, Lk2/o;->g:Lk2/b;

    .line 134
    .line 135
    const/16 v4, 0x10

    .line 136
    .line 137
    invoke-direct {v0, v4, v3}, Lh2/m;-><init>(ILk2/o;)V

    .line 138
    .line 139
    .line 140
    new-array v1, v1, [Ln1/n;

    .line 141
    .line 142
    aput-object v0, v1, v2

    .line 143
    .line 144
    return-object v1

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
