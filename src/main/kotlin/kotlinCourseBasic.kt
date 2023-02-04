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
val list =  mutableListOf("a","b","c")
fun main() {
    // local variable jest in function
//    var prices: Double = 7.14
//    println(prices.toString())
//    println(link)
//    println(link.length)
//    println(link.toUpperCase())
//   // println(link.toDouble()) // not run
//    println(link.isEmpty())
//    statmentIf(isBlocked)
//    println(getAgeStageRange(like))
    //loop()
    breakloop()
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
// function to loop
fun loop(){
    for (i in 0 until list.size){
        print(list[i]+"\t")
    }
    println("\n___________________")
    for (elemnt in list){
        print(elemnt+"\t")
    }
    println("\n__________________")
    list.forEach{
        print(it+"\t")
    }
}
fun breakloop(){
    //label and break statement
   loop1@ for (i in 1..5){
        loop2@ for (j in 1..10){
            if (i==2){break@loop1}
            print("${i*j}\t")
        }
        print("\n")
    }
}

