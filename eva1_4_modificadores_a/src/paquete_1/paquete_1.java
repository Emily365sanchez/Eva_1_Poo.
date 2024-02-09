/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete_1;

/**
 *
 * @author invitado
 */
public class paquete_1 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one obj1 = new one();
        System.out.println(obj1);
        
        //clase del paquete b
        b objb = new b();
        System.out.println(objb);
        
        //two obj2 = new two(); no se puede usar por que no es accesible, tiene modificador default
        
        c objc = new c ();
        System.out.println(objc);
        
        //three obj3 = new three();
   
    }

    
        
    }
    
}

class one {

}