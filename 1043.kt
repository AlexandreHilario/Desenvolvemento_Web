import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Digite o valor de a ")
    val a = scanner.nextDouble()

    println("Digite o valor de b ")
    val b = scanner.nextDouble()

    println("Digite o valor de c ")
    val c = scanner.nextDouble()
    val area = (a+b)*c/2.0
    val peri = a+b+c

    if (a < b+c && b < a+c && c < a+b)
        println("Perimetro = $peri")

    else

        println("Area = $area")

}