<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des étudiants</title>
</head>
<body>
<h2>Liste des étudiants</h2>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">ID Number</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Phone Number</th>
        <th scope="col">Has PC</th>
        <th scope="col">Has Bike</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.studentIDNumber}</td>
            <td>${student.studentName}</td>
            <td>${student.studentEmail}</td>
            <td>${student.studentPhoneNumber}</td>
            <td>${student.studentHasPCNumber}</td>
            <td>${student.studentHasBike}</td>
            <td>
                <a href="remove-student/${student.studentIDNumber}" class="btn btn-danger">Supprimer</a>
                <a href="update-student/${student.studentIDNumber}" class="btn btn-primary">Modifier</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

