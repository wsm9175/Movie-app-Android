package com.wsm9175.android.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.wsm9175.android.movieapp.ui.models.dialog.DialogButton
import com.wsm9175.android.movieapp.ui.models.dialog.DialogContent
import com.wsm9175.android.movieapp.ui.models.dialog.DialogText
import com.wsm9175.android.movieapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    movieName: String,
    rating: Float,
    buttons: List<DialogButton>
){
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your Score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = movieName,
                rating = rating
            )
        ),
        buttons = buttons
    )
}