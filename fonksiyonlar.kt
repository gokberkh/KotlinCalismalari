

fun carpma(sayi1: Int, sayi2: Int): Int
{
    var sonuc = sayi1 * sayi2
    return sonuc
}

fun yil_goster(sayi1: Int = 0) {
    println("Değer : " + sayi1)
}

fun merhaba() {
    println("Merhaba Dünya")
}

fun main(args: Array<String>) {

    println("20 * 30 = " + carpma(20, 30))
    println("30 * 30 = " + carpma(30, 30))
    yil_goster(2018)
    merhaba()
}