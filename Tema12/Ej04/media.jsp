<%-- 
    Document   : media
    Created on : 29-ene-2019, 12:45:56
    Author     : Alejandro
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
            <title>Ejercicio 3 Tema 12</title>
    </head>
    <body>
        <%
            double nota1 = Double.parseDouble(request.getParameter("nota1"));
            double nota2 = Double.parseDouble(request.getParameter("nota2"));
            double nota3 = Double.parseDouble(request.getParameter("nota3"));
            double media = (nota1 + nota2 + nota3) / 3;
            DecimalFormat dosDecimales = new DecimalFormat("0.00");
            String colorMensaje;
            if (media <5 ) {
                colorMensaje = "text-danger";
            } else {
                colorMensaje = "text-primary";
            }
        %>
        
        <h1 class="text-center <%=colorMensaje%>"><b>Tu nota media es <%= dosDecimales.format(media)%></b</h1>
    </body>
</html>
