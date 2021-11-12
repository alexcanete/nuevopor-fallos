package model;

public class Conexion {
	public static String Usuario;
	public static String contrasena;
	public static String host;
	public static String puerto;
	public static String baseDatos;
	public static String Query;
	
	public Conexion(String Usuario, String contrasena, String host, String puerto, String baseDatos, String Query) {
		Conexion.Usuario = Usuario;
		Conexion.contrasena = contrasena;
		Conexion.host = host;
		Conexion.puerto = puerto;
		Conexion.baseDatos = baseDatos;
		Conexion.Query = Query;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	public static void setUsuario(String Usuario) {
		Conexion.Usuario = Usuario;
	}
	public String getcontrasena() {
		return contrasena;
	}
	public static void setcontrasena(String contrasena) {
		Conexion.contrasena = contrasena;
	}
	public String gethost() {
		return host;
	}
	public static void sethost(String host) {
		Conexion.host = host;
	}
	public String getpuerto() {
		return puerto;
	}
	public static void setpuerto(String puerto) {
		Conexion.puerto = puerto;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public static void setBaseDatos(String baseDatos) {
		Conexion.baseDatos = baseDatos;
	}
	public String getQuery() {
		return Query;
	}
	public static void setQuery(String Query) {
		Conexion.Query = Query;
	}
	

}
