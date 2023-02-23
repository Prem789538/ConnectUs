<%@ include file="header.jsp" %>

<form:form action="signup" modelAttribute="user">
	Name: <form:input path="name"/><br/>
	Email: <form:input path="email"/><br/>
	Password: <form:password path="password"/><br/>
	
	<input type="submit" value="Submit">
</form:form>

</body>
</html>