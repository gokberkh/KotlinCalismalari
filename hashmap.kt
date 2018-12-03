

    fun main(args: Array<String>){

        var map= HashMap<Int,String>()
        map.put(58,"Sivas")
        map.put(55,"Samsun")
        map.put(60,"Tokat")
        map.put(61,"Trabzon")
        println("------------------")
        for(i in map.keys){
            println(map.get(i))

        }
        var map2 = hashMapOf<Int,String>(1 to "Ferrari",2 to "Porsche",3 to "Mclaren",4 to "Lamborghini")
        for (item in map2){
            println(item)
        }
        //arrayof kullanımı burda eleman silinmiyor
        var dizi= arrayOf(1,2,3,4,5,6,7,8,9,10)

        //muteablelist tanımlıyoruz burda üstüne ekleyebiliriz mutable oldugu için
        var dizi2= mutableListOf(1,2,3,4,6,7)
        dizi2[0]=58



    }