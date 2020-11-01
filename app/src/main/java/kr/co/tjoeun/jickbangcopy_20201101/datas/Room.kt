package kr.co.tjoeun.jickbangcopy_20201101.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room(
    val price: Int,
    val address: String,
    val floor:Int,
    val description: String) : Serializable {

//    부가기능(fun) 직접 제작 - 함수를 만들자.
//    1) price값에 따라서 가공된 가격 알려주기. (ex. 2억 8,500 or 3,600)

    fun getFormmatedPrice() : String {

//        price의 값이 1억(10000) 이상? 아닌가? 에 따라 다른 행동.

        if (price >= 10000) {

//            price : 25300, 175000 등 1만보다 큰 상태. 78500
//            결과 : 2억 5,300  , 17억 5,000 => ?억 + 나머지?

            val uk = price / 10000 // 25300 / 10000 = 2, 175000 / 10000 = 17
            val rest = price % 10000 // 25300 % 10000 = 5300

            val commaRest = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            return "${uk}억 ${commaRest}"
        }
        else {

//            8500 등으로 1만이 안되는 경우만 여기서 실행.
//            컴마처리만 해서 바로 결과로지정하자.

            return NumberFormat.getNumberInstance(Locale.KOREA).format(price)
        }

    }

//    2) 층수값에 따라서 몇층인지 알려주기. (ex. 2층, 반지하, 지하 1층)

    fun getFormattedFloor() : String {

//        floor의 값이 1이상, 0, 그 외 (0미만) 냐에 따른 분기 처리
        if (floor >= 1) {
//            1,2,3.. => 1층, 2층, 3층.. => ?층
            return "${floor}층"
        }
        else if (floor == 0) {
//            무조건 "반지하" 결과
            return "반지하"
        }
        else {
//            -1, -2, -3... => 지하 1층, 지하 2층.. => 지하 ?층
            return "지하 ${-floor}층"
        }

    }

}










