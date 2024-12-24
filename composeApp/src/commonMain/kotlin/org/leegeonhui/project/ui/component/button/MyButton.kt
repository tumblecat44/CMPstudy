package org.leegeonhui.project.ui.component.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import org.leegeonhui.project.ui.component.animation.bounceClick
import org.leegeonhui.project.ui.theme.fontFamily

@Composable
fun MyButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(4.dp),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .bounceClick(
                onClick = onClick
            )
    ) {
        Box(
            modifier = modifier
                .background(
                    color = if (enabled) Color(0xFF242351) else Color(0xFFF5F6F8),
                    shape = shape
                )
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(contentPadding),
                text = text,
                color = if (enabled) White else Color(0xFFCCCCD6),
                style = fontFamily.body2

            )
        }
    }
}

