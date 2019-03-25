package com.postbox.kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter object's length:")
    val length = scanner.nextFloat()
    print("Please enter object's width:")
    val width = scanner.nextFloat()
    print("Please enter object's height:")
    val height = scanner.nextFloat()
    val box3 = Box3()
    val box5 = Box5()
    if (box3.comparison(length, width, height)) {
        println("Box3")
    } else {
        if (box5.comparison(length, width, height)) {
            println("Box5")
        } else {
            println("都不符合!")
        }
    }
}
open class Box(var length:Float,var width:Float, var height:Float) {
    open fun comparison(length: Float, width: Float, height: Float): Boolean {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true
        } else {
            return false
        }
    }
}

class Box3:Box(23f,14f,13f){

}

class Box5:Box(39.5f,27.5f,23f){

}
