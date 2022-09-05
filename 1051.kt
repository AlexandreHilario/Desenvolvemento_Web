import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Digite o salario")
    val salario = scanner.nextDouble()
    val imposto: Double

    if (salario >= 0 && salario <= 2000) {
        println("É isento")
    } else if (salario > 2000 && salario <= 3000) {
        imposto = (salario - 2000) * 0.08
        println(String.format("R$ $imposto"))
    } else if (salario > 3000 && salario <= 4500) {
        imposto = ((salario - 3000)  * 0.18) + 80
        println(String.format("R$ $imposto"))
    } else {
        imposto = ((salario - 4500) * 0.28) + 350
        println(String.format("R$ $imposto"))
    }
}
