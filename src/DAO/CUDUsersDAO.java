package DAO;

import Entitys.Conexion;
import Entitys.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CUDUsersDAO {

    Conexion oConex = new Conexion();
    PreparedStatement myPs;
    ResultSet myRs;
    
    
    
    //Creando Usuarios;
    Usuarios oUser = new Usuarios();
    boolean ok = true;

    public Usuarios findUserDAO(Usuarios o) {
        try {
            String sql = "SELECT * from triracing_01_users WHERE sUserName=? and sPassword=?";
            myPs = oConex.conectar().getConexion().prepareStatement(sql);
            myPs.setString(1, o.getUserName());
            myPs.setString(2, o.getPassword());
            myRs = myPs.executeQuery();
            if (myRs != null) {
                
                
                while (myRs.next()) {
                    oUser.setnIdUsuario(myRs.getInt("nIdUser01"));
                    oUser.setNombre(myRs.getString("sNombre"));
                    oUser.setApat(myRs.getString("sApat"));
                    oUser.setAmat(myRs.getString("sAmat"));
                    oUser.setUserName(myRs.getString("sUserName"));
                    oUser.setNivel(myRs.getString("sTipoUsuario"));
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
        return oUser;
    }

    public static CUDUsersDAO DAO() {
        return new CUDUsersDAO();
    }

}
