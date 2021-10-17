package caphter2

fun main() {
    val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)

    println(printSorted(numbers))
    println("------------------")
    println(printSortedManual(numbers))
}

fun printSorted(numbers: List<Int>) {
    val sorted = numbers.sorted()
    for (element in sorted) {
        println(element)
    }
}

fun printSortedManual(numbers: List<Int>) {
// 1
    if (numbers.isEmpty()) return
// 2
    var currentCount = 0
    var minValue = Int.MIN_VALUE
// 3
    for (value in numbers) {
        if (value == minValue) {
            println(value)
            currentCount += 1
        }
    }
    while (currentCount < numbers.size) {
// 4
        var currentValue = numbers.maxOrNull()!!
        for (value in numbers) {
            if (value in (minValue + 1) until currentValue) {
                currentValue = value
            }
        }
// 5
        for (value in numbers) {
            if (value == currentValue) {
                println(value)
                currentCount += 1
            }
        }
    }
}