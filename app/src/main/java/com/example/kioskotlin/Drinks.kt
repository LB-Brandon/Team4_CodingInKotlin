package com.example.kioskotlin

class Drinks {
    fun drinksmenu() {
        val dm = DrinksMenu()
        dm.kioskmenu()

        var select = readln().toInt()

        if(select !in dm.numarray) select = 0

        if(select == 0) {
            println("뒤로가기")
        } else {
            menuselected(dm, select)
            Details().foodsize(dm.menuname[select - 1])
        }
    }
}