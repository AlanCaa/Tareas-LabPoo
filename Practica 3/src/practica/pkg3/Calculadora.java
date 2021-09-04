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
public class Calculadora extends Dispositivo_Electronico implements IOperaciones_Aritmeticas, ICosas_TV {

    @Override
    public String encender() {
        return "Calculadora encendida";
    }

    @Override
    public String apagar() {
        return "Calculadora apagada";
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public String Color() {
        return "Calculadora azul";
    }

    @Override
    public String ConfMenu() {
        return "Configuración del menú";
    }
    
}