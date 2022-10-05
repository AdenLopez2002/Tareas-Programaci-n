import java.util.Scanner;
public class new_4_18_PR {
    public static void main(String[] args) {
        System.out.println("\nCalculadora de límite de crédito");
        System.out.println("---------------------------------------");

        Scanner in= new Scanner(System.in);

        System.out.println("Por favor ingrese los siguientes datos:");
        System.out.print("a) el número de cuenta. ");
        int cuenta= in.nextInt();
        System.out.print("b) el saldo al inicio del mes. ");
        int saldo_inicial= in.nextInt();
        System.out.print("c) el total de todos los artículos cargados por el cliente en el mes. " );
        int art_cargados= in.nextInt();
        System.out.print("d) el total de todos los créditos aplicados a la cuenta del cliente en el mes. ");
        int creditos_apl= in.nextInt();
        System.out.print("e) el límite de crédito permitido. ");
        int lim_permitido= in.nextInt();

        int nuevo_saldo = saldo_inicial + (art_cargados - creditos_apl);

        System.out.printf("\n%s \t\t\t%s%d\n","Datos", "Cliente No.",cuenta);
        System.out.println("----------------------------------------");
        System.out.printf("%s \t\t%d\n","saldo_inicial", saldo_inicial);
        System.out.printf("%s \t\t%d\n","saldo_nuevo", nuevo_saldo);
        System.out.printf("%s \t%d\n","limite_de_crédito", lim_permitido);

        if (nuevo_saldo>lim_permitido) {
            System.out.println("\nSe excedió el límite de su crédito. ");
        }else{
            System.out.println("\nSe aprobó su crédito.");
        }
        in.close();



    }
}
