/**
 * Summation of primes
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
class Problem10{
    fun solve(): Long{
        // val limit = 14L
        val limit = 20L
        var sum = 0L

        for (n in 2..(limit-1)){
            if(isPrime(n)){
                sum += n
            }
        }

        return sum
    }

    private fun isPrime(paramNum: Long): Boolean{
        for (n in 2..(paramNum-1)){
            if(paramNum%n==0L){
                return false
            }
        }

        return true
    }
}