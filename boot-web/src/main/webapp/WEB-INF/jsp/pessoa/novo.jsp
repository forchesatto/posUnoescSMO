<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro pessoa</title>
</head>
<body>

	<form action="/pessoa/salvar" method="post">

		<label for="nome"> Nome </label>
		<input type="text" name="nome" id="nome">
		<label for="cpf"> CPF </label>
		<input type="text" name="cpf" id="cpf">
		
		<button type="submit">Salvar</button>
		<a href="/pessoa/listar">Cancelar</a>
	</form>
</body>
</html>