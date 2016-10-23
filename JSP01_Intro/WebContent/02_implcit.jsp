<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello I am in JSP again
	<br>
	<%
		test();
		System.out.println("value of i is : "+i);
		test1();
		System.out.println("value of j is : "+j);
		out.println("Hello this content is printed to browser from JSP");
	%>
	<%!
		int i = 10;
		private void test(){
			System.out.println("Test");
		}
	%>
	
	<%! int j=20; 
		private void test1(){
			System.out.println("this is from test1");
		}
	%>

</body>
</html>