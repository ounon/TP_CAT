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
			<table>
				<tr>
					<td>ID</td>
					<td>${produit.id}</td>
				</tr>
				<tr>
					<td>DESIGNATION</td>
					<td>${produit.designation}</td>
				</tr>
				<tr>
					<td>PRIX</td>
					<td>${produit.prix}</td>
				</tr>
				<tr>
					<td>QUANTITE</td>
					<td>${produit.quantite}</td>
				</tr>
			</table>

	</div>
	
</body>
</html>