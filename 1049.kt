import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    println("Escolha entre vertebrado e invertebrado")
    val palavra1: String = scanner.next()

    if (palavra1.equals("vertebrado", ignoreCase = true)) {
        println("ave ou mamifero")
        val palavra2: String = scanner.next()
        if (palavra2.equals("ave", ignoreCase = true)) {
            println("carnivoro ou onivoro")
            val palavra3: String = scanner.next()
            if (palavra3.equals("carnivoro", ignoreCase = true)) {
                println("aguia")
            } else {
                println("pomba")
            }
        } else {
            println("onivoro ou herbivoro")
            val palavra3: String = scanner.next()
            if (palavra3.equals("onivoro", ignoreCase = true)) {
                println("homem")
            } else {
                println("vaca")
            }
        }
    } else {
        println("Escolha entre inseto ou anelidio")
        val palavra2: String = scanner.next()
        if (palavra2.equals("inseto", ignoreCase = true)) {
            println("hamatofago ou herbivoro")
            val palavra3: String = scanner.next()
            if (palavra3.equals("hematofago", ignoreCase = true)) {
                println("pulga")
            } else {
                println("lagarta")
            }
        } else {
            println("hematofago ou onivoro")
            val palavra3: String = scanner.next()
            if (palavra3.equals("hematofago", ignoreCase = true)) {
                println("sanguessuga")
            } else {
                println("minhoca")
            }
        }
    }
}