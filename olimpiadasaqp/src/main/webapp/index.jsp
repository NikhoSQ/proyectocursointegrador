<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Iniciar Sesi�n | Olimpiadas AQP</title>
</head>
<body>
<div class="login_box">
	<h2>Olimpiadas AQP</h2>
	<form action="ServletLogin" method="POST">
		<p>Correo electr�nico:</p>
		<input type="email" name="email"> <br>

		<p>Contrase�a:</p>
		<input type="password" name="contrasena">
		
		<input type="submit" value="Iniciar Sesi�n">
	</form>
	<p>�No tienes una cuenta? <a href="registro.jsp">Reg�strate</a></p> <!-- Enlace al formulario de registro -->
</div>
</body>
</html>
