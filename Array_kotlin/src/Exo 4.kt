fun serieInverse(n:Int): Array<Int> {

    val entier = mutableListOf<Int>()

    for (i in n downTo 1) {
        entier.add(i)
    }

    return entier.toTypedArray()

}

fun main() {

    println(serieInverse(5).contentToString())
}