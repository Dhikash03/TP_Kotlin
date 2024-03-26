class Personne {

    var Nom : String =  ""
    var Taille : Double = 0.0
    var Poids : Int = 0

    constructor(Nom: String, Taille: Double, Poids: Int) {
        this.Nom = Nom
        this.Taille = Taille
        this.Poids = Poids
    }

    constructor() {}

    override fun toString(): String {
        return "Personne(Nom='$Nom ', Taille=$Taille m, Poids=$Poids km)"
    }

    fun IMC () : Double {

        var imc = this.Poids / (this.Taille * this.Taille)

        return imc
    }

    fun Signification() : String {

        var signification = ""
        if (this.IMC() < 18.5){
            signification = " Maigreur"
        }

        else if (this.IMC() in 18.5..24.9){
            signification = "Normal"
        }

        else if (this.IMC() in 25.0..29.9) {
            signification = "Surpoid"
        }

        else {
            signification = "Obésité, Niveau 1"
        }
        return signification

        }
    }
