<%@ page import="java.util.*"%>

<% Date d1=new Date();
String s1=Arrays.toString(new int[] {90,12,56,333});
ArrayList list=new ArrayList();
list.add(90);
list.add(910);
list.add(190);
%>

Todays Date : <%=d1%></br>
Array Content : <%=s1%></br>
Array List Content : <%=list%></br>