package week1

object Pascal {
  def pascal(c: Int, r: Int): Int = 
    if(c <= 0 || c >= r) 1
    else pascal(c, r-1) + pascal(c-1,r-1)

  def main(args: Array[String]) {
    println("column: 0 row: 2 = "+pascal(0,2))
    println("column: 1 row: 2 = "+pascal(1,2))
    println("column: 1 row: 3 = "+pascal(1,3)) 
  }
}
