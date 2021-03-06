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
                         		<form:form modelAttribute="student" action="students" method="post">
                         		  	<fieldset>
                         				<legend>Account Fields</legend>
                         				<p>
                         					<form:label	for="name" path="name" cssErrorClass="error"><fmt:message key="student.name"/></form:label><br/>
                         					<form:input path="name" /> <form:errors path="name" />
                         				</p>
                         				<p>
                         					<form:label for="surname" path="surname" cssErrorClass="error"><fmt:message key="student.surName"/></form:label><br/>
                         					<form:input path="surname" /> <form:errors path="surname" />
                         				</p>
                         				<p>
                         					<form:label for="age" path="age" cssErrorClass="error"><fmt:message key="student.age"/></form:label><br/>
                         					<form:input path="age" /> <form:errors path="age" />
                         				</p>
                         				<p>
                         					<form:label for="email" path="email" cssErrorClass="error"><fmt:message key="student.email"/></form:label><br/>
                         					<form:input path="email" /> <form:errors path="email" />
                         				</p>
                         				<p>
                                            <form:label for="phone" path="phone" cssErrorClass="error"><fmt:message key="student.phone"/></form:label><br/>
                                            <form:input path="phone" /> <form:errors path="phone" />
                                        </p>
                                        <p>
                                            <form:label for="address" path="address" cssErrorClass="error"><fmt:message key="student.address"/></form:label><br/>
                                            <form:input path="address" /> <form:errors path="address" />
                                        </p>
                         				<p>
                         					<input type="submit" />
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