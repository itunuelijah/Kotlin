class math{
    // user define infix member functiion
    infix fun square(n: Int): Int{  //  here we started the function declaration with 'infix'
    val num = n * n
   
    return num
    
    }}
    fun main(args: Array<String>){
        // creating an object from the math class
        val m = math()
        // call using infix notation
        val result = m square 3
        print("The square of a number is: "+ result)
    
        
    }