<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<METAÂ http-equiv="Content-Type"Â content="text/html;charset=UTF-8">
	<title>Create Account</title>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
	<!--[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]-->
</head>
<body>
<div class="container">
	<h1>
		Create Account
	</h1>
	<div class="span-12 last">
		<form:form modelAttribute="teacher" action="teachers" method="post">
		  	<fieldset>
				<legend>Account Fields</legend>
				<p>
					<form:label	for="name" path="name" cssErrorClass="error"><fmt:message key="teacher.name"/></form:label><br/>
					<form:input path="name" /> <form:errors path="name" />
				</p>
				<p>
					<form:label for="surName" path="surName" cssErrorClass="error"><fmt:message key="teacher.surName"/></form:label><br/>
					<form:input path="surName"  /> <form:errors path="surName" />
			   </p>
			    <p>
                	<form:label for="age" path="age" cssErrorClass="error"><fmt:message key="teacher.age"/></form:label><br/>
                	<form:input path="age" /> <form:errors path="age" />
               </p>
				<p>
					<form:label for="email" path="email" cssErrorClass="error"><fmt:message key="teacher.email"/></form:label><br/>
					<form:input path="email" /> <form:errors path="email" />
				</p>
				<p>
					<form:label for="address" path="address" cssErrorClass="error"><fmt:message key="teacher.address"/></form:label><br/>
					<form:input path="address" /> <form:errors path="address" />
				</p>
				<p>
                	<form:label for="phone" path="phone" cssErrorClass="error"><fmt:message key="teacher.phone"/></form:label><br/>
                	<form:input path="phone" /> <form:errors path="phone" />
                </p>

			</fieldset>
		</form:form>
	</div>
	<hr>
	<ul>
		<li> <a href="?locale=en_us">us</a> |  <a href="?locale=en_gb">gb</a> | <a href="?locale=es_es">es</a> | <a href="?locale=de_de">de</a> </li>
	</ul>
</div>
</body>
</html>