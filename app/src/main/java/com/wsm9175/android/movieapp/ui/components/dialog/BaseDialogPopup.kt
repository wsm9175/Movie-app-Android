package com.wsm9175.android.movieapp.ui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.wsm9175.android.movieapp.ui.components.dialog.components.button.DialogButtonsColumn
import com.wsm9175.android.movieapp.ui.components.dialog.components.content.DialogContentWrapper
import com.wsm9175.android.movieapp.ui.components.dialog.components.title.DialogTitleWrapper
import com.wsm9175.android.movieapp.ui.models.dialog.DialogButton
import com.wsm9175.android.movieapp.ui.models.dialog.DialogContent
import com.wsm9175.android.movieapp.ui.models.dialog.DialogText
import com.wsm9175.android.movieapp.ui.models.dialog.DialogTitle
import com.wsm9175.android.movieapp.ui.theme.MovieAppTheme
import com.wsm9175.android.movieapp.ui.theme.Paddings
import com.wsm9175.android.movieapp.ui.theme.colorScheme

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButton>? = null,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = Paddings.none,
        backgroundColor = MaterialTheme.colorScheme.background,
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }

            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let {
                    DialogContentWrapper(it)
                }

                buttons?.let {
                    DialogButtonsColumn(it)
                }
            }
        }
    }
}

@Composable
@Preview
fun BaseDialogPopupPreivew() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("TITLE"),
            dialogContent = DialogContent.Large(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde")
            ),
            buttons = listOf(
                DialogButton.Primary(
                    "Okay"
                ) {

                }
            )
        )
    }
}

@Composable
@Preview
fun BaseDialogPopupPreivew2() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Default(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde")
            ),
            buttons = listOf(
                DialogButton.Secondary("Okay") {},
                DialogButton.UnderlinedText("Cancel") {}
            )
        )
    }
}

@Composable
@Preview
fun BaseDialogPopupPreivew3() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "Jurassic Park",
                    rating = 8.2f
                )
            ),
            buttons = listOf(
                DialogButton.Secondary("Okay") {},
                DialogButton.UnderlinedText("Cancel") {}
            )
        )
    }
}






