package p200x0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.f */
/* loaded from: classes.dex */
public final class C2738f extends AbstractC2415i0 {

    /* renamed from: a */
    public final TextView f10111a;

    /* renamed from: b */
    public final C2736d f10112b;

    /* renamed from: c */
    public boolean f10113c = true;

    public C2738f(TextView textView) {
        this.f10111a = textView;
        this.f10112b = new C2736d(textView);
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: B */
    public final void mo4270B(boolean z7) {
        if (z7) {
            m4804J();
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: C */
    public final void mo4271C(boolean z7) {
        this.f10113c = z7;
        m4804J();
        TextView textView = this.f10111a;
        textView.setFilters(mo4277j(textView.getFilters()));
    }

    /* renamed from: J */
    public final void m4804J() {
        TextView textView = this.f10111a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f10113c) {
            if (!(transformationMethod instanceof C2742j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C2742j(transformationMethod);
            }
        } else if (transformationMethod instanceof C2742j) {
            transformationMethod = ((C2742j) transformationMethod).f10119j;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: j */
    public final InputFilter[] mo4277j(InputFilter[] inputFilterArr) {
        if (!this.f10113c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2736d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArray.indexOfKey(i8) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i8];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i9 = 0;
        while (true) {
            C2736d c2736d = this.f10112b;
            if (i9 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c2736d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i9] == c2736d) {
                return inputFilterArr;
            }
            i9++;
        }
    }
}
