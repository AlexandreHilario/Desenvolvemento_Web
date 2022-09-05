import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    println("Digite o valor de primeiro numero ")
    val n1 = scanner.nextInt()

    println("Digite o valor de segundo numero ")
    val n2 = scanner.nextInt()


    if ((n1 % n2 == 0) || (n2 % n1 == 0)) {
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }
}