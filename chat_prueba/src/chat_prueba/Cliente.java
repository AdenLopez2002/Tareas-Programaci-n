package chat_prueba;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable
{
    private int puerto;
    private String mensaje;
    
    public Cliente(int puerto, String mensaje)
    {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() 
    {
         final String HOST = "127.0.0.1";
        //final int PUERTO = 5001;
        //DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, puerto);

            //in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            out.writeUTF(mensaje);
            
            //String mensaje = in.readUTF();
            //Envia el mensaje de conexion con el servidor.           
            //System.out.println(mensaje);
            
            sc.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
