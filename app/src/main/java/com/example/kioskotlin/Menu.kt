package com.example.kioskotlin

class Menu {
    fun menu(num: Int) {
        when(num) {
            1 -> Burgers().burgermenu()
            2 -> FrozenCustards()
            3 -> Drinks()
            4 -> Beer()
        }
    }
}

class KioskMain:Menus() {
    override val menuname = arrayOf<String>("Burgers", "Frozen Custard", "Drinks", "Beer", "종료")
    override val numarray = arrayOf<Int>(1, 2, 3, 4, 0)
    override fun kioskmenu() {
        println("[ SHAKESHACK MENU ]")      // 메뉴 출력 -> KioskMain으로 이동시키기
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | ")
            when (menuname[i]) {
                "Burgers" -> println("항생제와 호르몬제를 사용하지 않은 100% 앵거스 비프 통살을 다져 만든 패티와 쫄깃한 식감의 포테이토 번을 사용한 버거")
                "Frozen Custard" -> println("매일 매장에서 신선하게 직접 만드는 부드럽고 진한 맛의 쫀득한 아이스크림")
                "Drinks" -> println("매장에서 직접 만드는 음료")
                "Beer" -> println("뉴욕 브루클린 브루어리에서 양조한 맥주")
                "종료" -> println("프로그램 종료")
            }
        }
    }
}

class BurgerMenu:Menus() {
    override val menuname = arrayOf<String>("ShackBurger", "SmokeShack", "Shroom Burger", "Shack Stack", "Cheeseburger","Hamburger","뒤로가기")
    override val numarray = arrayOf<Int>(1, 2, 3, 4, 5, 6, 0)
    override fun kioskmenu() {
        println("[ Burgers MENU ]")
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | ")
            when (numarray[i]) {
                1 -> println("토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                2 -> println("애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉑소스가 토핑된 치즈 버거")
                3 -> println("몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거")
                4 -> println("슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴")
                5 -> println("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                6 -> println("포테이토 번과 비프페티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거")
                0 -> println("뒤로가기")
            }
        }
    }
}