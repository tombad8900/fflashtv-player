.class public final Lq1/a;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ln1/n;


# instance fields
.field public final synthetic a:I

.field public final b:Lh1/w;

.field public final c:Ln1/e0;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lq1/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lh1/w;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    invoke-direct {p1, v0}, Lh1/w;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lq1/a;->b:Lh1/w;

    .line 16
    .line 17
    new-instance p1, Ln1/e0;

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    const-string v1, "image/avif"

    .line 21
    .line 22
    invoke-direct {p1, v1, v0, v0}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lq1/a;->c:Ln1/e0;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lh1/w;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-direct {p1, v0}, Lh1/w;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lq1/a;->b:Lh1/w;

    .line 38
    .line 39
    new-instance p1, Ln1/e0;

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    const-string v1, "image/webp"

    .line 43
    .line 44
    invoke-direct {p1, v1, v0, v0}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lq1/a;->c:Ln1/e0;

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lh1/w;

    .line 54
    .line 55
    const/4 v0, 0x4

    .line 56
    invoke-direct {p1, v0}, Lh1/w;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lq1/a;->b:Lh1/w;

    .line 60
    .line 61
    new-instance p1, Ln1/e0;

    .line 62
    .line 63
    const/4 v0, -0x1

    .line 64
    const-string v1, "image/heif"

    .line 65
    .line 66
    invoke-direct {p1, v1, v0, v0}, Ln1/e0;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lq1/a;->c:Ln1/e0;

    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final init(Ln1/p;)V
    .locals 1

    .line 1
    iget v0, p0, Lq1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln1/e0;->init(Ln1/p;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ln1/e0;->init(Ln1/p;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ln1/e0;->init(Ln1/p;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final read(Ln1/o;Ln1/a0;)I
    .locals 1

    .line 1
    iget v0, p0, Lq1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ln1/e0;->read(Ln1/o;Ln1/a0;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Ln1/e0;->read(Ln1/o;Ln1/a0;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_1
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Ln1/e0;->read(Ln1/o;Ln1/a0;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, Lq1/a;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final seek(JJ)V
    .locals 1

    .line 1
    iget v0, p0, Lq1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3, p4}, Ln1/e0;->seek(JJ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2, p3, p4}, Ln1/e0;->seek(JJ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    iget-object v0, p0, Lq1/a;->c:Ln1/e0;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3, p4}, Ln1/e0;->seek(JJ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final sniff(Ln1/o;)Z
    .locals 8

    .line 1
    iget v0, p0, Lq1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq1/a;->b:Lh1/w;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lh1/w;->a:[B

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lh1/w;->w()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    const-wide/32 v6, 0x52494646

    .line 23
    .line 24
    .line 25
    cmp-long v2, v4, v6

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p1, v1}, Ln1/o;->d(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lh1/w;->D(I)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lh1/w;->a:[B

    .line 37
    .line 38
    invoke-interface {p1, v2, v3, v1}, Ln1/o;->i([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lh1/w;->w()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide/32 v4, 0x57454250

    .line 46
    .line 47
    .line 48
    cmp-long p1, v0, v4

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    :cond_1
    :goto_0
    return v3

    .line 54
    :pswitch_0
    const/4 v0, 0x4

    .line 55
    invoke-interface {p1, v0}, Ln1/o;->d(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lq1/a;->b:Lh1/w;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Lh1/w;->D(I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v1, Lh1/w;->a:[B

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-interface {p1, v2, v3, v0}, Ln1/o;->i([BII)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lh1/w;->w()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    const v2, 0x66747970

    .line 74
    .line 75
    .line 76
    int-to-long v6, v2

    .line 77
    cmp-long v2, v4, v6

    .line 78
    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lh1/w;->D(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, Lh1/w;->a:[B

    .line 85
    .line 86
    invoke-interface {p1, v2, v3, v0}, Ln1/o;->i([BII)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lh1/w;->w()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    const p1, 0x68656963

    .line 94
    .line 95
    .line 96
    int-to-long v4, p1

    .line 97
    cmp-long p1, v0, v4

    .line 98
    .line 99
    if-nez p1, :cond_2

    .line 100
    .line 101
    const/4 v3, 0x1

    .line 102
    :cond_2
    return v3

    .line 103
    :pswitch_1
    const/4 v0, 0x4

    .line 104
    invoke-interface {p1, v0}, Ln1/o;->d(I)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lq1/a;->b:Lh1/w;

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lh1/w;->D(I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v1, Lh1/w;->a:[B

    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    invoke-interface {p1, v2, v3, v0}, Ln1/o;->i([BII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lh1/w;->w()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    const v2, 0x66747970

    .line 123
    .line 124
    .line 125
    int-to-long v6, v2

    .line 126
    cmp-long v2, v4, v6

    .line 127
    .line 128
    if-nez v2, :cond_3

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Lh1/w;->D(I)V

    .line 131
    .line 132
    .line 133
    iget-object v2, v1, Lh1/w;->a:[B

    .line 134
    .line 135
    invoke-interface {p1, v2, v3, v0}, Ln1/o;->i([BII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lh1/w;->w()J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    const p1, 0x61766966

    .line 143
    .line 144
    .line 145
    int-to-long v4, p1

    .line 146
    cmp-long p1, v0, v4

    .line 147
    .line 148
    if-nez p1, :cond_3

    .line 149
    .line 150
    const/4 v3, 0x1

    .line 151
    :cond_3
    return v3

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
