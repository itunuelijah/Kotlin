fun displayBorder (character: Char ='=', length: Int = 15){
    for(i in 1..length){
        print(character)
    }}

    fun main(args: Array<String>){
        println("Output when no argument is passed: ")
        displayBorder()

        println("\n\n'*' is used as a first argument.")
        println("5 is used as a second argument.")
        println("Output when both arguments are passed:")

        displayBorder('*', 5)
        println()
        displayBorder(5)
    
    }
}



 

// fun displayBorder(character: Char = '=', length: Int = 15){
//     for(i in 1..length){
//         print(character)
//     }
// }

// fun main(args: Arg<String>){
//     displayBorder(length  = 5)
// }