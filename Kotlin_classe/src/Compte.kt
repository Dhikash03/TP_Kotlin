class Compte {

    var solde : Double = 0.0

    constructor(Balance_initial : Double) {
        this.solde = Balance_initial
    }

    constructor()

    override fun toString(): String {
        return "Compte()"
    }

    fun getBalance() : Double {

        return this.solde
    }

    fun deposer(montant : Double) {


        this.solde += montant

    }

    fun retirer(montant : Double)  {

        this.solde -= montant

    }

    fun ajoutInteret (taux_interet : Double) : Double {

        var interet = this.solde*(1+taux_interet)

        return  interet
    }

}
