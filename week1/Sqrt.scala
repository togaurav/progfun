package week1

/**
 * Finds square root of a number with Newton's method.
 */
object Sqrt {
  def abs(x: Double) = if(x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double = 
    if(isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) = 
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  def main(args: Array[String]) {
    println("Square root of 2 is "+sqrt(2)+"\n"+
      "Square root of 4 is "+sqrt(4)+"\n"+
      "Square root of 1e-6 is "+sqrt(1e-6)+"\n"+
      "Square root of 1e60 is "+sqrt(1e60))
  }
}

/**
 * Same as Sqrt, but uses lexical scoping to hide functions 
 * that should not be called directly.
 */
object SimplifiedSqrt {
  def abs(x: Double) = if(x < 0) -x else x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double = 
      if(isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) = 
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

  def main(args: Array[String]) {
    println("Square root of 2 is "+sqrt(2)+"\n"+
      "Square root of 4 is "+sqrt(4)+"\n"+
      "Square root of 1e-6 is "+sqrt(1e-6)+"\n"+
      "Square root of 1e60 is "+sqrt(1e60))
  }
}
