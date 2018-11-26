


fun main(args: Array<String>){

    print("Notunuzu Giriniz: ")
    var not= readLine()!!.toInt()

    if (not>=90){
        if(not>=97) {  //iç içe if yapısı
            print("Harf Notunuz =AA+")
        }
        else
        print("Harf Notunuz = AA ")
    }

   else  if (not<90 && not>=70) {
        print("Harf Notunuz = BA ")
    }

  else  if (not>=45 && not<70){
        print("Harf Notunuz = BB")
    }
    else
    {
        print("Harf Notunuz = FF")
    }



}