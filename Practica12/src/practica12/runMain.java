/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

import java.util.Scanner;

/**
 *
 * @author ajosu
 */
public class runMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un valor numerico: ");
        int numero = s.nextInt();
        String cad = String.valueOf(numero);
        System.out.println(cad);
        
        
        System.out.println("Ingrese cuantos números desea contar");
        int numero1 = s.nextInt();
        int c = 0;
        int acum = 0;
        for (int i = 0; i < numero1; i++) {
            System.out.println("Ingrese el valor numerico: "+(i+1));
            c = s.nextInt();
            acum = acum+c;
            
        }
        System.out.println(acum);
        System.out.println("Ingrese cuantos numeros random quiere generar");
        int numero2 = s.nextInt();
        int aleatorio = 0;
        
        for (int i = 0; i < numero2; i++) {
            aleatorio = (int) (Math.random() * 100 + 1);
            
            System.out.println(aleatorio);
            }
            System.out.println("Valores numericos del 1 al 100: ");
            int k = 1;
            while (k <= 100) {
                System.out.println(k);
                k++;

            }
            int p = 1;
            System.out.println("Numeros del 1 al 100: ");
            do {
                System.out.println(p);
                p++;
            } while (p <= 100);
            
            System.out.println("Numeros del 1 al 100: ");
            for (int o = 1; o <= 100; o++) {
                System.out.println(o);
            }
             int n;
        do {
            System.out.print("Introduce un número entre 1 y 3999: ");
            n = s.nextInt();
        } while (n < 1 || n > 3999);
        System.out.println(n + " en numeros romanos -> " + convertirANumerosRomanos(n));

    }

    public static String convertirANumerosRomanos(int num) {
        int i, miles, centenas, decenas, unidades;
        String romano = "";

        //obtenemos cada cifra del número
        miles = num / 1000;
        centenas = num / 100 % 10;
        decenas = num / 10 % 10;
        unidades = num % 10;

        //millar
        for (i = 1; i <= miles; i++) {
            romano = romano + "M";
        }

        //centenas
        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenas; i++) {
                romano = romano + "C";
            }
        } else if (centenas == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                romano = romano + "C";
            }
        }

        //decenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
            }
        }

        //unidades
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano = romano + "I";
            }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }
        return romano;
    }

}