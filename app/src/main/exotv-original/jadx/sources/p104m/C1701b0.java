package p104m;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005a4.C0073c;
import p046f0.AbstractC0930c;
import p046f0.InterfaceC0929b;
import p054g.AbstractC1026a;
import p095l.C1629o;
import p156s.C2332e;
import p183v0.C2510j;
import p200x0.C2734b;
import p200x0.C2737e;
import p200x0.C2740h;
import p200x0.C2741i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.b0 */
/* loaded from: classes.dex */
public class C1701b0 {

    /* renamed from: d */
    public static final int[] f6508d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f6509a = 2;

    /* renamed from: b */
    public View f6510b;

    /* renamed from: c */
    public Object f6511c;

    public /* synthetic */ C1701b0() {
    }

    /* renamed from: a */
    public KeyListener m3383a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C2332e) ((C1629o) this.f6511c).f6229j).getClass();
        if (keyListener instanceof C2737e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C2737e(keyListener);
    }

    /* renamed from: b */
    public void mo3384b(AttributeSet attributeSet, int i) {
        switch (this.f6509a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f6510b;
                C0073c c0073cM263F = C0073c.m263F(i, 0, absSeekBar.getContext(), attributeSet, f6508d);
                Drawable drawableM300y = c0073cM263F.m300y(0);
                if (drawableM300y != null) {
                    if (drawableM300y instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM300y;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable drawableM3387e = m3387e(animationDrawable.getFrame(i4), true);
                            drawableM3387e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM3387e, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM300y = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM300y);
                }
                Drawable drawableM300y2 = c0073cM263F.m300y(1);
                if (drawableM300y2 != null) {
                    absSeekBar.setProgressDrawable(m3387e(drawableM300y2, false));
                }
                c0073cM263F.m275I();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f6510b).getContext().obtainStyledAttributes(attributeSet, AbstractC1026a.f4316i, i, 0);
                try {
                    boolean z7 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m3386d(z7);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: c */
    public C2734b m3385c(InputConnection inputConnection, EditorInfo editorInfo) {
        C1629o c1629o = (C1629o) this.f6511c;
        if (inputConnection == null) {
            c1629o.getClass();
            inputConnection = null;
        } else {
            C2332e c2332e = (C2332e) c1629o.f6229j;
            c2332e.getClass();
            if (!(inputConnection instanceof C2734b)) {
                inputConnection = new C2734b((EditText) c2332e.f8170k, inputConnection, editorInfo);
            }
        }
        return (C2734b) inputConnection;
    }

    /* renamed from: d */
    public void m3386d(boolean z7) {
        C2741i c2741i = (C2741i) ((C2332e) ((C1629o) this.f6511c).f6229j).f8171l;
        if (c2741i.f10118l != z7) {
            if (c2741i.f10117k != null) {
                C2510j c2510jM4522a = C2510j.m4522a();
                C2740h c2740h = c2741i.f10117k;
                c2510jM4522a.getClass();
                AbstractC0714c.m1529o("initCallback cannot be null", c2740h);
                ReentrantReadWriteLock reentrantReadWriteLock = c2510jM4522a.f9143a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c2510jM4522a.f9144b.remove(c2740h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c2741i.f10118l = z7;
            if (z7) {
                C2741i.m4805a(c2741i.f10116j, C2510j.m4522a().m4523b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public Drawable m3387e(Drawable drawable, boolean z7) {
        if (drawable instanceof InterfaceC0929b) {
            ((AbstractC0930c) ((InterfaceC0929b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m3387e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                    layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                    layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                    layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                    layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                    layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                    layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                    layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                    layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f6511c) == null) {
                    this.f6511c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1701b0(AbsSeekBar absSeekBar) {
        this.f6510b = absSeekBar;
    }

    public C1701b0(EditText editText) {
        this.f6510b = editText;
        C1629o c1629o = new C1629o();
        c1629o.f6229j = new C2332e(editText);
        this.f6511c = c1629o;
    }
}
