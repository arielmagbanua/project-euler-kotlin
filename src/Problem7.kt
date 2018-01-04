/**
 * 10001st prime
 * Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
class Problem7{

    fun solve(): Int{
        var primeCounter = 0
        var counter = 2

        while (true){
            if(isPrime(counter)){
                ++primeCounter

                if(primeCounter==10001){
                    break
                }
            }

            ++counter
        }

        return counter
    }

    private fun isPrime(paramNum: Int): Boolean{
        for (n in 2..(paramNum-1)){
            if(paramNum%n==0){
                return false
            }
        }

        return true
    }
}