/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;
import java.util.Scanner;
/**
 *
 * @author ajosu
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        //Datos de propiedades
        
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        Calculadora casio = new Calculadora();
        Television tv = new Television();
        Radio rd = new Radio();
        
        System.out.println("Televisor");
        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println(tv.Color());
        System.out.println(tv.encender());
        System.out.println(tv.cambioCanal());
        System.out.println(tv.ConfMenu());
        System.out.println(tv.apagar());
        System.out.println("");
        
        System.out.println("Radio");
        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println(rd.Color());
        System.out.println(rd.encender());
        System.out.println(rd.cambioCanal());
        System.out.println(rd.volumen());
        System.out.println(rd.ConfMenu());
        System.out.println(rd.apagar());
        System.out.println("");
        
        System.out.println("Calculadora");
         System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println(casio.Color());
        System.out.println(casio.encender());
        System.out.println(casio.suma(2, 2));
        System.out.println(casio.resta(4, 2));
        System.out.println(casio.ConfMenu());
        System.out.println(casio.apagar());
    }
    
}
