/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

/**
 *
 * @author ajosu
 */
public class FString {

    public boolean ComienzaCon(String a, String b) {
        boolean va = true;
        if (a.startsWith(b)) {
            va = true;
        } else {
            va = false;
        }
        return va;
    }

    public boolean TerminaEn(String a, String b) {
        boolean Te = true;
        if (a.endsWith(b)) {
            Te = true;
        } else {
            Te = false;
        }
        return Te;
    }

    public String[] Separar(String a, String b) {
        String[] PS = a.split(b);
        return PS;
    }

    public int ContarCaracteres(String a, String b) {
        int con = 0;

        if (Character.isAlphabetic(b.charAt(0)) == true) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(0)) {
                    con++;
                }
            }
        } else {
            System.out.println("El caracter introducido no es una letra");
        }
        return con;
    }

    public int ContarPalabras(String a) {
        int con = 1, pos;
        a = a.trim();
        if (a.isEmpty()) {
            con = 0;
        } else {
            pos = a.indexOf(" ");
            while (pos != -1) {
                con++;
                pos = a.indexOf(" ", pos + 1);
            }
        }
        return con;
    }

    public String Iniciales(String[] a) {
        String ini = "";

        for (String s : a) {
            ini += s.toUpperCase().charAt(0);
        }
        return ini;
    }

    public String InvertirCadena(String a, int b) {
        String inv = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            inv = inv + a.charAt(i);
        }
        return inv;
    }

    public String Sustituir(String a, String b, String c) {
        String replace = a.replace(b, c);
        return replace;
    }

    public void MayuMinu(String a) {
        char pos;

        for (int i = 0; i < a.length(); i++) {

            pos = a.charAt(i);
            if (Character.isUpperCase(pos)) {
                Character.toLowerCase(pos);
            } else {
                Character.toUpperCase(pos);
            }
            System.out.print(pos);
        }
    }

    public boolean subcadena(String a, String b) {
        boolean ind = false;

        ind = a.contains(b);
        return ind;
    }

    public boolean palindromo(String a) {
        boolean ver = true;
        String cadena = a.toLowerCase();

        for (int i = 0, j = a.length() - 1; i <= j; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                ver = false;
            }
        }
        return ver;
    }
}
