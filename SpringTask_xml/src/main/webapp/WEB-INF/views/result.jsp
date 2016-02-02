<%--
  Created by IntelliJ IDEA.
  User: РђСЂС‚РµРј
  Date: 24.01.2016
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Contact book</title>
</head>
<body>

<h2>Submitted Contact Information</h2>
<table>
  <tr>
    <td>Name</td>
    <td>${name}</td>
  </tr>
  <tr>
    <td>Age</td>
    <td>${age}</td>
  </tr>
  <tr>
    <td>Phone</td>
    <td>${phone}</td>
  </tr>
</table>
</body>
</html>
