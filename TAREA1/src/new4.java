import java.util.Scanner;
//cap2 ejemplo 15 (Aritmética)
public class new4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int a= in.nextInt();
        int b= in.nextInt();

        System.out.println("Suma: "+ (a+b));
        System.out.println("Producto: "+ (a*b));
        System.out.println("Diferencia: "+ (a-b));        
        System.out.println("Cociente: "+ (a/b));
        in.close();
    }
}
