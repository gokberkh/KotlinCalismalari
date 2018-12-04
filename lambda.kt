




//lambda fonksiyon örnegi

fun main(args: Array<String>) {

    val mylambda :(String)->Unit  = {s:String->println(s)}
    val mylambda2 :(String)->Unit ={s:String-> println("İlerleme var \n"+s)}
    val v:String = "Kotlin Ögreniyorum"
    mylambda(v)
    mylambda2(v)
}