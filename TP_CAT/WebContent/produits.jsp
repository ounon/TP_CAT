<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<div>
		<form action="chercher.do" method="get">
			<label>Mot Clé</label>
			<input type="text" name="motCle" />
			<button type="submit">Chercher</button>
		</form>
		<table>
			<tr>
				<th>ID</th>
				<th>DESIGNATION</th>
				<th>PRIX</th>
				<th>QUANTITE</th>
			</tr>
			<c:forEach items="${model.produits}" var="p">
				<tr>
					<td>${p.id}</td>
					<td>${p.designation}</td>
					<td>${p.prix}</td>
					<td>${p.quantite}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>