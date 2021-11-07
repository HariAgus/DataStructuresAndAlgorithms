package chapter3

class LinkedListIterator<T>(
    private val list: LinkedList<T>
) : Iterator<T>, MutableIterator<T> {

    private var lastNode: Node<T>? = null
    private var index = 0

    override fun next(): T {
        // 1
        if (index >= list.size) throw IndexOutOfBoundsException()

        //2
        lastNode = if (index == 0) {
            list.nodeAt(0)
        } else {
            lastNode?.next
        }

        //3
        index++
        return lastNode!!.value

    }

    override fun hasNext(): Boolean {
        return index < list.size
    }

    override fun remove() {
        if (index == 1) {
            list.pop()
        } else {
            val prevNode = list.nodeAt(index - 2) ?: return
            list.removeAfter(prevNode)
            lastNode = prevNode
        }
    }
}