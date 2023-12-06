package com.example.kioskotlin

import kotlin.random.Random

fun main() {
    while (true) {
        val km = KioskMain()
        km.kioskmenu()
        val select = readln().toInt()
        if(select !in km.numarray) {
            println("번호를 다시 입력하세요.")
            continue
        } else if (select == 0) {
            println("프로그램 종료")
            break
        }
        Menu().menu(select)
    }
}



