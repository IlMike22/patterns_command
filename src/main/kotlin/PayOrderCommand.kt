class PayOrderCommand(private val id: Long) : IOrderCommand {
    override fun execute() {
        println("Pay order with id $id")
    }
}