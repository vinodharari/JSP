<html>
 <head>
   <title>JSP</title>
 </head>
 <body>
	Hello I am in JSP
	<%
		System.out.println("This is JSP Scriptlet1");
	%>
	<%
		int i=10;
		System.out.println(i);
		System.out.println("This is JSP Scriptlet2");
		System.out.println("This is JSP Scriptlet3");
		session.setAttribute("pi",3.142);
		System.out.println(session.getAttribute("pi"));
	%>	


 </body>
</html>
