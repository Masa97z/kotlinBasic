fun main(args: Array<String>) {
    val friendsNameList = listOf("a","a","b")
    println(findRepetition(friendsNameList))


}

fun solution(l: MutableList<String>) = l.filter { it in listOf("a", "b") }
    .let {e->
        if (e!=l||"a" !in e||"b" !in e)-1.0 else l.count{it=="a"}.toDouble()/e.size
    }

/**
 *add new commit
 * @sample findRepetition بمتنبلكبتةرءمؤرة
 */


fun findRepetition(list: List<String>): Double {
    if (list.filter { it == "a"|| it == "b" }.size != list.size) return -1.0
    list.filter { it == "a" || it == "b" }.count { it == "a" }
    return list.filter { it == "a" || it == "b" }.count { it == "a" }.toDouble() / list.filter { it == "a" || it == "b" }.size.toDouble()
}
