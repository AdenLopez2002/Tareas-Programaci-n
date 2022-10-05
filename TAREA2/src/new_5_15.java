import java.util.Scanner;
public class new_5_15 {    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Eliga el triangulo a imprimir: (1-4) ");
        int op= in.nextInt(); 

        switch (op) {
            case 1:
                for (int a=0; a<=10; a++) {
                    System.out.print("\n");
                    for (int b = 0; b<=a; b++) {
                        System.out.print("*");
                    }
                }System.out.print("\n");
                break;

            case 2:
                //b
                for (int i = 0; i <= 10; i++) {
                    System.out.print("\n");
                    for (int j = 10; j>=i; j--) {
                        System.out.print("*");
                    }
                }System.out.print("\n");
                break;
        
            case 3:
                for (int a=0; a<=10; a++) {
                    System.out.print("\n");
                    //espacios
                    for (int b = 0; b<=a; b++) {
                        System.out.print(" ");
                    }//atreriscos
                    for (int b=10; b>=a; b--) {
                        System.out.print("*");
                    }
                }
                break;

            case 4:
                for (int a=0; a<=10; a++) {
                    System.out.print("\n");
                    //espacios
                    for (int b=10; b>=a; b--) {
                        System.out.print(" ");
                    }//atreriscos
                    for (int b = 0; b<=a; b++) {
                        System.out.print("*");
                    } 

                    }
                    break;
            default:                
                break;
        }
        in.close();
        
    }
}
