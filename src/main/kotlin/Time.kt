import java.time.LocalDate
import java.time.LocalTime

class Time {
    val currentDate = LocalDate.now()
    val currentTime = LocalTime.now()
    val futureDate = currentDate.plusDays(7)
     fun time(){
         println("Time: $currentTime")
         println("Date: $currentDate")
     }

}