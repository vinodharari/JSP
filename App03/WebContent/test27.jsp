<jsp:useBean id="p1" class="com.lara.Person" scope="request"/>

<%out.println(p1.getHello());%></br>
<%= p1.getHello()%>