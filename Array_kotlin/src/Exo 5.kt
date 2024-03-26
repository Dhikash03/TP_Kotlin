fun tabPair(n:Array<Int>): List<Int> {

    //val entier = mutableListOf<Int>()
    val np = mutableListOf<Int>()
    for (i in n) {
        np.add(i)
    }
    return np.toList()
}

fun main() {

    println(tabPair(10).toIntArray())
}