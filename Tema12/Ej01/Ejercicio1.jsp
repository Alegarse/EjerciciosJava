<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
        <title>Ejercicio 1 Tema 12</title>
    </head>
    <body>

        <h2><b>Ejercicio 1</b></h2>

        <%
            String nombre = "Alejandro";
            String apellidos = "García Serrano";
            String direccion = "C/La higuera 2";
            String email = "agscm2@gmail.com";
        %>

        <% out.print("<b>Hola, mis datos son los siguientes:</b>"); %>

        <br>
        <%
            out.println("Nombre completo: " + nombre + " " + apellidos);
            out.println("<br>Dirección: " + direccion);
            out.println("<br>E-mail: " + email);
        %>

        
    </body>
</html>
