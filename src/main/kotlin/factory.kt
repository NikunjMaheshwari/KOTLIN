fun main() {
    var pizza1=Pizza.factory.create("Peppy Paneer")
    println(pizza1)
}
class Pizza(val type:String,val toppings:String){
    object factory{
        fun create(pizzaType:String):Pizza{
            return when(pizzaType){
                "Tomato"->Pizza("Tomato","tomato,cheese")
                "Peppy Paneer" -> Pizza("Paneer farm","Paneer ,cheese burst,tomato,onion")
                else ->Pizza("Basic","Onion,Cheese")
            }
        }
    }
}