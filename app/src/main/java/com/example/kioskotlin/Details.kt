package com.example.kioskotlin

class Details {
    fun foodsize(foods: String) {
        val up = upgrade(foods)
        if(up == 1) {
            println("$foods 업그레이드")
            Buy().payprice(moneyrange,foods,1)
        } else if(up == 0) {
            Buy().payprice(moneyrange,foods,0)
        }
    }
}

fun single(foods:String) {
    println("Normal : ${ItemPrice().price(foods)} W")
}
fun double(foods:String) {
    println("Normal : ${ItemPrice().price(foods)} W, Upgrade : ${ItemPrice().sizeup(foods)} W")
}

fun upgrade(food:String):Int {
    var upgrade = 0
    when(food) {
        "ShackBurger" -> {
            double(food)
            println("업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
        "SmokeShack" -> {
            double(food)
            println("업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
        "Shroom Burger" -> {
            single(food)
            upgrade = 0
        }
        "Shack Stack" -> {
            single(food)
            upgrade = 0
        }
        "Cheeseburger" -> {
            double(food)
            println("업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
        "Hamburger" -> {
            double(food)
            println("업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
    }
    return upgrade
}
