import java.time.LocalDate


class Employe {

    var matricule : Int = 0
    var nom : String = ""
    var prenom : String = ""
    var anneeEmbauche : Int = 0
    var Salaire : Double = 0.0

    constructor(matricule : Int, nom: String , prenom: String, anneeEmbauche: Int, salaire: Double) {
        this.matricule = matricule
        this.nom = nom
        this.prenom = prenom
        this.anneeEmbauche = anneeEmbauche
        this.Salaire = salaire
    }

    constructor()



    fun anciennete() : Int {

        var annee_anciennete = LocalDate.now().year - anneeEmbauche

        return annee_anciennete
    }

    fun augmentationSalaire() : Double{

        var augmentationSal = this.Salaire

        if (anciennete()<5) {

            augmentationSal *= 1.02
        }
        else if (anciennete()<10 ){
            augmentationSal *= 1.05
        }

        else {
            augmentationSal*= 1.10
        }

        return augmentationSal

    }

    override fun toString(): String {
        return "Matricule : ['$matricule']" +
                " Nom complet : ['$nom, $prenom']" +
                " Ancienneté : [${anciennete()}]" +
                " Salaire : [$Salaire]"
    }





    }










