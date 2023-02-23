<%@ include file="header.jsp" %>

	<p/>
	<form:form action = "login" modelAttribute="user">
		Email: <form:input path="email"/><br/>
		Password: <form:password path=""/><br/>
		<br/>
		<input type="submit" value="Submit">
		
		<small><a href="signup">Create account</a></small>
	</form:form>
	
	
	
	
</body>
</html>