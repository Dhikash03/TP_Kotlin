/*fun main() {
    println("Entrez votre nom : ")
    val user = readln().toString()
    println("Bonjour $user ")

}*/

fun main() {
    println("Entrez un nombre entier : ")
    val nombre1 = readln().toInt()
    println("Entrez un autre nombre entier : ")
    val nombre2 = readln().toInt()

    println("L'addition de $nombre1 + $nombre2 = ${nombre1 + nombre2 } ")
    println("La différence de $nombre1 - $nombre2 = ${nombre1 - nombre2 } ")
    println("Le produit de $nombre2 = ${nombre1 * nombre2 } ")
    println("Le quotient de $nombre1 / $nombre2 = ${nombre1 / nombre2 } ")
}

