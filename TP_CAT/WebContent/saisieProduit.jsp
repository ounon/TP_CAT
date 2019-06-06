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
		<form action="saveProduit.do" method="post">
			<table>
				<tr>
					<td>DESIGNATION</td>
					<td><input type="text" name="designation"/></td>
				</tr>
				<tr>
					<td>PRIX</td>
					<td><input type="text" name="prix"/></td>
				</tr>
				<tr>
					<td>QUANTITE</td>
					<td><input type="text" name="quantite"/></td>
				</tr>
			</table>
			<div>
				<button type="submit">Ajouter</button>
			</div>
		</form>
	</div>
	
</body>
</html>