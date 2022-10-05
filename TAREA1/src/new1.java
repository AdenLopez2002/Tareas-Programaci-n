import java.util.Scanner;
//Cap2 ejemplo 3
public class new1 {
    public static void main(String[] args){        
        //a
        int c, estaEsUnaVariable, q76354, numero;
        //b,c
        Scanner in= new Scanner(System.in);

        System.out.print("Introduzca un entero: ");
        int valor= in.nextInt();
        System.out.println("Ingresó un entero: "+valor);

        //d
        System.out.println("Este es un programa de Java.");

        //e
        System.out.printf("%s %s %s\n","Este","es","un");
        System.out.printf("%s %s %s\n","programa","de","Java.");

        //f
        System.out.print("V numero: ");
        numero= in.nextInt();
        if(numero!=7){
            System.out.println("La variable número no es igual a 7.");
        }else{
            System.out.println("La variable número es igual a 7.");
        }
        in.close();
    }
}
