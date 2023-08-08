fun main() {
    val p1=Per("aaaaa",23)
    println(p1.age)
    p1.age=-13
    println(p1.name)

}
class Per(namePer:String,agePer:Int){
    var name:String=namePer
        //getter se name capital letter mai print hoga.
        get(){
            println("getter is called")
            return field.toUpperCase()
        }
    var age :Int=agePer //age pe setter laga hua h
        //setter
        set(value){
            if(value>0){
                field=value
            }
            else{
                println("Age cant be negetive")
            }
        }
}
