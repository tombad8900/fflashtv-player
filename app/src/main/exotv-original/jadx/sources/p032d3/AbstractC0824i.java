package p032d3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.i */
/* loaded from: classes.dex */
public abstract class AbstractC0824i {
    /* renamed from: a */
    public static <T, V> ObjectAnimator m1987a(T t8, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
    }
}
