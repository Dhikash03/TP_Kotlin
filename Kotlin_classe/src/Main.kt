/*fun main() {
    val v1 = Voiture("Peugeot", "308")
    val v2 = Voiture("Volvo", "V50", 0)
    val v3 = Voiture()


    v1.accelerer(60)
    println(v2.accelerer(40))
    println(v1.retourneVitesse())
    println(v1)
    println(v2)
}*/

/*fun main(){

    val nombre = Nombre(45)
    val nombre2 = Nombre(91)
    println(nombre)
    println(nombre.diviseurs(45))
    println(nombre.nombrepremier())
    println(nombre.estAmi(nombre2))

}*/

/*fun main(){

    var lesPersonne = mutableListOf<Personne>()
    lesPersonne.add(Personne("Paul", 1.90,90) )
    lesPersonne.add(Personne("Polo", 1.70,50))
    lesPersonne.add(Personne("Alice", 1.90,90))


    for ( unePersonne in lesPersonne){
        println("${unePersonne.Nom} a un imc de ${unePersonne.IMC()}")

    }
}*/

/*fun main() {

    var location = Location("Bob", 'E',15.0,31 )

    println(location.montantJour())
    println(location.montantLocation())
    println(location.kmSupplementaire())
    println(location.pxKmSupplementaire())
    println(location.montantTotal())
}*/

/*fun main() {

    var compte = Compte(530.0)

    println(compte.getBalance())
    compte.deposer(200.0)
    compte.retirer(150.0)
    println(compte.getBalance())
    println(compte.ajoutInteret(20.0))
}*/

fun main(){
    println("Le nom de matricule est :")
    var matricule = readln().toInt()

    println(" Entrer votre prénom :")
    var prenom = readln().toString()

    println(" Entrer votre nom :")
    var nom = readln().toString()

    println(" Votre annee d'embauche :")
    var annee_embauche = readln().toInt()

    println(" Entrer votre salaire :")
    var salaire = readln().toDouble()

    var employe = Employe(matricule, prenom, nom, annee_embauche, salaire)


    println(employe.anciennete())
    print(employe.augmentationSalaire())
    print(employe)


}

