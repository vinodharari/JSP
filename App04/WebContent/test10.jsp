<%@page import="com.lara.Employee"%>

<% Employee emp=(Employee)session.getAttribute("emp");
   out.println(emp.getParam1());
%>