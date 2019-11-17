<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Todo list</title>

</head>

<body>
	
	<div >
	
		<div >
		
			
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>ToDo Name</th>
					<th>Description</th>
					<th>Due Date</th>
					<th>Is Done?</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempToDo" items="${todolist}">									
					
					<tr>
						<td> ${tempToDo.getTodoName()} </td>
						<td> ${tempToDo.getDescription()} </td>
						<td> ${tempToDo.isDone()} </td>						
						<td>${tempToDo.getDueDate()}</td>
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	


</body>

</html>










