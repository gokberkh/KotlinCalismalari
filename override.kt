

//override fonksiyon isimleri aynı parametreleri farklı olmalıdır..


fun topla(x:Int):Int{

    return x
}

fun topla(x:Int,y:Int):Int{

    return x+y
}

fun topla(x:Int,y:Int,z:Int):Int{

    return x+y+z
}

fun main(args: Array<String>) {

    println("toplam(x):"+topla(20))
    println("20+30 : "+topla(20,30))
    println("20+30+50 :"+topla(20,30,50))

}