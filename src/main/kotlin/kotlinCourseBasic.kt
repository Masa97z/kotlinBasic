/**
 * 01 kotlin variable
 *
 */
// global variable
val link :String = "www.masaso.com"
var like : Int = 6
var price :Float = 3.4f
var city: String? = null

fun main() {
    // local variable jest in function
    var prices: Double = 7.14
    println(prices.toString())
    println(link)
    println(link.length)
    println(link.toUpperCase())
   // println(link.toDouble()) // not run
    println(link.isEmpty())
}