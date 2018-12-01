 open class Araba {              // override etmek için open ekliyoruz
     open fun markasoyle () {   //sınıfa ve fonksiyona
        println("Car Name!")
    }
}

class Mustang : Araba() {
    override fun markasoyle () {
        println("-> MUSTANG")
    }
}

fun main() {
    val m1: Araba = Mustang()
    m1.markasoyle()
}