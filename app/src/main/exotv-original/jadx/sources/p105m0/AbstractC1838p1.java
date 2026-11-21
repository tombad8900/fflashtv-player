package p105m0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC1838p1 {
    /* renamed from: a */
    public static int m3613a(int i) {
        int iStatusBars;
        int i4 = 0;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i & i8) != 0) {
                if (i8 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i8 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i8 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i8 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i8 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i8 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i8 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i8 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i4 |= iStatusBars;
            }
        }
        return i4;
    }
}
