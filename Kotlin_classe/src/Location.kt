class Location {

    var nom_loueur : String = ""
    var categorie_vehicule : Char ='p'
    var km : Double = 0.0
    var jour : Int = 0


    constructor(nom_loueur: String, categorie_vehicule: Char, km: Double, jour : Int) {
        this.nom_loueur = nom_loueur
        this.categorie_vehicule = categorie_vehicule
        this.km = km
        this.jour = jour
    }

    constructor()

    override fun toString(): String {
        return "Location(nom_loueur='$nom_loueur', categorie_vehicule=$categorie_vehicule, km=$km, jour=$jour)"
    }

    fun montantJour () : Double {

        var prix : Double = when(this.categorie_vehicule) {

            'E' -> 30.00
            'V' -> 50.00
            'L' -> 75.00
            else -> 0.0
        }
        return prix
    }

    fun montantLocation() : Double {

        var prix_location : Double = montantJour() * this.jour

        return prix_location

    }

    fun kmSupplementaire() : Double {

        var kilometresup = this.km - 100 * this.jour

        if (kilometresup > 0)
             return kilometresup
        else {
           return 0.0
        }

    }

    fun pxKmSupplementaire() : Double {

        var prix_km_supplementaire = 0.0

        prix_km_supplementaire = 0.5*kmSupplementaire()

        return  prix_km_supplementaire
    }

    fun montantTotal(): Double {

        var prix_total = montantLocation() + pxKmSupplementaire()

        return  prix_total
    }
}



