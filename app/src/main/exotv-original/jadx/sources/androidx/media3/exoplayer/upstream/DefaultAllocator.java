package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z7, int i) {
        this(z7, i, 0);
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i = this.availableCount;
            if (i > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i4 = i - 1;
                this.availableCount = i4;
                allocation = allocationArr[i4];
                allocation.getClass();
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i8 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i8 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i = this.availableCount;
        this.availableCount = i + 1;
        allocationArr[i] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z7 = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z7) {
            trim();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void trim() {
        try {
            int i = 0;
            int iMax = Math.max(0, AbstractC1118i0.m2446f(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i4 = this.availableCount;
            if (iMax >= i4) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i8 = i4 - 1;
                while (i <= i8) {
                    Allocation allocation = this.availableAllocations[i];
                    allocation.getClass();
                    if (allocation.data == this.initialAllocationBlock) {
                        i++;
                    } else {
                        Allocation allocation2 = this.availableAllocations[i8];
                        allocation2.getClass();
                        if (allocation2.data != this.initialAllocationBlock) {
                            i8--;
                        } else {
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i] = allocation2;
                            allocationArr[i8] = allocation;
                            i8--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, iMax, this.availableCount, (Object) null);
            this.availableCount = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultAllocator(boolean z7, int i, int i4) {
        AbstractC1101a.m2353d(i > 0);
        AbstractC1101a.m2353d(i4 >= 0);
        this.trimOnReset = z7;
        this.individualAllocationSize = i;
        this.availableCount = i4;
        this.availableAllocations = new Allocation[i4 + 100];
        if (i4 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i4 * i];
        for (int i8 = 0; i8 < i4; i8++) {
            this.availableAllocations[i8] = new Allocation(this.initialAllocationBlock, i8 * i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i = this.availableCount;
                this.availableCount = i + 1;
                allocationArr[i] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }
}
