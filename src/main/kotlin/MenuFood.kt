open class MenuFood {
    val menu: List<Fooditem> = listOf(
        Fooditem("Burger", 599),
        Fooditem("Pizza", 799),
        Fooditem("Spaghetti", 899)
    )

    fun displaymenu() {
        println("Welcome to the Food Menu")
        println("-------------------------------")

        println("Menu: ")
        menu.forEachIndexed { index, items ->
            println("${index + 1}. ${items.name} - Rs ${items.price}")
            println("-------------------------------")

        }


    }
}