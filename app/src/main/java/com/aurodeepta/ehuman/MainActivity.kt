package com.aurodeepta.ehuman

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    EHumanApp()
                }
            }
        }
    }
}

@Composable
fun EHumanApp() {
    // TODO: Full implementation coming in next files
    androidx.compose.material3.Text("eHuman - Initial Setup Complete")
}

@Preview
@Composable
fun PreviewEHumanApp() {
    EHumanApp()
}