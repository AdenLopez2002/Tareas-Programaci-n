/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conex_bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Richard Lopez
 */
public class conexion {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password=" ";
    private static final String url="jdbc:mysql://localhost:3306/veterinaria";

   

    public conexion() {
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            //para saber
            if(conn != null){
                System.out.println("Conectado.");
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error:" + e);
        }
            
    }
    
    //retorna
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn= null;
        if(conn == null){
                System.out.println("Conexión terminada.");
            }
}
    
}
