class Nombre {

    var nb1: Int = 0


    constructor(nb1: Int) {
        this.nb1 = nb1
    }

    constructor() {
    }

    override fun toString(): String {
        return "Nombre(nb1 = $nb1)"
    }


    fun diviseurs(nb1: Int): List<Int> {

        val nombre = mutableListOf<Int>()

        for (i in 1..this.nb1) {
            if (this.nb1 % i == 0) {
                nombre.add(i)
            }
        }
        return nombre

    }

    /*fun diviseurs2(nb2: Int): List<Int> {

        val nombre2 = mutableListOf<Int>()

        for (i in 1..this.nb2) {
            if (this.nb2 % i == 0) {
                nombre2.add(i)
            }
        }
        return nombre2

    }*/

    fun nombrepremier(): Boolean {

        if (this.diviseurs(this.nb1).size == 2) {
            return true
        } else {
            return false
        }


    }

    fun sommechiffre(): Int {

        var somme = 0
        var nb = this.nb1
        while (nb != 0) {
            somme += nb % 10
            nb /= 10
        }

        return somme

    }

     fun estAmi(nb2: Nombre): Boolean {

        if (this.sommechiffre()==nb2.sommechiffre()) {

            return true
        }
         else
             return false

    }

}

















