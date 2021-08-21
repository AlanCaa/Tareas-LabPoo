/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author ajosu
 */ import java.util.Scanner;
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);
 String nombre, numero, nombre2;
 double tipo, importe;

 //se crea objeto cuenta1 sin parámetros
 //se ejecuta el constructor por defecto
 Cuenta cuenta1 = new Cuenta();

 System.out.print("Nombre : ");
 nombre = sc.nextLine();
 System.out.print("Número de cuenta : ");
 numero = sc.nextLine();
 System.out.print("Tipo de interes : ");
 tipo = sc.nextDouble();
 System.out.print("Saldo: ");
 importe = sc.nextDouble();

 cuenta1.setnomCliente(nombre);
 cuenta1.setnumCuenta(numero);
 cuenta1.setTipoInteres(tipo);
 cuenta1.setSaldo(importe);

 System.out.println("Saldo cuenta 1: " + cuenta1.getSaldo());
 System.out.println(" ");
 //se crea el objeto cuenta2 sin parámetros
 //se ejecuta el constructor por defecto
 Cuenta cuenta2 = new Cuenta();   
 
 System.out.print("Nombre : ");
 nombre = sc.nextLine();
 nombre=sc.nextLine();
 System.out.print("Número de cuenta : ");
 numero = sc.nextLine();
 System.out.print("Tipo de interes: ");
 tipo = sc.nextDouble();
 System.out.print("Saldo:");
 importe=sc.nextDouble();

 cuenta2.setnomCliente(nombre);
 cuenta2.setnumCuenta(numero);
 cuenta2.setTipoInteres(tipo);
 cuenta2.setSaldo(importe);
  
 System.out.println("Saldo cuenta 2: " + cuenta2.getSaldo());
 System.out.println(" ");
 //se crea cuenta3 como copia de cuenta1
 //se ejecuta el constructor copia
 Cuenta cuenta3 = new Cuenta(cuenta1);

 //mostrar los datos de cuenta1
 System.out.println("Datos de la cuenta 1");
 System.out.println("Nombre del titular: " + cuenta1.getnomCliente());
 System.out.println("Número de cuenta: " + cuenta1.getnumCuenta());
 System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
 System.out.println("Saldo: " + cuenta1.getSaldo());
 System.out.println();
       
 //se realiza un ingreso en cuenta1
 
 
 //mostrar el saldo de cuenta1 después del ingreso

 //mostrar los datos de cuenta2
 System.out.println("Datos de la cuenta 2");
 System.out.println("Nombre del titular: " + cuenta2.getnomCliente());
 System.out.println("Número de cuenta: " + cuenta2.getnumCuenta());
 System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
 System.out.println("Saldo: " + cuenta2.getSaldo());
 System.out.println();
     

 //realizar una transferencia de 10 desde cuenta3 a cuenta2
 cuenta3.transferencia(cuenta2, 100);
        System.out.println("*Cuenta 1 ha transferido con exito 100 pesos a la cuenta 2*");
        System.out.println("");
  //mostrar el saldo de cuenta
 System.out.println("Saldo de la cuenta 1");
 System.out.println("Saldo: " + cuenta3.getSaldo());
 System.out.println();
 //mostrar el saldo de cuenta2
 System.out.println("Saldo de la cuenta 2");
 System.out.println("Saldo: " + cuenta2.getSaldo());
 System.out.println();
     

}
 }   
