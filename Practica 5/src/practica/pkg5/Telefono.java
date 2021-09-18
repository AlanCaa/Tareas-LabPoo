/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

/**
 *
 * @author ajosu
 */
public class Telefono extends DispositivoElectronico implements IWifiConexion {

    public Telefono(String marca, String modelo) {
        super(marca, modelo);
    }

    int iniLlamada(int numero) {
        System.out.println("Llamando al numero: " + numero);
        return numero;
    }

    String iniLlamada(Contacto contacto) {
        System.out.println("Llamando a: " + contacto.nombre);
        return contacto.nombre;
    }

    void finLlamada() {
        System.out.println("Finalizando llamada...");
    }


    @Override
    public String encender() {
        return "Telefono prendido";
    }

    @Override
    public String apagar() {
        return "Telefono apagado";
    }

    @Override
    public boolean setWifiPasword(String psswd) {
         return psswd.equals("Contraseña: R24uZ2aa");
    }
}

