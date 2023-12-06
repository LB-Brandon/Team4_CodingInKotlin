package com.example.kioskotlin

class Burgers {
    fun burgermenu() {
        val bm = BurgerMenu()
        bm.kioskmenu()
        var select = readln().toInt()
        if(select !in bm.numarray) select = 0
        when (select) {
            bm.numarray[0] -> {
                menuselected(select)
                Details().burgersize(bm.menuname[select-1])
            }
            bm.numarray[1] -> {
                menuselected(select)
            }
            bm.numarray[2] -> {
                menuselected(select)
            }
            bm.numarray[3] -> {
                menuselected(select)
            }
            bm.numarray[4] -> {
                menuselected(select)
            }
            bm.numarray[5] -> {
                menuselected(select)
            }
            bm.numarray[6] -> {
                println("뒤로가기")
            }
        }
    }
}

fun menuselected(select: Int) {
    println("${BurgerMenu().menuname[select-1]} 선택")
}

