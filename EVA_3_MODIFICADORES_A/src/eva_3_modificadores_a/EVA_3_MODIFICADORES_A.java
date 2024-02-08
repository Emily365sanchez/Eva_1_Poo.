/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_3_modificadores_a;

import EMILY.CHANGO;

/**
 *
 * @author invitado
 */
public class EVA_3_MODIFICADORES_A {
    public int x;
    protected int y;
    private int z;
    int w;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //prueba es default
        pruebaA objA = new pruebaA();
       // objA. --> puedo ver x (public)
        //puedo ver a y protected
        //puedo ver a w (default)
        CHANGO CHobj = new CHANGO ();
        //otroobj. --> se ve x por que es public 
        // los demas no son visibles 
       // pruebaB objB = new pruebaB(); esta clase no es visible 
    }
    
}
//estas clases son default, clase con acceso default
class pruebaA{
    public int x;
    protected int y;
    private int z;
    int w;
}
