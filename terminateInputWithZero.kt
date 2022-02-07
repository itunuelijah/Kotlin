
// import java.util.Scanner

// fun main(args: Array<String>) {

   
//     val reader = Scanner(System.`in`)
//     print("Enter a number: ")

//     var integer:Int = reader.nextInt()

// if( integer!= 0) {
    
//     println("You entered: $integer")
// }

// }




fun main(args: Array<String>){
    var sum =0
    var number: Int
    while(true){
        while(true){
            print ("Enter a numberr: ")
            number =readLine()!!.toInt()
            if(number==0)
            break
             sum += number}
            print("sum = $sum")
        }
    }
}