.class public final Lx4/q;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lx4/q;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lx4/q;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx4/s;

    .line 7
    .line 8
    iget-wide v0, p1, Lx4/s;->a:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p2, Lx4/s;

    .line 15
    .line 16
    iget-wide v0, p2, Lx4/s;->a:J

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_0
    check-cast p1, Lx4/s;

    .line 28
    .line 29
    iget-wide v0, p1, Lx4/s;->a:J

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p2, Lx4/s;

    .line 36
    .line 37
    iget-wide v0, p2, Lx4/s;->a:J

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_1
    check-cast p1, Lx4/s;

    .line 49
    .line 50
    iget-wide v0, p1, Lx4/s;->a:J

    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p2, Lx4/s;

    .line 57
    .line 58
    iget-wide v0, p2, Lx4/s;->a:J

    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :pswitch_2
    check-cast p2, Ll6/d;

    .line 70
    .line 71
    iget-object p2, p2, Ll6/d;->k:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, Ljava/lang/Comparable;

    .line 74
    .line 75
    check-cast p1, Ll6/d;

    .line 76
    .line 77
    iget-object p1, p1, Ll6/d;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ljava/lang/Comparable;

    .line 80
    .line 81
    invoke-static {p2, p1}, Landroid/support/v4/media/session/b;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
