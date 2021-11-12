package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import view.Principal;

public class Controlador {

    public static Connection con;
    public static String mostrar;
    public static void createConexion(){
        String dbHost = view.Conexion.txtHost.getText() + "";
        String dbPuerto = view.Conexion.txtPuerto.getText() + "";
        String dbNombre = view.Conexion.txtNombre.getText() + "";
        model.Conexion.sethost(dbHost);
        model.Conexion.setpuerto(dbPuerto);
        model.Conexion.setBaseDatos(dbNombre);
        dbms.DataBase.conectar();

    }
    public static void createLogin(){
        String dbUsuario = view.frmLogin.txtUsuario.getText() + "";
        String dbcontrasena = view.frmLogin.txtContrasenia.getText() + "";
        model.Conexion.setUsuario(dbUsuario);
        model.Conexion.setcontrasena(dbcontrasena);
        dbms.DataBase.conectar();


    }

    public static void executeQuery() throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
		String Query = view.Principal.txtQuery.getText() + "";
        model.Conexion.setQuery(Query);

    
            //mandar query a la base de datos
        Statement miOrden = dbms.DataBase.getCon().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();

        ResultSetMetaData info = resultado.getMetaData();

        // obtener la tabla y guardar en mostrar
        int numCampos = info.getColumnCount();
        for(int iContador = 1; iContador <= numCampos; iContador++) {
            modelo.addColumn(info.getColumnName(iContador)); 
        }
        String row[] = new String[numCampos];
            while(resultado.next()) {
                for(int iContador = 1; iContador <= numCampos; iContador++) {
                    row[iContador-1] = resultado.getString(iContador);
                }
                modelo.addRow(row); 
            }
            view.Principal.table.setModel(modelo);

    }
          
            


        	
}
  
        
        
    

