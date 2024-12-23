package org.leegeonhui.project.ui.theme


import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import iamfullstack.composeapp.generated.resources.Res
import iamfullstack.composeapp.generated.resources.pretendard_bold
import iamfullstack.composeapp.generated.resources.pretendard_extrabold
import iamfullstack.composeapp.generated.resources.pretendard_extralight
import iamfullstack.composeapp.generated.resources.pretendard_medium
import iamfullstack.composeapp.generated.resources.pretendard_regular
import iamfullstack.composeapp.generated.resources.pretendard_semibold
import iamfullstack.composeapp.generated.resources.pretendard_thin
import org.jetbrains.compose.resources.Font

val fontFamily
    @Composable
    get() = Typography().run {
        val fontFamily = FontFamily(
            Font(
                Res.font.pretendard_bold,
                weight = FontWeight.Bold,
            ),
            Font(
                Res.font.pretendard_regular,
                weight = FontWeight.Normal,
            ),
            Font(
                Res.font.pretendard_extrabold,
                weight = FontWeight.ExtraBold,
            ),
            Font(
                Res.font.pretendard_extralight,
                weight = FontWeight.ExtraLight,
            ),
            Font(
                Res.font.pretendard_extralight,
                weight = FontWeight.Light,
            ),
            Font(
                Res.font.pretendard_medium,
                weight = FontWeight.Medium,
            ),
            Font(
                Res.font.pretendard_semibold,
                weight = FontWeight.SemiBold,
            ),
            Font(
                Res.font.pretendard_thin,
                weight = FontWeight.Thin,
            ),
        )

        copy(
            h1 = h1.copy(
                lineHeight = 52.17.sp,
                fontSize = 40.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
            ),
            h2 = h2.copy(
                lineHeight = 52.17.sp,
                fontSize = 40.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
            ),
            h3 = h3.copy(fontFamily = fontFamily),
            h4 = h4.copy(fontFamily = fontFamily),
            h5 = h5.copy(fontFamily = fontFamily),
            h6 = h6.copy(fontFamily = fontFamily),
            subtitle1 = subtitle1.copy(
                fontFamily = fontFamily,
                color = Color(0xFF9A70E2),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            ),
            subtitle2 = subtitle2.copy(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF9A70E2),
            ),
            body1 = body1.copy(fontFamily = fontFamily),
            body2 = body2.copy(fontFamily = fontFamily),
            button = button.copy(
                fontFamily = fontFamily,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                letterSpacing = 0.sp,
            ),
            caption = caption.copy(
                fontFamily = fontFamily,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                fontSize = 26.sp,
                lineHeight = 34.sp
            ),
            overline = overline.copy(
                fontFamily = fontFamily,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                lineHeight = 26.5.sp
            )
        )
    }

val fontFamilyMobile
    @Composable
    get() = Typography().run {
        val fontFamily = FontFamily(
            Font(
                Res.font.pretendard_bold,
                weight = FontWeight.Bold,
            ),
            Font(
                Res.font.pretendard_regular,
                weight = FontWeight.Normal,
            ),
            Font(
                Res.font.pretendard_extrabold,
                weight = FontWeight.ExtraBold,
            ),
            Font(
                Res.font.pretendard_extralight,
                weight = FontWeight.ExtraLight,
            ),
            Font(
                Res.font.pretendard_extralight,
                weight = FontWeight.Light,
            ),
            Font(
                Res.font.pretendard_medium,
                weight = FontWeight.Medium,
            ),
            Font(
                Res.font.pretendard_semibold,
                weight = FontWeight.SemiBold,
            ),
            Font(
                Res.font.pretendard_thin,
                weight = FontWeight.Thin,
            ),
        )

        copy(
            h1 = h1.copy(
                lineHeight = 33.sp,
                fontSize = 24.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                color = Black,
            ),
            h2 = h2.copy(
                lineHeight = 52.17.sp,
                fontSize = 40.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
            ),
            h3 = h3.copy(fontFamily = fontFamily),
            h4 = h4.copy(fontFamily = fontFamily),
            h5 = h5.copy(fontFamily = fontFamily),
            h6 = h6.copy(fontFamily = fontFamily),
            subtitle1 = subtitle1.copy(
                fontFamily = fontFamily,
                color = Color(0xFF9A70E2),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                lineHeight = 21.sp,
                letterSpacing = 0.16.sp,
            ),
            subtitle2 = subtitle2.copy(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                lineHeight = 21.sp,
                color = Color.Black,
                letterSpacing = 0.14.sp
            ),
            body1 = body1.copy(fontFamily = fontFamily),
            body2 = body2.copy(fontFamily = fontFamily),
            button = button.copy(
                fontFamily = fontFamily,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                letterSpacing = 0.sp,
            ),
            caption = caption.copy(
                fontFamily = fontFamily,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.sp
            ),
            overline = overline.copy(
                fontFamily = fontFamily,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                lineHeight = 26.5.sp
            )
        )
    }