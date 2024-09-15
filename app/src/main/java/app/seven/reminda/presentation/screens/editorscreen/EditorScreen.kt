package app.seven.reminda.presentation.screens.editorscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import app.seven.reminda.presentation.components.CircularIcon
import app.seven.reminda.presentation.components.RAppBar
import app.seven.reminda.presentation.components.RColor
import app.seven.reminda.presentation.components.TextCard
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.util.RPreview

@Composable
fun EditorScreen(
    modifier: Modifier = Modifier
) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        RAppBar(
            title = "February, 2023",
            trailing = {
                CircularIcon(
                    icon = Icons.Default.Check,
                    contentDescription = "add icon",
                    backgroundColor = Pallet.cyan
                )
            }
        )
        Spacer(modifier = Modifier.size(24.dp))
        TextCard(
            text = "March 08, 2023",
            leadingIcon = Icons.Default.DateRange,
            color = RColor(backgroundColor = Pallet.orange, fontColor = Color.Black)
        )
        Spacer(modifier = Modifier.size(12.dp))
        TextCard(
            text = "Select Time",
            leadingIcon = Icons.Default.DateRange,
            color = RColor(backgroundColor = Pallet.cyan, fontColor = Color.Black)
        )
        Spacer(modifier = Modifier.size(12.dp))
        TextCard(
            text = "Priority",
            leadingIcon = Icons.Default.DateRange,
            color = RColor(backgroundColor = Color.White, fontColor = Color.Black)
        )
        Spacer(modifier = Modifier.size(12.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .background(
                    color = Pallet.blueGrey,
                    shape = RoundedCornerShape(24.dp)
                )
        ) {
            Column(
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                val color = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                )
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    colors = color,
                    value = title,
                    placeholder = {
                        Text("Add Title...")
                    },
                    onValueChange = { title = it }
                )
                HorizontalDivider()
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = description,
                    colors = color,
                    placeholder = {
                        Text("Add Description...")
                    },
                    onValueChange = { description = it }
                )
            }
        }
        Spacer(modifier = Modifier.size(12.dp))
        Box(
            modifier = Modifier
                .background(
                    color = Pallet.blueGrey,
                    shape = RoundedCornerShape(24.dp)
                ).fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text("Add Hashtags", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@RPreview
@Composable
fun EditorScreenPreview() {
    RemindaTheme {
        Surface(color = MaterialTheme.colorScheme.background) {

            EditorScreen()
        }
    }
}