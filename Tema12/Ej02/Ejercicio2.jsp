<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" src="miestilo.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        
        <title>Ejercicio 2 Tema 12</title>
    </head>
    <body>
        <div class="container">

        <h2><b>Ejercicio 2</b></h2>

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

        </div>
    </body>
</html>
