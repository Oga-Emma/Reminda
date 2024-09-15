package app.seven.reminda.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun TextCard(
    text: String,
    leadingIcon: ImageVector,
    color: RColor
) {
    Box(
        modifier = Modifier
            .background(
                color = color.backgroundColor,
                shape = RoundedCornerShape(24.dp)
            )
    ) {
        Row(
            modifier = Modifier.padding(start = 16.dp, end = 12.dp, bottom = 16.dp, top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = leadingIcon,
                contentDescription = "",
                modifier = Modifier.size(28.dp),
                tint = color.fontColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text, fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                fontSize = 16.sp,
                color = color.fontColor
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "",
                modifier = Modifier.size(28.dp)
                    .rotate(-45f),
                tint = color.fontColor
            )
        }
    }
}

@Composable
@RPreview
fun TextCardPreview(){
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            TextCard(
                text = "Test",
                leadingIcon = Icons.Default.DateRange,
                color = RColor(backgroundColor = Pallet.cyan, fontColor = Color.Black)
            )
        }
    }
}