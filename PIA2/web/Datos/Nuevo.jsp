<%-- 
    Document   : Nuevo
    Created on : 18/11/2021, 08:11:06 PM
    Author     : Gloria
--%>

<%-- 
    Document   : Nuevo
    Created on : 15 nov. 2021, 04:59:24
    Author     : ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingrese la cita</title>
    </head>
    <body bgcolor="FFBFB2">  
        <div align="center"> 

            <h1>Nuevo Registro</h1>
            <a href="DatosControlador?accion=Insertar">Ver Tabla</a>
            <br/><br/>

            <h3>Ingrese Los Datos para registrar su cita y seleccione guardar </h3>
            

            <form action="DatosControlador?accion=Insertar" method="POST" autocomplete="off">
                <table>    
                    <p>
                    <tr><td> Nombre: </td><td><input id="Nombre" name="Nombre" type="text" required/></td></tr>  
                    </p>                
                    <p>

                    <tr><td>Apellido Paterno: </td><td><input id="Apellido" name="Apellido" type="text" required/></td></tr>  
                    </p>                
                    <p>

   
                    <tr><td>Telefono:</td><td> <input id="Telefono" name="Telefono" type="number" required/></td></tr>  
                    </p>               
                    <p>

                    <tr><td> Correo: </td><td><input id="Correo" name="Correo" type="email"required/></td></tr>  
                    </p>                
                    <p>

                    <tr><td>Fecha:</td><td> <input id="Fecha" name="Fecha" type="date"required/></td></tr>  
                    </p>
                </table>
                <br/><br/>
                <button id="insertar" name="insertar" type="submit" >Guardar</button> 

            </form>
           

        </body>
</html>
