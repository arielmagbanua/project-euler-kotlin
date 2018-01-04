/**
 * Largest palindrome product
 *
 * Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
class Problem4{
    fun solve(): Int{

        var num1 = 0
        var num2 = 0
        var largestPalindrome = 0

        for (c in 100..999){
            for (n in 100..999){
                num1 = c * n
                num2 = reverse(num1)

                if(num1==num2 && largestPalindrome < num2){
                    largestPalindrome = num2
                }
            }
        }

        return largestPalindrome
    }

    private fun reverse(paramNum: Int): Int{

        var num = paramNum
        var reversed = 0

        while (num>0){
            reversed = reversed*10 + (num % 10)
            num /= 10
        }

        return reversed
    }
}