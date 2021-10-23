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
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Lector leer = new Lector();
        Carro carro = new Carro();
        String dato;
        System.out.println("Ingrese matricula del vehiculo: ");
        dato = leer.leerCadena();
        carro.setMatricula(dato);
        System.out.println("Ingrese marca de carro(Ford,Toyota,Suzuki,Renault,Seat).");
        dato = leer.leerCadena();
        carro.setMarca(dato);
        System.out.printf("El Automovil Marca " + carro.getMarca() + " Matricula " + carro.getMatricula() + ".");
    }
    }


