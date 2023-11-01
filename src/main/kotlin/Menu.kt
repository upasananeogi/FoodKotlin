open class Menu {
    val menu: List<Fooditem> = listOf(
        Fooditem("Burger", 500),
        Fooditem("Pizza", 700),
        Fooditem("Spaghetti", 600)
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