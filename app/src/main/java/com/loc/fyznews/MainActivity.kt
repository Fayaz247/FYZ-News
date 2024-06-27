package com.loc.fyznews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.loc.fyznews.presentation.onboarding.OnboardingScreen
import com.loc.fyznews.presentation.onboarding.components.OnboardingPage
import com.loc.fyznews.ui.theme.FYZNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            FYZNewsTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)){
                    OnboardingScreen()
                }
            }
        }
    }
}
