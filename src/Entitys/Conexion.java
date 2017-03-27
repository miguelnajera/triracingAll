
package Entitys;

import java.sql.*;


public class Conexion {
    
    private Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public Conexion conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/triracing?user=root&password=";

            setConexion(DriverManager.getConnection(BaseDeDatos));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
}


