import java.util.Scanner;
//Cap2 ejemplo 28
public class new8 {
    public static void main(String[] args) {
        /*Cálculo de un circulo:
         * diámetro = 2r
         * circunferencia = 2πr
         * área = πr2         */

        Scanner in = new Scanner(System.in);
        System.out.print("- Ingrese un valor para el radio del círculo: ");
        int r=in.nextInt();

        System.out.printf("\t%s %d %n", "diámetro =", (2*r));
        System.out.printf("\t%s %f %n", "circunferencia =", (2*Math.PI*r));
        System.out.printf("\t%s %f %n%n", "área =", (Math.PI * (Math.pow(r,2)) ));
        in.close();
    }
    
}