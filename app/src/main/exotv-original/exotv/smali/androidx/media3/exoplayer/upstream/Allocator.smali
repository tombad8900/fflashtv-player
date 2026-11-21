.class public interface abstract Landroidx/media3/exoplayer/upstream/Allocator;
.super Ljava/lang/Object;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/upstream/Allocator$AllocationNode;
    }
.end annotation


# virtual methods
.method public abstract allocate()Landroidx/media3/exoplayer/upstream/Allocation;
.end method

.method public abstract getIndividualAllocationLength()I
.end method

.method public abstract getTotalBytesAllocated()I
.end method

.method public abstract release(Landroidx/media3/exoplayer/upstream/Allocation;)V
.end method

.method public abstract release(Landroidx/media3/exoplayer/upstream/Allocator$AllocationNode;)V
.end method

.method public abstract trim()V
.end method
