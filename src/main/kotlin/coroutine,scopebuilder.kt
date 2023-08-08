import kotlinx.coroutines.*

fun main() = runBlocking {
    doWor()
}

suspend fun doWor() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}