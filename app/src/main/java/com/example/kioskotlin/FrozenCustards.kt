package com.example.kioskotlin

class FrozenCustards {
    fun frozencustardsmenu() {
        val fcm = FrozenCustardMenu()
        fcm.kioskmenu()

        var select = readln().toInt()

        if(select !in fcm.numarray) select = 0

        if(select == 0) {
            println("뒤로가기")
        } else {
            menuselected(fcm, select)
            Details().foodsize(fcm.menuname[select - 1])
        }
    }
}