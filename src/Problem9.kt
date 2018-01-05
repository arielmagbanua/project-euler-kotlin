/**
 * Special Pythagorean triplet
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 */
class Problem9 {
    fun solve(): Int{
        var sum = 1000
        var product = 1
        var a: Int

        for (a in 1..sum/3){
            var b: Int

            for (b in (a+1)..sum/2){
                var c = sum - a - b

                if(a*a + b*b == c*c){
                    println("a=$a, b=$b, c=$c")
                    product = a * b * c
                }
            }
        }

        return product
    }
}