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
            val largestNumber = problem.solve()
            println("The largest palindrome made from the product of two 3-digit numbers is $largestNumber")
        }
        5 -> {
            val problem = Problem5()
            val answer = problem.solve()
            println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is $answer")
        }
        6 -> {
            val problem = Problem6()
            val answer = problem.solve()
            println("Difference: $answer")
        }
        7 -> {
            val problem = Problem7()
            val answer = problem.solve()
            println("The 10001st prime number is $answer")
        }
        8 -> {
            val problem = Problem8()
            val answer = problem.solve()
            println("Largest Product of 13 adjacent numbers is $answer")
        }
        9 -> {
            val problem = Problem9()
            val answer = problem.solve()
            println("Product: $answer")
        }
        10 -> {
            val problem = Problem10()
            val answer = problem.solve()
            println("Sum: $answer")
        }
        else -> {
            println("No solution for this problem yet!")
        }
    }
}