package com.fflashtv.player.adblock

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BraveAdBlockSettingsCard() {
    val context = LocalContext.current
    var enabled by remember { mutableStateOf(BraveAdBlockEngine.isEnabled(context)) }
    var selected by remember { mutableStateOf(BraveFilterListManager.getEnabledIds(context)) }
    var busy by remember { mutableStateOf(false) }
    var status by remember { mutableStateOf("يتم تهيئة المحرك عند فتح التطبيق") }
    val mainHandler = remember { Handler(Looper.getMainLooper()) }

    LaunchedEffect(Unit) {
        BraveAdBlockEngine.initializeAsync(context)
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Brave Adblock", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("حجب الإعلانات بقواعد Brave الأصلية")
                    Text(
                        if (BraveAdBlockEngine.isReady()) "المحرك جاهز"
                        else BraveAdBlockEngine.lastError()?.let { "تعذر التهيئة: $it" } ?: status,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Switch(
                    checked = enabled,
                    onCheckedChange = {
                        enabled = it
                        BraveAdBlockEngine.setEnabled(context, it)
                        if (it) status = "جارٍ تهيئة المحرك"
                        else status = "تم إيقاف الحجب"
                    }
                )
            }

            if (enabled) {
                Text("قوائم الحجب", fontWeight = FontWeight.SemiBold)
                BraveFilterListManager.lists.forEach { filter ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(filter.title, modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodyMedium)
                        Switch(
                            checked = filter.id in selected,
                            onCheckedChange = { checked ->
                                val next = if (checked) selected + filter.id else selected - filter.id
                                if (next.isNotEmpty()) {
                                    selected = next
                                    BraveFilterListManager.setEnabledIds(context, next)
                                    busy = true
                                    BraveAdBlockEngine.rebuildAsync(context) { message ->
                                        mainHandler.post {
                                            busy = false
                                            status = message
                                        }
                                    }
                                } else {
                                    status = "يجب إبقاء قائمة واحدة على الأقل"
                                }
                            }
                        )
                    }
                }

                Button(
                    enabled = !busy,
                    onClick = {
                        busy = true
                        status = "جارٍ تنزيل القوائم من مصادرها الأصلية..."
                        BraveAdBlockEngine.refreshAsync(context) { message ->
                            mainHandler.post {
                                busy = false
                                status = message
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE6C27A), contentColor = Color.Black)
                ) {
                    Text(if (busy) "جارٍ العمل..." else "تحديث قوائم Brave الآن")
                }
            }
            if (status.isNotBlank()) {
                Text(status, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
            }
            Text(
                "القوائم الثماني تُنزّل من مصادرها المحددة عند طلب التحديث. يحتفظ التطبيق بآخر نسخة سليمة عند فشل التنزيل.",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
