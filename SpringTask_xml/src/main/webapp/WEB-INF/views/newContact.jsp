<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 24.01.2016
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
  <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
  <title>Contact book</title>
</head>
<body>

<div class="header"><h2>Contact Book</h2></div>
<div class="mid">
<form:form method="POST" commandName="contact" action="/addContact">
  <table>
    <tr>
      <td><form:label path="name">Name</form:label></td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td><form:label path="age">Age</form:label></td>
      <td><form:input path="age" /></td>
    </tr>
    <tr>
      <td><form:label path="phone">Phone</form:label></td>
      <td><form:input path="phone" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Add Contact"/>
      </td>
    </tr>
  </table>
</form:form>
  <form action="/">
    <input type="submit" value="Back">
  </form>
</div>
</body>
</html>
