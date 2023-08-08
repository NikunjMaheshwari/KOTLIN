import kotlinx.coroutines.*

fun main()= runBlocking {

    doWorl()
    println("Done")
}

    suspend fun doWorl() = coroutineScope {
        launch {
            delay(2000L)
            println("World 2")
        }
        launch {
            delay(1000L)
            println("World 1")
        }
        println("Hello")

    }
