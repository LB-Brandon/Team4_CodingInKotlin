package com.example.kioskotlin

import kotlin.random.Random

var moneyrange = Random.nextInt(50000,100001)

class Buy {
    fun payprice(myMoney:Int,foodSelected:String, upgrade:Int):Int {
        var money = myMoney
        var price = 0
        if(upgrade == 1) {
            price = ItemPrice().sizeup(foodSelected)
        } else if( upgrade == 0 ) {
            price = ItemPrice().price(foodSelected)
        }
        println("소지금 : $money")
        myMoney.run {
            if(money >= price) {
                println("[${foodSelected} 구매 중]: [${money} - ${price}] = ${money - price}")
                money -= price
                println("$foodSelected 구매완료.")
            } else {
                println("돈이 부족합니다.")
            }
        }
        moneyrange = money
        return money
    }
}