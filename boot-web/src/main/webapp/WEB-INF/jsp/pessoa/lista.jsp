<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de pessoas</title>
</head>
<body>

	<a href="/pessoa/novo">Nova pessoa</a>
	
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>CPF</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pessoas}" var="pessoa">
				<tr>
					<td>${pessoa.codigo}</td>
					<td>${pessoa.nome}</td>
					<td>${pessoa.cpf}</td>
				</tr>
			</c:forEach>
		</tbody>	
	</table>
	
</body>
</html>








