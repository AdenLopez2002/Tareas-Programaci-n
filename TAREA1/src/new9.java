//cap2 ejemplo 33
import java.util.Scanner;
public class new9 {
    public static void main(String[] args) {        
        Scanner in= new Scanner(System.in);        

        System.out.println("******CALCULADORA DE BMI******");
        System.out.print("¿Qué sistema métrico prefiere usar? \n(Americano-0 / Internacional-1) ");    
        int sist= in.nextInt();

        if(sist==0){            
            System.out.print("\nIngrese su peso en libras:  ");
            double peso=in.nextDouble();
            System.out.print("Ingrese su altura en pulgadas: ");
            double altura=in.nextDouble();

            double BMI = (peso*703)/(Math.pow(altura, 2));

            System.out.println("\nCalculando su índice de masa corporal...");
            System.out.println("Su índice: " + BMI);

        }else if(sist==1){
            System.out.print("\nIngrese su peso en kilogramos: ");
            double peso=in.nextDouble();
            System.out.print("Ingrese su altura en metros:   ");
            double altura=in.nextDouble();

            double BMI = (peso)/(Math.pow(altura, 2));

            System.out.println("\nCalculando su índice de masa corporal...");
            System.out.println("Su índice: " + BMI);
        }
        
        System.out.println("\nVALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal:    entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso:     30 o más");
        in.close();
    }
}
