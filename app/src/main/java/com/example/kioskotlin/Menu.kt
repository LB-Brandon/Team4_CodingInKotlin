package com.example.kioskotlin

class Menu {
    fun menu(num: Int) {
        when(num) {
            1 -> Burgers().burgermenu()
            2 -> FrozenCustards().frozencustardsmenu()
            3 -> Drinks().drinksmenu()
            4 -> Beer().beermenu()
        }
    }
}

fun menuselected(menunames:Menus, select: Int) {
    println("${menunames.menuname[select-1]} 선택")
}

abstract class Menus {
    abstract val menuname:Array<String>
    abstract val numarray:Array<Int>
    abstract fun kioskmenu()
}