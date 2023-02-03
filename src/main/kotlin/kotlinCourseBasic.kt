/**
 * 01 kotlin variable
 *
 */
// global variable
val link :String = "www.masaso.com"
var like : Int = 6
var price :Float = 3.4f
var city: String? = null
var isBlocked  = true

fun main() {
    // local variable jest in function
    var prices: Double = 7.14
    println(prices.toString())
    println(link)
    println(link.length)
    println(link.toUpperCase())
   // println(link.toDouble()) // not run
    println(link.isEmpty())
    statmentIf(isBlocked)
    println(getAgeStageRange(like))
}

fun statmentIf(isBlock:Boolean){
    if (isBlock){
        println("uesr is blocked")
    }else {
        println("user is not blocked")
    }
}
fun getAgeStageRange(age: Int):String{
     var result = when (age){
        in -1 downTo Int.MIN_VALUE -> "بعدك مجاي للدنيا"
        in 0..4 -> "رضيع"
        in 5..12 -> "طفل"
        in 13..19 -> "مراهق "
        in 20..39 -> " شاب"
        in 40..59 -> " رجل"
        in 60..120 -> " شايب"
        in 121..Int.MAX_VALUE ->"الله يرحمة جان خوش انسان"
        else -> "دخل عمرك عدك *_^"
    }
    return result
}