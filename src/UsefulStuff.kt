fun main(){
    val input = readInput("numbers")
    println("Sum: ${countWords(input)}")

}
fun sumAllNums(input: List<String>):Int{
    var total = 0
    for(num in input){
        total += num.toInt()
    }
    return total

   // return input.map { it.toInt() }.sum()
}

fun findMin(input: List<String>):Int{
//    var min = Integer.MAX_VALUE
//    for(num in input){
//        if(num.toInt()< min){
//        min = num.toInt()
//        }
//    }
//    return min
    return input.map { it.toInt() }.min()
}

fun findTwoSmallest(input: List<String>):Int{
    val sorted = input.map{it.toInt()}.sorted()
    return sorted.take(2).sum()
}

//words separated by spaces
fun countWords(input: List<String>): Int{
    var total = 0
    for(i in input.indices){
        val words = input[i].split(" ")
        total+= words.size
    }
    return total
}

fun countHWords(input: List<String>):Int{
    var count =0
    for(line in input){
        count+= line.split(" ").count{ it.startsWith("h", true)
        }
    }
    return count
}