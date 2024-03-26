fun main() {
    println("Entrez votre age  : ")
    val age = readln().toInt()

    if (age <= 26 ){
        println("Vous avez droit au tarif réduit")
    }
    else {
        println("Vous n'avez pas le droit au tarif réduit")
    }

}
