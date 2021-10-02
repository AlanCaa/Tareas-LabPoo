/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajosu
 */
public class Carro {

    private String marc;
    private String model;
    private String precio;
    private String gas;
    private String mov;
    private String mov2;
    
    /**
     *
     * @return
     * @deprecated
     */
    @Deprecated
    public String abrirCarro(){
        return "El carro se abrio con la llave";
    }
    
    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getMov() {
        return mov;
    }

    public void setMov(String mov) {
        this.mov = mov;
    }

    public String getMov2() {
        return mov2;
    }

    public void setMov2(String mov2) {
        this.mov2 = mov2;
    }

}
