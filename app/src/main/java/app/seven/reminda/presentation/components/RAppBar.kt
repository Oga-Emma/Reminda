package app.seven.reminda.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun RAppBar(
    title: String,
    trailing: @Composable () -> Unit
) {
    Box {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircularIcon(
                modifier = Modifier.rotate(45f),
                icon = Icons.Default.ArrowBack,
                contentDescription = "add icon",
                backgroundColor = Pallet.blueGrey
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                modifier = Modifier.weight(1f),
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(2.dp))
            trailing()
        }
    }

}

@RPreview
@Composable
fun RAppBarPreview() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            RAppBar(
                title = "February, 2023",
                trailing = {
                    CircularIcon(
                        icon = Icons.Default.Check,
                        contentDescription = "add icon",
                        backgroundColor = Pallet.blueGrey
                    )
                }
            )
        }
    }
}

