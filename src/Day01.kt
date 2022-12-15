fun main() {

//    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    println(part1(testInput))
//    //println(part2(input))
    //748958

    val input = readInput("Day01")
    println(cals3Elves(input))
    //println(part2(input))
}
    fun countCalsPerElf(input: List<String>): Int {
        var maxCount = 0
        var current = 0
        for(num in input){
            if(num != ""){
                current += num.toInt()
            }
            else{
                if(current > maxCount){
                    maxCount = current
                }
                current = 0
            }
        }
        if(current > maxCount){
            maxCount = current
        }
        return maxCount
    }

    fun cals3Elves(input: List<String>): Int {
        val arrayList = ArrayList<Int>()
        var current = 0
        for(num in input){
            if(num != ""){
                current += num.toInt()
            }
            else{
                arrayList.add(current)
                current = 0
            }
        }
        val sorted = arrayList.map{it}.sortedDescending()
        return sorted.take(3).sum()
    }



