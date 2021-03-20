class AddOrderCommand(private val id: Long) : IOrderCommand {
    override fun execute() {
        println("Add oder with id $id")
    }
}