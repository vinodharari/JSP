<html>
 <head>
   <title>JSP</title>
 </head>
 <body>
	<jsp:forward page="another.jsp">
		<jsp:param value="this is forwarded from action" name="message"/>
	</jsp:forward>
	Hello this is from source
 </body>
</html>
