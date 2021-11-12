package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataBase {


   
	public static Connection con= controller.Controlador.con;
    //conectar a db
    public static void conectar(){
		
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@" + model.Conexion.host  + ":" + model.Conexion.puerto + "/" + model.Conexion.baseDatos, model.Conexion.Usuario, model.Conexion.contrasena);
            System.out.println(con);
            Statement st = ((Connection) con).createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
    }
    //cerrar db
    public static void desconectar() throws Exception{
		if(con.isClosed()==true){
            System.out.println("Conexion cerrada");
        }else{
            con.close();
            System.out.println("Conexion cerrada");
        }
        
	}


    //metodo comprobar conexion
    public static void testCon(){
        if (controller.Controlador.con == null) {
            view.frmTest.mensaje= "No hay conexion";
        } else {
            view.frmTest.mensaje= "Si hay conexion";
        }
    }
    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection con) {
        DataBase.con = con;
    }
    

   
	
	
    


/*
    public static void conectar() throws Exception {
		
		String dbHOST = "10.192.120.60";
		String dbPORT = "1521";
		String dbNAME = "orcl";
		String dbUSER = "ALEX";
		String dbPASS = "5720";
		
		
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+":"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
		
	}*/
}
