fun main() {
    val emp=Employee()
    emp.age=20
    emp.name="John"
    emp.apply {
        age=30
        name="Sean"
    }
    println(emp)
    println(emp.age)
    println(emp.name)
    emp.let {
        println(it.name)
        println(it.age)
    }
}
data class Employee(var name:String="",var age:Int=18)