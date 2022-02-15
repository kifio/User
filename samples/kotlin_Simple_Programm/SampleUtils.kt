object Printer {
    
    fun printMessage(msg: String) {
        println(msg)
    }

    fun printArray(arr: Array<*>) {
        for (o in arr) {
            println(o.toString())
        }
    }
}