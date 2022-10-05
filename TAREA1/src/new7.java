import java.util.Scanner;
public class new7 {
    public static void main(String[] args) {
        //cap2 ejemplo 25
        int x=1;
        while (x!=0){

        Scanner in= new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n= in.nextInt();
        
        if (n%2==0){
            System.out.println(n+" es un número par.");
        }else if (n%2!=0){
            System.out.println(n+" es un número impar.");
        }
        System.out.print("Salir? ");  x= in.nextInt();
        in.close();
        } 
        
    }
    
}
