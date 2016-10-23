<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:out value="${msg}">
 <jsp:include page="noMsg.txt"/>
</c:out></br>
<c:out value="${hello}">
  <jsp:include page="noHello.txt"/>
</c:out>
