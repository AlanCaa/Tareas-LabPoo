/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;
import java.util.Scanner;

/**
 *
 * @author ajosu
 */
public class RunPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        Scanner anim = new Scanner(System.in);
        System.out.println("ANIMALES ");
        System.out.println("1)Perro");
        System.out.println("2)Gato");
        System.out.println("3)Ave");
        System.out.println("4)Conejo");
        System.out.print("Introduce que animal es:");
        int op= anim.nextInt();
        
        switch (op){
            case 1:
                        System.out.println("");
                        Scanner rzaP = new Scanner(System.in);
                        System.out.println("Raza del perro ");
                        System.out.println("1)Pastor Aleman");
                        System.out.println("2)Chihuahua");
                        System.out.print("Introduce la raza del perro:");
                        int perro = rzaP.nextInt();
                         switch (perro){
                             case 1:
                                    PastorAleman pa = new PastorAleman();
                                    System.out.println(pa.comer());
                                    pa.corre();
                                    pa.ladrar();
                                    pa.moverCola();
                                    pa.cariñoso();
                                    pa.jugar();
                                    break;
                             case 2:
                                    Chihuahua chi= new Chihuahua();
                                    System.out.println(chi.comer());
                                    chi.ladrar();
                                    chi.muerde();
                                    chi.enojo();
                                    break;
                         }
                         break;
            case 2:          
                        System.out.println("");                
                        Scanner rzaG = new Scanner(System.in);
                        System.out.println("Razas del gato ");
                        System.out.println("1)Siames");
                        System.out.println("2)Persa");
                        System.out.print("Introduce la raza del gato:");
                        int gato = rzaG.nextInt();       
                         switch(gato){
                             case 1:
                                         Siames gto = new Siames();
                                         System.out.println(gto.comer());
                                         gto.comer();
                                         gto.brincar();
                                         gto.maullar();
                                         gto.cariño();
                                         gto.dormir();
                                         break;
                             case 2: 
                                         Persa per = new Persa();
                                         System.out.println(per.comer());
                                         per.comer();
                                         per.brincar();
                                         per.maullar();
                                         per.juego();
                                         per.ronronear();
                                         break;
                         }
                         break;
            case 3:
                        System.out.println("");
                        Scanner rzaAv = new Scanner(System.in);
                        System.out.println("Raza del ave ");
                        System.out.println("1)Perico");
                        System.out.println("2)Canario");
                        System.out.print("Introduce la raza del ave:");
                        int aV = rzaAv.nextInt();
                         switch(aV){
                             case 1:
                                         Perico pe = new Perico();
                                         System.out.println(pe.comer());
                                         pe.volar();
                                         pe.hablar();
                                         pe.pico();
                                         pe.color();
                                         break;
                             case 2: 
                                         Canario can = new Canario();
                                         System.out.println(can.comer());
                                         can.volar();
                                         can.cantar();
                                         can.pluma();
                                         can.peque();
                                         break;
                                         
                         }    
                         break;
            case 4:
                        System.out.println("");
                        Scanner rzaCon = new Scanner(System.in);
                        System.out.println("Raza del conejo ");
                        System.out.println("1)Holandes");
                        System.out.println("2)Holland Lop");
                        System.out.print("Introduce la raza del conejo:");
                        int c = rzaCon.nextInt();        
                         switch(c){
                             case 1: 
                                         Holandes ho = new Holandes();
                                         System.out.println(ho.comer());
                                         ho.salta();
                                         ho.calmado();
                                         ho.cariños();
                                         ho.trucos();
                                         break;
                                         
                             case 2:
                                        HollandLop hl = new HollandLop();
                                         System.out.println(hl.comer());
                                         hl.salta();
                                         hl.gordo();
                                         hl.sacudir();
                                         break;
                         }
                         break;
        }
        




 
        

        

        
    }
    
}
