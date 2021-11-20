/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosDAO {
    Connection conectar;

    public DatosDAO() throws ClassNotFoundException {

        Conexion con = new Conexion();
        conectar = con.getConexion();
    }
    
    public List<Datos> ListAgregar() {
        PreparedStatement p;

        ResultSet r;

        List<Datos> lis = new ArrayList<>();
        try {

            p = conectar.prepareStatement("SELECT id, Nombre, Apellido, Telefono, Correo, Fecha FROM datos"); //Consulta
            r = p.executeQuery();

            while (r.next()) {
                int id = r.getInt("id");
                String Nombre = r.getString("Nombre");
                String Apellido = r.getString("Apellido");
                String Telefono = r.getString("Telefono");
                String Correo = r.getString("Correo");
                String Fecha = r.getString("Fecha");

                Datos d = new Datos(id, Nombre, Apellido, Telefono, Correo, Fecha);

                lis.add(d);
            }
            return lis;

        } catch (SQLException e) {
            System.out.println(e);
            return null;

        }

    }
    public Datos Buscar(int id_) {
        PreparedStatement p;

        ResultSet r;

        Datos dato = null;
        try {

            p = conectar.prepareStatement("SELECT id,Nombre,Apellido,Correo,Telefono,Fecha FROM datos WHERE id=?"); //Consulta
            p.setInt(1, id_);

            r = p.executeQuery();

            while (r.next()) {
                int id = r.getInt("id");
                String Nombre = r.getString("Nombre");
                String Apellido = r.getString("Apellido");
                String Telefono = r.getString("Telefono");
                String Correo = r.getString("Correo");
                String Fecha = r.getString("Fecha");

                dato = new Datos(id, Nombre, Apellido, Telefono, Correo, Fecha);

            }
            return dato;

        } catch (SQLException e) {
            System.out.println(e);
            return null;

        
        }

    }
    public Datos Buscar_tel(String cel) {
        PreparedStatement p;

        ResultSet r;

        Datos dato = null;
        try {

            p = conectar.prepareStatement("SELECT id,Nombre,Apellido,Correo,Telefono,Fecha FROM datos WHERE Telefono=?"); //Consulta
            p.setString(1, cel);

            r = p.executeQuery();

            while (r.next()) {
                int id = r.getInt("id");
                String Nombre = r.getString("Nombre");
                String Apellido = r.getString("Apellido");
                String Telefono = r.getString("Telefono");
                String Correo = r.getString("Correo");
                String Fecha = r.getString("Fecha");

                dato = new Datos(id, Nombre, Apellido, Telefono, Correo, Fecha);

            }
            return dato;

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("hola");
            return null;

        }

    }
    public boolean Insertar(Datos dato) {
        PreparedStatement p;

        try {

            p = conectar.prepareStatement("INSERT INTO datos (Nombre,Apellido,Correo,Telefono,Fecha) VALUES (?,?,?,?,?)"); //Consultade insertar
            p.setString(1, dato.getNombre());
            p.setString(2, dato.getApellido());
            p.setString(3, dato.getCorreo());
            p.setString(4, dato.getTelefono());
            p.setString(5, dato.getFecha());
            // p.setSimpleDateFormat(5, dato.getFecha());
            p.execute();

            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }

    }
    public boolean Modificar(Datos dato) {
        PreparedStatement p;

        try {

            p = conectar.prepareStatement("UPDATE datos SET Nombre=?,Apellido=?,Correo=?,Fecha=? WHERE Telefono=? "); //Consulta
            p.setString(1, dato.getNombre());
            p.setString(2, dato.getApellido());
            p.setString(3, dato.getCorreo());
            p.setString(4, dato.getFecha());
            p.setString(5, dato.getTelefono());

            p.execute();

            System.out.println("se edito");
            return true;

        } catch (SQLException e) {
            System.out.println("fallo¿?");
            System.out.println(e);
            return false;

        }

    }
    public boolean eliminar(String numero) {
        PreparedStatement p;
        
        try {

            p = conectar.prepareStatement("DELATE FROM datos WHERE numero='?'"); 

            p.setString(1, numero);

            p.execute();

            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }
    }
}
