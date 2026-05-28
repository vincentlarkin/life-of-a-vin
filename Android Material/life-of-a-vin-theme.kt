package com.example.app.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

private val Obsidian = Color(0xFF030202)
private val VelvetBlack = Color(0xFF090706)
private val CarbonVeil = Color(0xFF11100E)
private val BloodVelvet = Color(0xFF7F0D0D)
private val BrakeLight = Color(0xFFA41212)
private val SignalRed = Color(0xFFFF443D)
private val AntiqueGold = Color(0xFFB08A57)
private val DonGold = Color(0xFFD4A967)
private val TarnishedGold = Color(0xFF5D4015)
private val ChampagneCream = Color(0xFFE7D7B5)
private val SmokeTaupe = Color(0xFF9D8D78)
private val SystemGreen = Color(0xFF39B34A)

private val LifeOfAVinDarkScheme = darkColorScheme(
    primary = DonGold,
    onPrimary = Obsidian,
    primaryContainer = TarnishedGold,
    onPrimaryContainer = ChampagneCream,
    secondary = AntiqueGold,
    onSecondary = Obsidian,
    secondaryContainer = BloodVelvet,
    onSecondaryContainer = ChampagneCream,
    tertiary = BrakeLight,
    onTertiary = ChampagneCream,
    background = Obsidian,
    onBackground = ChampagneCream,
    surface = VelvetBlack,
    onSurface = ChampagneCream,
    surfaceVariant = CarbonVeil,
    onSurfaceVariant = SmokeTaupe,
    outline = AntiqueGold,
    outlineVariant = TarnishedGold,
    error = SignalRed,
    onError = Obsidian,
    errorContainer = BloodVelvet,
    onErrorContainer = ChampagneCream,
    inverseSurface = ChampagneCream,
    inverseOnSurface = Obsidian,
    inversePrimary = BrakeLight,
    scrim = Color.Black
)

private val LifeOfAVinTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        color = ChampagneCream
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.SemiBold,
        color = ChampagneCream
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.SemiBold,
        color = ChampagneCream
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Medium,
        color = DonGold
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        color = ChampagneCream
    )
)

private val LifeOfAVinShapes = Shapes(
    extraSmall = RoundedCornerShape(2.dp),
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(4.dp),
    extraLarge = RoundedCornerShape(4.dp)
)

@Composable
fun LifeOfAVinTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LifeOfAVinDarkScheme,
        typography = LifeOfAVinTypography,
        shapes = LifeOfAVinShapes,
        content = content
    )
}

val LifeOfAVinSuccess = SystemGreen
