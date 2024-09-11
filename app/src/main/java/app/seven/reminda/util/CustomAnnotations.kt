package app.seven.reminda.util

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.FUNCTION
)
@Preview(
    name = "Light mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true
)
@Preview(
    name = "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true
)
annotation class RPreview()