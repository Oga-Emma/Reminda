package app.seven.reminda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import app.seven.reminda.presentation.screens.editorscreen.EditorScreen
import app.seven.reminda.presentation.theme.RemindaTheme
import app.seven.reminda.presentation.screens.mainscreen.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            RemindaTheme(
                darkTheme = true
            ) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EditorScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}