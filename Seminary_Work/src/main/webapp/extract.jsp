<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/normalize.css">
        <link href='http://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/extract.css">
        <title>Databáze</title>
        <meta name="viewport" content="width=device-width">
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="main.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        
        <% 
            if(session.getAttribute("username") == null){
                response.sendRedirect("login.jsp");
            }
        %>
        
        <div class="mainboxelement"></div>
        
        <table> <!-- style="border:1px solid black;" -->
            <caption>Our Database</caption>
            <thead>
                <tr>
                    <th scope="col">Jméno</th>
                    <th scope="col">Příjmení</th>
                    <th scope="col">Tel.</th>
                    <th scope="col">E-mail</th>
                    <th scope="col">Web</th>
                    <th scope="col">Zpráva</th>
                    <th scope="col">Kontakt</th>
                    <th colspan="2">Typ</th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <td colspan="3">Data's are updated every 15 minutes !</td>
                </tr>
            </tfoot>
            <tbody>
                <c:forEach var="column" items="${results}" varStatus="loop">
                <form action="delete" method="get">
                    <tr class="${loop.index % 2 == 0 ? 'even' : 'odd'}" scope="row">
                        <td>${column.name}</td>
                        <td>${column.lastname}</td>
                        <td>${column.number}</td>
                        <td>${column.email}</td>
                        <td>${column.web}</td>
                        <td>${column.text}</td>
                        <td>${column.contact}</td>
                        <td>${column.choice}</td>
                        <td class="cross">
                            <input type="hidden" name="idquestions" value="${column.idquestions}" />    
                            <input type="image" src="img/cros.png" width="25" height="25"/>
                        </td>
                    </tr>
                </form>
                </c:forEach> 
            </tbody>
        </table>


        <form action="logout">
            <input type="submit" value="Logout" />
        </form>

        <div class="footer-container">
            <form action="logout">
                <input type="submit" value="Logout" />
            </form>
        </div>

        
    </body>
</html>
