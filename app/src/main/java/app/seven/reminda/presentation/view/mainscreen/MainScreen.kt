package app.seven.reminda.presentation.view.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.seven.reminda.presentation.theme.Pallet
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.presentation.view.mainscreen.components.HeaderArea
import app.seven.reminda.presentation.view.mainscreen.components.RColor
import app.seven.reminda.presentation.view.mainscreen.components.ReminderCountArea
import app.seven.reminda.presentation.view.mainscreen.components.TodayReminderHeader
import app.seven.reminda.presentation.view.mainscreen.components.TodayReminderListItem
import app.seven.reminda.util.RPreview

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(horizontal = 8.dp)
    ) {
        item {
            Column {
                HeaderArea()
                Spacer(modifier = Modifier.height(16.dp))
                ReminderCountArea()
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        item {
            TodayReminderHeader()
        }
        items(
            items = (0..5).toList()
        ) {
            Box {
                TodayReminderListItem(
                    index = it + 1,
                    text = "Weekly\nappointments",
                    color = getBackgroundColor(it),
                    previousColor = if (it == 0) RColor(
                        backgroundColor = Color.White,
                        fontColor = Color.Black
                    ) else getBackgroundColor(it - 1)
                )
            }
        }
    }
}

@Composable
fun getBackgroundColor(it: Int): RColor {
    return when {
        it % 2 == 0 -> RColor(backgroundColor = Pallet.cyan, fontColor = Color.Black)
        it % 3 == 0 -> RColor(backgroundColor = Pallet.orange, fontColor = Color.Black)
        else -> RColor(backgroundColor = Pallet.black, fontColor = Color.White)
    }
}

@RPreview
@Composable
fun MainScreenPreview() {
    RemindaTheme(
        darkTheme = true
    ) {
        Surface(color = MaterialTheme.colorScheme.background) {
            MainScreen()
        }
    }
}