<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Login</title>

</head>

<body>
	
	

	<div >
		<h3>lOGIN FORM</h3>
	
		<form:form action="loginSubmit" modelAttribute="customer" method="POST">
			
			
					
			<table>
				<tbody>
					<tr>
						<td><label>User name:</label></td>
						<td><form:input path="userName" /></td>
					</tr>
				
					

					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="SUBMIT" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		
	
	</div>

</body>

</html>










