

fun main(args: Array<String>){
    print("Bir sayi degeri giriniz = ")
    var girdi= readLine()!!.toInt()
    when(girdi){

        1 ->print("Sayma Sayıları $girdi başlar")
        2 ->print("En küçük asal sayı $girdi dir")
        3 ->print("1+2 = $girdi :)")
        in 4..33 ->print("$girdi , [4 33] aralığındadır ")
        else -> print("Girdiğiniz sayı $girdi aralık dışıdır !!!")
    }

    
//Basit yaşlı genç yaşa göre when kullanımı
    println("----*** Uygulamamıza Hoşgeldiniz ***-----")

    print(" Yasinizi giriniz : ")

    var yas= readLine()!!.toInt()

    when(yas){
        in 10..30 -> print("Gençsiniz..!!")
        in 30..45 ->print ("Orta Yaştasınız..!!")
        else -> print ("Yaşlısınız..!!")
    }

}


