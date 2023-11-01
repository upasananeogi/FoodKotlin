import java.lang.RuntimeException
import java.util.Scanner
data class ExistingC(val id :Int,val name: String, val password:String, val type:String, val address:String,val short :String)
class Customer {
    private var sc = Scanner(System.`in`)
    public var c_id = 0

    val Ecustomer: List<ExistingC> = listOf(
        ExistingC(1, "Upasana", "Upu", "Regular", "Kolkata", "R"),
        ExistingC(2, "Shaunak", "Shau", "Regular", "Kolata", "R"),
        ExistingC(3, "Shaira", "Shaira", "Premium", "Kolkata", "P"),
        ExistingC(4, "Chandana", "chan", "Premium", "Kolkata", "P")


    )

    fun CustomerType(): Int {
        var flag = true
        while (flag == true) {
            println("Type : (R) Regular/Type(P)Premium Customer/New Customer(N)")
            try {
                var ch = readln()?.uppercase()
                if (ch != "R" && ch != "P" && ch != "N") throw RuntimeException("Please type the above only")
                if (ch == "R" || ch == "P") {
                    println("Enter your id :")
                    this.c_id = sc.nextInt()
                    if (c_id != null) {
                        val matching = Ecustomer.find { it.id == c_id }
                        if (matching != null) {
                            println("-------------------------------")
                            println("Welcome ${matching.name}, Thank You for being our ${matching.type} Customer!")
                            println("Your address: ${matching.address}")
                        } else {
                            println("-------------------------------")
                            println("Customer with ID $c_id not found.")
                            println("Signup for ordering online")
                            println("Enter name:")
                            var name = readln()
                            println("Enter address")
                            var address = readln()
                            println("Enter contact details:")
                            var phoneno = readln()

                        }

                    }
                } else if (ch=="N"){


                    println("Signup for ordering online")
                    println("Enter name:")
                    var name = readln()
                    println("Enter address")
                    var address = readln()
                    println("Enter contact details:")
                    var phoneno = readln()
                }
                break
            }
            catch (e: Exception) {
                println(e.message)

            }

        }
        return c_id as Int
    }
}



