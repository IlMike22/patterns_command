fun main(args: Array<String>) {
    val orderCommandProcessor = OrdersCommandProcessor()
    orderCommandProcessor.apply {
        addToQueue(AddOrderCommand(1L))
        addToQueue(AddOrderCommand(2L))
        addToQueue(PayOrderCommand(2L))
        addToQueue(PayOrderCommand(1L))
        processCommands()
    }


    val queue = orderCommandProcessor.getQueue()
    queue.forEach { command ->
        println("Command ${command.hashCode()} stored in queue}")
    }
}