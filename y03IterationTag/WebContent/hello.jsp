<%@taglib uri="/WEB-INF/hello.tld" prefix="vinod" %>
<%@page import="com.vinod.Person"%>

<html>
<head>
<title>JSP action</title>
</head>
<body>
	<jsp:useBean id="personBean" class="com.vinod.Person" scope="application">
	</jsp:useBean>
	<%!String str="this is a message"; 
	int id=200; %>
	<jsp:setProperty property="id" name="personBean" value="100"/>
	<jsp:setProperty property="name" name="personBean" value="vinod"/>
	Before custom tag<br/>

	<vinod:helloTag id="1008" message="jain jinendra" count="5">
		THIS IS BODY
	</vinod:helloTag>
</body>
</html>