<%-- 
    Document   : saluda
    Created on : 29-ene-2019, 12:15:58
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3 Tema 12</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        if ((nombre == null) || (nombre.equals(""))){
            nombre = "usuario";
        }
        
        %>
        <h1>¡Hola <%= nombre %> !</h1>
    </body>
</html>
