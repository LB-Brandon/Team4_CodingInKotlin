package com.example.kioskotlin

fun main() {
    while (true) {
        val km = KioskMenu()
        km.kioskmenu()

        try {
            val select = readln().toInt()

            if (select !in km.numarray) {
                println("번호를 다시 입력하세요.")
                continue
            } else if (select == 0) {
                println("프로그램 종료")
                break
            }

            Menu().menu(select)
        } catch (e: Exception) {
            println("숫자를 입력해 주세요.")
        }
    }
}



