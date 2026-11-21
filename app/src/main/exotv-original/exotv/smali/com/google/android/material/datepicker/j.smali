.class public final Lcom/google/android/material/datepicker/j;
.super Lm0/b;
.source "r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/j;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Lm0/b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/j;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lm0/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Lm0/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->m:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;Ln0/d;)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/j;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/datepicker/j;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lm0/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p2, p2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 11
    .line 12
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 16
    .line 17
    iget-boolean p1, v1, Lcom/google/android/material/internal/NavigationMenuItemView;->G:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const v0, 0x7f110083

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string v0, "AccessibilityNodeInfo.roleDescription"

    .line 38
    .line 39
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    iget-object p2, p2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 44
    .line 45
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 46
    .line 47
    .line 48
    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 49
    .line 50
    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->n:Z

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 53
    .line 54
    .line 55
    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->m:Z

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    iget-object p2, p2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 62
    .line 63
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 64
    .line 65
    .line 66
    check-cast v1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 67
    .line 68
    sget v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->B:I

    .line 69
    .line 70
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 71
    .line 72
    const/4 v2, -0x1

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    :cond_0
    move v6, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v0, 0x0

    .line 78
    move v3, v0

    .line 79
    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-ge v0, v4, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-ne v4, p1, :cond_2

    .line 90
    .line 91
    move v6, v3

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    instance-of v4, v4, Lcom/google/android/material/button/MaterialButton;

    .line 98
    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    const/16 v5, 0x8

    .line 110
    .line 111
    if-eq v4, v5, :cond_3

    .line 112
    .line 113
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 119
    .line 120
    iget-boolean v9, p1, Lcom/google/android/material/button/MaterialButton;->E:Z

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x1

    .line 125
    const/4 v7, 0x1

    .line 126
    invoke-static/range {v4 .. v9}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_2
    iget-object v0, p2, Ln0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 135
    .line 136
    invoke-virtual {v2, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 137
    .line 138
    .line 139
    check-cast v1, Lcom/google/android/material/datepicker/m;

    .line 140
    .line 141
    iget-object p1, v1, Lcom/google/android/material/datepicker/m;->n0:Landroid/view/View;

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-nez p1, :cond_4

    .line 148
    .line 149
    const p1, 0x7f1100f1

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, p1}, La1/v;->k(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    goto :goto_2

    .line 157
    :cond_4
    const p1, 0x7f1100ee

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, p1}, La1/v;->k(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_2
    new-instance v0, Ln0/c;

    .line 165
    .line 166
    const/16 v1, 0x10

    .line 167
    .line 168
    invoke-direct {v0, v1, p1}, Ln0/c;-><init>(ILjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v0}, Ln0/d;->b(Ln0/c;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
