class Employe {

    var Matricule : String = ""
    var Nom : String = ""
    var Prenom : String = ""
    var anneeEmbauche : Int = 0
    var salaire : Double = 0.0

    constructor(Matricule: String, Nom: String, Prenom: String, anneeEmbauche: Int, salaire: Double) {
        this.Matricule = Matricule
        this.Nom = Nom
        this.Prenom = Prenom
        this.anneeEmbauche = anneeEmbauche
        this.salaire = salaire
    }

    constructor()

    override fun toString(): String {
        return "Employe(Matricule='$Matricule', Nom='$Nom', Prenom='$Prenom', anneeEmbauche=$anneeEmbauche, salaire=$salaire)"
    }

    



}