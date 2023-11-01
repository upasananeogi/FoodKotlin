import kotlin.system.exitProcess
import java.util.Scanner
class Restaurant {
    var sc = Scanner(System.`in`)

    val address="Kolkata sec 26"
    val phone_no="9910533328"
    companion object
    {
        val name= "Foodie"
    }

    fun display(){
        println("Welcome to ${Restaurant.name}!!!")
        println("-------------------------------")
        println("Address: $address")
        println("Contact us: $phone_no")
        println("-------------------------------")
    }
    fun Int.AdvancePayment():Int{
        return this
    }

  fun Option() {
      println("Dinning(D)/Online(O)")
      var ch = readln().uppercase()
      if (ch == "O") {
          println("Online order:")
      } else {
          println("Would you like to make a reservation? (yes/no)")
          var ans = sc.nextLine()
          if (ans.equals("yes", ignoreCase = true)) {
              println("Please enter your name for reservation:")
              val name = readln()
              println("How many people are we expecting?")
              val answer = sc.nextInt()
              sc.nextLine() // Consume the newline character
              println("Enter the date and time (e.g., 2023-10-27 18:30):")
              val dateTime = sc.nextLine()
              println("You have a reservation for $answer people on $dateTime under name of $name")
              val advance= 500
              println("Please pay a booking amount of Rs ${advance.AdvancePayment()} for reservation.")
              advance.AdvancePayment()

              exitProcess(0)
      }

      }}}

