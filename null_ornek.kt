




fun main(args:Array<String>){

    var str : String ? = " Kotlin Null Safe" // ? eklediğimiz için null değeri döner hata almayız
    str = null
    print("Stringin uzunluğu : "+str?.length)


    str?.replace("A","B")?.reversed()?.toUpperCase()?.trim()
    //herhangi bir metod null dönderince direk null çıktısı hata almayız burdanda

    //!! kullanmaktan kaçınmalıyız null exp. hatası alınabilir.
}