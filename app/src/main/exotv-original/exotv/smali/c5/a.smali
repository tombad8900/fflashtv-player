.class public final Lc5/a;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/exotv/net/ui/AdActivity;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/exotv/net/ui/AdActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/a;->a:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc5/a;->a:Landroid/view/View;

    .line 2
    .line 3
    const/16 p2, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc5/a;->a:Landroid/view/View;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 6
    iget-object p1, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    invoke-static {p1, p4}, Lcom/exotv/net/ui/AdActivity;->s(Lcom/exotv/net/ui/AdActivity;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 4

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p1

    :goto_1
    if-eqz p3, :cond_2

    .line 2
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, p1

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "web error main="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " code="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " desc="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 3
    const-string v0, "AdActivity"

    invoke-static {v0, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_4

    .line 4
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_4

    .line 5
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    iget-object p2, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    invoke-static {p2, p1}, Lcom/exotv/net/ui/AdActivity;->s(Lcom/exotv/net/ui/AdActivity;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "intent"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string v0, "toString(...)"

    .line 31
    .line 32
    invoke-static {v0, p2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    .line 36
    .line 37
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->M:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, p2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    :goto_0
    return-object p1

    .line 46
    :cond_2
    iput-object p2, v0, Lcom/exotv/net/ui/AdActivity;->M:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, v0, Lcom/exotv/net/ui/AdActivity;->H:Landroid/webkit/WebView;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    new-instance p1, Landroidx/media3/exoplayer/audio/i;

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    invoke-direct {p1, v0, v2, p2}, Landroidx/media3/exoplayer/audio/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    new-instance p1, Landroid/webkit/WebResourceResponse;

    .line 62
    .line 63
    new-instance p2, Ljava/io/ByteArrayInputStream;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    new-array v0, v0, [B

    .line 67
    .line 68
    invoke-direct {p2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 69
    .line 70
    .line 71
    const-string v0, "text/plain"

    .line 72
    .line 73
    const-string v1, "utf-8"

    .line 74
    .line 75
    invoke-direct {p1, v0, v1, p2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_3
    const-string p2, "webView"

    .line 80
    .line 81
    invoke-static {p2}, Lz6/h;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 5

    if-nez p2, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    sget-object v0, Lcom/exotv/net/ui/AdActivity;->P:Ljava/util/Set;

    .line 2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v2, v1}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    iput-object v2, v3, Lcom/exotv/net/ui/AdActivity;->K:Ljava/lang/String;

    .line 5
    const-string v2, "http"

    invoke-static {v1, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x1

    if-nez v2, :cond_3

    const-string v2, "https"

    invoke-static {v1, v2}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Lcom/exotv/net/ui/AdActivity;->v(Landroid/webkit/WebView;Ljava/lang/String;)V

    return v4

    .line 7
    :cond_3
    :goto_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object p2

    const-string v1, "POST"

    invoke-static {p2, v1}, Lh7/p;->n0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_5
    return v4

    :cond_6
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    if-nez p2, :cond_0

    .line 9
    const-string p2, ""

    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    const-string v0, "parse(...)"

    invoke-static {v0, p2}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lcom/exotv/net/ui/AdActivity;->P:Ljava/util/Set;

    .line 10
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v1, v0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-string v1, "http"

    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "https"

    invoke-static {v0, v1}, Lz6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lc5/a;->b:Lcom/exotv/net/ui/AdActivity;

    invoke-virtual {v0, p1, p2}, Lcom/exotv/net/ui/AdActivity;->v(Landroid/webkit/WebView;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 13
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1
.end method
