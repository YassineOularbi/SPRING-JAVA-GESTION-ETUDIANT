<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
</head>
<body>
<h2>Liste des étudiants</h2>
<table>
    <tr>
        <th>Nom</th>
        <th>Age</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.getName()}</td>
            <td>${student.getAge()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
