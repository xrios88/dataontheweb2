<%@ page import="com.ironyard.data.Person" %><%--
  Created by IntelliJ IDEA.
  User: Banksy
  Date: 1/12/17
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Your financial results!</title>
</head>
<body>
Thank you for your inquiry!
<br>
<br>
<%
    Person p = (Person)request.getAttribute("person");
%>
Hello, your name is <%=request.getAttribute("fName")%> <%=request.getAttribute("lName")%> and you would like to invest $<%=request.getAttribute("iAmount")%>0!
<br>
<br>
The total return you're seeking with your initial investment included is $<%=request.getAttribute("iReturn")%>0!
<br>
<br>

<%=request.getAttribute("fName")%>, <%=request.getAttribute("eval")%>!
</body>
</html>