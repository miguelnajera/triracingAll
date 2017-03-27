
package Entitys;

import ENUMS.CRUDAction;
import java.util.Date;

public class Usuarios {
    
    private int nIdUsuario;
    private Date fechaReg;
    private String tipoUsuario;
    private String urlFoto;
    private String Nombre;
    private String Apat;
    private String Amat;
    private int Tel;
    private String Email;
    private String UserName;
    private String Password;
    private String FecNac;
    private int Edad;
    private String tSangre;
    private String Alergias;
    private String talla;
    private String Nivel;
    private int telContact;
    private String Comentarios;
    
    private CRUDAction Action;
    

    public int getnIdUsuario() {
        return nIdUsuario;
    }

    public void setnIdUsuario(int nIdUsuario) {
        this.nIdUsuario = nIdUsuario;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApat() {
        return Apat;
    }

    public void setApat(String Apat) {
        this.Apat = Apat;
    }

    public String getAmat() {
        return Amat;
    }

    public void setAmat(String Amat) {
        this.Amat = Amat;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFecNac() {
        return FecNac;
    }

    public void setFecNac(String FecNac) {
        this.FecNac = FecNac;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String gettSangre() {
        return tSangre;
    }

    public void settSangre(String tSangre) {
        this.tSangre = tSangre;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getTelContact() {
        return telContact;
    }

    public void setTelContact(int telContact) {
        this.telContact = telContact;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    

    public CRUDAction getAction() {
        return Action;
    }

    public void setAction(CRUDAction Action) {
        this.Action = Action;
    }
    
    
    
    
    
    
    
    
    
    
}
