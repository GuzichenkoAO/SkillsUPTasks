
<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 29.01.2016
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
    <title>All Contacts</title>
</head>
<body>
<div class="header"><h2>Contact Book</h2></div>
<div class="mid">
<table>
  <tr>
  <td width="145px"><h3>Name</h3></td>
  <td width="145px"><h3>Age</h3></td>
  <td width="145px"><h3>Phone</h3></td>
  </tr>
</table>
</div>
<div class="mid"><table>
  <c:forEach var="listValue" items="${list}">
    <tr>
      <td width="150px">${listValue.name}</td>
      <td width="150px">${listValue.age}</td>
      <td width="150px">${listValue.phone}</td>
      <td width="75px"><form><input type="submit" value="details"/></form> </td>
      <td width="75px"><form><input type="submit" value="delete"/></form> </td>
    </tr>
  </c:forEach>
</table>
  <form action="/">
    <input type="submit" value="Back">
  </form></div>
</body>
</html>
