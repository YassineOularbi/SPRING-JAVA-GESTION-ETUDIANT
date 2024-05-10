<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Édition d'étudiant</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2>Édition d'étudiant</h2>
    <form action="update-student" method="post">
        <div class="form-group">
            <label for="studentIDNumber">ID Number:</label>
            <input type="text" class="form-control" id="studentIDNumber" name="studentIDNumber" value="${student.studentIDNumber}" readonly>
        </div>
        <div class="form-group">
            <label for="studentName">Name:</label>
            <input type="text" class="form-control" id="studentName" name="studentName" value="${student.studentName}" readonly>
        </div>
        <div class="form-group">
            <label for="studentEmail">Email:</label>
            <input type="email" class="form-control" id="studentEmail" name="studentEmail" value="${student.studentEmail}">
        </div>
        <div class="form-group">
            <label for="studentPhoneNumber">Phone Number:</label>
            <input type="text" class="form-control" id="studentPhoneNumber" name="studentPhoneNumber" value="${student.studentPhoneNumber}">
        </div>
        <div class="form-group">
            <label for="studentProfilePicture">Profile Picture:</label>
            <input type="text" class="form-control-file" id="studentProfilePicture" name="studentProfilePicture">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="studentHasPCNumber" name="studentHasPCNumber" ${student.studentHasPCNumber ? 'checked' : ''}>
            <label class="form-check-label" for="studentHasPCNumber">Has PC Number</label>
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="studentHasBike" name="studentHasBike" ${student.studentHasBike ? 'checked' : ''}>
            <label class="form-check-label" for="studentHasBike">Has Bike</label>
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
