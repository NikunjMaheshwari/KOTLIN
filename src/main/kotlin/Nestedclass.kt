fun main(){
    val obj=Outer()
    obj.i
    //val nested=Outer.Nested()  //it is used without inner class.
    //nested.test()
    val inner=Outer().Nested()   //This will used for inner class.
    inner.test()
}
class Outer{
    var i=0
    inner class Nested{
        fun test(){
            println("I am in nested class $i")
        }
    }
}