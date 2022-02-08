fun main(arg: Array<String>){
  val intSet = setOf(2,3,4,5,9,5)
  val mySet: Set<Any> = setOf(2,3,5,9,4,5,"Abeokuta")

println("....print Int type....")
for(i in intSet){
   println(i)}

   
println()
println("....print Any type....")
for(i in mySet){
   println(i)}
}