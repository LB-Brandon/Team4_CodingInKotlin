package com.example.kioskotlin

class Details {
    val buy = Buy()
    fun burgersize(foods: String) {
        val up = upgrade(foods)
        if(up == 1) {
            println("$foods 업그레이드")
            buy.payprice(moneyrange,foods,1)
        } else if(up == 0) {
            println("$foods 구매")
            buy.payprice(moneyrange,foods,0)
        }
    }
}

class Pay {
    fun price(food:String):Int {
        return when (food) {
            "ShackBurger" -> 6900
            "SmokeShack" -> 8900
            "Shroom Burger" -> 9400
            "Shack Stack" -> 12400
            "Cheeseburger" -> 6900
            "Hamburger" -> 5400
            else -> 0
        }
    }
    fun sizeup(food:String):Int {
        return when(food) {
            "ShackBurger" -> 10900
            "SmokeShack" -> 12900
            "Cheeseburger" -> 10900
            "Hamburger" -> 9000
            else -> 0
        }
    }
}
fun single(foods:String) {
    println("Single : ${Pay().price(foods)}W")
}
fun double(foods:String) {
    println("Single : ${Pay().price(foods)}W, Double : ${Pay().sizeup(foods)}W")
}

fun upgrade(food:String):Int {
    var upgrade = 0
    when(food) {
        "ShackBurger" -> {
            double(food)
            println("버거를 업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
        "SmokeShack" -> {
            double(food)
            println("버거를 업그레이드 하시겠습니까? yes = 1, no = 0")
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
            println("버거를 업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
        "Hamburger" -> {
            double(food)
            println("버거를 업그레이드 하시겠습니까? yes = 1, no = 0")
            upgrade = readln().toInt()
        }
    }
    return upgrade
}
abstract class Menus {
    abstract val menuname:Array<String>
    abstract val numarray:Array<Int>
    abstract fun kioskmenu()
}