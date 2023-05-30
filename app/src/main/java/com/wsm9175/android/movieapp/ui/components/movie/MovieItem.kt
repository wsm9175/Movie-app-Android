package com.wsm9175.android.movieapp.ui.components.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wsm9175.android.movieapp.R
import com.wsm9175.android.movieapp.ui.theme.Paddings

private val CARD_WIDTH = 150.dp
private val ICON_SIZE = 12.dp

@Composable
fun MovieItem() {
    Column(
        modifier = Modifier
            .padding(Paddings.large)
            .width(CARD_WIDTH)
    ) {
        Poster(
            modifier = Modifier
                .width(CARD_WIDTH)
        )

        Text(
            text = "The Load the Ring 1",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,  //글자의 길이가 Text의 길이 보다 길 경우 ... 처리
            modifier = Modifier.padding(
                top = Paddings.large
            ),
            style = MaterialTheme.typography.body2,
        )

        Row(
            modifier = Modifier.padding(
                vertical = Paddings.medium
            ),
            //alignment - 컨테이너의 수직 방향 정렬 방식, arrangement - 수평 방향 배치
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .padding(Paddings.small)
                    .size(ICON_SIZE),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_rating),
                tint = Color.Black.copy(
                    alpha = 0.5f,
                ),
                contentDescription = "rating icon"
            )
            Text(
                text = "5.0",
                style = MaterialTheme.typography.body2,
                color  = MaterialTheme.colors.onSurface.copy(
                    alpha = 0.5f
                )
            )
        }
    }
}

@Composable
fun Poster(
    modifier: Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Box(
            modifier = Modifier.background(Color.Blue)
        )
    }
}

@Preview
@Composable
fun MovieItemPreview() {
    MovieItem()
}
