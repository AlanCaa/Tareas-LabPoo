
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ajosu
 */
public class RunPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Carro> listaCarros = new ArrayList<>(10);

        Carro c1 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c1.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c1.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c1.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c1.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c1.setGasolina(Integer.parseInt(entrada.nextLine()));
        c1.prender();
        c1.avanzar();
        c1.Vuelta();

        listaCarros.add(c1);

        Carro c2 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c2.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c2.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c2.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c2.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c2.setGasolina(Integer.parseInt(entrada.nextLine()));
        c2.prender();
        c2.avanzar();
        c2.Vuelta();

        listaCarros.add(c2);

        Carro c3 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c3.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c3.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c3.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c3.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c3.setGasolina(Integer.parseInt(entrada.nextLine()));
        c3.prender();
        c3.avanzar();
        c3.Vuelta();

        listaCarros.add(c3);

        Carro c4 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c4.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c4.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c4.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c4.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c4.setGasolina(Integer.parseInt(entrada.nextLine()));
        c4.prender();
        c4.avanzar();
        c4.Vuelta();

        listaCarros.add(c4);
        
        Carro c5 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c5.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c5.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c5.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c5.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c5.setGasolina(Integer.parseInt(entrada.nextLine()));
        c5.prender();
        c5.avanzar();
        c5.Vuelta();

        listaCarros.add(c5);

        Carro c6 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c6.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c6.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c6.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c6.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c6.setGasolina(Integer.parseInt(entrada.nextLine()));
        c6.prender();
        c6.avanzar();
        c6.Vuelta();

        listaCarros.add(c6);
        
        Carro c7 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c7.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c7.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c7.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c7.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c7.setGasolina(Integer.parseInt(entrada.nextLine()));
        c7.prender();
        c7.avanzar();
        c7.Vuelta();

        listaCarros.add(c7);

        Carro c8 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c8.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c8.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c8.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c8.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c8.setGasolina(Integer.parseInt(entrada.nextLine()));
        c8.prender();
        c8.avanzar();
        c8.Vuelta();

        listaCarros.add(c8);

        Carro c9 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c9.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c9.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c9.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c9.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c9.setGasolina(Integer.parseInt(entrada.nextLine()));
        c9.prender();
        c9.avanzar();
        c9.Vuelta();

        listaCarros.add(c9);

        Carro c10 = new Carro();
        System.out.println("Ingrese marca del Carro:");
        c10.setMarca(entrada.nextLine());
        System.out.println("Ingrese modelo del Carro: ");
        c10.setModelo(entrada.nextLine());
        System.out.println("Ingrese color del Carro: ");
        c10.setColor(entrada.nextLine());
        System.out.println("Ingrese precio: ");
        c10.setPrecio(entrada.nextLine());
        System.out.println("Litros de gasolina");
        c10.setGasolina(Integer.parseInt(entrada.nextLine()));
        c10.prender();
        c10.avanzar();
        c10.Vuelta();

        listaCarros.add(c10);

        for (int i = 0; i < listaCarros.size(); i++) {
            System.out.println("Carro: " + (i + 1));
            Carro car = listaCarros.get(i);

            System.out.println("Marca: " + car.getMarca());
            System.out.println("Modelo: " + car.getModelo());
            System.out.println("Color: " + car.getColor());
            System.out.println("Precio: " + car.getPrecio());
            System.out.println("Prender: " + car.avanzar());
            System.out.println("Vuelta: " + car.vuelta());
        }
    }
}
