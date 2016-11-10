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
public class BebidaAlcohol extends Bebida {

    private double alcohol;

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }
     public void mostrar(){
        super.mostrar();
        System.out.println(this.alcohol);
    }

}
