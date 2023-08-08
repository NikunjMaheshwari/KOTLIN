import java.lang.IllegalArgumentException

fun main() {
    val arr= arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (ex:NullPointerException){
        println("Hiiii")
    }
    catch (e:Exception){
        println("Please check the array index")
    }
    finally{
        println("I will execute no matter what")
    }
    createUserList(5)
    createUserList(-2)

}
fun createUserList(count:Int){
    if(count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User List Created containing $count users")
    }
}