fun main(args: Array<String>){
    print("Enter Problem Number: ")

    val (number) = readLine()!!.split(' ')

    showSolution(number.toInt())
}

fun showSolution(problemNumber: Int){

    when(problemNumber){
        1 -> {
            val problem = Problem1()
            print("Enter a Number: ")
            val(num) = readLine()!!.split(' ').map(String::toInt)

            val answer = problem.solve(num)
            println("Answer: $answer")
        }
        else -> {
            println("No solution for this problem yet!")
        }
    }
}