package p095l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p002a1.AbstractC0026j;
import p055g0.InterfaceMenuItemC1027a;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.c0 */
/* loaded from: classes.dex */
public class MenuC1614c0 extends AbstractC0026j implements Menu {

    /* renamed from: l */
    public final MenuC1627m f6128l;

    public MenuC1614c0(Context context, MenuC1627m menuC1627m) {
        super(context);
        if (menuC1627m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f6128l = menuC1627m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m95h(this.f6128l.m3306a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f6128l.addIntentOptions(i, i4, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = m95h(menuItemArr2[i10]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f6128l.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2192k c2192k = (C2192k) this.f89k;
        if (c2192k != null) {
            c2192k.clear();
        }
        this.f6128l.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f6128l.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m95h(this.f6128l.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m95h(this.f6128l.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f6128l.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f6128l.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return this.f6128l.performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return this.f6128l.performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C2192k) this.f89k) != null) {
            int i4 = 0;
            while (true) {
                C2192k c2192k = (C2192k) this.f89k;
                if (i4 >= c2192k.f7656l) {
                    break;
                }
                if (((InterfaceMenuItemC1027a) c2192k.m3992f(i4)).getGroupId() == i) {
                    ((C2192k) this.f89k).mo3994h(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f6128l.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C2192k) this.f89k) != null) {
            int i4 = 0;
            while (true) {
                C2192k c2192k = (C2192k) this.f89k;
                if (i4 >= c2192k.f7656l) {
                    break;
                }
                if (((InterfaceMenuItemC1027a) c2192k.m3992f(i4)).getItemId() == i) {
                    ((C2192k) this.f89k).mo3994h(i4);
                    break;
                }
                i4++;
            }
        }
        this.f6128l.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z7, boolean z8) {
        this.f6128l.setGroupCheckable(i, z7, z8);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z7) {
        this.f6128l.setGroupEnabled(i, z7);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z7) {
        this.f6128l.setGroupVisible(i, z7);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f6128l.setQwertyMode(z7);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6128l.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f6128l.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m95h(this.f6128l.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i8, CharSequence charSequence) {
        return this.f6128l.addSubMenu(i, i4, i8, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i8, CharSequence charSequence) {
        return m95h(this.f6128l.m3306a(i, i4, i8, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i8, int i9) {
        return this.f6128l.addSubMenu(i, i4, i8, i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i8, int i9) {
        return m95h(this.f6128l.add(i, i4, i8, i9));
    }
}
