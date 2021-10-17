package caphter2

fun main() {
    val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)

//    println(linearContains(66, numbers))
    println("----------------")
    println(pseudoBinaryContains(2, numbers))

    println("----------------")
    println(sumFromOne(6))

    println("----------------")
    println(sumFromTwo(5))
}

fun linearContains(value: Int, numbers: List<Int>): Boolean {
    for (element in numbers) {
        if (element == value) {
            return true
        }
    }
    return false
}

fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false
    val middleIndex = numbers.size / 2

    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}

fun sumFromOne(n: Int): Int {
//    var result = 0
//    for (i in 1..n) {
//        println(i)
//        result += i
//    }
//    return result

    // With Reduce
    return (1..n).reduce { sum, element -> sum + element }
}

fun sumFromTwo(n: Int): Int {
    return n * (n + 1) / 2
}