/**
 * Smallest multiple
 *
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem5{
    fun solve(): Int{

        var smallest = 0
        var numberToTest = 1

        while (smallest==0){

            var count = 0

            for (c in 1..20){
                count = c

                if(numberToTest%c != 0){
                    break
                }
            }

            if(count >= 20){
                smallest=numberToTest
            }

            numberToTest++
        }

        return smallest
    }
}