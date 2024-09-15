package app.seven.reminda.presentation.view.mainscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun TodayReminderHeader() {
    Column {
        Box(
            modifier = Modifier
                .background(
                    color = Pallet.blueGrey,
                    shape = RoundedCornerShape(percent = 25)
                )
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    fontSize = 24.sp,
                    text = "All Reminders", fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "",
                    modifier = Modifier
                        .size(36.dp)
                        .rotate(-45f)
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                )
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                ) {
                    Text(
                        fontSize = 24.sp,
                        text = "About today", fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Your daily reminders are here",
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "",
                    modifier = Modifier
                        .size(24.dp)
                )
            }
        }
    }
}

@Composable
fun TodayReminderListItem(
    modifier: Modifier = Modifier,
    index: Int,
    text: String,
    color: RColor,
    previousColor: RColor
) {

    Box(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(color = previousColor.backgroundColor)
    )
    Box(
        modifier = modifier
            .background(
                color = color.backgroundColor,
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
            )
    ) {
        Row(
            modifier = Modifier.padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "$index".padStart(2, padChar = '0'),
                fontWeight = FontWeight.Bold,
                fontSize = 56.sp,
                color = color.fontColor,
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                modifier = Modifier.weight(1f),
                fontSize = 24.sp,
                text = text,
                fontWeight = FontWeight.Bold,
                color = color.fontColor,
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "",
                tint = color.fontColor,
                modifier = Modifier
                    .size(36.dp)
                    .rotate(-45f)
            )
        }
    }
}

@RPreview
@Composable
fun TodayReminderListAreaPreview() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            TodayReminderHeader()
        }
    }
}

data class RColor(
    val backgroundColor: Color,
    val fontColor: Color,
)
