package com.phoenixredwolf.testtracker.utility

fun getName(str: String): String {
    var list = str.split("/")
    var name = list.last().replace("_", " ")
    return name
}