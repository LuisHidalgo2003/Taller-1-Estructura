/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1luish;

import controlador.SucursalControl;
import controlador.exception.EspacioException;
import controlador.util.Utilidades;
import modelo.EnumMes;

/**
 *
 * @author peluche
 */
public class Taller1LuisH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println("Hola");
       SucursalControl sc = new SucursalControl(); 
       try {
        
        sc.getSucursal().setId(1);
        sc.getSucursal().setNombre("Camila");
        sc.registrar();
        sc.setSucursal(null);
        
        sc.getSucursal().setId(2);
        sc.getSucursal().setNombre("Sayda");
        sc.registrar();
        sc.setSucursal(null);

        
        sc.getSucursal().setId(3);
        sc.getSucursal().setNombre("Jose");
        sc.registrar();
        sc.setSucursal(null);
        
        sc.getSucursal().setId(4);
        sc.getSucursal().setNombre("Juan");
        sc.registrar();
        sc.getSucursales()[0].getVentas()[0].setValor(15d);
        //sc.guardarVentas(3, EnumMes.DICIEMBRE, 10d);
        System.out.println(sc.getSucursal().getVentas());
        Utilidades.imprimir(sc.getSucursal().getVentas());
        sc.setSucursal(null);

        System.out.println("/////////////////////////////////////////");
        Utilidades.imprimir(sc.getSucursales());
        Utilidades.imprimir(sc.getSucursales()[2].getVentas());
        } catch (EspacioException e) {
            System.out.println("Error"+" "+e.getMessage());
        }
    }
}