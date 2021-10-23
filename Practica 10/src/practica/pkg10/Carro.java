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
public class Carro {
    
    private enum MarcaCarro{FORD,TOYOTA,SUZUKI,RENAULT,SEAT};
    private String matricula;
    private MarcaCarro marca;
   
    public Carro(){
        matricula = "";
        marca = null;
    }
   
    public void setMatricula(String datoMatricula){
        matricula = datoMatricula;
    }
   
    public void setMarca(String datoMarca){
        switch(datoMarca){
            case "Ford":
            case "ford":
                marca = MarcaCarro.FORD;
            break;
            case "Toyota":
            case "toyota":
                marca = MarcaCarro.TOYOTA;
            break;
            case "Suzuki":
            case "suzuki":
                marca = MarcaCarro.SUZUKI;
            break;
            case "Renault":
            case "renault":
                marca = MarcaCarro.RENAULT;
            break;
            case "Seat":
            case "seat":
                marca = MarcaCarro.SEAT;
            break;
            default:
                System.out.println("La marca del carro no esta en los registros.");
            break;
        }
    }
   
    public String getMatricula(){
        return matricula;
    }
   
    public String getMarca(){
        return marca.toString().toLowerCase();
    }
    
}
