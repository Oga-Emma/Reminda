package app.seven.reminda.presentation.view.mainscreen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.seven.reminda.presentation.component.CircularIcon
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun HeaderArea() {
    Box {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("06", fontSize = 48.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(4.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text("February, 2023", fontWeight = FontWeight.SemiBold)
                Text("Monday", fontWeight = FontWeight.SemiBold)
            }
            Spacer(modifier = Modifier.padding(2.dp))
            CircularIcon(
                icon = Icons.Default.Add,
                contentDescription = "add icon",
                backgroundColor = Pallet.blueGrey
            )
        }
    }

}

@RPreview
@Composable
fun HeadAreaPreview(){
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            HeaderArea()
        }
    }
}