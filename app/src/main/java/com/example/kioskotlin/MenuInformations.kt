package com.example.kioskotlin

class KioskMenu:Menus() {
    override val menuname = arrayOf("Burgers", "Frozen Custard", "Drinks", "Beer", "종료")
    override val numarray = arrayOf(1, 2, 3, 4, 0)
    override fun kioskmenu() {
        println("[ SHAKESHACK MENU ]")      // 메뉴 출력 -> KioskMain으로 이동시키기
        for (i in menuname.indices)
        {
            print("${numarray[i]}. ${menuname[i]} | ")
            when (numarray[i]) {
                1 -> println("항생제와 호르몬제를 사용하지 않은 100% 앵거스 비프 통살을 다져 만든 패티와 쫄깃한 식감의 포테이토 번을 사용한 버거")
                2 -> println("매일 매장에서 신선하게 직접 만드는 부드럽고 진한 맛의 쫀득한 아이스크림")
                3 -> println("매장에서 직접 만드는 음료")
                4 -> println("뉴욕 브루클린 브루어리에서 양조한 맥주")
                0 -> println("프로그램 종료")
            }
        }
    }
}

class BurgerMenu:Menus() {
    override val menuname = arrayOf("ShackBurger", "SmokeShack", "Shroom Burger", "Shack Stack", "Cheeseburger","Hamburger","뒤로가기")
    override val numarray = arrayOf(1, 2, 3, 4, 5, 6, 0)
    override fun kioskmenu() {
        println("[ Burgers MENU ]")
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | W ${ItemPrice().price(menuname[i])} ")
            if(ItemPrice().sizeup(menuname[i]) != 0) {
                print("/ W ${ItemPrice().sizeup(menuname[i])} ")
            }
            when (numarray[i]) {
                1 -> println("| 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                2 -> println("| 애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉑소스가 토핑된 치즈 버거")
                3 -> println("| 몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거")
                4 -> println("| 슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴")
                5 -> println("| 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                6 -> println("| 포테이토 번과 비프페티를 기본으로 신선한 양상추, 토마토 피클, 양파 토핑을 취향에 따라 선택할 수 있는 버거")
                0 -> println("뒤로가기")
            }

        }
    }
}

class FrozenCustardMenu:Menus() {
    override val menuname = arrayOf("Shakes", "Shake of the Week", "Red Bean Shake", "Floats", "Cups & Cones", "Concretes", "Shack Attack","뒤로가기")
    override val numarray = arrayOf(1, 2, 3, 4, 5, 6, 7, 0)
    override fun kioskmenu() {
        println("[ Frozen Custard MENU ]")
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | W ${ItemPrice().price(menuname[i])} ")
            if(ItemPrice().sizeup(menuname[i]) != 0) {
                print("/ W ${ItemPrice().sizeup(menuname[i])} ")
            }
            when (numarray[i]) {
                1 -> println("바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피")
                2 -> println("특별한 커스터드 플레이버")
                3 -> println("신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
                4 -> println("루트 비어, 퍼플 카우, 크림 시클")
                5 -> println("바닐라, 초콜렛, Flavor of the Week")
                6 -> println("쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
                7 -> println("초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드")
                0 -> println("뒤로가기")
            }
        }
    }
}


class DrinksMenu:Menus() {
    override val menuname = arrayOf("Shack-made Lemonade", "Fresh Brewed Iced Tea", "Fifty/Fifty", "Fountain Soda", "Abita Root Beer", "Bottled Water","뒤로가기")
    override val numarray = arrayOf(1, 2, 3, 4, 5, 6, 0)
    override fun kioskmenu() {
        println("[ Drinks MENU ]")
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | W ${ItemPrice().price(menuname[i])} ")
            if(ItemPrice().sizeup(menuname[i]) != 0) {
                print("/ W ${ItemPrice().sizeup(menuname[i])} ")
            }
            when (numarray[i]) {
                1 -> println("매장에서 직접 만드는 상큼한 레몬에이드(오리지널/시즈널)")
                2 -> println("직접 유기농 홍차를 우려낸 아이스티")
                3 -> println("레몬에이드와 아이스티의 만남")
                4 -> println("코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
                5 -> println("청량감 있는 독특한 미국식 무알콜 탄산음료")
                6 -> println("지리산 암반대수층으로 만든 프리미엄 생수")
                0 -> println("뒤로가기")
            }
        }
    }
}

class BeerMenu:Menus() {
    override val menuname = arrayOf("ShackMeister Ale", "Magpie Brewing Co.", "뒤로가기")
    override val numarray = arrayOf(1, 2, 0)
    override fun kioskmenu() {
        println("[ Beer MENU ]")
        for (i in menuname.indices) {
            print("${numarray[i]}. ${menuname[i]} | W ${ItemPrice().price(menuname[i])} ")
            if(ItemPrice().sizeup(menuname[i]) != 0) {
                print("/ W ${ItemPrice().sizeup(menuname[i])} ")
            }
            when (numarray[i]) {
                1 -> println("쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
                2 -> println("Magpie Brewing Co.")
                0 -> println("뒤로가기")
            }
        }
    }
}