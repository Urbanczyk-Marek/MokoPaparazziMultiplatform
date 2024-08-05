package org.example.bug

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class AppTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun testApp() {
        paparazzi.snapshot {
            App()
        }
    }
}