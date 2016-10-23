<%@ page import="java.util.*"%>

<%!
int i=10;
int add(int x, int y) {
	return x+y;
}
%>

<% 
int i=20;
i++;
i=i+add(i, this.i);
this.i=30;
%>

<%= i %></br>
<%= this.i %></br>
