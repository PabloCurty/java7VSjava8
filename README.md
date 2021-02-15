<p><strong># java7VSjava8</strong></p>
<p><em>project to exercise some differences from java 7 to java 8, using lambdas, streams, functional programming. Examples: Sort, TXT search, Find clients by state, Rules engine.</em></p>
<p><br></p>
<p><strong><span style="font-size: 20px;">Imperative paradigm VS Functional paradigm</span></strong></p>
<p><br></p>
<p><span style="font-size: 18px;"><strong>Imperative</strong></span></p>
<p>The sequence of instructions that change variables in memory.</p>
<p><br></p>
<p><em><span style="background-color: rgb(0, 0, 0);"><strong><span style="color: rgb(255, 255, 255);">int total = 0;</span></strong></span></em></p>
<p><span style="background-color: rgb(0, 0, 0);"><span style="color: rgb(255, 255, 255);"><strong><em>for (int i = 0: i &lt; 10: i++){</em></strong></span></span></p>
<p><span style="background-color: rgb(0, 0, 0);"><span style="color: rgb(255, 255, 255);"><strong><em>&nbsp; &nbsp; total += i;</em></strong></span></span></p>
<p><em><span style="background-color: rgb(0, 0, 0);"><strong><span style="color: rgb(255, 255, 255);">}</span></strong></span></em></p>
<p><br></p>
<p><span style="font-size: 18px;"><strong>Functional</strong></span></p>
<p>Set of function definitions that we apply to values.</p>
<p>Immutability.</p>
<p><br></p>
<p><em><span style="background-color: rgb(0, 0, 0);"><strong><span style="color: rgb(255, 255, 255);">double volCilindro(double r, double h){</span></strong></span></em></p>
<p><span style="color: rgb(255, 255, 255);"><span style="background-color: rgb(0, 0, 0);"><strong><em>&nbsp; &nbsp; return volCirculo(r) * h;</em></strong></span></span></p>
<p><span style="color: rgb(255, 255, 255);"><span style="background-color: rgb(0, 0, 0);"><strong><em>}</em></strong></span></span></p>
<p><span style="color: rgb(255, 255, 255);"><span style="background-color: rgb(0, 0, 0);"><strong><em>double volCirculo(double r){</em></strong></span></span></p>
<p><span style="color: rgb(255, 255, 255);"><span style="background-color: rgb(0, 0, 0);"><strong><em>&nbsp; &nbsp; return Math.PI * r * r;</em></strong></span></span></p>
<p><em><span style="background-color: rgb(0, 0, 0);"><strong><span style="color: rgb(255, 255, 255);">}</span></strong></span></em></p>
<p><br></p>
<p><span style="font-size: 17px;"><strong><span style="background-color: rgb(0, 0, 0); color: rgb(209, 213, 216);">Functional programing -&gt; Lambda + Stream</span></strong></span></p>
<p><br></p>
<p><strong>Sort -&gt;</strong></p>
<p><br></p>
<p><strong>Find in TXT -&gt;</strong></p>
<ul>
    <li>Imperative to functional</li>
    <li>No explicit control variables</li>
    <li>Efficiency and better readability</li>
    <li>Using streams and filters</li>
</ul>
<p>Java 7 -&gt; Buffered Reader,<br><br>Java 7 -&gt; Using Files, but you need to put all file content in memory, if you have a big file it will be a problem.</p>
<p>Java 8 -&gt; Functional the File class has lines that transform in a Stream for lines.</p>
<p><br></p>
<p><strong>Group by per state -&gt;</strong></p>
<p>Java 7 - Given a list of customers, we want to transform it into MAP and then a group from that list by state.</p>
<p>Java 8 - Take the list of customers and create a Stream, each element of the Stream will be a customer. To group we use collectors, java already has several collectors implemented, let&apos;s use a Group By.</p>
<p><strong>Rules Engine -&gt;</strong></p>
<p>Using the Predicate interface, this interface is already a rule engine.</p>
<p>Transforming a complex structure to a functional method</p>
<p><br></p>