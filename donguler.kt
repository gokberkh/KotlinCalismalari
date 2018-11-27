


fun main(args: Array<String>){

    for (i in 1..5){
        println("")
        for(j in 1..i)
            print("*")

    }

    println("")

    var sayi=1
    while (sayi<=5){
        println("Merhaba $sayi")
        sayi++
        if(sayi==5) break
    }
    println("döngü dışı")
}