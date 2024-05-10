<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StudentForm</title>
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
            <td>
                <a href="remove-student/${student.getId()}">Remove</a>
            </td>
            <td>
                <a href="update-student/${student.getId()}">Remove</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
