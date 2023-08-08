fun main() {
    val mustang=Car("Mustang","petrol",100)
    val beetle=Car("bettle","diesel",300)
    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
    println(beetle.name)
    println(beetle.type)
    println(beetle.kmRan)
    mustang.driveCar()
    beetle.driveCar()
}
class Car(val name:String,val type:String,var kmRan:Int){
   fun driveCar(){ //methods
       println("$name Car is driving")
   }
   fun applyBrakes(){
       println("Brake applied")
   }
}