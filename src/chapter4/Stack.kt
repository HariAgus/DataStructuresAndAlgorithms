package chapter4

interface Stack<Element> {

    fun push(element: Element)
    fun pop(): Element?

    class Stack<T : Any>() {
        private val storage = arrayListOf<T>()

        override fun toString() = buildString {
            appendLine("----top----")
            storage.asReversed().forEach {
                appendLine("$it")
            }
            appendLine("-----------")
        }

    }

}
