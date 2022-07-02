package addition

import java.util.*

fun main() {

    print("List : ")
    val someList = arrayOf(20, 5, 42, 3, 8, 12)

    println(someList.toList())

    val wantedValueFirst = 3
    val wantedValueSecond = 10


    printResult(wantedValueFirst, binarySearch(someList, wantedValueFirst))
    printResult(wantedValueSecond, binarySearch(someList, wantedValueSecond))
}

fun binarySearch(array: Array<Int>, element: Int): Int {
    Arrays.sort(array)

    var index = 0
    var end = array.size - 1

    while (index <= end) {
        val center = (index + end) / 2
        if (element == array[center]) {
            return center
        } else if (element < array[center]) {
            end = center - 1
        } else if (element > array[center]) {
            index = center + 1
        }
    }

    return -1
}

fun printResult(wantedValue: Int, result: Int) {
    if (result == -1) {
        println("$wantedValue Tidak berada di dalam list")
    } else {
        println("$wantedValue berada di dalam list")
    }
}