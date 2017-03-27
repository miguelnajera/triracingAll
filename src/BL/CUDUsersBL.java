/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.CUDUsersDAO;
import Entitys.Usuarios;


public class CUDUsersBL {

    
    
    
    public Usuarios findUserBL(Usuarios o){    
        return CUDUsersDAO.DAO().findUserDAO(o);
    }

    public static CUDUsersBL BL() {
        return new CUDUsersBL();
    }

}
