fun main() {
    val input = readInput("Day02")
    println(rockPaperScissorsAnnoying(input))
}
//x is rock - 1pt
//y is paper - 2pt
//z is scissors -3pt

//a is rock
//b is paper
//c is scissors

// 0pt loss, 3pt draw, 6pt win
fun rockPaperScissors(input: List<String>): Int{
    var total = 0
    for(line in input){
        var elf = line.substring(0,1)
        var you = line.substring(2)
        if(you == "X")
            total+=1
        if(you == "Y")
            total+=2
        if(you == "Z")
            total+=3
        if(elf =="A" && you== "X")
            total+=3
        if(elf =="B" && you== "Y")
            total+=3
        if(elf =="C" && you== "Z")
            total+=3
        if(you=="Y" && elf =="A")
            total+=6
        if(you =="Z" && elf =="B")
            total+=6
        if(you=="X"&& elf =="C")
            total+=6
    }
    return total
}

fun rockPaperScissorsAnnoying(input: List<String>): Int{
    var total = 0
    for(line in input){
        var elf = line.substring(0,1)
        var result = line.substring(2)

        if(result == "X")
            total+=0
        if(result == "Y")
            total+=3
        if(result == "Z")
            total+=6

        if(elf =="A" && result== "X")
            total+=3
        if(elf =="A" && result== "Y")
            total+=1
        if(elf =="A" && result== "Z")
            total+=2

        if(elf =="B" && result== "X")
            total+=1
        if(elf =="B" && result== "Y")
            total+=2
        if(elf =="B" && result== "Z")
            total+=3

        if(elf =="C" && result== "X")
            total+=2
        if(elf =="C" && result== "Y")
            total+=3
        if(elf =="C" && result== "Z")
            total+=1

    }
    return total
}
