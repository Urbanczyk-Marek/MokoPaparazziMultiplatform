package org.example.bug

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import dev.icerock.moko.resources.desc.desc

@Composable
@Preview
fun App() {
    MaterialTheme {
        Text(text = MR.strings.foo_key.desc().toString(LocalContext.current))
    }
}
