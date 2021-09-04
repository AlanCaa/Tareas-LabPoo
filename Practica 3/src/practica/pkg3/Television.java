/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

/**
 *
 * @author ajosu
 */
public class Television extends Dispositivo_Electronico implements IFunciones, ICosas_TV {

    @Override
    public String encender() {
        return "Television Encendida";
    }

    @Override
    public String apagar() {
        return "Television Apagada";
    }

    @Override
    public String cambioCanal() {
        return "Television puede cambiar de canal";
    }

    @Override
    public String volumen() {
        return "Television con volumen";
    }

    @Override
    public String Color() {
        return "Television Negro";
    }

    @Override
    public String ConfMenu() {
        return "Configuración del Menú";
    }
    
    
}

