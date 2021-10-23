/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg10;

/**
 *
 * @author ajosu
 */
import java.util.Scanner;

public class Lector {
    
     public String leerCadena(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
   
    public int leerNumero(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
