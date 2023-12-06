package com.example.kioskotlin

import kotlin.random.Random

var moneyrange = Random.nextInt(50000,100001)

class Buy {
    fun payprice(myMoney:Int,foodSelected:String, upgrade:Int):Int {
        var money = myMoney
        var values = money
        var price = 0
        if(upgrade == 1) {
            price = Pay().sizeup(foodSelected)
        } else if( upgrade == 0 ) {
            price = Pay().price(foodSelected)
        }
        println("소지금 : $money")
        myMoney?.run {
            if(money >= price) {
                println("[${foodSelected} 구매 중]: [${money} - ${price}] = ${money - price}")
                money -= price
                println("$foodSelected 구매완료.")
                values = money
            } else {
                println("돈이 부족합니다.")
                values = -1
            }
        }
        moneyrange = money
        return values
    }
}