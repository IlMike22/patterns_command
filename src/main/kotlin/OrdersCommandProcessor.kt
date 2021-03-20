class OrdersCommandProcessor {
    private val queue = ArrayList<IOrderCommand>()

    fun addToQueue(orderCommand: IOrderCommand): OrdersCommandProcessor =
        apply {
            queue.add(orderCommand)
        }

    fun getQueue() = queue

    fun processCommands(): OrdersCommandProcessor = apply {
        queue.forEach { command ->
            command.execute()
        }
    }
}