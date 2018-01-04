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
        2 -> {
            val problem = Problem2()
            val testValue: Int = 4000000
            println("Term < $testValue \n")
            val answer = problem.solve(testValue)
            println("Answer: $answer")
        }
        3 -> {
            val problem = Problem3()
            print("Enter a Number: ")
            val(num) = readLine()!!.split(' ').map(String::toLong)
            val answer = problem.solve(num)
            println("The largest prime factor of the number $num is $answer")
        }
        4 -> {
            val problem = Problem4()
            var largestNumber = problem.solve()
            println("The largest palindrome made from the product of two 3-digit numbers is $largestNumber")
        }
        else -> {
            println("No solution for this problem yet!")
        }
    }
}