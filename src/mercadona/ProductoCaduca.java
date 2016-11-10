/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author usuario
 */
public class ProductoCaduca extends Producto {

    private String fecha_cad;

    public String getFecha_cad() {
        return fecha_cad;
    }

    public void setFecha_cad(String fecha_cad) {
        this.fecha_cad = fecha_cad;
    }
     public void mostrar(){
        super.mostrar();
        System.out.println(this.fecha_cad);
    }
}
