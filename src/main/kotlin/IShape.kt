fun main() {
    dragObjects(arrayOf(CIRC(4.0),SQUA(4.0),TRIAN(5.0,6.0),PLAYER("nikunj")))
}
fun dragObjects(objects: Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}
interface Draggable{//ye method by default abstract h
    fun drag()
}

abstract class IShape:Draggable{
    abstract fun area():Double
    abstract override fun drag()
}
class CIRC (val radius:Double) : IShape(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag() =println("circle is dragging")

}
class SQUA(val side:Double) :IShape(){
    override fun area(): Double =side*side
    override fun drag() =println("square is dragging")
}
class TRIAN(val base:Double ,val height:Double) : IShape(){
    override fun area(): Double =0.5*base*height
    override fun drag()=println("triangle is dragging")

}
class PLAYER(val name:String):Draggable{
    override fun drag()=println("$name is dragging")
}