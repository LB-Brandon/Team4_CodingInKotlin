package com.example.kioskotlin

class Beer {
    fun beermenu() {
        val bm = BeerMenu()
        bm.kioskmenu()
        var select = readln().toInt()

        if(select !in bm.numarray) select = 0

        if(select == 0) {
            println("뒤로가기")
        } else {
            menuselected(bm, select)
            Details().foodsize(bm.menuname[select - 1])
        }
    }
}