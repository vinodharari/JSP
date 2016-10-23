<jsp:useBean id="emp" class="com.lara.Employee" scope="request"/>
<%@page import="com.lara.Employee"%>

<% //Employee emp=(Employee)request.getAttribute("emp");
   out.println(emp.getParam1());
%>