<h1 id="exercise_1_pascals_triangle">Exercise 1: Pascal’s Triangle</h1>
<p>The following pattern of numbers is called <em>Pascal’s triangle</em>.</p>
<pre><code>    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
   ...</code></pre>
<p>The numbers at the edge of the triangle are all <code>1</code>, and each number inside the triangle is the sum of the two numbers above it. Write a function that computes the elements of Pascal’s triangle by means of a recursive process.</p>
<p>Do this exercise by implementing the <code>pascal</code> function in <code>Main.scala</code>, which takes a column <code>c</code> and a row <code>r</code>, counting from <code>0</code> and returns the number at that spot in the triangle. For example, <code>pascal(0,2)=1</code>, <code>pascal(1,2)=2</code> and <code>pascal(1,3)=3</code>.</p>
<pre><code>def pascal(c: Int, r: Int): Int</code></pre>