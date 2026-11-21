.class public final Lz4/g0;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Lz4/g0;

.field public static b:Z

.field public static volatile c:Lz4/l;

.field public static final d:Ljava/util/HashMap;

.field public static final e:Lh7/f;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz4/g0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz4/g0;->a:Lz4/g0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lz4/g0;->d:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Lh7/f;

    .line 16
    .line 17
    sget-object v1, Lh7/g;->k:Lh7/g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const-string v2, "\\.(m3u8|mp4|m4s)(\\?|#|$)"

    .line 21
    .line 22
    invoke-direct {v0, v2, v1}, Lh7/f;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lz4/g0;->e:Lh7/f;

    .line 26
    .line 27
    const-string v0, "(function () {\n  var W = 1280, H = 720;\n  try {\n    Object.defineProperty(document, \'hidden\', { configurable: true, get: function () { return false; } });\n    Object.defineProperty(document, \'visibilityState\', { configurable: true, get: function () { return \'visible\'; } });\n    Object.defineProperty(document, \'webkitHidden\', { configurable: true, get: function () { return false; } });\n    Object.defineProperty(document, \'webkitVisibilityState\', { configurable: true, get: function () { return \'visible\'; } });\n  } catch (e) {}\n  try {\n    Object.defineProperty(window, \'innerWidth\', { configurable: true, get: function () { return W; } });\n    Object.defineProperty(window, \'innerHeight\', { configurable: true, get: function () { return H; } });\n    Object.defineProperty(window, \'outerWidth\', { configurable: true, get: function () { return W; } });\n    Object.defineProperty(window, \'outerHeight\', { configurable: true, get: function () { return H; } });\n    var rect = function () { return { width: W, height: H, top: 0, left: 0, right: W, bottom: H, x: 0, y: 0 }; };\n    try {\n      Object.defineProperty(screen, \'width\', { configurable: true, get: function () { return W; } });\n      Object.defineProperty(screen, \'height\', { configurable: true, get: function () { return H; } });\n      Object.defineProperty(screen, \'availWidth\', { configurable: true, get: function () { return W; } });\n      Object.defineProperty(screen, \'availHeight\', { configurable: true, get: function () { return H; } });\n    } catch (e) {}\n    if (Element.prototype.getBoundingClientRect) {\n      var real = Element.prototype.getBoundingClientRect;\n      Element.prototype.getBoundingClientRect = function () {\n        var r = real.call(this);\n        // Only the page\'s own media element is replaced: everything else keeps its real box, so\n        // layout checks still see the page as the site laid it out.\n        if (this && (this.tagName === \'VIDEO\' || (this.id && this.id === \'player\')) && r.width <= 2) {\n          return { width: W, height: H, top: 0, left: 0, right: W, bottom: H, x: 0, y: 0, toJSON: rect };\n        }\n        return r;\n      };\n    }\n  } catch (e) {}\n})();\ntrue;"

    .line 28
    .line 29
    sput-object v0, Lz4/g0;->f:Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "(function () {\n  if (window.__exoNetHooked) return;\n  window.__exoNetHooked = true;\n  var OPENABLE = /\\.(m3u8|mp4|m4s)(?:[?#]|$)/i;\n  /**\n   * The page\'s player has a source: a playlist on its media element, or one it requested. This -\n   * not \"a media-looking URL was seen\" - is what proves a stream exists.\n   */\n  var liveStream = function () {\n    var found = [];\n    var push = function (u) {\n      if (typeof u === \'string\' && OPENABLE.test(u) && found.indexOf(u) === -1) found.push(u);\n    };\n    try {\n      var v = document.querySelector(\'video\');\n      if (v) { push(v.currentSrc); push(v.src); push(v.getAttribute && v.getAttribute(\'src\')); }\n      var srcs = document.querySelectorAll(\'video source, source\');\n      for (var i = 0; i < srcs.length; i++) push(srcs[i].src || (srcs[i].getAttribute && srcs[i].getAttribute(\'src\')));\n      var res = performance.getEntriesByType(\'resource\');\n      for (var k = 0; k < res.length; k++) push(res[k].name);\n    } catch (e) {}\n    // A playlist fetched by the player\'s own scripts counts even before it is attached.\n    if (live) for (var n = 0; n < live.length; n++) push(live[n]);\n    return found;\n  };\n  /** Playlists the page has requested. */\n  var live = [];\n  var requestWasMade = function (u) {\n    try { if (typeof u === \'string\' && OPENABLE.test(u)) live.push(u); } catch (e) {}\n  };\n  /** A response body naming a playlist is only a candidate: the poll decides whether it counts. */\n  var report = function (where, text) {\n    if (where) requestWasMade(where);\n    try {\n      if (!text || text.length > 4000000) return;\n      var m = text.match(/https?:\\/\\/[^\\s\"\'<>\\\\]+\\.(m3u8|mp4)[^\\s\"\'<>\\\\]*/gi);\n      if (m) for (var i = 0; i < m.length; i++) requestWasMade(m[i]);\n    } catch (e) {}\n  };\n\n  window.__exoLiveStream = liveStream;\n\n  /**\n   * Counts the backup\'s own calls that came back refused.\n   *\n   * That site asks each of its upstream servers in turn for a stream; when they all answer 404 it\n   * has nothing to offer, and it says so within a second or two. Without this the walk had no way\n   * to know, and sat on a page that would never change until its stall timeout - which the viewer\n   * experienced as a press that kept loading after the source had given up.\n   *\n   * The rule is the page\'s own origin, not a guessed path: naming the path meant a probe whose\n   * shape did not match it was never counted at all, so the same silence came back. Third-party\n   * ads and analytics are on other origins and stay out. A success resets the count.\n   */\n  window.__exoNacFails = 0;\n  var noteServerCheck = function (url, status) {\n    try {\n      if (typeof url !== \'string\') return;\n      var abs = url;\n      try { abs = new URL(url, location.href).href; } catch (e) {}\n      if (abs.indexOf(location.origin) !== 0) return;\n      if (status >= 400) window.__exoNacFails++;\n      else if (status >= 200 && status < 300) window.__exoNacFails = 0;\n    } catch (e) {}\n  };\n\n  var origFetch = window.fetch;\n  if (typeof origFetch === \'function\') {\n    window.fetch = function () {\n      var args = arguments;\n      var url = typeof args[0] === \'string\' ? args[0] : (args[0] && args[0].url);\n      requestWasMade(url);\n      var p = origFetch.apply(this, args);\n      try {\n        p.then(function (res) {\n          if (!res) return;\n          noteServerCheck(url, res.status);\n          if (typeof res.clone !== \'function\') return;\n          res.clone().text().then(function (t) { report(url, t); })[\'catch\'](function () {});\n        })[\'catch\'](function () {});\n      } catch (e) {}\n      return p;\n    };\n  }\n\n  try {\n    var xOpen = XMLHttpRequest.prototype.open;\n    var xSend = XMLHttpRequest.prototype.send;\n    XMLHttpRequest.prototype.open = function (m, u) { this.__vsUrl = u; requestWasMade(u); return xOpen.apply(this, arguments); };\n    XMLHttpRequest.prototype.send = function () {\n      var xhr = this;\n      xhr.addEventListener(\'load\', function () {\n        try {\n          noteServerCheck(xhr.__vsUrl, xhr.status);\n          if (!xhr.responseType || xhr.responseType === \'text\') report(xhr.__vsUrl, xhr.responseText);\n        } catch (e) {}\n      });\n      return xSend.apply(this, arguments);\n    };\n  } catch (e) {}\n\n  try {\n    var EA = Element.prototype.setAttribute;\n    Element.prototype.setAttribute = function (n, v) {\n      try {\n        if (typeof v === \'string\' && (n === \'src\' || n === \'data-src\' || n === \'data-hls\')) report(v, null);\n      } catch (e) {}\n      return EA.apply(this, arguments);\n    };\n  } catch (e) {}\n\n  try {\n    var MP = window.HTMLMediaElement && HTMLMediaElement.prototype;\n    if (MP) {\n      [\'src\', \'currentSrc\'].forEach(function (prop) {\n        var d = Object.getOwnPropertyDescriptor(MP, prop);\n        if (!d || !d.set || !d.get) return;\n        Object.defineProperty(MP, prop, {\n          configurable: true,\n          enumerable: d.enumerable,\n          get: function () { return d.get.call(this); },\n          set: function (v) {\n            try { if (v && OPENABLE.test(v)) requestWasMade(v); } catch (e) {}\n            return d.set.call(this, v);\n          }\n        });\n      });\n    }\n  } catch (e) {}\n})();\ntrue;"

    .line 32
    .line 33
    sput-object v0, Lz4/g0;->g:Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "(function () {\n  if (window.__exoChained) return;\n  window.__exoChained = true;\n  var post = function (p) {\n    try { window.ExoBridge.onEvent(JSON.stringify(p)); } catch (e) {}\n  };\n\n  var abs = function (u) {\n    try { return new URL(u, location.href).href; } catch (e) { return u; }\n  };\n\n  /** Ticks of the 250ms poll below: about 12s before a page with nothing on it is called dead. */\n  var STALL_TICKS = (window.__exoStallTicks || 48);\n\n  var tries = 0;\n  /** Set after the one nudge below: repeating it spams the page and burns the site\'s mint budget. */\n  var nudged = false;\n  var iv = setInterval(function () {\n    tries++;\n\n    // The player\'s own source is the only thing that ends the walk. Anything else a page mentions\n    // is a candidate, and ending on one hands the viewer a stream that was never addressable.\n    var live = (typeof window.__exoLiveStream === \'function\') ? window.__exoLiveStream() : [];\n    if (live.length) {\n      clearInterval(iv);\n      post({ type: \'stream\', urls: live });\n      return;\n    }\n\n    // The backup\'s own server checks all came back refused: it has nothing for this title. It\n    // reaches that verdict in a second or two, so the walk ends here rather than sitting on a page\n    // that will never change - which the viewer saw as an episode that kept loading.\n    if ((window.__exoNacFails || 0) >= 5) {\n      clearInterval(iv);\n      post({ type: \'exhausted\', fails: window.__exoNacFails });\n      return;\n    }\n\n    // The site\'s own \"Session expired\u2026\" page: a verdict on the `vs` token, not a title without\n    // streams, and otherwise indistinguishable from a stall. Cheap checks, first ticks only.\n    if (tries <= 12 && (tries <= 1 || tries % 4 === 0)) {\n      var expired = false;\n      try {\n        if ((document.title || \'\').toLowerCase() === \'expired\') expired = true;\n        var bodyText = (document.body && document.body.textContent) ? document.body.textContent : \'\';\n        if (bodyText.indexOf(\'Session expired\') !== -1) expired = true;\n      } catch (e) {}\n      if (expired) {\n        clearInterval(iv);\n        post({ type: \'expired\', where: location.href });\n        return;\n      }\n      // The same page carries this flag when the site is over its mint cap; its player then\n      // refuses to fetch at all, so the walk ends here rather than stalling.\n      try {\n        if (window.CONFIG && window.CONFIG.rateLimited) {\n          clearInterval(iv);\n          post({ type: \'limited\' });\n          return;\n        }\n      } catch (e) {}\n    }\n\n    // One nudge per page, at a real control only: repeating it spams the page, and a player that\n    // re-requests its stream list on interaction turns clicks into token mints.\n    if (!nudged && tries > 4) {\n      nudged = true;\n      try {\n        // Not `[id*=\'play\']`: that matches the player container, which is not a control.\n        var playBtn = document.querySelector(\n          \"button[id*=\'play\' i], button[class*=\'play\' i], [role=\'button\'][aria-label*=\'play\' i], \" +\n          \"[role=\'button\'][title*=\'play\' i], .jw-icon-display, .jw-display-icon-container\"\n        );\n        if (playBtn && playBtn.tagName && playBtn.tagName !== \'VIDEO\' &&\n            typeof playBtn.click === \'function\') {\n          playBtn.click();\n        }\n      } catch (e) {}\n      try {\n        var media = document.querySelector(\'video\');\n        if (media && media.paused && typeof media.play === \'function\') {\n          var p = media.play();\n          if (p && p.catch) p.catch(function () {});\n        }\n      } catch (e) {}\n    }\n\n    // Hop rules, which belong to the primary\'s two-page chain: its landing page names the player\n    // in window.CFG, and its embed fills #player_iframe from /vs_src.php. The backup is a single\n    // page whose iframes are ad slots - following one of those is a walk into an advert - so it\n    // disables this whole block.\n    if (window.__exoNoHops !== true) {\n      // Player landing: window.CFG carries the nested player URL, usually relative.\n      var CFG = window.CFG;\n      if (CFG && CFG.playerUrl) {\n        var landed = document.getElementById(\"player_frame\");\n        if (landed && landed.src) {\n          clearInterval(iv);\n          post({ type: \'hop\', url: abs(landed.src) });\n          return;\n        }\n        var btn = document.getElementById(\"bigPlay\") || document.getElementById(\"play\");\n        if (btn) { try { btn.click(); } catch (e) {} }\n        clearInterval(iv);\n        post({ type: \'hop\', url: abs(CFG.playerUrl) });\n        return;\n      }\n\n      // Embed landing: #player_iframe.src is filled in async from /vs_src.php.\n      var frame = document.getElementById(\"player_iframe\");\n      if (frame && frame.src && frame.src.indexOf(\"about:\") !== 0) {\n        clearInterval(iv);\n        post({ type: \'hop\', url: abs(frame.src) });\n        return;\n      }\n\n      var others = document.querySelectorAll(\"iframe[src]\");\n      for (var i = 0; i < others.length; i++) {\n        var s = others[i].src;\n        if (s && s.indexOf(\"about:\") !== 0) {\n          clearInterval(iv);\n          post({ type: \'hop\', url: abs(s) });\n          return;\n        }\n      }\n    }\n\n    if (tries > STALL_TICKS) {\n      clearInterval(iv);\n      post({ type: \'stall\', where: location.href, tries: tries });\n    }\n  }, 250);\n})();\ntrue;"

    .line 36
    .line 37
    sput-object v0, Lz4/g0;->h:Ljava/lang/String;

    .line 38
    .line 39
    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lj$/time/LocalDate;->now()Lj$/time/LocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "today"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-static {p0}, Lh7/h;->S0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v1, Lj$/time/format/DateTimeFormatter;->ISO_LOCAL_DATE:Lj$/time/format/DateTimeFormatter;

    .line 28
    .line 29
    invoke-static {p0, v1}, Lj$/time/LocalDate;->parse(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lj$/time/LocalDate;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catch Lj$/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    invoke-virtual {p0, v0}, Lj$/time/LocalDate;->isAfter(Lj$/time/chrono/ChronoLocalDate;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :catch_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "tmdbId"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb5/h;->a:Lb5/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lb5/i;->t:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    new-array v2, v2, [C

    .line 17
    .line 18
    const/16 v3, 0x2f

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput-char v3, v2, v4

    .line 22
    .line 23
    invoke-static {v0, v2}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-lez v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v1

    .line 37
    :goto_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "/movie/"

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ".json"

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    return-object v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-static {p0}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v0, "://"

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v0, v2, v2, v1}, Lh7/h;->B0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v0, v0, 0x3

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    const/16 v3, 0x2f

    .line 25
    .line 26
    invoke-static {p0, v3, v0, v1}, Lh7/h;->A0(Ljava/lang/CharSequence;CII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-gez v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "substring(...)"

    .line 38
    .line 39
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v0, "toLowerCase(...)"

    .line 49
    .line 50
    invoke-static {v0, p0}, Lz6/h;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "tmdbId"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb5/h;->a:Lb5/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lb5/i;->t:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    new-array v2, v2, [C

    .line 17
    .line 18
    const/16 v3, 0x2f

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput-char v3, v2, v4

    .line 22
    .line 23
    invoke-static {v0, v2}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-lez v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v1

    .line 37
    :goto_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "/tv/"

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ".json"

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Ljava/lang/String;IIZLr6/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Lz4/p;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lz4/p;

    .line 9
    .line 10
    iget v2, v1, Lz4/p;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lz4/p;->o:I

    .line 20
    .line 21
    :goto_0
    move-object v10, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lz4/p;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lz4/p;-><init>(Lz4/g0;Lr6/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v10, Lz4/p;->m:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 32
    .line 33
    iget v2, v10, Lz4/p;->o:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v11, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lb5/h;->a:Lb5/i;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v0, v0, Lb5/i;->x:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    new-array v2, v3, [C

    .line 65
    .line 66
    const/16 v4, 0x2f

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    aput-char v4, v2, v5

    .line 70
    .line 71
    invoke-static {v0, v2}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-lez v2, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v0, v11

    .line 85
    :goto_2
    const-string v2, "ResolverChain"

    .line 86
    .line 87
    if-nez v0, :cond_4

    .line 88
    .line 89
    const-string p1, "backup: no vidcoreBase in the server config"

    .line 90
    .line 91
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    return-object v11

    .line 95
    :cond_4
    if-eqz p5, :cond_5

    .line 96
    .line 97
    sget-object v0, Lz4/o;->k:Lz4/o;

    .line 98
    .line 99
    const-string v0, "primary gave nothing; trying vidcore"

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    sget-object v0, Lz4/o;->k:Lz4/o;

    .line 103
    .line 104
    const-string v0, "trying vidcore"

    .line 105
    .line 106
    :goto_3
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    sget-object v4, Lz4/o;->l:Lz4/o;

    .line 110
    .line 111
    iput v3, v10, Lz4/p;->o:I

    .line 112
    .line 113
    const/4 v9, 0x1

    .line 114
    const/4 v8, 0x0

    .line 115
    move-object v2, p0

    .line 116
    move-object v3, p1

    .line 117
    move-object v5, p2

    .line 118
    move v6, p3

    .line 119
    move/from16 v7, p4

    .line 120
    .line 121
    invoke-virtual/range {v2 .. v10}, Lz4/g0;->n(Landroid/app/Activity;Lz4/o;Ljava/lang/String;IILx4/c;ILr6/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v1, :cond_6

    .line 126
    .line 127
    return-object v1

    .line 128
    :cond_6
    :goto_4
    check-cast v0, Lz4/n;

    .line 129
    .line 130
    iget-object p1, v0, Lz4/n;->a:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    return-object v11

    .line 139
    :cond_7
    sput-object v11, Lz4/g0;->c:Lz4/l;

    .line 140
    .line 141
    return-object v0
.end method

.method public final b(Ljava/lang/String;IILr6/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lz4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lz4/q;

    .line 7
    .line 8
    iget v1, v0, Lz4/q;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/q;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lz4/q;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lz4/q;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/q;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const-string v4, "ResolverChain"

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v7, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    :try_start_0
    invoke-static {p4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lx4/e; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_5

    .line 49
    :catch_1
    move-exception p1

    .line 50
    goto :goto_7

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    :try_start_1
    invoke-static {p4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catch Lx4/e; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    if-ltz p2, :cond_5

    .line 67
    .line 68
    if-ltz p3, :cond_5

    .line 69
    .line 70
    :try_start_2
    sget-object p4, Lx4/k;->a:Lx4/k;

    .line 71
    .line 72
    iput v7, v0, Lz4/q;->o:I

    .line 73
    .line 74
    invoke-static {p1, p2, p3, v0}, Lx4/k;->d(Ljava/lang/String;IILz4/q;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    if-ne p4, v1, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    check-cast p4, Lx4/c;

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    sget-object p2, Lx4/k;->a:Lx4/k;

    .line 85
    .line 86
    iput v5, v0, Lz4/q;->o:I

    .line 87
    .line 88
    invoke-static {p1, v0}, Lx4/k;->c(Ljava/lang/String;Lz4/q;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    if-ne p4, v1, :cond_6

    .line 93
    .line 94
    :goto_2
    return-object v1

    .line 95
    :cond_6
    :goto_3
    check-cast p4, Lx4/c;

    .line 96
    .line 97
    :goto_4
    new-instance p1, Lz4/m;

    .line 98
    .line 99
    invoke-direct {p1, p4, v6, v6}, Lz4/m;-><init>(Lx4/c;ZZ)V
    :try_end_2
    .catch Lx4/e; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-eqz p2, :cond_7

    .line 108
    .line 109
    const-string p3, "rate limit"

    .line 110
    .line 111
    invoke-static {p2, p3, v7}, Lh7/h;->u0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-ne p2, v7, :cond_7

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_7
    move v7, v6

    .line 119
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string p3, "could not reach the gate\'s chain: "

    .line 126
    .line 127
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    new-instance p1, Lz4/m;

    .line 141
    .line 142
    invoke-direct {p1, v3, v7, v6}, Lz4/m;-><init>(Lx4/c;ZZ)V

    .line 143
    .line 144
    .line 145
    goto :goto_8

    .line 146
    :goto_7
    throw p1

    .line 147
    :catch_2
    const-string p1, "primary has no source for this title; skipping its walk"

    .line 148
    .line 149
    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    new-instance p1, Lz4/m;

    .line 153
    .line 154
    invoke-direct {p1, v3, v6, v7}, Lz4/m;-><init>(Lx4/c;ZZ)V

    .line 155
    .line 156
    .line 157
    :goto_8
    return-object p1
.end method

.method public final c(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lz4/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz4/r;

    .line 7
    .line 8
    iget v1, v0, Lz4/r;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/r;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/r;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz4/r;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz4/r;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/r;->p:I

    .line 30
    .line 31
    sget-object v3, Lz4/g0;->d:Ljava/util/HashMap;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lz4/r;->m:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Lorg/json/JSONObject;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    return-object p2

    .line 68
    :cond_4
    sget-object p2, Lx4/k;->a:Lx4/k;

    .line 69
    .line 70
    iput-object p1, v0, Lz4/r;->m:Ljava/lang/String;

    .line 71
    .line 72
    iput v5, v0, Lz4/r;->p:I

    .line 73
    .line 74
    sget-object p2, Li7/e0;->a:Lo7/e;

    .line 75
    .line 76
    sget-object p2, Lo7/d;->l:Lo7/d;

    .line 77
    .line 78
    new-instance v2, Lx4/h;

    .line 79
    .line 80
    invoke-direct {v2, p1, v4, v5}, Lx4/h;-><init>(Ljava/lang/String;Lp6/c;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p2, v2, v0}, Li7/x;->r(Lp6/h;Ly6/p;Lp6/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_5

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_5
    :goto_1
    check-cast p2, Lorg/json/JSONObject;

    .line 91
    .line 92
    if-nez p2, :cond_6

    .line 93
    .line 94
    :goto_2
    return-object v4

    .line 95
    :cond_6
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v1, 0x80

    .line 100
    .line 101
    if-le v0, v1, :cond_7

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 104
    .line 105
    .line 106
    :cond_7
    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    return-object p2
.end method

.method public final d(IILjava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    instance-of v1, p5, Lz4/s;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p5

    .line 8
    check-cast v1, Lz4/s;

    .line 9
    .line 10
    iget v2, v1, Lz4/s;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lz4/s;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lz4/s;

    .line 23
    .line 24
    invoke-direct {v1, p0, p5}, Lz4/s;-><init>(Lz4/g0;Lr6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p5, v1, Lz4/s;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lq6/a;->j:Lq6/a;

    .line 30
    .line 31
    iget v3, v1, Lz4/s;->o:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p5}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :catch_1
    move-exception p1

    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p5}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    if-ltz p1, :cond_3

    .line 62
    .line 63
    if-ltz p2, :cond_3

    .line 64
    .line 65
    :try_start_1
    new-instance p5, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v3, "/embed/tv/"

    .line 74
    .line 75
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p5

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    new-instance p5, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, "/embed/movie/"

    .line 107
    .line 108
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p5

    .line 118
    :goto_1
    sget-object v0, Lx4/k;->a:Lx4/k;

    .line 119
    .line 120
    if-ltz p1, :cond_4

    .line 121
    .line 122
    if-ltz p2, :cond_4

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p3, "/vs_src.php?type=tv&id="

    .line 133
    .line 134
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p3, "&season="

    .line 141
    .line 142
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string p1, "&episode="

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    goto :goto_2

    .line 161
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p2, "/vs_src.php?type=movie&id="

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    :goto_2
    iput v5, v1, Lz4/s;->o:I

    .line 182
    .line 183
    invoke-static {p1, p5, v1}, Lx4/k;->e(Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p5

    .line 187
    if-ne p5, v2, :cond_5

    .line 188
    .line 189
    return-object v2

    .line 190
    :cond_5
    :goto_3
    check-cast p5, Lorg/json/JSONObject;

    .line 191
    .line 192
    const-string p1, "src"

    .line 193
    .line 194
    invoke-virtual {p5, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {p1}, Lz6/h;->b(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-lez p2, :cond_6

    .line 206
    .line 207
    const-string p2, "null"

    .line 208
    .line 209
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 213
    if-nez p2, :cond_6

    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_6
    return-object v4

    .line 217
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance p2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string p3, "browser walk could not ask the gate for a player: "

    .line 224
    .line 225
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const-string p2, "ResolverChain"

    .line 236
    .line 237
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    return-object v4

    .line 241
    :goto_5
    throw p1
.end method

.method public final g(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lz4/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz4/t;

    .line 7
    .line 8
    iget v1, v0, Lz4/t;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/t;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz4/t;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz4/t;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/t;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lz4/t;->m:Lz4/g0;

    .line 37
    .line 38
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lz4/g0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p0, v0, Lz4/t;->m:Lz4/g0;

    .line 58
    .line 59
    iput v3, v0, Lz4/t;->p:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, Lz4/g0;->c(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    move-object p1, p0

    .line 69
    :goto_1
    check-cast p2, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    const-string p1, "quality"

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-static {p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    const-string p2, "null"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_4

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_4
    const/4 p1, 0x0

    .line 100
    return-object p1
.end method

.method public final i(Landroid/app/Activity;Ljava/lang/String;IILr6/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    instance-of v5, v4, Lz4/u;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, Lz4/u;

    .line 17
    .line 18
    iget v6, v5, Lz4/u;->t:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Lz4/u;->t:I

    .line 28
    .line 29
    :goto_0
    move-object v14, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v5, Lz4/u;

    .line 32
    .line 33
    invoke-direct {v5, v0, v4}, Lz4/u;-><init>(Lz4/g0;Lr6/c;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v4, v14, Lz4/u;->r:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v5, Lq6/a;->j:Lq6/a;

    .line 40
    .line 41
    iget v6, v14, Lz4/u;->t:I

    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x1

    .line 46
    const-string v10, "ResolverChain"

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    if-eq v6, v9, :cond_3

    .line 52
    .line 53
    if-eq v6, v8, :cond_2

    .line 54
    .line 55
    if-ne v6, v7, :cond_1

    .line 56
    .line 57
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    iget v1, v14, Lz4/u;->q:I

    .line 71
    .line 72
    iget v2, v14, Lz4/u;->p:I

    .line 73
    .line 74
    iget-object v3, v14, Lz4/u;->o:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v6, v14, Lz4/u;->n:Landroid/app/Activity;

    .line 77
    .line 78
    iget-object v8, v14, Lz4/u;->m:Lz4/g0;

    .line 79
    .line 80
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move v11, v1

    .line 84
    move-object v9, v3

    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_3
    iget v1, v14, Lz4/u;->q:I

    .line 88
    .line 89
    iget v2, v14, Lz4/u;->p:I

    .line 90
    .line 91
    iget-object v3, v14, Lz4/u;->o:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v6, v14, Lz4/u;->n:Landroid/app/Activity;

    .line 94
    .line 95
    iget-object v9, v14, Lz4/u;->m:Lz4/g0;

    .line 96
    .line 97
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v16, v3

    .line 101
    .line 102
    move v3, v1

    .line 103
    move-object/from16 v1, v16

    .line 104
    .line 105
    move-object/from16 v16, v6

    .line 106
    .line 107
    move-object v6, v4

    .line 108
    move-object/from16 v4, v16

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-static {v4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 115
    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    iget-object v4, v4, Lb5/i;->s:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    new-array v6, v9, [C

    .line 123
    .line 124
    const/16 v11, 0x2f

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    aput-char v11, v6, v12

    .line 128
    .line 129
    invoke-static {v4, v6}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-lez v6, :cond_5

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v4, v15

    .line 143
    :goto_2
    if-nez v4, :cond_6

    .line 144
    .line 145
    const-string v1, "primary: no gateBase in the server config"

    .line 146
    .line 147
    invoke-static {v10, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    return-object v15

    .line 151
    :cond_6
    iput-object v0, v14, Lz4/u;->m:Lz4/g0;

    .line 152
    .line 153
    move-object/from16 v4, p1

    .line 154
    .line 155
    iput-object v4, v14, Lz4/u;->n:Landroid/app/Activity;

    .line 156
    .line 157
    iput-object v1, v14, Lz4/u;->o:Ljava/lang/String;

    .line 158
    .line 159
    iput v2, v14, Lz4/u;->p:I

    .line 160
    .line 161
    iput v3, v14, Lz4/u;->q:I

    .line 162
    .line 163
    iput v9, v14, Lz4/u;->t:I

    .line 164
    .line 165
    invoke-virtual {v0, v1, v2, v3, v14}, Lz4/g0;->j(Ljava/lang/String;IILr6/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    if-ne v6, v5, :cond_7

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    move-object v9, v0

    .line 173
    :goto_3
    check-cast v6, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-nez v6, :cond_8

    .line 180
    .line 181
    sget-object v1, Lz4/o;->k:Lz4/o;

    .line 182
    .line 183
    const-string v1, "primary has no stream for this title; going straight to vidcore"

    .line 184
    .line 185
    invoke-static {v10, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    return-object v15

    .line 189
    :cond_8
    iput-object v9, v14, Lz4/u;->m:Lz4/g0;

    .line 190
    .line 191
    iput-object v4, v14, Lz4/u;->n:Landroid/app/Activity;

    .line 192
    .line 193
    iput-object v1, v14, Lz4/u;->o:Ljava/lang/String;

    .line 194
    .line 195
    iput v2, v14, Lz4/u;->p:I

    .line 196
    .line 197
    iput v3, v14, Lz4/u;->q:I

    .line 198
    .line 199
    iput v8, v14, Lz4/u;->t:I

    .line 200
    .line 201
    invoke-virtual {v9, v1, v2, v3, v14}, Lz4/g0;->b(Ljava/lang/String;IILr6/c;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    if-ne v6, v5, :cond_9

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    move-object v8, v6

    .line 209
    move-object v6, v4

    .line 210
    move-object v4, v8

    .line 211
    move v11, v3

    .line 212
    move-object v8, v9

    .line 213
    move-object v9, v1

    .line 214
    :goto_4
    check-cast v4, Lz4/m;

    .line 215
    .line 216
    iget-object v12, v4, Lz4/m;->a:Lx4/c;

    .line 217
    .line 218
    if-nez v12, :cond_a

    .line 219
    .line 220
    iget-boolean v1, v4, Lz4/m;->c:Z

    .line 221
    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_a
    if-nez v12, :cond_b

    .line 226
    .line 227
    iget-boolean v1, v4, Lz4/m;->b:Z

    .line 228
    .line 229
    if-eqz v1, :cond_b

    .line 230
    .line 231
    sget-object v1, Lz4/l;->j:Lz4/l;

    .line 232
    .line 233
    sput-object v1, Lz4/g0;->c:Lz4/l;

    .line 234
    .line 235
    const-string v1, "primary: site is rate limiting this connection"

    .line 236
    .line 237
    invoke-static {v10, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    return-object v15

    .line 241
    :cond_b
    move-object v4, v6

    .line 242
    move-object v6, v8

    .line 243
    sget-object v8, Lz4/o;->k:Lz4/o;

    .line 244
    .line 245
    iput-object v15, v14, Lz4/u;->m:Lz4/g0;

    .line 246
    .line 247
    iput-object v15, v14, Lz4/u;->n:Landroid/app/Activity;

    .line 248
    .line 249
    iput-object v15, v14, Lz4/u;->o:Ljava/lang/String;

    .line 250
    .line 251
    iput v7, v14, Lz4/u;->t:I

    .line 252
    .line 253
    const/4 v13, 0x1

    .line 254
    move v10, v2

    .line 255
    move-object v7, v4

    .line 256
    invoke-virtual/range {v6 .. v14}, Lz4/g0;->n(Landroid/app/Activity;Lz4/o;Ljava/lang/String;IILx4/c;ILr6/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-ne v4, v5, :cond_c

    .line 261
    .line 262
    :goto_5
    return-object v5

    .line 263
    :cond_c
    :goto_6
    check-cast v4, Lz4/n;

    .line 264
    .line 265
    iget-object v1, v4, Lz4/n;->a:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_d

    .line 272
    .line 273
    return-object v4

    .line 274
    :cond_d
    :goto_7
    return-object v15
.end method

.method public final j(Ljava/lang/String;IILr6/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lz4/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lz4/v;

    .line 7
    .line 8
    iget v1, v0, Lz4/v;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/v;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lz4/v;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lz4/v;->q:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/v;->s:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lz4/v;->p:J

    .line 37
    .line 38
    iget p3, v0, Lz4/v;->o:I

    .line 39
    .line 40
    iget v1, v0, Lz4/v;->n:I

    .line 41
    .line 42
    iget-object v0, v0, Lz4/v;->m:Lz4/g0;

    .line 43
    .line 44
    invoke-static {p4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p4}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-ltz p2, :cond_3

    .line 60
    .line 61
    if-ltz p3, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, Lz4/g0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lz4/g0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    if-nez p1, :cond_4

    .line 73
    .line 74
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    new-instance p4, Lb5/d;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v6, 0x1

    .line 85
    invoke-direct {p4, p1, v2, v6}, Lb5/d;-><init>(Ljava/lang/String;Lp6/c;I)V

    .line 86
    .line 87
    .line 88
    iput-object p0, v0, Lz4/v;->m:Lz4/g0;

    .line 89
    .line 90
    iput p2, v0, Lz4/v;->n:I

    .line 91
    .line 92
    iput p3, v0, Lz4/v;->o:I

    .line 93
    .line 94
    iput-wide v4, v0, Lz4/v;->p:J

    .line 95
    .line 96
    iput v3, v0, Lz4/v;->s:I

    .line 97
    .line 98
    const-wide/16 v6, 0x1770

    .line 99
    .line 100
    invoke-static {v6, v7, p4, v0}, Li7/x;->s(JLy6/p;Lr6/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    if-ne p4, v1, :cond_5

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_5
    move-object v0, p0

    .line 108
    move v1, p2

    .line 109
    move-wide p1, v4

    .line 110
    :goto_2
    check-cast p4, Lorg/json/JSONObject;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    if-nez p4, :cond_7

    .line 117
    .line 118
    :cond_6
    :goto_3
    move v3, v0

    .line 119
    goto :goto_6

    .line 120
    :cond_7
    const-string v2, "status_code"

    .line 121
    .line 122
    invoke-virtual {p4, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-static {v2}, Lh7/o;->k0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-nez v2, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/16 v4, 0xc8

    .line 146
    .line 147
    if-ne v2, v4, :cond_6

    .line 148
    .line 149
    if-ltz v1, :cond_e

    .line 150
    .line 151
    if-gez p3, :cond_9

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_9
    const-string v2, "seasons"

    .line 155
    .line 156
    invoke-virtual {p4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    if-nez p4, :cond_a

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_a
    invoke-virtual {p4}, Lorg/json/JSONArray;->length()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    move v4, v0

    .line 168
    :goto_4
    if-ge v4, v2, :cond_6

    .line 169
    .line 170
    invoke-virtual {p4, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    if-nez v5, :cond_b

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_b
    const-string v6, "season"

    .line 178
    .line 179
    const/4 v7, -0x1

    .line 180
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-ne v6, v1, :cond_d

    .line 185
    .line 186
    const-string p4, "first_episode"

    .line 187
    .line 188
    invoke-virtual {v5, p4, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 189
    .line 190
    .line 191
    move-result p4

    .line 192
    const-string v1, "last_episode"

    .line 193
    .line 194
    invoke-virtual {v5, v1, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-ltz p4, :cond_e

    .line 199
    .line 200
    if-ge v1, p4, :cond_c

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_c
    if-gt p4, p3, :cond_6

    .line 204
    .line 205
    if-gt p3, v1, :cond_6

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_d
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_e
    :goto_6
    if-eqz v3, :cond_f

    .line 212
    .line 213
    const-string p3, "has this title"

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_f
    const-string p3, "does not have it"

    .line 217
    .line 218
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 219
    .line 220
    .line 221
    move-result-wide v0

    .line 222
    sub-long/2addr v0, p1

    .line 223
    new-instance p1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string p2, "primary info: "

    .line 226
    .line 227
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string p2, " ("

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string p2, "ms)"

    .line 242
    .line 243
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const-string p2, "ResolverChain"

    .line 251
    .line 252
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    return-object p1
.end method

.method public final k(Landroid/app/Activity;Ljava/lang/String;IILr6/c;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v1, v0, Lz4/w;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lz4/w;

    .line 11
    .line 12
    iget v2, v1, Lz4/w;->t:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Lz4/w;->t:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lz4/w;

    .line 26
    .line 27
    invoke-direct {v1, p0, v0}, Lz4/w;-><init>(Lz4/g0;Lr6/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lz4/w;->r:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v9, Lq6/a;->j:Lq6/a;

    .line 34
    .line 35
    iget v1, v6, Lz4/w;->t:I

    .line 36
    .line 37
    const-string v10, "resolve failed: "

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v2, 0x2

    .line 41
    const-string v11, "ResolverChain"

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    if-eq v1, v4, :cond_3

    .line 48
    .line 49
    if-eq v1, v2, :cond_2

    .line 50
    .line 51
    if-ne v1, v7, :cond_1

    .line 52
    .line 53
    iget-object v1, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object v3, v1

    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :catch_1
    move-exception v0

    .line 67
    move-object v3, v1

    .line 68
    goto/16 :goto_a

    .line 69
    .line 70
    :catch_2
    move-exception v0

    .line 71
    goto/16 :goto_d

    .line 72
    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    iget v1, v6, Lz4/w;->q:I

    .line 82
    .line 83
    iget v2, v6, Lz4/w;->p:I

    .line 84
    .line 85
    iget-object v3, v6, Lz4/w;->o:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v4, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Landroid/app/Activity;

    .line 90
    .line 91
    iget-object v5, v6, Lz4/w;->m:Lz4/g0;

    .line 92
    .line 93
    :try_start_1
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_3

    .line 94
    .line 95
    .line 96
    move-object v14, v5

    .line 97
    move v5, v2

    .line 98
    move-object v2, v14

    .line 99
    move-object v14, v4

    .line 100
    move-object v4, v3

    .line 101
    move-object v3, v14

    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :catch_3
    move-exception v0

    .line 105
    goto/16 :goto_8

    .line 106
    .line 107
    :catch_4
    move-exception v0

    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :cond_3
    iget-object v1, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Ljava/lang/String;

    .line 113
    .line 114
    :try_start_2
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_0

    .line 115
    .line 116
    .line 117
    move-object v3, v1

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-static {v0}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-boolean v0, Lz4/g0;->b:Z

    .line 123
    .line 124
    const/16 v1, 0x1a

    .line 125
    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    sput-boolean v4, Lz4/g0;->b:Z

    .line 129
    .line 130
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 131
    .line 132
    if-ge v0, v1, :cond_5

    .line 133
    .line 134
    sget-object v5, Lz4/o;->k:Lz4/o;

    .line 135
    .line 136
    const-string v5, "vidcore only"

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    sget-object v5, Lz4/o;->k:Lz4/o;

    .line 140
    .line 141
    const-string v5, "BROWSER, vidcore fallback"

    .line 142
    .line 143
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v13, "API "

    .line 146
    .line 147
    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, " mode: "

    .line 154
    .line 155
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v11, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    :cond_6
    sput-object v12, Lz4/g0;->c:Lz4/l;

    .line 169
    .line 170
    :try_start_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/LinkageError; {:try_start_3 .. :try_end_3} :catch_7

    .line 171
    .line 172
    if-ge v0, v1, :cond_7

    .line 173
    .line 174
    move v0, v4

    .line 175
    goto :goto_3

    .line 176
    :cond_7
    const/4 v0, 0x0

    .line 177
    :goto_3
    if-eqz v0, :cond_9

    .line 178
    .line 179
    :try_start_4
    iput-object p0, v6, Lz4/w;->m:Lz4/g0;

    .line 180
    .line 181
    iput-object v3, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 182
    .line 183
    iput v4, v6, Lz4/w;->t:I

    .line 184
    .line 185
    move-object v7, v6

    .line 186
    const/4 v6, 0x0

    .line 187
    move-object v1, p0

    .line 188
    move-object/from16 v2, p1

    .line 189
    .line 190
    move/from16 v4, p3

    .line 191
    .line 192
    move/from16 v5, p4

    .line 193
    .line 194
    invoke-virtual/range {v1 .. v7}, Lz4/g0;->a(Landroid/app/Activity;Ljava/lang/String;IIZLr6/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v9, :cond_8

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_8
    :goto_4
    check-cast v0, Lz4/n;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/LinkageError; {:try_start_4 .. :try_end_4} :catch_3

    .line 202
    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :cond_9
    :try_start_5
    iput-object p0, v6, Lz4/w;->m:Lz4/g0;

    .line 206
    .line 207
    move-object/from16 v0, p1

    .line 208
    .line 209
    iput-object v0, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v3, v6, Lz4/w;->o:Ljava/lang/String;

    .line 212
    .line 213
    move/from16 v4, p3

    .line 214
    .line 215
    iput v4, v6, Lz4/w;->p:I

    .line 216
    .line 217
    move/from16 v5, p4

    .line 218
    .line 219
    iput v5, v6, Lz4/w;->q:I

    .line 220
    .line 221
    iput v2, v6, Lz4/w;->t:I

    .line 222
    .line 223
    move-object v1, p0

    .line 224
    move-object v2, v0

    .line 225
    invoke-virtual/range {v1 .. v6}, Lz4/g0;->i(Landroid/app/Activity;Ljava/lang/String;IILr6/c;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/LinkageError; {:try_start_5 .. :try_end_5} :catch_7

    .line 229
    if-ne v0, v9, :cond_a

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    move-object v2, p0

    .line 233
    move-object/from16 v3, p1

    .line 234
    .line 235
    move-object/from16 v4, p2

    .line 236
    .line 237
    move/from16 v5, p3

    .line 238
    .line 239
    move/from16 v1, p4

    .line 240
    .line 241
    :goto_5
    :try_start_6
    check-cast v0, Lz4/n;

    .line 242
    .line 243
    if-nez v0, :cond_c

    .line 244
    .line 245
    iput-object v2, v6, Lz4/w;->m:Lz4/g0;

    .line 246
    .line 247
    iput-object v4, v6, Lz4/w;->n:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v12, v6, Lz4/w;->o:Ljava/lang/String;

    .line 250
    .line 251
    iput v7, v6, Lz4/w;->t:I

    .line 252
    .line 253
    const/4 v7, 0x1

    .line 254
    move-object v8, v6

    .line 255
    move v6, v1

    .line 256
    invoke-virtual/range {v2 .. v8}, Lz4/g0;->a(Landroid/app/Activity;Ljava/lang/String;IIZLr6/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/LinkageError; {:try_start_6 .. :try_end_6} :catch_5

    .line 260
    if-ne v0, v9, :cond_b

    .line 261
    .line 262
    :goto_6
    return-object v9

    .line 263
    :cond_b
    move-object v1, v4

    .line 264
    :goto_7
    :try_start_7
    check-cast v0, Lz4/n;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_7 .. :try_end_7} :catch_0

    .line 265
    .line 266
    move-object v3, v1

    .line 267
    goto :goto_b

    .line 268
    :catch_5
    move-exception v0

    .line 269
    move-object v3, v4

    .line 270
    goto :goto_8

    .line 271
    :catch_6
    move-exception v0

    .line 272
    move-object v3, v4

    .line 273
    goto :goto_a

    .line 274
    :cond_c
    move-object v3, v4

    .line 275
    goto :goto_b

    .line 276
    :catch_7
    move-exception v0

    .line 277
    move-object/from16 v3, p2

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :catch_8
    move-exception v0

    .line 281
    move-object/from16 v3, p2

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v1, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v11, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    :goto_9
    move-object v0, v12

    .line 304
    goto :goto_b

    .line 305
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v11, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    goto :goto_9

    .line 325
    :goto_b
    if-eqz v0, :cond_d

    .line 326
    .line 327
    iget-object v1, v0, Lz4/n;->a:Ljava/util/List;

    .line 328
    .line 329
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_d

    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_d
    sget-object v0, Lz4/g0;->c:Lz4/l;

    .line 337
    .line 338
    if-nez v0, :cond_e

    .line 339
    .line 340
    sget-object v0, Lz4/l;->k:Lz4/l;

    .line 341
    .line 342
    sput-object v0, Lz4/g0;->c:Lz4/l;

    .line 343
    .line 344
    :cond_e
    sget-object v0, Lz4/g0;->c:Lz4/l;

    .line 345
    .line 346
    if-eqz v0, :cond_f

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    goto :goto_c

    .line 353
    :cond_f
    move-object v0, v12

    .line 354
    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 355
    .line 356
    const-string v2, "the resolve failed for "

    .line 357
    .line 358
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    const-string v2, " ("

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    const-string v0, ")"

    .line 373
    .line 374
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v11, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    return-object v12

    .line 385
    :goto_d
    throw v0
.end method

.method public final m(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lz4/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz4/x;

    .line 7
    .line 8
    iget v1, v0, Lz4/x;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/x;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/x;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz4/x;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz4/x;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/x;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lz4/x;->m:Lz4/g0;

    .line 37
    .line 38
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lz4/g0;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p0, v0, Lz4/x;->m:Lz4/g0;

    .line 58
    .line 59
    iput v3, v0, Lz4/x;->p:I

    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, Lz4/g0;->c(Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    move-object p1, p0

    .line 69
    :goto_1
    check-cast p2, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    const-string p1, "quality"

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-static {p1}, Lh7/h;->D0(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    const-string p2, "null"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_4

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_4
    const/4 p1, 0x0

    .line 100
    return-object p1
.end method

.method public final n(Landroid/app/Activity;Lz4/o;Ljava/lang/String;IILx4/c;ILr6/c;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v7, p6

    .line 10
    .line 11
    move-object/from16 v1, p8

    .line 12
    .line 13
    sget-object v4, Lz4/g0;->a:Lz4/g0;

    .line 14
    .line 15
    instance-of v6, v1, Lz4/y;

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    move-object v6, v1

    .line 20
    check-cast v6, Lz4/y;

    .line 21
    .line 22
    iget v8, v6, Lz4/y;->x:I

    .line 23
    .line 24
    const/high16 v9, -0x80000000

    .line 25
    .line 26
    and-int v10, v8, v9

    .line 27
    .line 28
    if-eqz v10, :cond_0

    .line 29
    .line 30
    sub-int/2addr v8, v9

    .line 31
    iput v8, v6, Lz4/y;->x:I

    .line 32
    .line 33
    :goto_0
    move-object v9, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance v6, Lz4/y;

    .line 36
    .line 37
    invoke-direct {v6, v0, v1}, Lz4/y;-><init>(Lz4/g0;Lr6/c;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    iget-object v1, v9, Lz4/y;->v:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v10, Lq6/a;->j:Lq6/a;

    .line 44
    .line 45
    iget v6, v9, Lz4/y;->x:I

    .line 46
    .line 47
    const-string v8, "ResolverChain"

    .line 48
    .line 49
    const/4 v12, 0x4

    .line 50
    const/4 v13, 0x3

    .line 51
    const/4 v14, 0x2

    .line 52
    const/4 v15, 0x1

    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    if-eq v6, v15, :cond_5

    .line 56
    .line 57
    if-eq v6, v14, :cond_4

    .line 58
    .line 59
    if-eq v6, v13, :cond_3

    .line 60
    .line 61
    if-eq v6, v12, :cond_2

    .line 62
    .line 63
    const/4 v2, 0x5

    .line 64
    if-ne v6, v2, :cond_1

    .line 65
    .line 66
    iget-object v2, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lz4/n;

    .line 69
    .line 70
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    goto/16 :goto_14

    .line 75
    .line 76
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_2
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_3
    iget v2, v9, Lz4/y;->u:I

    .line 89
    .line 90
    iget v3, v9, Lz4/y;->t:I

    .line 91
    .line 92
    iget v5, v9, Lz4/y;->s:I

    .line 93
    .line 94
    iget-object v6, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Lz4/n;

    .line 97
    .line 98
    iget-object v7, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v13, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v13, Lz4/o;

    .line 105
    .line 106
    iget-object v14, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v14, Landroid/app/Activity;

    .line 109
    .line 110
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v4

    .line 114
    move-object v4, v1

    .line 115
    move-object v1, v0

    .line 116
    move-object v0, v6

    .line 117
    :goto_2
    move v6, v3

    .line 118
    move-object v3, v13

    .line 119
    goto/16 :goto_11

    .line 120
    .line 121
    :cond_4
    iget v2, v9, Lz4/y;->u:I

    .line 122
    .line 123
    iget v3, v9, Lz4/y;->t:I

    .line 124
    .line 125
    iget v5, v9, Lz4/y;->s:I

    .line 126
    .line 127
    iget-object v6, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v6, Lz6/k;

    .line 130
    .line 131
    iget-object v7, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, Lx4/c;

    .line 134
    .line 135
    iget-object v12, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v12, Ljava/lang/String;

    .line 138
    .line 139
    iget-object v13, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v13, Lz4/o;

    .line 142
    .line 143
    iget-object v14, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v14, Landroid/app/Activity;

    .line 146
    .line 147
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v33, v4

    .line 151
    .line 152
    move-object v4, v1

    .line 153
    move-object/from16 v1, v33

    .line 154
    .line 155
    goto/16 :goto_10

    .line 156
    .line 157
    :cond_5
    iget v2, v9, Lz4/y;->u:I

    .line 158
    .line 159
    iget v3, v9, Lz4/y;->t:I

    .line 160
    .line 161
    iget v5, v9, Lz4/y;->s:I

    .line 162
    .line 163
    iget-object v6, v9, Lz4/y;->r:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v7, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v7, Lx4/c;

    .line 168
    .line 169
    iget-object v12, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v12, Ljava/lang/String;

    .line 172
    .line 173
    iget-object v13, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v13, Lz4/o;

    .line 176
    .line 177
    iget-object v14, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v14, Landroid/app/Activity;

    .line 180
    .line 181
    iget-object v11, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v11, Lz4/g0;

    .line 184
    .line 185
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v33, v4

    .line 189
    .line 190
    move-object v4, v1

    .line 191
    move-object/from16 v1, v33

    .line 192
    .line 193
    move-object/from16 v33, v14

    .line 194
    .line 195
    move v14, v2

    .line 196
    move-object v2, v12

    .line 197
    move-object v12, v13

    .line 198
    move-object v13, v11

    .line 199
    move-object/from16 v11, v33

    .line 200
    .line 201
    goto/16 :goto_9

    .line 202
    .line 203
    :cond_6
    invoke-static {v1}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object v1, Lb5/h;->a:Lb5/i;

    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    const/16 v11, 0x2f

    .line 210
    .line 211
    if-eqz v1, :cond_7

    .line 212
    .line 213
    iget-object v1, v1, Lb5/i;->s:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v1, :cond_7

    .line 216
    .line 217
    new-array v12, v15, [C

    .line 218
    .line 219
    aput-char v11, v12, v6

    .line 220
    .line 221
    invoke-static {v1, v12}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-eqz v1, :cond_7

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    if-lez v12, :cond_7

    .line 232
    .line 233
    move-object/from16 v33, v4

    .line 234
    .line 235
    move-object v4, v1

    .line 236
    move-object/from16 v1, v33

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    move-object v1, v4

    .line 240
    const/4 v4, 0x0

    .line 241
    :goto_3
    const-string v12, "/"

    .line 242
    .line 243
    if-eqz v4, :cond_9

    .line 244
    .line 245
    if-ltz v2, :cond_8

    .line 246
    .line 247
    if-ltz v3, :cond_8

    .line 248
    .line 249
    new-instance v13, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v14, "/embed/tv/"

    .line 258
    .line 259
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v13

    .line 281
    goto :goto_4

    .line 282
    :cond_8
    new-instance v13, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v14, "/embed/movie/"

    .line 291
    .line 292
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    goto :goto_4

    .line 303
    :cond_9
    const/4 v13, 0x0

    .line 304
    :goto_4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    if-eqz v14, :cond_e

    .line 309
    .line 310
    if-ne v14, v15, :cond_d

    .line 311
    .line 312
    sget-object v4, Lb5/h;->a:Lb5/i;

    .line 313
    .line 314
    if-eqz v4, :cond_a

    .line 315
    .line 316
    iget-object v4, v4, Lb5/i;->x:Ljava/lang/String;

    .line 317
    .line 318
    if-eqz v4, :cond_a

    .line 319
    .line 320
    new-array v14, v15, [C

    .line 321
    .line 322
    aput-char v11, v14, v6

    .line 323
    .line 324
    invoke-static {v4, v14}, Lh7/h;->T0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    if-eqz v4, :cond_a

    .line 329
    .line 330
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-lez v6, :cond_a

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_a
    const/4 v4, 0x0

    .line 338
    :goto_5
    if-eqz v4, :cond_c

    .line 339
    .line 340
    const-string v6, "tmdbId"

    .line 341
    .line 342
    invoke-static {v6, v5}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    if-ltz v2, :cond_b

    .line 346
    .line 347
    if-ltz v3, :cond_b

    .line 348
    .line 349
    new-instance v6, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v4, "/tv/"

    .line 358
    .line 359
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    const-string v4, "?autoPlay=true"

    .line 378
    .line 379
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    goto :goto_6

    .line 387
    :cond_b
    new-instance v6, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v4, "/movie/"

    .line 396
    .line 397
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v4, "?autoplay=true"

    .line 404
    .line 405
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    :goto_6
    move-object/from16 v11, p1

    .line 413
    .line 414
    move-object/from16 v12, p2

    .line 415
    .line 416
    move/from16 v14, p7

    .line 417
    .line 418
    :goto_7
    move-object v6, v0

    .line 419
    goto/16 :goto_b

    .line 420
    .line 421
    :cond_c
    new-instance v1, Ljava/io/IOException;

    .line 422
    .line 423
    const-string v2, "no vidcoreBase in the server config"

    .line 424
    .line 425
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v1

    .line 429
    :cond_d
    new-instance v1, La1/u;

    .line 430
    .line 431
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 432
    .line 433
    .line 434
    throw v1

    .line 435
    :cond_e
    if-eqz v7, :cond_10

    .line 436
    .line 437
    iget-object v6, v7, Lx4/c;->b:Ljava/lang/String;

    .line 438
    .line 439
    if-nez v6, :cond_f

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_f
    move-object/from16 v11, p1

    .line 443
    .line 444
    move-object/from16 v12, p2

    .line 445
    .line 446
    move/from16 v14, p7

    .line 447
    .line 448
    move-object v4, v6

    .line 449
    goto :goto_7

    .line 450
    :cond_10
    :goto_8
    if-eqz v7, :cond_11

    .line 451
    .line 452
    iget-object v4, v7, Lx4/c;->a:Ljava/lang/String;

    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_11
    if-eqz v4, :cond_13

    .line 456
    .line 457
    iput-object v0, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 458
    .line 459
    move-object/from16 v11, p1

    .line 460
    .line 461
    iput-object v11, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 462
    .line 463
    move-object/from16 v12, p2

    .line 464
    .line 465
    iput-object v12, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 466
    .line 467
    iput-object v5, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 468
    .line 469
    iput-object v7, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 470
    .line 471
    iput-object v13, v9, Lz4/y;->r:Ljava/lang/String;

    .line 472
    .line 473
    iput v2, v9, Lz4/y;->s:I

    .line 474
    .line 475
    iput v3, v9, Lz4/y;->t:I

    .line 476
    .line 477
    move/from16 v14, p7

    .line 478
    .line 479
    iput v14, v9, Lz4/y;->u:I

    .line 480
    .line 481
    iput v15, v9, Lz4/y;->x:I

    .line 482
    .line 483
    move-object v6, v9

    .line 484
    invoke-virtual/range {v1 .. v6}, Lz4/g0;->d(IILjava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    if-ne v4, v10, :cond_12

    .line 489
    .line 490
    goto/16 :goto_13

    .line 491
    .line 492
    :cond_12
    move-object/from16 v2, p3

    .line 493
    .line 494
    move/from16 v5, p4

    .line 495
    .line 496
    move/from16 v3, p5

    .line 497
    .line 498
    move-object v6, v13

    .line 499
    move-object v13, v0

    .line 500
    :goto_9
    check-cast v4, Ljava/lang/String;

    .line 501
    .line 502
    move-object/from16 v33, v6

    .line 503
    .line 504
    move-object v6, v4

    .line 505
    move-object v4, v13

    .line 506
    move-object/from16 v13, v33

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_13
    move-object/from16 v11, p1

    .line 510
    .line 511
    move-object/from16 v12, p2

    .line 512
    .line 513
    move/from16 v14, p7

    .line 514
    .line 515
    move-object/from16 v2, p3

    .line 516
    .line 517
    move/from16 v5, p4

    .line 518
    .line 519
    move/from16 v3, p5

    .line 520
    .line 521
    move-object v4, v0

    .line 522
    const/4 v6, 0x0

    .line 523
    :goto_a
    if-nez v6, :cond_15

    .line 524
    .line 525
    if-eqz v13, :cond_14

    .line 526
    .line 527
    move v6, v5

    .line 528
    move-object v5, v2

    .line 529
    move v2, v6

    .line 530
    move-object v6, v4

    .line 531
    move-object v4, v13

    .line 532
    goto :goto_b

    .line 533
    :cond_14
    new-instance v1, Ljava/io/IOException;

    .line 534
    .line 535
    const-string v2, "no gateBase in the server config"

    .line 536
    .line 537
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v1

    .line 541
    :cond_15
    move/from16 v33, v5

    .line 542
    .line 543
    move-object v5, v2

    .line 544
    move/from16 v2, v33

    .line 545
    .line 546
    move-object/from16 v33, v6

    .line 547
    .line 548
    move-object v6, v4

    .line 549
    move-object/from16 v4, v33

    .line 550
    .line 551
    :goto_b
    new-instance v0, Lc5/b;

    .line 552
    .line 553
    invoke-direct {v0, v12, v13, v4, v15}, Lc5/b;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 554
    .line 555
    .line 556
    new-instance v24, Ljava/util/LinkedHashSet;

    .line 557
    .line 558
    invoke-direct/range {v24 .. v24}, Ljava/util/LinkedHashSet;-><init>()V

    .line 559
    .line 560
    .line 561
    new-instance v27, Ljava/util/ArrayList;

    .line 562
    .line 563
    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 564
    .line 565
    .line 566
    new-instance v13, Lz6/n;

    .line 567
    .line 568
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 569
    .line 570
    .line 571
    iput-object v4, v13, Lz6/n;->j:Ljava/lang/Object;

    .line 572
    .line 573
    new-instance v15, Lz6/n;

    .line 574
    .line 575
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 576
    .line 577
    .line 578
    iput-object v4, v15, Lz6/n;->j:Ljava/lang/Object;

    .line 579
    .line 580
    new-instance v28, Lz6/n;

    .line 581
    .line 582
    invoke-direct/range {v28 .. v28}, Ljava/lang/Object;-><init>()V

    .line 583
    .line 584
    .line 585
    new-instance v26, Lz6/k;

    .line 586
    .line 587
    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    .line 588
    .line 589
    .line 590
    new-instance v22, Lz6/l;

    .line 591
    .line 592
    invoke-direct/range {v22 .. v22}, Ljava/lang/Object;-><init>()V

    .line 593
    .line 594
    .line 595
    move-object/from16 v30, v0

    .line 596
    .line 597
    new-instance v0, Li7/m;

    .line 598
    .line 599
    move-object/from16 v29, v13

    .line 600
    .line 601
    const/4 v13, 0x1

    .line 602
    invoke-direct {v0, v13}, Li7/a1;-><init>(Z)V

    .line 603
    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    invoke-virtual {v0, v13}, Li7/a1;->C(Li7/s0;)V

    .line 607
    .line 608
    .line 609
    sget-object v13, Lz4/o;->l:Lz4/o;

    .line 610
    .line 611
    if-ne v12, v13, :cond_16

    .line 612
    .line 613
    const/16 v16, 0x5a

    .line 614
    .line 615
    :goto_c
    move/from16 v25, v16

    .line 616
    .line 617
    goto :goto_d

    .line 618
    :cond_16
    const/16 v16, 0x30

    .line 619
    .line 620
    goto :goto_c

    .line 621
    :goto_d
    if-ne v12, v13, :cond_17

    .line 622
    .line 623
    const-wide/32 v16, 0xfde8

    .line 624
    .line 625
    .line 626
    :goto_e
    move-wide/from16 v17, v16

    .line 627
    .line 628
    goto :goto_f

    .line 629
    :cond_17
    const-wide/16 v16, 0x61a8

    .line 630
    .line 631
    goto :goto_e

    .line 632
    :goto_f
    iget-object v13, v12, Lz4/o;->j:Ljava/lang/String;

    .line 633
    .line 634
    move-object/from16 v20, v0

    .line 635
    .line 636
    const/16 v0, 0x60

    .line 637
    .line 638
    invoke-static {v0, v4}, Lh7/h;->R0(ILjava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    move-object/from16 v19, v4

    .line 643
    .line 644
    new-instance v4, Ljava/lang/StringBuilder;

    .line 645
    .line 646
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    const-string v13, " walk (attempt "

    .line 653
    .line 654
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const-string v13, ") starts at "

    .line 661
    .line 662
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 673
    .line 674
    .line 675
    new-instance v16, Lz4/e0;

    .line 676
    .line 677
    const/16 v31, 0x0

    .line 678
    .line 679
    move-object/from16 v21, v12

    .line 680
    .line 681
    move-object/from16 v23, v15

    .line 682
    .line 683
    invoke-direct/range {v16 .. v31}, Lz4/e0;-><init>(JLjava/lang/String;Li7/m;Lz4/o;Lz6/l;Lz6/n;Ljava/util/LinkedHashSet;ILz6/k;Ljava/util/ArrayList;Lz6/n;Lz6/n;Lc5/b;Lp6/c;)V

    .line 684
    .line 685
    .line 686
    move-object/from16 v4, v16

    .line 687
    .line 688
    move-object/from16 v0, v26

    .line 689
    .line 690
    iput-object v11, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 691
    .line 692
    iput-object v12, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 693
    .line 694
    iput-object v5, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 695
    .line 696
    iput-object v7, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 697
    .line 698
    iput-object v0, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 699
    .line 700
    const/4 v13, 0x0

    .line 701
    iput-object v13, v9, Lz4/y;->r:Ljava/lang/String;

    .line 702
    .line 703
    iput v2, v9, Lz4/y;->s:I

    .line 704
    .line 705
    iput v3, v9, Lz4/y;->t:I

    .line 706
    .line 707
    iput v14, v9, Lz4/y;->u:I

    .line 708
    .line 709
    const/4 v13, 0x2

    .line 710
    iput v13, v9, Lz4/y;->x:I

    .line 711
    .line 712
    invoke-virtual {v6, v11, v4, v9}, Lz4/g0;->o(Landroid/app/Activity;Lz4/e0;Lr6/c;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    if-ne v4, v10, :cond_18

    .line 717
    .line 718
    goto/16 :goto_13

    .line 719
    .line 720
    :cond_18
    move-object v6, v0

    .line 721
    move-object v13, v12

    .line 722
    move-object v12, v5

    .line 723
    move v5, v2

    .line 724
    move v2, v14

    .line 725
    move-object v14, v11

    .line 726
    :goto_10
    move-object v0, v4

    .line 727
    check-cast v0, Lz4/n;

    .line 728
    .line 729
    iget-object v4, v0, Lz4/n;->a:Ljava/util/List;

    .line 730
    .line 731
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    if-eqz v4, :cond_1c

    .line 736
    .line 737
    sget-object v4, Lz4/o;->k:Lz4/o;

    .line 738
    .line 739
    if-ne v13, v4, :cond_1d

    .line 740
    .line 741
    iget-boolean v4, v6, Lz6/k;->j:Z

    .line 742
    .line 743
    if-eqz v4, :cond_1d

    .line 744
    .line 745
    const/4 v4, 0x2

    .line 746
    if-ge v2, v4, :cond_1d

    .line 747
    .line 748
    iput-object v14, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 749
    .line 750
    iput-object v13, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 751
    .line 752
    iput-object v12, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 753
    .line 754
    iput-object v0, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 755
    .line 756
    const/4 v4, 0x0

    .line 757
    iput-object v4, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 758
    .line 759
    iput v5, v9, Lz4/y;->s:I

    .line 760
    .line 761
    iput v3, v9, Lz4/y;->t:I

    .line 762
    .line 763
    iput v2, v9, Lz4/y;->u:I

    .line 764
    .line 765
    const/4 v4, 0x3

    .line 766
    iput v4, v9, Lz4/y;->x:I

    .line 767
    .line 768
    invoke-virtual {v1, v12, v5, v3, v9}, Lz4/g0;->b(Ljava/lang/String;IILr6/c;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    if-ne v4, v10, :cond_19

    .line 773
    .line 774
    goto/16 :goto_13

    .line 775
    .line 776
    :cond_19
    move-object v7, v12

    .line 777
    goto/16 :goto_2

    .line 778
    .line 779
    :goto_11
    check-cast v4, Lz4/m;

    .line 780
    .line 781
    iget-object v4, v4, Lz4/m;->a:Lx4/c;

    .line 782
    .line 783
    if-eqz v4, :cond_1b

    .line 784
    .line 785
    const/16 v32, 0x1

    .line 786
    .line 787
    add-int/lit8 v8, v2, 0x1

    .line 788
    .line 789
    const/4 v13, 0x0

    .line 790
    iput-object v13, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 791
    .line 792
    iput-object v13, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 793
    .line 794
    iput-object v13, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 795
    .line 796
    iput-object v13, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 797
    .line 798
    const/4 v0, 0x4

    .line 799
    iput v0, v9, Lz4/y;->x:I

    .line 800
    .line 801
    move-object v2, v7

    .line 802
    move-object v7, v4

    .line 803
    move-object v4, v2

    .line 804
    move-object v2, v14

    .line 805
    invoke-virtual/range {v1 .. v9}, Lz4/g0;->n(Landroid/app/Activity;Lz4/o;Ljava/lang/String;IILx4/c;ILr6/c;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    if-ne v0, v10, :cond_1a

    .line 810
    .line 811
    goto :goto_13

    .line 812
    :cond_1a
    return-object v0

    .line 813
    :cond_1b
    const-string v1, "no fresh chain to retry the expired session with"

    .line 814
    .line 815
    invoke-static {v8, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 816
    .line 817
    .line 818
    return-object v0

    .line 819
    :cond_1c
    sget-object v1, Lz4/o;->l:Lz4/o;

    .line 820
    .line 821
    if-ne v13, v1, :cond_1e

    .line 822
    .line 823
    :cond_1d
    return-object v0

    .line 824
    :cond_1e
    if-eqz v7, :cond_1f

    .line 825
    .line 826
    iget-object v13, v7, Lx4/c;->e:Ljava/lang/String;

    .line 827
    .line 828
    goto :goto_12

    .line 829
    :cond_1f
    const/4 v13, 0x0

    .line 830
    :goto_12
    if-eqz v7, :cond_20

    .line 831
    .line 832
    new-instance v13, Lx4/b;

    .line 833
    .line 834
    iget-object v1, v7, Lx4/c;->c:Ljava/lang/String;

    .line 835
    .line 836
    iget-object v2, v7, Lx4/c;->d:Ljava/lang/String;

    .line 837
    .line 838
    invoke-direct {v13, v1, v2}, Lx4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    move-object v1, v13

    .line 842
    const/4 v13, 0x0

    .line 843
    goto :goto_16

    .line 844
    :cond_20
    if-eqz v13, :cond_21

    .line 845
    .line 846
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 847
    .line 848
    .line 849
    move-result v1

    .line 850
    if-nez v1, :cond_22

    .line 851
    .line 852
    :cond_21
    const/4 v13, 0x0

    .line 853
    goto :goto_15

    .line 854
    :cond_22
    new-instance v1, Lc5/h;

    .line 855
    .line 856
    const/4 v2, 0x0

    .line 857
    move-object/from16 p1, v1

    .line 858
    .line 859
    move-object/from16 p6, v2

    .line 860
    .line 861
    move/from16 p4, v3

    .line 862
    .line 863
    move/from16 p3, v5

    .line 864
    .line 865
    move-object/from16 p2, v12

    .line 866
    .line 867
    move-object/from16 p5, v13

    .line 868
    .line 869
    invoke-direct/range {p1 .. p6}, Lc5/h;-><init>(Ljava/lang/String;IILjava/lang/String;Lp6/c;)V

    .line 870
    .line 871
    .line 872
    iput-object v0, v9, Lz4/y;->m:Ljava/lang/Object;

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    iput-object v13, v9, Lz4/y;->n:Ljava/lang/Object;

    .line 876
    .line 877
    iput-object v13, v9, Lz4/y;->o:Ljava/lang/Object;

    .line 878
    .line 879
    iput-object v13, v9, Lz4/y;->p:Ljava/lang/Object;

    .line 880
    .line 881
    iput-object v13, v9, Lz4/y;->q:Ljava/lang/Object;

    .line 882
    .line 883
    const/4 v2, 0x5

    .line 884
    iput v2, v9, Lz4/y;->x:I

    .line 885
    .line 886
    const-wide/16 v2, 0x1770

    .line 887
    .line 888
    invoke-static {v2, v3, v1, v9}, Li7/x;->s(JLy6/p;Lr6/c;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    if-ne v1, v10, :cond_23

    .line 893
    .line 894
    :goto_13
    return-object v10

    .line 895
    :cond_23
    move-object v2, v0

    .line 896
    :goto_14
    move-object v0, v1

    .line 897
    check-cast v0, Lx4/b;

    .line 898
    .line 899
    move-object v1, v0

    .line 900
    move-object v0, v2

    .line 901
    goto :goto_16

    .line 902
    :goto_15
    move-object v1, v13

    .line 903
    :goto_16
    if-eqz v1, :cond_24

    .line 904
    .line 905
    iget-object v2, v1, Lx4/b;->a:Ljava/lang/String;

    .line 906
    .line 907
    goto :goto_17

    .line 908
    :cond_24
    move-object v2, v13

    .line 909
    :goto_17
    if-eqz v1, :cond_25

    .line 910
    .line 911
    iget-object v11, v1, Lx4/b;->b:Ljava/lang/String;

    .line 912
    .line 913
    goto :goto_18

    .line 914
    :cond_25
    move-object v11, v13

    .line 915
    :goto_18
    iget-object v1, v0, Lz4/n;->a:Ljava/util/List;

    .line 916
    .line 917
    iget-object v3, v0, Lz4/n;->b:Ljava/lang/String;

    .line 918
    .line 919
    iget-object v0, v0, Lz4/n;->c:Ljava/util/Map;

    .line 920
    .line 921
    const-string v4, "headers"

    .line 922
    .line 923
    invoke-static {v4, v0}, Lz6/h;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    new-instance v4, Lz4/n;

    .line 927
    .line 928
    move-object/from16 p4, v0

    .line 929
    .line 930
    move-object/from16 p2, v1

    .line 931
    .line 932
    move-object/from16 p5, v2

    .line 933
    .line 934
    move-object/from16 p3, v3

    .line 935
    .line 936
    move-object/from16 p1, v4

    .line 937
    .line 938
    move-object/from16 p6, v11

    .line 939
    .line 940
    invoke-direct/range {p1 .. p6}, Lz4/n;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    move-object/from16 v0, p1

    .line 944
    .line 945
    return-object v0
.end method

.method public final o(Landroid/app/Activity;Lz4/e0;Lr6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lz4/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lz4/f0;

    .line 7
    .line 8
    iget v1, v0, Lz4/f0;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz4/f0;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz4/f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lz4/f0;-><init>(Lz4/g0;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lz4/f0;->p:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lq6/a;->j:Lq6/a;

    .line 28
    .line 29
    iget v2, v0, Lz4/f0;->r:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lz4/f0;->o:Landroid/widget/FrameLayout;

    .line 37
    .line 38
    iget-object p2, v0, Lz4/f0;->n:Landroid/webkit/WebView;

    .line 39
    .line 40
    iget-object v0, v0, Lz4/f0;->m:Landroid/view/ViewGroup;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p3

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p3}, Lcom/bumptech/glide/c;->d0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const p3, 0x1020002

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz p3, :cond_4

    .line 69
    .line 70
    new-instance v2, Landroid/webkit/WebView;

    .line 71
    .line 72
    invoke-direct {v2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Landroid/widget/FrameLayout;

    .line 76
    .line 77
    invoke-direct {v4, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 81
    .line 82
    invoke-direct {p1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 89
    .line 90
    invoke-direct {p1, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3, v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    .line 95
    .line 96
    :try_start_1
    iput-object p3, v0, Lz4/f0;->m:Landroid/view/ViewGroup;

    .line 97
    .line 98
    iput-object v2, v0, Lz4/f0;->n:Landroid/webkit/WebView;

    .line 99
    .line 100
    iput-object v4, v0, Lz4/f0;->o:Landroid/widget/FrameLayout;

    .line 101
    .line 102
    iput v3, v0, Lz4/f0;->r:I

    .line 103
    .line 104
    invoke-virtual {p2, v2, v0}, Lz4/e0;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    if-ne p1, v1, :cond_3

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_3
    move-object v0, p3

    .line 112
    move-object p2, v2

    .line 113
    move-object p3, p1

    .line 114
    move-object p1, v4

    .line 115
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Landroid/webkit/WebView;->destroy()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    return-object p3

    .line 125
    :catchall_1
    move-exception p1

    .line 126
    move-object v0, p3

    .line 127
    move-object p2, v2

    .line 128
    move-object p3, p1

    .line 129
    move-object p1, v4

    .line 130
    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Landroid/webkit/WebView;->destroy()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    throw p3

    .line 140
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 141
    .line 142
    const-string p2, "no content view to host the resolver\'s WebView"

    .line 143
    .line 144
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method
