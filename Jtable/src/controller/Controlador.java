package controller;

import javax.swing.table.DefaultTableModel;

public class Controlador {

    public static void rellenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();

        //añadir columnas

        modelo.addColumn("España");
        modelo.addColumn("Francia");
        modelo.addColumn("Portugal");

        //añadir filas
        String[] fila = new String[3];
        fila[0] = "100";
        fila[1] = "150";
        fila[2] = "200";
        modelo.addRow(fila);

        fila[0] = "200";
        fila[1] = "250";
        fila[2] = "300";
        modelo.addRow(fila);

        fila[0] = "300";
        fila[1] = "350";
        fila[2] = "400";
        modelo.addRow(fila);

        fila[0] = "400";
        fila[1] = "450";
        fila[2] = "500";
        modelo.addRow(fila);

        fila[0] = "500";
        fila[1] = "550";
        fila[2] = "600";

        //añadir tabla
        view.Principal.table.setModel(modelo);

        
        

    }
}
