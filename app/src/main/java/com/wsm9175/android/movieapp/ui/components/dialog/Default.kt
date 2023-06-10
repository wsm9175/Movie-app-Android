package com.wsm9175.android.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.wsm9175.android.movieapp.R
import com.wsm9175.android.movieapp.ui.models.dialog.DialogButton
import com.wsm9175.android.movieapp.ui.models.dialog.DialogContent
import com.wsm9175.android.movieapp.ui.models.dialog.DialogText
import com.wsm9175.android.movieapp.ui.models.dialog.DialogTitle


object  DialogPopup

@Composable
fun DialogPopup.Defalut(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
){
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}