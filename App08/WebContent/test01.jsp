<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setAttribute("msg", "Hello To All"); %>
<c:out value="${msg}"/>