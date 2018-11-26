
//Basit Kullanıcıdan Veri Alma İşlemi

fun main(args: Array<String>){
    print("İsminiz:")
    var name= readLine()
    print("Yasiniz:")
    var yas:Int =readLine()!!.toInt()
    print("Bolumunuz:")
    var bolum= readLine()
    print("Pi degeri giriniz:")
    var pi= readLine()!!.toDouble() //Readline string türünde aldığı için çeviriyoruz
    println("Adiniz "+name+"\nYasiniz "+yas+"\nBolumunuz "+bolum+"\nPi Degeriniz="+pi)
}
