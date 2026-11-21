.class public final synthetic Lg7/l;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ly6/l;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg7/l;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lg7/l;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "it"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lx4/v;->l:Lh7/f;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "<br */>"

    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v3, "compile(...)"

    .line 34
    .line 35
    invoke-static {v3, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const-string v3, "\n"

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "replaceAll(...)"

    .line 49
    .line 50
    invoke-static {v0, p1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-array v0, v2, [C

    .line 54
    .line 55
    const/16 v2, 0xa

    .line 56
    .line 57
    aput-char v2, v0, v1

    .line 58
    .line 59
    invoke-static {p1, v0}, Lh7/h;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v7, Lg7/l;

    .line 64
    .line 65
    const/4 p1, 0x6

    .line 66
    invoke-direct {v7, p1}, Lg7/l;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const/16 v8, 0x1e

    .line 70
    .line 71
    const-string v4, "\n"

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-static/range {v3 .. v8}, Lm6/h;->E0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly6/l;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lx4/v;->h:Lh7/f;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lx4/v;->d:Lh7/f;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Lh7/f;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :pswitch_3
    check-cast p1, Lp6/f;

    .line 113
    .line 114
    instance-of v0, p1, Li7/r;

    .line 115
    .line 116
    if-eqz v0, :cond_0

    .line 117
    .line 118
    check-cast p1, Li7/r;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    const/4 p1, 0x0

    .line 122
    :goto_0
    return-object p1

    .line 123
    :pswitch_4
    if-nez p1, :cond_1

    .line 124
    .line 125
    move v1, v2

    .line 126
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_5
    invoke-static {v3, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const/high16 p1, 0x7fff0000

    .line 135
    .line 136
    sget-object v0, Lc7/e;->k:Lc7/a;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lc7/e;->a(I)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    const/high16 v0, 0x10000

    .line 143
    .line 144
    add-int/2addr p1, v0

    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
