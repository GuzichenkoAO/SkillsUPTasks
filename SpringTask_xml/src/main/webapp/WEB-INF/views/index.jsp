<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Артем
  Date: 25.01.2016
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
  <title>Contact Book</title>
</head>
<body>

<div class="header"><h2>Contact Book</h2></div>
<div class="mid">
<table>
  <tr>
    <td width="150px"><form action="/Contact">
      <input type="submit" value="New Contact">
    </form></td>
    <td width="150px"><form action="/allContacts">
      <input type="submit" value="Show All">
    </form></td>
    <td width="150px"></td>
  </tr>
</table>
</div>

</body>
</html>
