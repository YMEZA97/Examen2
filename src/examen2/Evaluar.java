/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.ArrayList;

/**
 *
 * @author turupawn
 */
public class Evaluar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> productos1 = new ArrayList<>();
        productos1.add(new Producto("Asistin", "Limpieza", 40, 5.10));
        productos1.add(new Producto("Arroz", "Alimentos", 20, 2.55));
        productos1.add(new Producto("Cloro", "Limpieza", 50, 9.99));
        
        ArrayList<Producto> productos2 = new ArrayList<>();
        productos2.add(new Producto("P1", "C1", 10, 1.1));
        productos2.add(new Producto("P2", "C2", 20, 2.2));
        
        Ejercicios.guardar("archivo1.txt", productos1);
        Ejercicios.guardar("archivo2.txt", productos2);
        
        ArrayList<Producto> productos_lectura1 = Ejercicios.abrir("archivo1.txt");
        ArrayList<Producto> productos_lectura2 = Ejercicios.abrir("archivo2.txt");
        
        System.out.print("guardar y abrir: ");
        if(productos_lectura1 != null
                && productos_lectura2 != null
                && productos_lectura1.size() == 3
                && productos_lectura2.size() == 2
                && productos_lectura1.get(0).nombre.equals("Asistin")
                && productos_lectura1.get(0).categoria.equals("Limpieza")
                && productos_lectura1.get(0).existencias == 40
                && productos_lectura1.get(0).precio == 5.10
                && productos_lectura1.get(1).nombre.equals("Arroz")
                && productos_lectura1.get(1).categoria.equals("Alimentos")
                && productos_lectura1.get(1).existencias == 20
                && productos_lectura1.get(1).precio == 2.55
                && productos_lectura1.get(2).nombre.equals("Cloro")
                && productos_lectura1.get(2).categoria.equals("Limpieza")
                && productos_lectura1.get(2).existencias == 50
                && productos_lectura1.get(2).precio == 9.99
                && productos_lectura2.get(0).nombre.equals("P1")
                && productos_lectura2.get(0).categoria.equals("C1")
                && productos_lectura2.get(0).existencias == 10
                && productos_lectura2.get(0).precio == 1.1
                && productos_lectura2.get(1).nombre.equals("P2")
                && productos_lectura2.get(1).categoria.equals("C2")
                && productos_lectura2.get(1).existencias == 20
                && productos_lectura2.get(1).precio == 2.2
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
    }
    
}
