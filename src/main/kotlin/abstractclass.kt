fun main() {
    val cir=Circl(4.0)
    println(cir.are())
    cir.display()
}
abstract class Shap{
    var name:String = ""
    abstract fun are():Double
    abstract fun display()
    //aese method jin ki body uski subclass/child class define kare vo abstract h
}
class Circl (val radius :Double):Shape(){
    fun are():Double = Math.PI*radius*radius
    fun display(){
        println("circle is getting displayed")
    }
}