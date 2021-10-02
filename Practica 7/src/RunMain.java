
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajosu
 */
public class RunMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carro> arl = new ArrayList<Carro>(10);
        Carro car = new Carro();

        try {
            FileReader fr = new FileReader("C:\\Users\\ajosu\\Documents\\GitHub\\autos.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while ((cadena = br.readLine()) != null) {

                String[] arr = cadena.split(",");
                car.setMarc(arr[0]);
                car.setModel(arr[1]);
                car.setPrecio(arr[2]);
                car.setMov(arr[3]);
                car.setMov2(arr[4]);
                System.out.println("La Marca es: " + car.getMarc() + " El Modelo es: "
                        + car.getModel() + " su precio es :" + car.getPrecio()
                        + " el carro enciende , se mueve hacia " + car.getMov() + " y hacia "
                        + car.getMov2());
                arl.add(car);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido un error");
        } catch (IOException e) {
            System.out.println("Ha vuelvo a ocurrir un error");
        }
    }
}
