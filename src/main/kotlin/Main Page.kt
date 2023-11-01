fun main() {
    var res = Restaurant()
    res.display()
    res.Option()
    var c = Menu()
    c.displaymenu()
    var o = Order()
    o.placeorder()
    o.showbill()
    var t = Time()
    t.time()
    var customer = Customer()
    var id = customer.CustomerType()
    val r = RegularC(id)
    val p = PremiumClass(id)
    if (r.Userexitornot()){
        println(r.discount(o.total))
    }
    else{
        println(p.discount(o.total))
    }


}




