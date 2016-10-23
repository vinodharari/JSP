<% String s1=request.getParameter("username");
	if(s1==null){
		s1="";
	}
	String s2=(String)request.getParameter("errorMessage");
	if(s2==null){
		s2="";
	}
%>
<%=s2%>

<form action="LoginServlet">
Username : <input type="text" name="username" value="<%=s1%>"/></br>
Passwrd : <input type="password" name="password"/></br>
			<input type="submit" value="submit"/>
</form>