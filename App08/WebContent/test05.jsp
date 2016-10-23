<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="true">
	Hello
</c:if></br>
<c:if test="${100==100}" var="con1">
	Executed
</c:if>
<c:if test="false">
	Hi
</c:if>
<c:if test="${con1}">
	Test
</c:if>
