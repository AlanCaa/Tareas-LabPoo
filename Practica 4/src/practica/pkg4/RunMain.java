/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author ajosu
 */
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FString F = new FString();

        //Separar
        System.out.print("Ingrese cuatro letras o numeros separados por guiones: ");
        Scanner sc = new Scanner(System.in);
        String cade = sc.nextLine();

        String[] Sep = F.Separar(cade, "-");
        System.out.println(Sep[0] + " " + Sep[1] + " " + Sep[2] + " " + Sep[3]);

        //Termina con
        System.out.print("Ingrese una palabra: ");
        Scanner term = new Scanner(System.in);
        String a = term.nextLine();
        System.out.print("Con cual letra termina?: ");
        Scanner ca = new Scanner(System.in);
        String b = ca.nextLine();

        boolean abool = F.TerminaEn(a, b);
        System.out.println("La palabra " + a + " termina con " + b + "? " + abool);

        //Comienza con
        System.out.print("Ingrese una palabra: ");
        Scanner comi = new Scanner(System.in);
        String c = comi.nextLine();
        System.out.print("Con cual letra empieza?: ");
        Scanner car = new Scanner(System.in);
        String d = car.nextLine();
        boolean cbool = F.ComienzaCon(c, d);
        System.out.println("La palabra " + c + " comienza con " + d + "? " + cbool);

        //Cuantas veces se repite un caracter
        System.out.print("Ingrese una cadena de caracteres o texto: ");
        Scanner palab = new Scanner(System.in);
        String e = palab.nextLine();

        System.out.print("Ingrese un caracter: ");
        Scanner cc = new Scanner(System.in);
        String f = cc.nextLine();

        int rep = F.ContarCaracteres(e, f);
        System.out.println("El caracter " + f + " se repite " + rep + " veces");

        //Contar las palabras
        System.out.print("Ingrese una frase o texto: ");
        Scanner aa = new Scanner(System.in);
        String g = aa.nextLine();
        int pala = F.ContarPalabras(g);
        System.out.println("El numero de palabras en la frase o texto es: " + pala);

        //Mostrar las iniciales
        System.out.print("Ingrese un nombre completo: ");
        Scanner as = new Scanner(System.in);
        String[] h = as.nextLine().split(" ");
        String ini = F.Iniciales(h);
        System.out.println("Sus iniciales son: " + ini);

        //Invertir una cadena de caracteres
        System.out.print("Ingrese una palabra: ");
        Scanner ad = new Scanner(System.in);
        String j = ad.nextLine();
        String invert = F.InvertirCadena(j, j.length());
        System.out.println(invert);

        //Sustituir caracteres
        System.out.print("Ingrese una frase: ");
        Scanner af = new Scanner(System.in);
        String k = af.nextLine();
        System.out.print("Que caracter desea sustituir? ");
        Scanner ag = new Scanner(System.in);
        String l = ag.nextLine();
        System.out.print("Por que caracter lo quiere sustituir?: ");
        Scanner aq = new Scanner(System.in);
        String m = aq.nextLine();
        String repl = F.Sustituir(k, l, m);
        System.out.println(repl);

        //Convertir mayusculas y minusculas
        System.out.print("Ingrese una cadena alternando mayusculas y minusculas: ");
        Scanner aw = new Scanner(System.in);
        String n = aw.nextLine();
        F.MayuMinu(n);

        //Verificar su una cadena contiene una subcadena
        System.out.print("Ingrese una cadena: ");
        Scanner at = new Scanner(System.in);
        String p = at.nextLine();
        System.out.print("Ingrese una subcadena: ");
        Scanner ap = new Scanner(System.in);
        String q = ap.nextLine();
        boolean vv = F.subcadena(p, q);
        System.out.println("La cadena " + p + " contiene la subaceda " + q + "? " + vv);

        //Verificar si una cadena es palindromo
        System.out.print("Ingrese una cadena: ");
        Scanner ae = new Scanner(System.in);
        String o = ae.nextLine();
        boolean ver = F.palindromo(o);
        System.out.println("La palabra " + o + " es palindromo? " + ver);
    }

}
