import java.util.*

//Yaş hesaplama basit şekilde

fun main(args: Array<String>){

    //Girdi alıyoruz ve inte ceviriyoruz
    println("Kaç Yılında Dogdunuz ?")
    var yil:Int= readLine()!!.toInt()

    //Burada Hesaplama işlemini yapacağız
    var simdiyil=Calendar.getInstance().get(Calendar.YEAR) //sistemden yılı çektik
    var yas:Int=simdiyil-yil

    //Sonuc
    println("Yasiniz= $yas")


}