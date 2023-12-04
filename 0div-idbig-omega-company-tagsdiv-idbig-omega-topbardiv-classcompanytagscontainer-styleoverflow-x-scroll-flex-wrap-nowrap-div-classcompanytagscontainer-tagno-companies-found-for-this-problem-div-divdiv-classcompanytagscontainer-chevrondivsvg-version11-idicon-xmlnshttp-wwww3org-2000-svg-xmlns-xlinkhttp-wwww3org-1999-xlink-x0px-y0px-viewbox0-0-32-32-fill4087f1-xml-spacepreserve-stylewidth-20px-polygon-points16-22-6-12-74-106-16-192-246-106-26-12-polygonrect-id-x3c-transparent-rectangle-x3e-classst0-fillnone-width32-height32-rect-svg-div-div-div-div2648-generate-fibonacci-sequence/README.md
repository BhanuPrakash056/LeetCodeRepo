<h2><a href="https://leetcode.com/problems/generate-fibonacci-sequence/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2648. Generate Fibonacci Sequence</a></h2><h3>Easy</h3><hr><div><p>Write a generator function that returns a generator object which yields the&nbsp;<strong>fibonacci sequence</strong>.</p>

<p>The&nbsp;<strong>fibonacci sequence</strong>&nbsp;is defined by the relation <code>X<sub>n</sub>&nbsp;= X<sub>n-1</sub>&nbsp;+ X<sub>n-2</sub></code>.</p>

<p>The first few numbers&nbsp;of the series are <code>0, 1, 1, 2, 3, 5, 8, 13</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> callCount = 5
<strong>Output:</strong> [0,1,1,2,3]
<strong>Explanation:</strong>
const gen = fibGenerator();
gen.next().value; // 0
gen.next().value; // 1
gen.next().value; // 1
gen.next().value; // 2
gen.next().value; // 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> callCount = 0
<strong>Output:</strong> []
<strong>Explanation:</strong> gen.next() is never called so nothing is outputted
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= callCount &lt;= 50</code></li>
</ul>
</div>