/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

/**
 *
 * @author ajosu
 */
public abstract class DispositivoElectronico {
    String marca;
    String modelo;

    public DispositivoElectronico(String marca, String modelo) { 
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract String encender();
    public abstract String apagar();
}
