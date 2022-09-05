import java.text.DecimalFormat
import java.util.*


fun main(){
    verifica()

}
fun verifica() {
    val scanner = Scanner(System.`in`)
    val decimal = DecimalFormat("0.0")

    println("Insira a primeira nota")
    val n1 = scanner.nextDouble()
    println("Insira a segunda nota")
    val n2 = scanner.nextDouble()
    println("Insira a terceia nota")
    val n3 = scanner.nextDouble()
    println("Insira a quarta nota")
    val n4 = scanner.nextDouble()

    var media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10

    if (media >= 7) {
        println("Aluno aprovado com "+ decimal.format(media))
    } else if (media < 7 && media >= 5) {
        println("Aluno em exame")
        println("Digite a nota do exame")
        val nExame = scanner.nextDouble()
        println("A nota do exame foi: " + decimal.format(nExame))
        media = (media + nExame) / 2

        if (media >= 5) {
            println("Aluno aprovado" )
        } else {
            println("Aluno Reprovado")
        }
        println("A media final do aluno é: " + decimal.format(media))
    } else {
        println("Aluno reprovado")

    }
    return
}


