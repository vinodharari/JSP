<jsp:useBean id="std" class="com.lara.Student">
	<jsp:setProperty name="std" property="firstName"/>
	<jsp:setProperty name="std" property="lastName"/>
	<jsp:setProperty name="std" property="age" value="100"/>
	
	First Name : <jsp:getProperty name="std" property="firstName"/></br>
	Last Name : <jsp:getProperty name="std" property="lastName"/></br>
	Age : <jsp:getProperty name="std" property="age"/></br>
</jsp:useBean>