package chapter3

fun main() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1)

    println()
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)

    println(list)

    // Append
    println()
    val listAppend = LinkedList<Int>()
    listAppend.append(1)
    listAppend.append(2)
    listAppend.append(3)
    println(listAppend)

    // Insert
    println()
    val listInsert = LinkedList<Int>()
    listInsert.push(3)
    listInsert.push(2)
    listInsert.push(1)

    println("Before inserting $listInsert")
    var middleNode = listInsert.nodeAt(1)!!
    for (i in 1..3) {
        middleNode = listInsert.insert(-1 * 1, middleNode)
    }
    println("After inserting $listInsert")

    // POP
    println()
    val listPop = LinkedList<Int>()
    listPop.push(3)
    listPop.push(2)
    listPop.push(1)

    println("Before popping list : $listPop")
    val poppedValue = listPop.pop()
    println("Before popping list : $listPop")
    println("Popped value $poppedValue")

    // REMOVE LAST
    val listRemoveLast = LinkedList<Int>()
    listRemoveLast.push(3)
    listRemoveLast.push(2)
    listRemoveLast.push(1)

    println("Before removing last node: $listRemoveLast")
    val removedValue = listRemoveLast.removeLast()

    println("After removing last node: $listRemoveLast")
    println("Remove Value : $removedValue")
}

