.class public final Lv5/c;
.super Lt2/i0;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Lt2/i0;

.field public final synthetic d:Lv5/d;


# direct methods
.method public constructor <init>(Lv5/d;Landroid/content/Context;Landroid/text/TextPaint;Lt2/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv5/c;->d:Lv5/d;

    .line 5
    .line 6
    iput-object p2, p0, Lv5/c;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lv5/c;->b:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Lv5/c;->c:Lt2/i0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final v(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv5/c;->c:Lt2/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/i0;->v(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv5/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lv5/c;->b:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Lv5/c;->d:Lv5/d;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Lv5/d;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lv5/c;->c:Lt2/i0;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lt2/i0;->w(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
