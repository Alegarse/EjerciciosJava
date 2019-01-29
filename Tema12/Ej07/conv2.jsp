<%-- 
    Document   : conv1
    Created on : 29-ene-2019, 17:07:59
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        
        <title>Ejercicio 6 Tema 12</title>
    </head>
    <body>
        <h2>Ejercicio 6</h2>
        <%
            double peseta1 = Double.parseDouble(request.getParameter("pesetas"));
            double euros = peseta1 / 166.386;
        %>
            <h2 class="text-center text-primary"><b>El importe en pesetas es de: <%=+ euros%></b></h1>
    </body>
</html>
