package com.wsm9175.android.movieapp.ui.models.dialog

// 보여지는 방식
sealed class DialogContent {
    data class Default(
        val dialogText: DialogText.Default
    ) : DialogContent()

    data class Large(
        val dialogText: DialogText.Default
    ) : DialogContent()

    data class Rating(
        val dialogText: DialogText.Rating
    ) : DialogContent()
}
