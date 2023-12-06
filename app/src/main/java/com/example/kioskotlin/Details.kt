package com.example.kioskotlin

class Details:Size() {
    override var sizeA: String = ""
    override var sizeB: String = ""

    fun burgersize(foods: String) {
        val hasSize = arrayOf("ShackBurger", "SmokeShack", "Cheeseburger", "Hamburger")
        if(foods in hasSize) {
            sizeA = "Single"
            sizeB = "Double"
            println("$sizeA,$sizeB")
        }
    }
}

abstract class Size {
    abstract var sizeA:String
    abstract var sizeB:String
}

abstract class Pay {
    abstract fun price():Int
}

abstract class Menus {
    abstract val menuname:Array<String>
    abstract val numarray:Array<Int>
    abstract fun kioskmenu()
}