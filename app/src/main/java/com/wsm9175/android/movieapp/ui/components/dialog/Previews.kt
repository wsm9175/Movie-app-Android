package com.wsm9175.android.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wsm9175.android.movieapp.R
import com.wsm9175.android.movieapp.ui.models.buttons.LeadingIconData
import com.wsm9175.android.movieapp.ui.models.dialog.DialogButton
import com.wsm9175.android.movieapp.ui.theme.MovieAppTheme

@Preview
@Composable
fun AlertPreview(){
    MovieAppTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blah blah blah",
            buttons = listOf(
                DialogButton.UnderlinedText("Okay"){},
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview(){
    MovieAppTheme {
        DialogPopup.Defalut(
            title = "Title",
            bodyText = "blah blah blah",
            buttons = listOf(
                DialogButton.UnderlinedText("Okay"){},
                DialogButton.UnderlinedText("CANCEL"){},
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview(){
    MovieAppTheme {
        DialogPopup.Rating(
            movieName = "The Lord of the Rings",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ),
                DialogButton.SecondaryBorderless("CANCEL")
            )
        )
    }
}