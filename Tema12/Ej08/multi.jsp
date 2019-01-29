
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

        <title>Tabla de multiplicar</title>
    </head>
    <body>
        <div class="container">
            <%  int numero = Integer.parseInt(request.getParameter("numero"));
            %>
            <h3>Esta es la tabla de multiplicar del numero <%=numero%></h3>
            <br>

            <table>
                <tr>
                    <td><%=numero%> * 0 = <%=numero * 0%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 1 = <%=numero * 1%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 2 = <%=numero * 2%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 3 = <%=numero * 3%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 4 = <%=numero * 4%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 5 = <%=numero * 5%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 6 = <%=numero * 6%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 7 = <%=numero * 7%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 8 = <%=numero * 8%></td>
                </tr>
                <tr>
                    <td><%=numero%> * 9 = <%=numero * 9%></td>
                </tr>
                </tr>
            </table>

        </div>

    </body>
</html>
