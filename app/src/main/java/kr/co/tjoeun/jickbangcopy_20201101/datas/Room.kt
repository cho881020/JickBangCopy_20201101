package kr.co.tjoeun.jickbangcopy_20201101.datas

class Room(
    val price: Int,
    val address: String,
    val floor:Int,
    val description: String) {

//    부가기능(fun) 직접 제작 - 함수를 만들자.
//    1) price값에 따라서 가공된 가격 알려주기. (ex. 2억 8,500 or 3,600)

    fun getFormmatedPrice() : String {

//        price의 값이 1억(10000) 이상? 아닌가? 에 따라 다른 행동.

        if (price >= 10000) {
            return "1억 이상"
        }
        else {
            return "1억이 안됨"
        }

    }

//    2) 층수값에 따라서 몇층인지 알려주기. (ex. 2층, 반지하, 지하 1층)

}










