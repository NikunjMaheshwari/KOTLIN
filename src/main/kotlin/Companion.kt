fun main() {
    MyClass.MyObject.f()

    MyClass.f()//using companion object
    MyClass.AnotherObject.g()
}
class MyClass{
    companion object MyObject{
        fun f(){
            println("Hello I am F from object")
        }
    }
    object AnotherObject{
        fun g(){
            println("Hello I am G from object")
        }
    }
}