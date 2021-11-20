<%-- 
    Document   : Index
    Created on : 18/11/2021, 11:41:21 PM
    Author     : Alan y Josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Citas Guardadas</title>
    </head>
    <body bgcolor="C1FCBE">
                <div align="center"> 

        <h1>Datos Almacenados</h1>
        <a href="DatosControlador?accion=Nuevo">Ingresar Nueva Cita</a>
        <br></br>
        <table border="1" width="80%">
            <head>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Fecha</th>
            </tr>
            </head>
            <tbody>
            <c:forEach var="dato" items="${lista}">
                <tr>
                    <td><c:out value="${dato.nombre}"></c:out> </td>
                    <td><c:out value="${dato.apellido}"></c:out> </td>
                    <td><c:out value="${dato.telefono}"></c:out> </td>
                    <td><c:out value="${dato.correo}"></c:out> </td>
                    <td><c:out value="${dato.fecha}"></c:out> </td>
                    
                </tr>
            </c:forEach>
                   <br></br>
                        <br></br>

                 <table>
                <td>
                        <br></br>

                    <form method="POST" action="DatosControlador?accion=bus">

                        <input type="submit" value="Buscar" />

                    </form>
                </td>

            </table>
            </tbody>
                
            
        </table>
    </body>
</html>
