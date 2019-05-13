<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Jméno</th>
                    <th>Příjmení</th>
                    <th>Tel. číslo</th>
                    <th>E-mail</th>
                    <th>Web</th>
                    <th>Zpráva</th>
                    <th>Kontakt</th>
                    <th>Typ</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="column" items="${results}">
                    <tr>
                        <td>${column.name}</td>
                        <td>${column.lastname}</td>
                        <td>${column.number}</td>
                        <td>${column.email}</td>
                        <td>${column.web}</td>
                        <td>${column.text}</td>
                        <td>${column.contact}</td>
                        <td>${column.choice}</td>
                    </tr>
                </c:forEach> 
            </tbody>
        </table>

        
        
    </body>
</html>
