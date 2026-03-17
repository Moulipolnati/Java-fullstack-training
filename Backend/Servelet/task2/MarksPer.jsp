<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Printing marks in JSP</title>
</head>
<body>

<h3>Student Marks</h3>
<h4>Physics Marks: <%= request.getAttribute("phyMarks") %></h4>
<h4>Chemistry Marks: <%= request.getAttribute("cheMarks") %></h4>
<h4>Mathematics Marks: <%= request.getAttribute("mathMarks") %></h4>
<h4>Percentage: <%= request.getAttribute("percentage") %></h4>
</body>
</html>
