fun main() {
    val input = readInput("Day03")
    println(rucksackPriorities(input))
}

fun rucksackPriorities(input: List<String>): String {
    var total = 0
    var foundDuplicate = false
    var character = ""
    for(line in input){
        var seg1 = line.substring(0, (line.length)/2)
        var seg2 = line.substring((line.length)/2+1)
        while(!foundDuplicate){
            for(i in seg1.indices){
                character = seg1.substring(i, i+1)
                for(j in seg2.indices){
                    if(character==seg2.substring(j, j+1))
                        foundDuplicate = true
                }
            }
        }



    }
    return character
}
