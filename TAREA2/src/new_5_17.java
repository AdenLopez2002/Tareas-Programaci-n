//cap 45ejemplo 17 
import java.util.Scanner;
public class new_5_17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double precio;
        System.out.print("Ingrese cuantos tipos de productos que se vendieron: ");
        int op= in.nextInt();
        

        for (int a=1; a<=op; a++){                       
            System.out.println("\nProducto "+a);

            System.out.print("Número de producto que vendió: ");
            int num= in.nextInt();

            System.out.print("\nCantidad vendida: ");
            int cant= in.nextInt();

            switch (num) {
                case 1:
                    precio=2.98;
                    System.out.println("Valor total del producto 1: "+ precio*cant); 
                case 2:
                    precio=4.50;
                    System.out.println("Valor total del producto 2: "+ precio*cant);
                case 3:
                    precio=9.98;
                    System.out.println("Valor total del producto 3: "+ precio*cant);
                case 4:
                    precio=4.49;
                    System.out.println("Valor total del producto 4: "+ precio*cant);
                case 5:
                    precio=6.87;
                    System.out.println("Valor total del producto 5: "+ precio*cant);
                break;

                default:
                    System.out.println("Ingrese nuevamente.");
                    a--;                    
            }
         }
        System.out.println("Adiós.");
        in.close();
}
}
