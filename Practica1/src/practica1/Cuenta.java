/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author ajosu
 */
public class Cuenta {
    
private String nomCliente;
private String numCuenta;
private double saldo;
private double tipoInteres;


public Cuenta(){
    
}
public Cuenta(String nomCliente, String numCuenta, double tipoInteres, double Saldo){
    this.nomCliente = nomCliente;
    this.numCuenta = numCuenta;
    this.tipoInteres = tipoInteres;
    this.saldo = Saldo;
}
public Cuenta(Cuenta objCuenta){
    this.nomCliente = objCuenta.nomCliente;
    this.numCuenta = objCuenta.numCuenta;
    this.tipoInteres = objCuenta.tipoInteres;
    this.saldo = objCuenta.saldo;
}
 public void setnomCliente(String s) {
        nomCliente = s;
    }

    public void setnumCuenta(String s) {
        numCuenta = s;
    }

    public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public void setSaldo(double n) {
        saldo = n;
    }

    public String getnomCliente() {
        return nomCliente;
    }

    public String getnumCuenta() {
        return numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }
public boolean deposito(double cnt){
    boolean depositoDone = true;
    if(cnt < 0){
           depositoDone = false;
     }
    else{
        this.saldo = this.saldo + cnt;
        
    }
    return depositoDone;
}
   public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;                                                                         
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
    public boolean transferencia(Cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.deposito(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
    }

 