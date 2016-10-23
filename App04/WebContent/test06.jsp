<%@page import="com.lara.Employee"%>
<jsp:useBean id="emp" class="com.lara.Employee"/>

<%emp.setParam1("abc");%>

<%=emp.getParam1()%></br>

<% Employee emp1=(Employee)pageContext.getAttribute("emp");
   out.println(emp1.getParam1());
%>