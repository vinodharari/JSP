<%@ page import="java.util.*"%>

<%!
Date d1=new Date();
int i=20;
void test1(){
}
%>

<% 
d1=new Date(d1.getTime()+24*60*60*1000);
i=20;
%>

Date: <%= d1 %></br>
i: <%= i %></br>

<%!
int i1=30;
void test2(){
}
%>