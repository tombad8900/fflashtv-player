package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p002a1.C0016e;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p106m1.C1868c;
import p106m1.C1872g;
import p115n1.C1978h0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final C1132w scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AllocationNode implements Allocator.AllocationNode {
        public Allocation allocation;
        public long endPosition;
        public AllocationNode next;
        public long startPosition;

        public AllocationNode(long j, int i) {
            reset(j, i);
        }

        public AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            Allocation allocation = this.allocation;
            allocation.getClass();
            return allocation;
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }

        public void reset(long j, int i) {
            AbstractC1101a.m2359j(this.allocation == null);
            this.startPosition = j;
            this.endPosition = j + i;
        }

        public int translateOffset(long j) {
            return ((int) (j - this.startPosition)) + this.allocation.offset;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new C1132w(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j) {
        while (j >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private void postAppend(int i) {
        long j = this.totalBytesWritten + i;
        this.totalBytesWritten = j;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (allocationNode.allocation == null) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (nodeContainingPosition.endPosition - j));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, C1872g c1872g, SampleQueue.SampleExtrasHolder sampleExtrasHolder, C1132w c1132w) {
        long j = sampleExtrasHolder.offset;
        int iM2507A = 1;
        c1132w.m2510D(1);
        AllocationNode data = readData(allocationNode, j, c1132w.f4799a, 1);
        long j8 = j + 1;
        byte b7 = c1132w.f4799a[0];
        boolean z7 = (b7 & 128) != 0;
        int i = b7 & Byte.MAX_VALUE;
        C1868c c1868c = c1872g.cryptoInfo;
        byte[] bArr = c1868c.f6968a;
        if (bArr == null) {
            c1868c.f6968a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        AllocationNode data2 = readData(data, j8, c1868c.f6968a, i);
        long j9 = j8 + i;
        if (z7) {
            c1132w.m2510D(2);
            data2 = readData(data2, j9, c1132w.f4799a, 2);
            j9 += 2;
            iM2507A = c1132w.m2507A();
        }
        int[] iArr = c1868c.f6971d;
        if (iArr == null || iArr.length < iM2507A) {
            iArr = new int[iM2507A];
        }
        int[] iArr2 = c1868c.f6972e;
        if (iArr2 == null || iArr2.length < iM2507A) {
            iArr2 = new int[iM2507A];
        }
        if (z7) {
            int i4 = iM2507A * 6;
            c1132w.m2510D(i4);
            data2 = readData(data2, j9, c1132w.f4799a, i4);
            j9 += i4;
            c1132w.m2513G(0);
            for (int i8 = 0; i8 < iM2507A; i8++) {
                iArr[i8] = c1132w.m2507A();
                iArr2[i8] = c1132w.m2539y();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = sampleExtrasHolder.size - ((int) (j9 - sampleExtrasHolder.offset));
        }
        C1978h0 c1978h0 = sampleExtrasHolder.cryptoData;
        int i9 = AbstractC1118i0.f4750a;
        byte[] bArr2 = c1978h0.f7339b;
        byte[] bArr3 = c1868c.f6968a;
        int i10 = c1978h0.f7338a;
        int i11 = c1978h0.f7340c;
        int i12 = c1978h0.f7341d;
        c1868c.f6973f = iM2507A;
        c1868c.f6971d = iArr;
        c1868c.f6972e = iArr2;
        c1868c.f6969b = bArr2;
        c1868c.f6968a = bArr3;
        c1868c.f6970c = i10;
        c1868c.f6974g = i11;
        c1868c.f6975h = i12;
        MediaCodec.CryptoInfo cryptoInfo = c1868c.f6976i;
        cryptoInfo.numSubSamples = iM2507A;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr2;
        cryptoInfo.iv = bArr3;
        cryptoInfo.mode = i10;
        if (AbstractC1118i0.f4750a >= 24) {
            C0016e c0016e = c1868c.f6977j;
            c0016e.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c0016e.f63l;
            pattern.set(i11, i12);
            ((MediaCodec.CryptoInfo) c0016e.f62k).setPattern(pattern);
        }
        long j10 = sampleExtrasHolder.offset;
        int i13 = (int) (j9 - j10);
        sampleExtrasHolder.offset = j10 + i13;
        sampleExtrasHolder.size -= i13;
        return data2;
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, C1872g c1872g, SampleQueue.SampleExtrasHolder sampleExtrasHolder, C1132w c1132w) {
        if (c1872g.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, c1872g, sampleExtrasHolder, c1132w);
        }
        if (!c1872g.hasSupplementalData()) {
            c1872g.ensureSpaceForWrite(sampleExtrasHolder.size);
            return readData(allocationNode, sampleExtrasHolder.offset, c1872g.data, sampleExtrasHolder.size);
        }
        c1132w.m2510D(4);
        AllocationNode data = readData(allocationNode, sampleExtrasHolder.offset, c1132w.f4799a, 4);
        int iM2539y = c1132w.m2539y();
        sampleExtrasHolder.offset += 4;
        sampleExtrasHolder.size -= 4;
        c1872g.ensureSpaceForWrite(iM2539y);
        AllocationNode data2 = readData(data, sampleExtrasHolder.offset, c1872g.data, iM2539y);
        sampleExtrasHolder.offset += iM2539y;
        int i = sampleExtrasHolder.size - iM2539y;
        sampleExtrasHolder.size = i;
        c1872g.resetSupplementalData(i);
        return readData(data2, sampleExtrasHolder.offset, c1872g.supplementalData, sampleExtrasHolder.size);
    }

    public void discardDownstreamTo(long j) {
        AllocationNode allocationNode;
        if (j == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    public void discardUpstreamSampleBytes(long j) {
        AbstractC1101a.m2353d(j <= this.totalBytesWritten);
        this.totalBytesWritten = j;
        if (j != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (j != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = allocationNode.next;
                allocationNode2.getClass();
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void peekToBuffer(C1872g c1872g, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, c1872g, sampleExtrasHolder, this.scratch);
    }

    public void readToBuffer(C1872g c1872g, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, c1872g, sampleExtrasHolder, this.scratch);
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) throws EOFException {
        int iPreAppend = preAppend(i);
        AllocationNode allocationNode = this.writeAllocationNode;
        int i4 = interfaceC0219m.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
        if (i4 != -1) {
            postAppend(i4);
            return i4;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, byte[] bArr, int i) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        int i4 = i;
        while (i4 > 0) {
            int iMin = Math.min(i4, (int) (nodeContainingPosition.endPosition - j));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), bArr, i - i4, iMin);
            i4 -= iMin;
            j += iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(C1132w c1132w, int i) {
        while (i > 0) {
            int iPreAppend = preAppend(i);
            AllocationNode allocationNode = this.writeAllocationNode;
            c1132w.m2519e(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
            i -= iPreAppend;
            postAppend(iPreAppend);
        }
    }
}
