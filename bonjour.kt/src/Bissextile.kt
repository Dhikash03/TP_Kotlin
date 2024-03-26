fun main() {

    println("Entrez une année : ")
    val annee = readln().toInt()

    if (annee % 4 == 0 || annee % 400 == 0 ) {
        println("Cet $annee est bissextile ")
    }
    else if (annee % 100 == 0 ){
        println("Cet $annee n'est pas bissextile ")
    }

    else {
    println("Cet $annee n'est pas bissextile ")
}



}