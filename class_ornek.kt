

class fonksiyon(val id: Int, var email: String)
class numara(val no: Int, var operator:String){
    fun goster(){
        println("Numara = "+no)
        println("Operatör ="+operator)
    }
}

fun main(args: Array<String>) {
    var yeni=numara(542415," Vodafone")
    yeni.goster()
    val iletisim = fonksiyon(58, "gokberkhdrgl@gmail.com")
    println(iletisim.id)
    iletisim.email = "gokberkhdrgl@gmail.com"
    println(iletisim.email)





}

