I am from test18.jsp</br>
<jsp:include page="test19.jsp">
<jsp:param value="abc" name="param1"/>
<jsp:param value="xyz" name="param2"/>
</jsp:include>
I am at end of test18.jsp</br>
Param1 : <%= request.getParameter("param1")%>
Param2 : <%= request.getParameter("param2")%></br>