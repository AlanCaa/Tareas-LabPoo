/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Agenda.Datos;
import Agenda.DatosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DatosControlador", urlPatterns = {"/DatosControlador"})
public class DatosControlador extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DatosDAO d = new DatosDAO();
            String accion;

            RequestDispatcher dis = null;

            accion = request.getParameter("accion");
            
            if (accion == null || accion.isEmpty()) {

                dis = request.getRequestDispatcher("Datos/Nuevo.jsp");
                //dis = request.getRequestDispatcher("Datos/Index.jsp");
                List<Datos> list = d.ListAgregar();
                request.setAttribute("lista", list);

            }
            else if ("Nuevo".equals(accion)) {
                dis = request.getRequestDispatcher("Datos/Nuevo.jsp");

            }
            else if ("Insertar".equals(accion)) {
                String Nombre = request.getParameter("Nombre");
                String Apellido = request.getParameter("Apellido");
                String Correo = request.getParameter("Correo");
                String Telefono = request.getParameter("Telefono");
                String Fecha = request.getParameter("Fecha");


                Datos dat = new Datos(0, Nombre, Apellido, Telefono, Correo, Fecha);

                d.Insertar(dat);
                dis = request.getRequestDispatcher("Datos/Index.jsp");
                List<Datos> lista = d.ListAgregar();
                request.setAttribute("lista", lista);

            }
            else if ("actualizar".equals(accion)) {
               // String Telefon = request.getParameter("Telefono");

                //int id = Integer.parseInt(request.getParameter("id"));

                String Nombre = request.getParameter("Nombre");
                String Apellido = request.getParameter("Apellido");
                String Correo = request.getParameter("Correo");
                String Telefono = request.getParameter("Telefono");
                String Fecha = request.getParameter("Fecha");

                Datos dat = new Datos(0, Nombre, Apellido, Telefono, Correo, Fecha);

                d.Modificar(dat);
                dis = request.getRequestDispatcher("Datos/Index.jsp");
                List<Datos> lista = d.ListAgregar();
                request.setAttribute("lista", lista);
            }
            else if ("bus".equals(accion)) {
               
                dis = request.getRequestDispatcher("Datos/Busqueda.jsp");
                //int id = Integer.parseInt(request.getParameter("id"));
//                String Email = request.getParameter("Email");
                String Telefono = request.getParameter("Telefono");
                
                Datos lista = d.Buscar_tel(Telefono);
               request.setAttribute("lista", lista);
               
            }
            else if ("busqueda".equals(accion)){
   
                //String Email = request.getParameter("Email");
               String Telefono = request.getParameter("Telefono");
                System.out.println("Buscando: "+Telefono);
                Datos dato = d.Buscar_tel(Telefono);
                
                request.setAttribute("dato", dato);
                
                dis = request.getRequestDispatcher("Datos/Modificar.jsp");

                
            }
            else if("eliminar".equals(accion)){
            
            String Telefono = request.getParameter("Telefono");
            d.eliminar(Telefono);
            dis = request.getRequestDispatcher("Datos/Index.jsp");
            List<Datos> lista = d.ListAgregar();
            request.setAttribute("lista", lista);
            } else{
            dis = request.getRequestDispatcher("Datos/Index.jsp");
             List<Datos> lista = d.ListAgregar();
             request.setAttribute("lista", lista);
            }
            
            dis.forward(request, response);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request,response);//método para mandar las peticiones del html al doGet
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
