fun main(args: Array<String> ){
    var mutableList1 = mutableListOf("Apple", "Orange")
    mutableList1.add("Banana")
    mutableList1.add("Mango")

    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Lion")
    mutableList2.add("Tiger")
    mutableList2.add("Wolf")
    for(element in mutableList1){
        println(element)
    }

    println()
    for(element in mutableList2){
    println(element)
    }

}