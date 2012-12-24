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

<h1 id="exercise_2_parentheses_balancing">Exercise 2: Parentheses Balancing</h1>
<p>Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a <code>List[Char]</code> not a <code>String</code>. For example, the function should return <code>true</code> for the following strings:</p>
<ul>
<li>(if (zero? x) max (/ 1 x))</li>

<li>I told him (that it’s not (yet) done). (But he wasn’t listening)</li>
</ul>
<p>The function should return <code>false</code> for the following strings: </p>
<ul>
<li>:-)</li>
<li>())(</li>
</ul>
<p></p>
<p>The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.</p>
<p>Do this exercise by implementing the <code>balance</code> function in <code>Main.scala</code>. Its signature is as follows:</p>
<pre><code>def balance(chars: List[Char]): Boolean</code></pre>
<p>There are three methods on <code>List[Char]</code> that are useful for this exercise:</p>
<ul>
<li><code>chars.isEmpty: Boolean</code> returns whether a list is empty</li>

<li><code>chars.head: Char</code> returns the first element of the list</li>

<li><code>chars.tail: List[Char]</code> returns the list without the first element</li>
</ul>
<p><strong>Hint</strong>: you can define an inner function if you need to pass extra parameters to your function.</p>
<p><strong>Testing</strong>: You can use the <code>toList</code> method to convert from a <code>String</code> to a <code>List[Char]</code>: e.g. <code>"(just an) example".toList</code>.</p>