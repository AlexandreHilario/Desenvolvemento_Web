import java.util.*

fun main(){
    val entrada = Scanner(System.`in`)
    println("Digite um numero")
    val num = entrada.nextInt()

    for (i in 0..num) {
        if (i % 2 == 1) {
            println(i)
        }
    }
}