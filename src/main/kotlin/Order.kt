import java.util.Scanner
class Order {

    var food = arrayListOf<String>()
    var price = arrayListOf<Int>()
    var total = 0
    fun placeorder(){
        var m = Menu()
        var flag = true
        while (flag == true) {
            try {
                println("Select 1 for Burger")
                println("Select 2 for Pizza")
                println("Select 3 for Spaghetti")
                var sc = Scanner(System.`in`)
                var sel = sc.nextInt()
                val exp = when (sel) {
                    1 -> {
                        food.add(m.menu.get(0).name)
                        price.add(m.menu.get(0).price)

                    }

                    2 -> {
                        food.add(m.menu.get(1).name)
                        price.add(m.menu.get(1).price)

                    }

                    3 -> {
                        food.add(m.menu.get(2).name)
                        price.add(m.menu.get(2).price)

                    }

                    else -> {
                        println("Not applicable")
                    }

                }
                println("Enter Y for ordering more or press N ")
                var choice = readln().toUpperCase()
                if (choice == "N") {
                    flag = false
                }


            }
            catch (e: Exception) {
                println("An error occurred: ${e.message}")

            }
        }

    }
fun showbill(){
    println("Your Bill:")
    println("-------------------------------")
    for (items in food.indices){
        println("Food :"+food.get(items)+"\nPrice: "+ price.get(items) )

    }
    for (prices in price.indices){
        total= total+ price.get(prices)
    }
    println("-------------------------------")
    println("Total Amount :Rs $total")

    }
}









