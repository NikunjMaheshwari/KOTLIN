import kotlinx.coroutines.*
fun main() = runBlocking {
    repeat(5) {// launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}