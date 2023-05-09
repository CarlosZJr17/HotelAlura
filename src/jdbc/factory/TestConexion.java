package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class TestConexion {
	
	public static void main(String[] args)throws SQLException {
		ConexionBase con = new ConexionBase();
		Connection cone = con.conectarBase();
		
		System.out.println("conecto bien");
		cone.close();
		
		System.out.println("cerro correctamente");
	}
	
}
