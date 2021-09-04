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
public class Radio extends Dispositivo_Electronico implements IFunciones, ICosas_TV{

    @Override
    public String encender() {
        return "Radio Enciende";
    }

    @Override
    public String apagar() {
        return "Radio Apagado";
    }

    @Override
    public String cambioCanal() {
        return "Radio cambia de canal";
    }

    @Override
    public String volumen() {
        return "Radio con volumen";
    }

    @Override
    public String Color() {
        return "Radio rojo";
    }

    @Override
    public String ConfMenu() {
        return "Configuración del menú";
    }
    
}

