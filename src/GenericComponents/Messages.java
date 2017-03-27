
package GenericComponents;

import javax.swing.JOptionPane;


public class Messages {
    
    
    //Information
    public void FormAlreadyOpen(){
        JOptionPane.showMessageDialog(null, "El formulario ya se encuentra abierto.","Information",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    //Action performed.
    public void ActionPerformedOK(){
        JOptionPane.showMessageDialog(null, "Accion realizada correctamente","OK",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Accion no realizada
    public void NoActionPerformed(){
        JOptionPane.showMessageDialog(null, "Accion no realizada correctamente","OK",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Credenciales Incorrectas
    public void CREDENCIALES_NO_VALIDAS(){
        JOptionPane.showMessageDialog(null, "CREDENCIALES DE ACCESO INCORRECTAS","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    
    
    public static Messages Message(){
        return new Messages();
    }
    
}
