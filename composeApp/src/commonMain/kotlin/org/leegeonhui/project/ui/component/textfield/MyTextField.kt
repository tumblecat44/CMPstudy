package org.leegeonhui.project.ui.component.textfield

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.leegeonhui.project.ui.theme.Black
import org.leegeonhui.project.ui.theme.ErrorRed
import org.leegeonhui.project.ui.theme.Gray
import org.leegeonhui.project.ui.theme.Gray40
import org.leegeonhui.project.ui.theme.WhiteGray
import org.leegeonhui.project.ui.theme.fontFamily


enum class MyTextFieldState {
    ERROR, DEFAULT, FOCUS
}

@Composable
fun MyTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    info: String = "",
    singleLine: Boolean = true,
    state: MyTextFieldState = MyTextFieldState.DEFAULT,
    maxLines: Int = 1,
    minLines: Int = 1,
    shape: Shape = RoundedCornerShape(4.dp),
) {
    var isFocused by remember { mutableStateOf(state) } // 상태를 Compose에서 관리
    val animBorderColor by animateColorAsState(
        targetValue = when (isFocused) {
            MyTextFieldState.DEFAULT -> WhiteGray
            MyTextFieldState.ERROR -> ErrorRed
            MyTextFieldState.FOCUS -> Gray
        },
        label = "",
    )
    Column(modifier = modifier) {
        if (info.isNotEmpty()) {
            Text(info, style = fontFamily.caption.copy(color = Black, fontSize = 14.sp), color = Gray40)
            Spacer(modifier = Modifier.height(4.dp))
        }
        BasicTextField(modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = animBorderColor, shape = shape)
            .background(WhiteGray, shape = shape)
            .onFocusChanged { focusState ->
                isFocused = if (focusState.isFocused) {
                    MyTextFieldState.FOCUS
                } else {
                    state
                }
            }
            .padding(start = 12.dp)
            .padding(vertical = 12.dp),
            value = value,
            minLines = minLines,
            singleLine = singleLine,
            onValueChange = onValueChange,
            textStyle = fontFamily.body2.copy(color = Black, fontWeight = FontWeight.Medium),
            maxLines = maxLines,
            decorationBox = { innerTextField ->
                if (value.isEmpty()) {
                    Text(
                        modifier = Modifier.padding(start = 2.dp),
                        text = hint,
                        style = fontFamily.body2.copy(color = Black, fontWeight = FontWeight.Medium)

                        ,
                        color = Black
                    )
                }
                innerTextField()
            })
    }

}
