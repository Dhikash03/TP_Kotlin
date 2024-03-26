/*fun main() {
    val entiers = mutableListOf<Int>()
    val listPair = mutableListOf<Int>()
    val listImpair = mutableListOf<Int>()
    for(i in 1..10) {
        var aletoire = (1..100).random()
        entiers.add(aletoire)

        if (aletoire % 2 == 0) {
            listPair.add(aletoire)
        }else {
            listImpair.add(aletoire)
        }
    }


    println(entiers)
    println(entiers.sum())
    println(entiers.min())
    println(entiers.max())
    println(listPair)
    println(listImpair)

}*/

fun main() {
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    val listPair = entiers.filter { it % 2 == 0 }
    val listImpair = entiers.filter { it % 2 == 1 }


    println(entiers)
    println(entiers.sum())
    println(entiers.min())
    println(entiers.max())
    println(listPair)
    println(listImpair)

}

