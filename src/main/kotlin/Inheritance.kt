fun main() {
    val obj = PhoneBasic()
    obj.makeCall()
    obj.powerOff()
}
open class Phone{
    val name:String=""
    val type:String=""
    val volume:Int=10

    fun makeCall(){
        println("calling")
    }
    fun display(){}
    fun powerOff(){
        println("Powering off")
    }
    fun deviceInfo(){}
}
class PhoneBasic :Phone() {
    fun getScreenInfo(){}
}
class SmartPhone:Phone(){
    fun playMovie(){}
    fun takePictures(){}
    fun getLocation(){}
}
