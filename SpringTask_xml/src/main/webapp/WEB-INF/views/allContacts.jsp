
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
    <title></title>
</head>
<body>
<table>
  <c:forEach var="listValue" items="${list}">
    <tr>
      <td>${listValue.name}</td>
      <td>${listValue.age}</td>
      <td>${listValue.phone}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
