import java.text.DecimalFormat
import java.util.*
//UOJ - 1038 lanche
fun main (){

    val decimal = DecimalFormat("0.00")
    val total = calc()
    println("total: R$ " + decimal.format(total))

}
fun calc(): Double {
    val scanner = Scanner(System.`in`)
    println("Digite o codigo ")
    val codigo = scanner.nextInt()
    println("digite a quantidade")
    val quantidade = scanner.nextDouble()
    var preco = 0.0

    when (codigo) {
        1 -> {
            preco = 4.0
        }

        2 -> {
            preco = 4.5
        }

        3 -> {
            preco = 5.0
        }

        4 -> {
            preco = 2.0
        }

        5 -> {
            preco = 1.5
        }
    }
    return quantidade * preco
}
