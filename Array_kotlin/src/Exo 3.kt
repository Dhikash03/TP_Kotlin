fun main() {
    val notes = mutableMapOf<String, MutableList<Int>>(
        "Adrien" to mutableListOf(15, 12, 10),
        "Bertrand" to mutableListOf(12, 10)
    )

    notes.getOrPut("Toto") { mutableListOf() }.add(8)// ajoute la clé Toto avec une note de 8

    notes.getOrPut("Adrien") { mutableListOf() }.add(6)//ajoute une note de 6 à la clé Adrien

    for (element in notes) {
        val moyenne = element.value.sum().toDouble() / element.value.size
        println(element.key)
        println(moyenne)

        if (moyenne >= 10) {
            println(element.key)
        }
    }

}