
package conexion;

//import com.mysql.jdbc.Connection;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard Lopez
 */
public class conexionMySQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login","root","durtecks");
            
            //JOptionPane.showMessageDialog(null,"buena conexion ");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexión " + e.getMessage());
            
        }
        
        return conectar;
    }

       
}
