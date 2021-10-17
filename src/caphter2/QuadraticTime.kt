package caphter2

fun main() {
    println(multiplicationBoard(11))
}

fun multiplicationBoard(size: Int) {
    for (number in 1..size) {
        print("-------------")
        for (otherNumber in 1..size) {
            println("$number x $otherNumber = ${number * otherNumber}")
        }
        println()
    }
}