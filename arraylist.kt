


fun main(args: Array<String>) {
    //arrayliste item ekleme
    val arrayList = ArrayList<String>()
    arrayList.add("Hello")
    arrayList.add("JVM")
    arrayList.add("Kotlin ")

    val arrayList2 = ArrayList<Int>()
    arrayList2.add(3)
    arrayList2.add(5)
    arrayList2.add(7)

    //item silmek            arrayList.removeAt(3)
    //listten item almak     var deger1: String = arrayList.get(0)
    //list gösterimi foreach kullanırız
    arrayList.forEach { str ->
        println(str)
    }

}