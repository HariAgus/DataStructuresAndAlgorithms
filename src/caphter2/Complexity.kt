package caphter2

fun main() {
    val arrayListName = listOf("Agus", "Hari", "Widakdo")

    println(checkFirst(arrayListName))

    println("-----------------------")
    println(printNames(arrayListName))

}

fun checkFirst(names: List<String>) {
    if (names.firstOrNull() != null) {
        println(names.first())
    } else {
        println("No Names")
    }
}

fun printNames(names: List<String>) {
    for (name in names) {
        println(name)
    }
}

