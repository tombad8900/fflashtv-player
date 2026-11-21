package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ShuffleOrder {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i) {
            this(i, new Random());
        }

        private static int[] createShuffledList(int i, Random random) {
            int[] iArr = new int[i];
            int i4 = 0;
            while (i4 < i) {
                int i8 = i4 + 1;
                int iNextInt = random.nextInt(i8);
                iArr[i4] = iArr[iNextInt];
                iArr[iNextInt] = i4;
                i4 = i8;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i4) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int i8 = 0;
            int i9 = 0;
            while (i9 < i4) {
                iArr[i9] = this.random.nextInt(this.shuffled.length + 1);
                int i10 = i9 + 1;
                int iNextInt = this.random.nextInt(i10);
                iArr2[i9] = iArr2[iNextInt];
                iArr2[iNextInt] = i9 + i;
                i9 = i10;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i4];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i8 >= iArr4.length + i4) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
                if (i11 >= i4 || i12 != iArr[i11]) {
                    int i13 = i12 + 1;
                    int i14 = iArr4[i12];
                    iArr3[i8] = i14;
                    if (i14 >= i) {
                        iArr3[i8] = i14 + i4;
                    }
                    i12 = i13;
                } else {
                    iArr3[i8] = iArr2[i11];
                    i11++;
                }
                i8++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i4) {
            int i8 = i4 - i;
            int[] iArr = new int[this.shuffled.length - i8];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i9 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
                int i11 = iArr2[i9];
                if (i11 < i || i11 >= i4) {
                    int i12 = i9 - i10;
                    if (i11 >= i) {
                        i11 -= i8;
                    }
                    iArr[i12] = i11;
                } else {
                    i10++;
                }
                i9++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i4 = this.indexInShuffled[i] + 1;
            int[] iArr = this.shuffled;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i4 = this.indexInShuffled[i] - 1;
            if (i4 >= 0) {
                return this.shuffled[i4];
            }
            return -1;
        }

        public DefaultShuffleOrder(int i, long j) {
            this(i, new Random(j));
        }

        public DefaultShuffleOrder(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private DefaultShuffleOrder(int i, Random random) {
            this(createShuffledList(i, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.indexInShuffled[iArr[i]] = i;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i) {
            this.length = i;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i, int i4) {
            return new UnshuffledShuffleOrder(this.length + i4);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i, int i4) {
            return new UnshuffledShuffleOrder((this.length - i4) + i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int i = this.length;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i) {
            int i4 = i + 1;
            if (i4 < this.length) {
                return i4;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i) {
            int i4 = i - 1;
            if (i4 >= 0) {
                return i4;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i, int i4);

    ShuffleOrder cloneAndRemove(int i, int i4);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
