import java.util.Scanner;
public class new_5_25_rombos {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int op=1;
        while (op!=0) {
            System.out.println("---IMPRESORA DE ROMBOS---");
            System.out.print("--Especifique el número de filas del rombo: ");
            int n= in.nextInt();

            if (n%2!=0 && n<=19) {
                //parte de arriba
                for (int a=0; a<=((n/2)-1); a++) {
                    System.out.print("\n");
                    //espacios
                    for (int b=(n/2); b>=a; b--) {
                        System.out.print(" ");
                    }//atreriscos
                    for (int b = 0; b<=(2*a); b++) {
                        System.out.print("*");
                    }                     
                }
                //parte de abajo
                for (int a=0; a<=((n/2)); a++) {
                    System.out.print("\n");
                    //espacios
                    for (int b = 0; b<=(a); b++) {
                        System.out.print(" ");
                    }//atreriscos
                    for (int b=(n); b>=((2*a)+1); b--) {
                        System.out.print("*");
                    }
               }
                System.out.println("\n\n");
                op=0;            
                
            } else if(n%2!=0 && n>19){
                System.out.println(" ERROR: -Debe ser un número menor a 19.\n\n");
                
            } else if(n%2==0 && n<=19){
                System.out.println(" ERROR: -Debe ser un número impar.\n\n");
            }

            
        }in.close();
    }
}
