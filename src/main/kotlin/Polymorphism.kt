fun main() {
   val cir:Shape=Circle(4.0)
    val sq:Shape=Square(6.0)
    val tri:Shape=Triangle(6.0,4.0)
    val shapes =arrayOf(Circle(3.0),Square(4.0),Triangle(5.0,6.0))
    calculateAreas(shapes)
    println(sq.area())
    println(cir.area())
    println(tri.area())

}
fun calculateAreas(shapes:Array<Shape>){
    for(shape:Shape in shapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){
    override fun area():Double{
        return Math.PI*radius*radius
    }
}
class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}
class Triangle(val base:Double,val heigth:Double):Shape(){
    override fun area():Double{
        return 0.5*base*heigth
    }
}