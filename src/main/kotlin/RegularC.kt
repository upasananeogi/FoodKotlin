class RegularC(val Id:Int):Billpayment {
    val Ecustomer : List<ExistingC> = arrayListOf(
        ExistingC(1,"Upasana","Upu","Regular","kolkata","R"),
        ExistingC(2,"Shaunak","Shau","Regular","kolkata","R"))
    fun matching(): ExistingC? {
        for (ecustomer in Ecustomer.listIterator()){
            if(ecustomer.id==Id) return ecustomer
        }
        return null
    }
    fun Userexitornot(): Boolean {
        for (ecustomer in Ecustomer.listIterator()){
            if(ecustomer.id==Id) return true
        }
        return false
    }

    override fun discount(amt: Int): Any  { val matchingCustomer = matching()

        if (matchingCustomer == null) {
            println("No discount available")
            return amt

        } else {
            println("20% OFF!!!!!")
            println("Billable Amt : ")
            return amt * 0.85
        }



    }

//    fun discountR(amt: Int): Any {
//        val matchingCustomer = matching()
//
//        if (matchingCustomer == null) {
//            println("No discount available")
//            return amt
//
//        } else {
//            println("20% OFF!!!!!")
//            println("Billable Amt : ")
//            return amt * 0.85
//        }


    }

