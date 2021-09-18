/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

import java.util.Scanner;


/**
 *
 * @author ajosu
 */
public class RunPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);

        Contacto[] contact = new Contacto[6];
        Telefono[] tel = new Telefono[6];

        for (int i = 1; i < contact.length; i++) {
            System.out.println("\n== Contacto #" + i + " ==");
            contact[i] = new Contacto();
            System.out.print("Nombre: ");
            contact[i].nombre = sc.nextLine();
            System.out.print("Telefono: ");
            contact[i].telefono = sc.nextInt();
            System.out.print("Email: ");
            sc.nextLine(); // Saltarse el \n suelto
            contact[i].email = sc.nextLine();
        } 

        for (int i = 1; i < tel.length; i++) {
            System.out.println("\n== Telefono #" + i + " ==");
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            tel[i] = new Telefono(marca, modelo);
        }

        System.out.println("Telefono #1 con wifi contraseña \"Contraseña\": " + tel[1].setWifiPasword("1954387"));
        tel[1].iniLlamada(contact[1].telefono);
        tel[1].iniLlamada(contact[1]);
        tel[1].finLlamada();

        System.out.println("Telefono #2 con wifi contraseña \"Contraseña:\": " + tel[2].setWifiPasword("R24uZ2aa"));
        tel[2].iniLlamada(contact[2].telefono);
        tel[2].iniLlamada(contact[2]);
        tel[2].finLlamada();
    }
}
