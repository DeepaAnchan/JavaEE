
<!DOCTYPE html>



<%@ page contentType="text/html" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" isELIgnored="false"%>
<html lang="en">
<head>
<title>list all customer</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src= "https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"> </script>
</head>
	
<body>
	 <%
      if (session != null) {
    	  //out.println(session.getId());
         if (session.getAttribute("user") != null) {
            String name = (String) session.getAttribute("user");
            out.print("Hello, " + name + "  Welcome to ur Profile");
         } else {
            response.sendRedirect("index.jsp");
         }
      }
   %>
   </br>
   </br>
   <form action="Logout" method="post">
      <input type="submit" value="Logout">
   </form>
	

	<div id="container">
		<div id="wrapper">
			<div id="header">
				<h2>CRM - Customer Relationship Manager</h2>
			</div>
		</div>
		
	</div>
	
	<div class="container">
	
		<div id="content">


			<input type="button" value="Add Customer"
				onclick="window.location.href='add-customer.jsp'; return false;"
				class="add-button" />
		</div>
		<div>
			<form action="SearchServlet.do">

				<input name="search" type="text" /><input type="submit"
					value="search">
			</form>
		</div>
		<div>
				<form action="SortServlet.do">
					<select name="Sort">
						<option value="ASC">Ascending</option>
						<option value="DESC">Descending</option>
					</select>
					<input type="submit" value="search">
				</form>
		</div>
	
		<h2>Customer Details</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>


				</tr>
			</thead>
			<tbody>
			<!-- <a href='
									<c:url value="Update.do">
										<c:param name="CustomerId2" value="${tempCustomer.id }"></c:param>								
									</c:url>
									'>Update</a> -->
		
					 <c:forEach var="tempCustomer" items="${customers}">
					 		
						     <tr>		
						     	<td>${tempCustomer.id}</td>						     	        
							     <td><input class = "${tempCustomer.id}" type="text" name="input2" value="${tempCustomer.firstName}" disabled/></td>
							     <td><input class = "${tempCustomer.id}" type="text" name="input2" value="${tempCustomer.lastName}" disabled/></td>
							     <td><input class = "${tempCustomer.id}" type="text" name="input2" value="${tempCustomer.email}" disabled/></td>
							     <td><a href='
									<c:url value="delete.do">
										<c:param name="CustomerId" value="${tempCustomer.id }"></c:param>								
									</c:url>
									'>Delete</a>
									<a href='
									<c:url value="Update.do">
										<c:param name="CustomerId2" value="${tempCustomer.id }"></c:param>								
									</c:url>
									'>Update</a>
									<!-- 
										<button onclick="enable_disable(${tempCustomer.id}); myFunction();">Update</button>
										<button id="submit_update"  style="display:none;" >Submit</button>
									 -->
									
								</td>
						     </tr>    
    				 </c:forEach>
			</tbody>
		</table>
	</div>
	<script>  
        function enable_disable(x) {
            //alert(""+s) ;
            $("input[class='"+x+"']").prop('disabled', false); 

            <!--  $("input[class='"+x+"']").prop('disabled',function( i, val ) {
            	  return !val;
            }); 

            -->
        } 
        function myFunction() {
        	  var x = document.getElementById("submit_update");
        	  if (x.style.display === "none") {
        	    x.style.display = "inline";
        	  } else {
        	    x.style.display = "none";
        	  }
        }
    </script>
</body>
</html>