import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Digite o valo de x")
    val x = scanner.nextDouble()

    println("Digite o valo de y")
    val y = scanner.nextDouble()

    when {
        x==0.0 && y ==0.0 -> {
            println("Esta na origem")
        }
        x > 0 && y > 0 -> {
            println("Está em Q1")
        }
        x < 0 && y > 0 -> {
            println("Está em Q2")
        }
        x < 0 && y < 0 -> {
            println("Está em Q3")
        }
        x > 0 && y < 0 -> {
            println("Está em Q4")
        }
        x == 0.0 -> {
            println(" No Eixo Y")
        }
        y == 0.0 -> {
            println("No Eixo X")
        }
    }
}