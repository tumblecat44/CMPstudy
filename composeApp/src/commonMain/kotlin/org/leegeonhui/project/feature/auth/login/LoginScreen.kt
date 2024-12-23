package org.leegeonhui.project.feature.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.leegeonhui.project.ui.component.MyTopAppBar
import org.leegeonhui.project.ui.component.TopAppBarType
import org.leegeonhui.project.ui.component.button.MyButton
import org.leegeonhui.project.ui.component.textfield.MyTextField
import org.leegeonhui.project.ui.component.textfield.MyTextFieldState
import org.leegeonhui.project.ui.theme.White

@Composable
fun LoginScreen(
    navHostController: NavHostController
) {
    var idText by remember { mutableStateOf("") }
    var pwText by remember { mutableStateOf("") }
    var idError by remember { mutableStateOf(MyTextFieldState.DEFAULT) }
    var pwError by remember { mutableStateOf(MyTextFieldState.DEFAULT) }
    val verticalScroll = rememberScrollState()
    MyTopAppBar(
        modifier = Modifier.imePadding(),
        type = TopAppBarType.SMALL,
        onBackClick = {navHostController.popBackStack()},
        title = "로그인",
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(White)
                .padding(paddingValues)
                .verticalScroll(verticalScroll)
        ) {
            Column(modifier = Modifier.padding(bottom = 200.dp).width(400.dp).align(Alignment.Center).height(400.dp)){
                MyTextField(
                    value = idText,
                    onValueChange = {
                        idText = it
                        idError = MyTextFieldState.DEFAULT
                    },
                    state = idError,
                    info = "이메일",
                    hint = ""
                )
                Spacer(Modifier.height(8.dp))
                MyTextField(
                    value = pwText,
                    info = "비밀번호",
                    onValueChange = { pwText = it
                        pwError = MyTextFieldState.DEFAULT},
                    hint = ""
                )
                Spacer(modifier = Modifier.weight(1f))
                MyButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    text = "시작하기",
                    onClick = {
                        idError = MyTextFieldState.ERROR
                        pwError = MyTextFieldState.ERROR
                    },
                    contentPadding = PaddingValues(vertical = 17.5.dp)
                )
            }

        }

    }
}