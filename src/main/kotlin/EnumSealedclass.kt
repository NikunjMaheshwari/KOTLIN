fun main() {
    val day= Day.SUNDAY
    println(day.number)
    for(i in Day.values()){
        println(i)
    }
    val tile:Tile=Red("Mushroom",25)
    val tile2=Red("Fire",30)
    val points=when(tile){
        is Red -> tile.points*2
        is Blue -> tile.points*3
    }
    println(points)
}
enum class Day(val number:Int){
    //set of constant value assign karle k liye use karte h
    //ya ek class bana le jismai hum constant value define karte h or use kaar sakte h
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}
sealed class Tile
class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()
