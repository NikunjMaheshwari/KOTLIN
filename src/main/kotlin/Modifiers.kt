fun main() {
    var obA=A()
    var obB=B()
    obA.a
    obA.b

}
//public modifier is accessble everywhere.
//internal modifier is accessble in that module only.
//private modifier is accessble only in that class.
//protacted is accessble in subclasses
open class A{
    var a=20
    internal var b=3
    private var c=20
    protected var d=40

}
class B:A(){
   fun test(){
       println(a)
       println(b)
       //c cann0t used bcoz it is private
       //println(c)
       println(d)
   }
}
