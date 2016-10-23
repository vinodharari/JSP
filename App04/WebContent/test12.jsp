<%@page import="com.lara.Employee"%>

<% Employee emp=(Employee)application.getAttribute("emp");
   out.println(emp.getParam1());
%>