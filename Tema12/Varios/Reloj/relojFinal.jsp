<%-- 
    Document   : cocheListo
    Created on : 29-ene-2019, 13:58:43
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
   
        <title>Reloj listo para tu muñeca!</title>
    </head>
    <body>
        <h1>¡Aquí tiene tu reloj preparado, que lo disfrutes!</h1>
        <img src="img/reloj_<%=request.getParameter("material")%>_<%=request.getParameter("color")%>.png">
    </body>
</html>
