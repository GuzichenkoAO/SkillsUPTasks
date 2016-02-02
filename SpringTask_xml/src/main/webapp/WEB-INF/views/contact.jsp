<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 24.01.2016
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
  <title>Contact book</title>
</head>
<body>

<h2>Contact book</h2>
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
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
