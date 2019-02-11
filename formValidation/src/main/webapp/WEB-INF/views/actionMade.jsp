<%-- 
    Document   : actionMade
    Created on : Jan 28, 2019, 9:22:42 PM
    Author     : ntsep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Done</h1>
        <h4>${result}</h4>
        <h5>UserName: ${user.username}</h5>
        <h5>Password: ${user.password}</h5>
        <h5>FirstName: ${user.fname}</h5>
        <h5>LastName: ${user.lname}</h5>
        <h5>FreePasses: ${user.freePasses}</h5>
        <h5>PostalCode: ${user.postalCode}</h5>
        <h5>Email: ${user.email}</h5>
    </body>
</html>
