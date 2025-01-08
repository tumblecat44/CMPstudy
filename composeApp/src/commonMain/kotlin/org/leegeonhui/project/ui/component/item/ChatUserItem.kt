package org.leegeonhui.project.ui.component.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.leegeonhui.project.ui.component.animation.noRippleClickable
import org.leegeonhui.project.ui.theme.Gray40

@Composable
fun ChatUserItem(
    name: String = "ERROR",
    profile: String = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyB_Y4x_2qADG2TQ2-lR8BB53v9UpL7a2Cjg&s",
    buttonEnabled: Boolean = true,
    onClick: () -> Unit = {},
    onFollowClick: () -> Unit = {},
) {
    Column {
        Row(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 21.dp, top = 15.dp, bottom = 14.dp, end = 15.dp)
                .noRippleClickable { onClick() },

            ) {
            Box {
                Box(
                    modifier = Modifier
                        .size(52.dp)
                        .background(color = Gray40, CircleShape)
                )
//                AsyncImage(
//                    modifier = Modifier
//                        .size(52.dp)
//                        .clip(CircleShape),
//                    model = profile,
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop
//                )
            }
            Box(
                modifier = Modifier
                    .width(170.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 16.dp), text = name,
                    maxLines = 1, overflow = TextOverflow.Ellipsis
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Gray40)
        )
    }
}