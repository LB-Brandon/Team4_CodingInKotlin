package com.example.kioskotlin

class Burgers {
    fun burgermenu() {
        val bm = BurgerMenu()
        bm.kioskmenu()
        var select = readln().toInt()
        if(select !in bm.numarray) select = 0
        if(select == 0) {
            println("뒤로가기")
        } else {
            menuselected(select)
            Details().burgersize(bm.menuname[select - 1])
        }
    }
}

fun menuselected(select: Int) {
    println("${BurgerMenu().menuname[select-1]} 선택")
}
