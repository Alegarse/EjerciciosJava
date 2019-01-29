
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

        <title>Resultado del meneo del cubilete</title>
    </head>
    <body>
        <h3><b></b>Tatachannnnn</b></h3>
        <br>

    <%  int elec = Integer.parseInt(request.getParameter("eleccion"));
        int suerte = (int) (Math.random() * 3 + 1);
        String resul = "";
        if (suerte == elec) {
            resul = "¡Enhorabuena!, has encontrado la bolita";
        } else {
            resul = "Lo siento, no has acertado";
        }
    %>
    
    <% if (suerte == 1) {%>
    <div class="container">
        <div class="row" align-items-center>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_con_1bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
        </div>
    </div>
    <%}%>
        <% if (suerte == 2) {%>
    <div class="container">
        <div class="row" align-items-center>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_con_1bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
        </div>
    </div>
    <%}%>
        <% if (suerte == 3) {%>
    <div class="container">
        <div class="row" align-items-center>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_sin_bola.png" height=150px>
                </div>
                <div class=" col-2 col-sm-3">
                    <img src="img/cubilete_con_1bola.png" height=150px>
                </div>
        </div>
    </div>
    <%}%>
        
        <h4><b><%=resul%></b></h4>    
        
</body>
</html>
