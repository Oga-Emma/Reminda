package app.seven.reminda.presentation.view.mainscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun ReminderCountArea() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        ReminderCountItem(
            modifier = Modifier.weight(1f),
            title = "Complete", count = "14", onClick = {})
        Spacer(modifier = Modifier.width(4.dp))
        ReminderCountItem(
            modifier = Modifier.weight(1f),
            title = "Complete", count = "08", onClick = {})
    }
}

@Composable
fun ReminderCountItem(
    modifier: Modifier = Modifier,
    title: String, count: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .background(
                color = Pallet.blueGrey,
                shape = RoundedCornerShape(percent = 12)
            ).clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(
                    modifier = Modifier.weight(1f), text = title, fontWeight = FontWeight.Bold
                )
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = count,
                fontWeight = FontWeight.Bold,
                fontSize = 56.sp,
            )
        }
    }
}

@RPreview
@Composable
fun ReminderCountAreaPreview() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ReminderCountArea()
        }
    }
}
