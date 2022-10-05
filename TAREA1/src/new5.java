import java.util.Scanner;
//cap2 ejemplo 16
public class new5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Ingrese dos enteros: ");
        int a= in.nextInt();
        int b= in.nextInt();

        if (a>b){
            System.out.println(a+" es más grande.");
        }else if(b>a){
            System.out.println(b+" es más grande.");
        }else if(b==a){
            System.out.println("Estos números son iguales.");
        }
        in.close();
    }
}
