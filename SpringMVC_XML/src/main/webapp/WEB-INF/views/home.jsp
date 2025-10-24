<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is the home page ${name}</h1>
	<form action="signup" method="post">
	<label>Email : </label>
	<input type="text" name="email">
	<br><br>
	<label>Password : </label>
	<input type="password" name="password">
	<br>
	<input type="submit" value="submit"> 
</form>
</body>
</html>