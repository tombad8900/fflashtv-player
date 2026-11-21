.class public interface abstract Le4/i;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# static fields
.field public static final a:Le4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le4/j;

    .line 2
    .line 3
    sget-object v0, Le4/j;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, Le4/l;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Le4/l;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Le4/i;->a:Le4/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
