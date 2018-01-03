/**
 * Largest prime factor
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
class Problem3 {

    fun solve(paramNum: Long): Long {

        var largest: Long = 0

        if(isPrime(paramNum)){

            largest = paramNum

        } else {

            println("Prime Factors are: ")

            for(n in 2..paramNum){

                if(paramNum%n==0L && n<paramNum){

                    // Determine if this number is prime
                    if(isPrime(n)){
                        largest=n
                        println("$n ")
                    }
                }
            }
        }

        return largest
    }

    private fun isPrime(paramNum: Long): Boolean {

        var isPrime = true

        loop@ for(n in 2..paramNum){

            // println("$n")
            // val haller = paramNum%n
            // println("paramNum%n = $haller")

            if(paramNum%n==0L && n<paramNum){
                isPrime = false
                break@loop
            }
        }

        return isPrime
    }
}