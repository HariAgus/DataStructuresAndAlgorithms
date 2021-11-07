package chapter3

fun main() {
//    val node1 = Node(value = 1)
//    val node2 = Node(value = 2)
//    val node3 = Node(value = 3)
//    node1.next = node2
//    node2.next = node3
//    println(node1)
//
//    println()
//    val list = LinkedList<Int>()
//    list.push(3).push(2).push(1)
//
//    println(list)
//
//    // Append
//    println()
//    val listAppend = LinkedList<Int>()
//    listAppend.append(1)
//    listAppend.append(2)
//    listAppend.append(3)
//    println(listAppend)
//
//    // Insert
//    println()
//    val listInsert = LinkedList<Int>()
//    listInsert.push(3)
//    listInsert.push(2)
//    listInsert.push(1)
//
//    println("Before inserting $listInsert")
//    var middleNode = listInsert.nodeAt(1)!!
//    for (i in 1..3) {
//        middleNode = listInsert.insert(-1 * 1, middleNode)
//    }
//    println("After inserting $listInsert")
//
//    // POP
//    println()
//    val listPop = LinkedList<Int>()
//    listPop.push(3)
//    listPop.push(2)
//    listPop.push(1)
//
//    println("Before popping list : $listPop")
//    val poppedValue = listPop.pop()
//    println("Before popping list : $listPop")
//    println("Popped value $poppedValue")
//
//    // REMOVE LAST
//    val listRemoveLast = LinkedList<Int>()
//    listRemoveLast.push(3)
//    listRemoveLast.push(2)
//    listRemoveLast.push(1)
//
//    println("Before removing last node: $listRemoveLast")
//    val removedValue = listRemoveLast.removeLast()
//
//    println("After removing last node: $listRemoveLast")
//    println("Remove Value : $removedValue")
//
//    // REMOVE AFTER
//    val listRemoveAfter = LinkedList<Int>()
//    list.push(3)
//    list.push(2)
//    list.push(1)
//
//    println("Before removing at particular index $listRemoveAfter")
//    val index = 1
//    val node = list.nodeAt(index - 1)!!
//    val removedValueAfter = listRemoveLast.removeAfter(node)
//
//    println("After removing at index $index : $list")
//    println("Removed value $removedValueAfter")

    // PRINTING DOUBLE
//    val listPrintingDouble = LinkedList<Int>()
//    listPrintingDouble.push(3)
//    listPrintingDouble.push(2)
//    listPrintingDouble.push(1)
//    println(listPrintingDouble)
//
//    for (item in listPrintingDouble) {
//        println("Double : ${item * 2}")
//    }

    val list: MutableCollection<Int> = LinkedList()
    list.add(3)
    list.add(2)
    list.add(1)

    println(list)
    list.remove(1)
    println(list)

    val listRetaining: MutableCollection<Int> = LinkedList()
    listRetaining.add(3)
    listRetaining.add(2)
    listRetaining.add(1)
    listRetaining.add(4)
    listRetaining.add(5)

    println(listRetaining)
    listRetaining.retainAll(listOf(3, 4, 5))
    println(listRetaining)

    val listRemoveAll: MutableCollection<Int> = LinkedList()
    listRemoveAll.add(3)
    listRemoveAll.add(1)
    listRemoveAll.add(2)
    listRemoveAll.add(4)
    listRemoveAll.add(5)

    println(listRemoveAll)
    listRemoveAll.removeAll(listOf(3, 4, 5))
    println(listRemoveAll)
}

