package app.seven.reminda.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun CircularIcon(
    icon: ImageVector,
    contentDescription: String,
    backgroundColor: Color,
    tint: Color = LocalContentColor.current
) {
    Box(
        modifier = Modifier
            .background(
                color = backgroundColor.copy(alpha = 0.5f),
                shape = RoundedCornerShape(50)
            )
            .size(42.dp)
    ) {
        Icon(
            modifier = Modifier.align(Alignment.Center),
            imageVector = icon, contentDescription = contentDescription, tint = tint
        )
    }
}

@RPreview
@Composable
fun CircularIconPreview() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CircularIcon(
                icon = Icons.Default.Add,
                contentDescription = "",
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@RPreview
@Composable
fun CircularIconPreview1() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CircularIcon(
                icon = Icons.Default.Add,
                contentDescription = "",
                backgroundColor = MaterialTheme.colorScheme.tertiary,
                tint = Color.Black
            )
        }
    }
}
