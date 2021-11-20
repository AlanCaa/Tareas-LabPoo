<%-- 
    Document   : Modificar
    Created on : 18/11/2021, 08:11:30 PM
    Author     : Gloria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
    </head>
    <body bgcolor="FF7264">  
        <div align="center"> 
            <h1>Modificar Registro</h1>
            <a href="DatosControlador?accion=Insertar">Ver Tabla</a>
            <br/><br/>


            <form action="DatosControlador?accion=actualizar" method="POST" autocomplete="off">
                <table>    
                    <p>
                    <tr><td> Nombre: </td><td><input id="Nombre" name="Nombre" type="text" required value="<c:out value="${dato.nombre}"/>"/></td>  
                        </p>                
                    <p>

                    <td>Apellido Paterno: </td><td><input id="Apellido" name="Apellido" type="text" required value="<c:out value="${dato.apellido}"/>"/></td>
                    </p>                
                    <p>

                    <tr><td> Numero: </td><td><input id="Telefono" name="Telefono" required type="number" value="<c:out value="${dato.telefono}"/>"/></td>
                        </p>                
                    <p>
                    <td>Fecha:</td><td> <input id="Fecha" name="Fecha" type="date" required value="<c:out value="${dato.fecha}"/>"/></td></tr>  
                    </p>
                     <p>
                    
                    <td>Correo:</td><td> <input id="Correo" name="Correo" type="email" required value="<c:out value="${dato.correo}"/>"/></td></tr>  
                    </p>               
                   

                    

                    

                </table>

                <button id="insertar" name="insertar" type="submit" >Modificar</button> 
                <td>><a href="DatosControlador?accion=eliminar&id">eliminar</a></td>
            </form>
            


    </body>
</html>
