fun main(args: Array<String>){
    print("Enter Problem Number: ")

    val (number) = readLine()!!.split(' ')

    showSolution(number.toInt());
}

fun showSolution(problemNumber: Int){

    when(problemNumber){
        1 -> print(problemNumber)
        else -> {
            println("No solution for this problem yet!")
        }
    }
}