//cap 4 ejemplo 19     Calculadora de comisiones de ventas
import java.util.Scanner;
public class new_4_19_PR {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double art1=239.99;
        double art2=129.75;
        double art3=99.95;
        double art4=350.89;
        int op=0;

        System.out.println("Bienvenido usuario.");

        while (op!=1) {            
            System.out.println("Ingrese la cantidad de artículos No. 1 que vendió: ");
            double a1= in.nextDouble();           
            a1=art1*a1;
            
            System.out.println("Ingrese la cantidad de artículos No. 2 que vendió: ");
            double a2= in.nextDouble();
            a2=art2*a2;
            
            System.out.println("Ingrese la cantidad de artículos No. 3 que vendió: ");
            double a3= in.nextDouble();
            a3=art3*a3;

            System.out.println("Ingrese la cantidad de artículos No. 4 que vendió: ");
            double a4= in.nextDouble();
            a4=art4*a4;            
            //Mercancía total vendida
            double cnt=a1+a2+a3+a4;

            System.out.println("Sueldo base: 200");
            System.out.println("Mercancía vendida: "+ cnt);
            System.out.println("Comisión: "+ (cnt*0.09));
            System.out.println("---------------------------");
            System.out.println("Sueldo total: "+ (200 + (cnt*0.09)));

            System.out.println("\n¿Salir? (1-SI)");
            op= in.nextInt();
        }
        System.out.println("Tenga buen día.");
        in.close();
    }
}
