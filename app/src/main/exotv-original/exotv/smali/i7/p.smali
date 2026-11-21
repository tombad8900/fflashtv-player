.class public final synthetic Li7/p;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/p;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li7/p;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li7/p;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp6/h;

    .line 7
    .line 8
    check-cast p2, Lp6/f;

    .line 9
    .line 10
    const-string v0, "acc"

    .line 11
    .line 12
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lp6/f;->getKey()Lp6/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0}, Lp6/h;->g(Lp6/g;)Lp6/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, Lp6/i;->j:Lp6/i;

    .line 24
    .line 25
    if-ne p1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget-object v1, Lp6/d;->j:Lp6/d;

    .line 29
    .line 30
    invoke-interface {p1, v1}, Lp6/h;->b(Lp6/g;)Lp6/f;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lp6/e;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    new-instance v0, Lp6/b;

    .line 39
    .line 40
    invoke-direct {v0, p2, p1}, Lp6/b;-><init>(Lp6/f;Lp6/h;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    move-object p2, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-interface {p1, v1}, Lp6/h;->g(Lp6/g;)Lp6/h;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    new-instance p1, Lp6/b;

    .line 52
    .line 53
    invoke-direct {p1, v2, p2}, Lp6/b;-><init>(Lp6/f;Lp6/h;)V

    .line 54
    .line 55
    .line 56
    move-object p2, p1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v0, Lp6/b;

    .line 59
    .line 60
    new-instance v1, Lp6/b;

    .line 61
    .line 62
    invoke-direct {v1, p2, p1}, Lp6/b;-><init>(Lp6/f;Lp6/h;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v2, v1}, Lp6/b;-><init>(Lp6/f;Lp6/h;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    return-object p2

    .line 70
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    check-cast p2, Lp6/f;

    .line 73
    .line 74
    const-string v0, "acc"

    .line 75
    .line 76
    invoke-static {v0, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, ", "

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_2
    return-object p1

    .line 111
    :pswitch_1
    check-cast p1, Lm7/v;

    .line 112
    .line 113
    check-cast p2, Lp6/f;

    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_2
    invoke-static {p1}, La1/a1;->r(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast p2, Lp6/f;

    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    return-object p1

    .line 123
    :pswitch_3
    check-cast p2, Lp6/f;

    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_4
    check-cast p1, Lp6/h;

    .line 127
    .line 128
    check-cast p2, Lp6/f;

    .line 129
    .line 130
    invoke-interface {p1, p2}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :pswitch_5
    check-cast p1, Lp6/h;

    .line 136
    .line 137
    check-cast p2, Lp6/f;

    .line 138
    .line 139
    invoke-interface {p1, p2}, Lp6/h;->c(Lp6/h;)Lp6/h;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast p2, Lp6/f;

    .line 150
    .line 151
    return-object p1

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
