fun main() {
    println("Entrez un nombre : ")
    val nombre1 = readln().toInt()
    println("Entrez un autre nombre : ")
    val nombre2 = readln().toInt()

    if ((nombre1 > 0 && nombre2 > 0 ) || (nombre1 < 0 && nombre2 < 0 )) {
        println(" Le produit de $nombre1 * $nombre2 est postive ")
    }
    else {
        println(" Le produit de $nombre1 * $nombre2 est négative ")
    }
}
