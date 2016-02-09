<%--
  Created by IntelliJ IDEA.
  User: РђСЂС‚РµРј
  Date: 24.01.2016
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
  <title>Contact Book</title>
</head>
<body>

<div class="header"><h2>Submitted Contact Information</h2></div>
  <div class="mid">
    <table>
      <tr>
        <td>Name</td>
        <td>${contact.name}</td>
      </tr>
      <tr>
        <td>Age</td>
        <td>${contact.age}</td>
      </tr>
      <tr>
        <td>Phone</td>
        <td>${contact.phone}</td>
      </tr>
    </table>
 <table>
  <tr>
    <td width="150px"><form action="/Contact">
      <input type="submit" value="New Contact">
    </form></td>
    <td width="150px"><form action="/allContacts">
      <input type="submit" value="Show All">
    </form></td>
    <td width="150px"><form action="/">
      <input type="submit" value="Back">
    </form></td>
  </tr>
</table>
  </div>

</body>
</html>
