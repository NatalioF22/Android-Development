package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class Item(
    val title: String,
    val route: String,
    val icon: ImageVector,
    val color: Color
)

val bottomItem = listOf(
    Item("Home", "Home", Icons.Filled.Home, Color.Green),
    Item("Menu", "Menu", Icons.Filled.Fastfood, Color.Blue),
    Item("Account", "Account", Icons.Filled.ManageAccounts, Color.Yellow),
    Item("Rewards", "Rewards", Icons.Filled.Star, Color.Magenta)
)

val topItem = listOf(
    Item("Cart", "Cart", Icons.Filled.AddShoppingCart, Color.DarkGray),
    Item("Settings", "Settings", Icons.Filled.Build, Color.LightGray)
)


