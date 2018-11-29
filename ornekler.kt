

    //string parcala ve yazdır for
   fun main (args: Array<String>){
        var text="Kotlin *"
        for(char in text){
            println(char)
        }
    }

       // Basit çarpım tablosu
    fun main (args: Array<String>) {
        val aralık1 = 1..9
        val aralık2 = 1..9

        println("Çarpım Tablosu")
        for(i in aralık1)
            for(j in aralık2){
               val carpim=i*j
                println("$i * $j = $carpim")
            }
    }

    //label kullanımı

    fun main (args: Array<String>) {
        val aralık1=1..4
        val aralık2=1..6
       deneme@for(i in aralık1) {
           for (j in aralık2) {
               if (i==4 && j == 5) {
                   break@deneme
               }

               println("birinci sayi= $i  ikinci sayi =$j ")

           }
       }



    }