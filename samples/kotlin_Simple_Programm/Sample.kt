class Sample {
    
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            Printer.printMessage("This is sample app!")
            Printer.printArray(args)
        }
    }

}