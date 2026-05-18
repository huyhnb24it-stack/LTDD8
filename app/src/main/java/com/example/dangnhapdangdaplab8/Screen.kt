package com.example.dangnhapdangdaplab8

sealed class Screen(val rout: String) {
    object Signin : Screen("signin")
    object Signup : Screen("signup")
    object Home : Screen("home")
}