/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_instanciacion;

/**
 *
 * @author invitado
 */
public class EVA1_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //INSTANCIACION: Crear el objeto --> darle memoria 
        //CLASE IDENTIFICADOR = new constructor();
        //constructor --> Método con el mismo nombre que la clase.
        Persona persol = new Persona();//instanciación
        System.out.println(persol);
        //persol --> referencia --> direccion en memoria
        Vehiculo perron = new Vehiculo();
        System.out.println(perron);
       perron.marca = "Ford";
       perron.modelo = "Mustang";
       perron.annio = 1965;
       System.out.println("Marca: " + perron.marca);
       System.out.println("Modelo: " + perron.modelo);
       System.out.println("Año: " + perron.annio);


   
   }
    
}

//TIPO DE DATO ABSTRACTO 
class Vehiculo{
String marca;
int annio;
String modelo;


}