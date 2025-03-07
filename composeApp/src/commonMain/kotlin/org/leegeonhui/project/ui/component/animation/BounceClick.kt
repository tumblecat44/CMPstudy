package org.leegeonhui.project.ui.component.animation

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput

internal enum class ButtonState { Idle, Hold }

@Composable
internal fun Modifier.bounceAnimation(
    onChangeButtonState: (ButtonState) -> Unit = {},
    enabled: Boolean = true
): Modifier {
    var buttonState by remember { mutableStateOf(ButtonState.Idle) }
    val scale by animateFloatAsState(
        targetValue = if (buttonState == ButtonState.Idle) 1f else 0.965f,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "",
    )

    return graphicsLayer {
        scaleX = scale
        scaleY = scale
    }
        .pointerInput(buttonState) {
            if (!enabled) return@pointerInput

            awaitPointerEventScope {
                buttonState = if (buttonState == ButtonState.Hold) {
                    waitForUpOrCancellation()
                    ButtonState.Idle
                } else {
                    awaitFirstDown(false)
                    ButtonState.Hold
                }
                onChangeButtonState(buttonState)
            }
        }
}

@Composable
internal fun Modifier.bounceClick(
    interactionSource: MutableInteractionSource? = null,
    onChangeButtonState: (ButtonState) -> Unit = {},
    enabled: Boolean = true,
    onClick: () -> Unit
): Modifier {
    var buttonState by remember { mutableStateOf(ButtonState.Idle) }
    val scale by animateFloatAsState(
        targetValue = if (buttonState == ButtonState.Idle) 1f else 0.965f,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "",
    )

    return clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        onClick = onClick,
    )
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .pointerInput(buttonState) {
            awaitPointerEventScope {
                buttonState = if (buttonState == ButtonState.Hold) {
                    waitForUpOrCancellation()
                    ButtonState.Idle
                } else {
                    awaitFirstDown(false)
                    ButtonState.Hold
                }
                onChangeButtonState(buttonState)
            }
        }
}