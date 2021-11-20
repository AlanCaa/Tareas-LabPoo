<%-- 
    Document   : Busqueda
    Created on : 18/11/2021, 08:10:54 PM
    Author     : Gloria
--%>

<%-- 
    Document   : Busqueda
    Created on : 16 nov. 2021, 00:35:47
    Author     : ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda De Cita</title>
    </head>
    <body bgcolor="FFBFB2">
        <div align="center"> 
            <br></br>

            <br></br>

            <h1>Ingrese El numero o correo con el que registro la cita</h1>
            <br></br>

            <form action="DatosControlador?accion=busqueda" method="POST" autocomplete="off">
                <table>    
                        <td> Numero: </td><td><input id="Telefono" name="Telefono" required type="number"/></td></tr>  
                    </p>                

                </table>
                <br/><br/>
                <button id="insertar" name="insertar" type="submit" >Buscar</button> 
               
            </form>

    </body>
</html>