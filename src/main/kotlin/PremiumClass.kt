class PremiumClass(val Id:Int):Billpayment  {
    var c = Customer()
    val Ecustomer : List<ExistingC> = arrayListOf(
        ExistingC(3,"Shaira","Shaira","Premium","kolkata","P"),
        ExistingC(4,"Chandana","chan","Premium","kolkata","P")
    )
    fun matching(): ExistingC? {
        for (ecustomer in Ecustomer.listIterator()){
            if(ecustomer.id==Id) return ecustomer
        }
        return null
    }

   override fun discount(amt: Int): Any {
        val matchingCustomer = matching()

        if (matchingCustomer == null) {
            println("No discount available")
            return amt

        } else {
            println("30% OFF!!!!!")
            println("Billable Amt : ")
            return amt * 0.70
        }
}}