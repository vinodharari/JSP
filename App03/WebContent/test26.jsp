<%@ page import="com.lara.Person"%>

<%
Person p1=new Person();
out.println(p1.getHello());
%></br>
<%= p1.getHello()%>