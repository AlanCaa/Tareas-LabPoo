/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajosu
 */
public class Carro extends Transporte implements IAvanzar, IParar {

    private String marca;
    private String modelo;
    private String color;
    private String precio;
    private int gasolina;

    public Carro(String marca, String modelo, String color, String precio, int gasolina) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.gasolina = gasolina;

    }

    Carro() {
    }

    @Override
    public String prender() {
        return "Encendido";
    }

    @Override
    public String avanzar() {
        if (gasolina > 0) {
            return "Avanzar";
        }
        if (gasolina <= 0) {
            return "No enciende";
        }
        return null;
    }

    public String vuelta() {
        if (gasolina > 0) {
            return "Vuelta derecha o izquierda";
        }
        if (gasolina <= 0) {
            return null;
        }
        return null;

    }

    @Override
    public void parar() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the gasolina
     */
    public int getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    String Vuelta() {
        return "Izquierda o derecha";

    }

}
