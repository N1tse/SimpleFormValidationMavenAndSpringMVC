<%-- 
    Document   : homepage
    Created on : Jan 28, 2019, 1:25:53 PM
    Author     : ntsep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        <title>JSP Page</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body>
        <div class="container text-center">
        <h1>HomePage</h1>
        <form:form action="registerForm" modelAttribute="user">
            UserName: <form:input path="username"/>
            <form:errors path="username" cssClass="error"/>
            <br><br>
            Password: <form:input path="password"/>
            <form:errors path="password" cssClass="error"/>
            <br><br>
            FirstName <form:input path="fname"/>
            <form:errors path="fname" cssClass="error"/>
            <br><br>
            LastName <form:input path="lname"/>
            <form:errors path="lname" cssClass="error"/>
            <br><br>
            Free Passes <form:input path="freePasses"/>
            <form:errors path="freePasses" cssClass="error"/>
            <br><br>
            PostalCode <form:input path="postalCode"/>
            <form:errors path="postalCode" cssClass="error"/>
            <br><br>
            Email <form:input path="email"/>
            <form:errors path="email" cssClass="error"/>
            <br><br>
            <input type="submit" value="Submit" />
        </form:form>
        </div>
    </body>
</html>
