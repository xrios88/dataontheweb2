<%--
  Created by IntelliJ IDEA.
  User: Banksy
  Date: 1/12/17
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Xavier Financial</title>
</head>
<body>
<h1>Welcome to Xavier Financial!</h1>
<br>
<br>
<form action="/hello" method="post">
  <table>
    <tr><td>First Name:</td><td><input type="text" name="firstName"></td></tr>
    <tr><td>Last Name:</td><td><input type="text" name="lastName"></td></tr>
    <tr><td>Investment Amount:</td><td><input type="text" name="investAmount"></td></tr>
    <tr><td>Investment Return:</td><td><input type="text" name="investReturn"></td></tr>
  </table>
  <p>
    <input type="Submit">
  </p>
</form>
</body>
</html>