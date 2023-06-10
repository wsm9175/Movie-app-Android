package com.wsm9175.android.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.wsm9175.android.movieapp.ui.models.dialog.DialogButton
import com.wsm9175.android.movieapp.ui.models.dialog.DialogContent
import com.wsm9175.android.movieapp.ui.models.dialog.DialogText
import com.wsm9175.android.movieapp.ui.models.dialog.DialogTitle


@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
){
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            title
        ),
        dialogContent = DialogContent.Large(
                DialogText.Default(
                    bodyText,
            )
        ),
        buttons = buttons
    )
}