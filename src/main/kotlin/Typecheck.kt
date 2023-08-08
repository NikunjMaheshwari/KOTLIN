fun main() {
    val circ = CIR(4.0)
    val play = PLAYE("nikk")
    //typechecking
    if(circ is CIR){
        println("This is circle")
    }
    val arr=arrayOf(circ,play)
    for(obj in arr){
        //smartcasting
        if(obj is CIR){
            println(obj.area())
        }
        else{
            (obj as PLAYE).sayMyName()
        }
    }
}
interface Dragable{
    fun drag()
}
abstract class Typecheck:Dragable{
    abstract fun area():Double
    abstract override fun drag()
}
class CIR (val radius:Double) : Typecheck(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag() =println("circle is dragging")
}
class SQUAR(val side:Double) :Typecheck(){
    override fun area(): Double =side*side
    override fun drag() =println("square is dragging")
}
class TRIANG(val base:Double ,val heigth:Double) : Typecheck(){
    override fun area(): Double =0.5*base*heigth
    override fun drag()=println("triangle is dragging")
}
class PLAYE(val name:String):Dragable{
    override fun drag()=println("$name is dragging")
    fun sayMyName()=println("Hey my name is-$name")
}