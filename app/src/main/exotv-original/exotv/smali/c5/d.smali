.class public final Lc5/d;
.super Landroid/webkit/WebChromeClient;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic a:Lcom/exotv/net/ui/AdActivity;


# direct methods
.method public constructor <init>(Lcom/exotv/net/ui/AdActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/d;->a:Lcom/exotv/net/ui/AdActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 4

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "resultMsg"

    .line 7
    .line 8
    invoke-static {p1, p4}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of p2, p1, Landroid/webkit/WebView$WebViewTransport;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_1
    new-instance p2, Landroid/webkit/WebView;

    .line 26
    .line 27
    iget-object p3, p0, Lc5/d;->a:Lcom/exotv/net/ui/AdActivity;

    .line 28
    .line 29
    invoke-direct {p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lz6/k;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lc5/b;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-direct {v2, v0, p3, p2, v3}, Lc5/b;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    new-instance p3, Lc5/c;

    .line 59
    .line 60
    invoke-direct {p3, v2}, Lc5/c;-><init>(Lc5/b;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 70
    .line 71
    .line 72
    return v1
.end method
