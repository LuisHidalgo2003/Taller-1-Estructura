/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modelaTabla;

import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author peluche
 */
public class ModeloTablaVenta extends AbstractTableModel{
    
    private Venta [] datos = new Venta[12];

    public Venta[] getDatos() {
        return datos;
    }

    public void setDatos(Venta[] datos) {
        this.datos = datos;
    }

    

    
    public int getColumnCount() {
        return 2;
    }

    
    public int getRowCount() {
        return datos.length;
    }

    
    public String getColumnName(int i) {
        
        switch(i) {
            case 0: return "Mes";
            case 1: return "Valor ";
   
            default: return null;
        }
    }

    
    public Object getValueAt(int i, int i1) {
        Venta s = datos[i];
         
        switch(i1) {
            case 0: return (s != null )? s.getMes().toString(): "NO DEFINIDO";
            case 1: return (s != null) ? s.getValor():0.0;
            
            default: return null;
        }
    }
}
