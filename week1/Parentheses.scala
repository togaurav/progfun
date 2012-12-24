package week1

object Parenthesis {
  
  def balance(chars: List[Char]): Boolean = {
    
    /*
     * Counts the amount of open round brackets in a list 
     * of characters.
     * @param chars The list of charcters.
     * @param open The amount of open brackets.
     * @return The amount of open brackets or -1 if a 
     * closing bracket is encountered with no open bracket.
     */
    def balanceIter(chars: List[Char], open: Int): Int =
      if(chars.isEmpty) open
      else if(chars.head == ')' && open == 0) -1
      else if(chars.head == ')') 
        balanceIter(chars.tail, open - 1)
      else if(chars.head == '(') 
        balanceIter(chars.tail, open + 1)
      else
        balanceIter(chars.tail, open)

    if(balanceIter(chars, 0) == 0) true else false
  }

  def main(args: Array[String]) {
    println("\":-)\"  -> "+balance(":-)".toList))
    println("\"())(\" -> "+balance("())(".toList))

    println("\"(if(zero? x) max (/ 1x))\" -> "+
      balance("(if(zero? x) max (/ 1x))".toList))
  }
}
