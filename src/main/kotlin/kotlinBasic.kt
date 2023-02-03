fun main(args: Array<String>) {
println(add())

}
fun add():Int{
    var x : Int = 0
    ++x
    return x
}
fun follow(followC: Int) =  followC + 1


fun unFollow(followC: Int) =  followC - 1


fun getDetels(followC: Int) = "Follow : $followC"


fun show(followC: Int) = println(getDetels(followC))
fun isEven(number: Int) = number%2 ==0
fun getAgeStage(age: Int)= when (age){
    in -1 downTo Int.MIN_VALUE -> "بعدك مجاي للدنيا"
    in 0..4 -> "رضيع"
    in 5..12 -> "طفل"
    in 13..19 -> "مراهق "
    in 20..39 -> " شاب"
    in 40..59 -> " رجل"
    in 60..120 -> " شايب"
    in 0..Int.MAX_VALUE ->"الله يرحمة جان خوش انسان"
    else -> "دخل عمرك عدك *_^"
}
