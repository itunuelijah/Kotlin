fun addNumbers(n1: Double, n2: Double): Int{
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main(){
   var sum = addNumbers(5.0, 6.0)
   println(sum)
}
