import kotlin.system.measureTimeMillis

fun main() {
    val graphTask = CliqueNumberGraphTask()
    val millis = measureTimeMillis {
        repeat(1000000) {
            graphTask.solve("F?B~w")
        }
    }
    println("${millis / 1000}.%03d s".format(millis % 1000))
}