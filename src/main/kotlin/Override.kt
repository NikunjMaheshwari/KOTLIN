fun main() {
    val oneplus=OnePlus()
    oneplus.display()

    val generalMobile=Mobile()
    generalMobile.display()
    println(oneplus.toString())

}
open class Mobile{
    open val name:String="" //open tab karna jo property hum override karna chahte h
    open val size:Int =5
    fun makeCall()=println("Calling from mobile")
    fun powerOff()=println("Shutting down")
    open fun display()=println("Simple mobile display")
}
class OnePlus:Mobile(){
    //override means display function oneplus ke liye alag hai
    override val name:String="One Plus"
    override val size:Int =6
    override fun display() = println("One Plus display")
    override fun toString(): String {
        return "NAME - $name SIZE - $size"
    }
}