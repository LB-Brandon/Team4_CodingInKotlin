package com.example.kioskotlin

class ItemPrice {
    fun price(food:String):Int {
        return when (food) {
            "ShackBurger" -> 6900
            "SmokeShack" -> 8900
            "Shroom Burger" -> 9400
            "Shack Stack" -> 12400
            "Cheeseburger" -> 6900
            "Hamburger" -> 5400
            "Shakes" -> 5900
            "Shake of the Week" -> 6500
            "Red Bean Shake" -> 6500
            "Floats" -> 5900
            "Cups & Cones" -> 4900
            "Concretes" -> 5900
            "Shack Attack" -> 5900
            "Shack-made Lemonade" -> 3900
            "Fresh Brewed Iced Tea" -> 3400
            "Fifty/Fifty" -> 3500
            "Fountain Soda" -> 2700
            "Abita Root Beer" -> 4400
            "Bottled Water" -> 1000
            "ShackMeister Ale" -> 9800
            "Magpie Brewing Co." -> 6800
            else -> 0
        }
    }
    fun sizeup(food:String):Int {
        return when(food) {
            "ShackBurger" -> 10900
            "SmokeShack" -> 12900
            "Cheeseburger" -> 10900
            "Hamburger" -> 9000
            "Cups & Cones" -> 5900
            "Concretes" -> 8900
            "Shack-made Lemonade" -> 4500
            "Fresh Brewed Iced Tea" -> 3900
            "Fifty/Fifty" -> 4400
            "Fountain Soda" -> 3300
            else -> 0
        }
    }
}