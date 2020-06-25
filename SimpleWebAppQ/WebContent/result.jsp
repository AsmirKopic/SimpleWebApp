<%@ page import="java.util.*" %>


<html>
<body>

<h1 align="center"> Result // Score </h1>
<p>

<%
//Display number of correct answers

int correctAnsw = (Integer)request.getAttribute("answers");
out.print("<br> Number of correct answers " + correctAnsw);

 %>

</body>
</html>