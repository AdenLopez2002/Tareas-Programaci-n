package chat_prueba;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Observable implements Runnable
{
    private int puerto;
    
    public Servidor(int puerto)
    {
        this.puerto = puerto;
    }
    
    @Override
    public void run()
    {
         ServerSocket Servidor = null;
        Socket sc = null;
        DataInputStream in;
        //DataOutputStream out;
        
        try
        {
            Servidor = new ServerSocket(puerto);
            System.out.println("Servidor corriendo.");
            
            while(true)
            {  
                sc = Servidor.accept();
                             
                System.out.println("Cliente en linea.");
                
                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();
                
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                sc.close();
                System.out.println("Cliente desconectado.");
            }
        } catch (IOException ex)
        {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
