package com.loc.fyznews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.fyznews.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Title of the first Page",
        description = "This is the description text of the first onboarding page",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Title of the second Page",
        description = "This is the description text of the second onboarding page",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Title of the third Page",
        description = "This is the description text of the third onboarding page",
        image = R.drawable.onboarding3
    )

)
