<!-- Fichier student-form.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>Student Registration Form</h2>
<form action="students" method="post">
    Name: <input type="text" name="name" value="${Student.getName()}" readonly><br>
    Age: <input type="text" name="age" value="${Student.getAge()}"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
