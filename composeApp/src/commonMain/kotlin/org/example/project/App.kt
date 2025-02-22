package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.multiplatform.webview.web.WebViewNavigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewNavigator
import com.multiplatform.webview.web.rememberWebViewState

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navigator = rememberWebViewNavigator()
        BrowserContent(navigator, "https://www.google.com/")
    }
}

@Composable
fun BrowserContent(
    navigator: WebViewNavigator,
    url: String
) {
    val webViewState = rememberWebViewState(url)
    Column(Modifier.fillMaxSize()) {
        WebView(
            state = webViewState,
            navigator = navigator,
            modifier = Modifier.fillMaxSize()
        )
    }
}