package org.leegeonhui.project.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.leegeonhui.project.ui.component.button.MyButton
import org.leegeonhui.project.root.NavGroup
import org.leegeonhui.project.ui.theme.fontFamily

@Composable
fun MainScreen(
    navHostController: NavHostController
) {
    var idTextField by remember {
        mutableStateOf("")
    }

    val verticalScroll = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()){
        Spacer(modifier = Modifier.weight(0.3f))
        Text(modifier = Modifier.align(Alignment.CenterHorizontally).padding(start = 24.dp), text = "채팅 어플리케이션", style = fontFamily.h1)
        Spacer(modifier = Modifier.height(12.dp))

        Text(modifier = Modifier.align(Alignment.CenterHorizontally).padding(start = 24.dp), text = "With Compose Multiplatform", style = fontFamily.h1)

        Spacer(modifier = Modifier.height(26.dp))
        MyButton(
            modifier = Modifier.align(Alignment.CenterHorizontally).width(180.dp),
            text = "로그인",
            enabled = true,
            contentPadding = PaddingValues(vertical = 14.dp, horizontal = 23.dp),
            onClick = {
                navHostController.navigate(NavGroup.LOGIN)
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        MyButton(
            modifier = Modifier.align(Alignment.CenterHorizontally).width(180.dp),
            text = "회원가입",
            enabled = false,
            contentPadding = PaddingValues(vertical = 14.dp, horizontal = 23.dp),
            onClick = {  }
        )
        Spacer(modifier = Modifier.weight(0.6f))

    }
}



