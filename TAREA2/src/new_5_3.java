public class new_5_3 {
    public static void main(String[] args) {
        int suma = 0;
        System.out.println("a)");
        for (int cuenta = 1; cuenta <= 99; cuenta += 2) 
            suma += cuenta;

        System.out.println(suma);

        System.out.println("b)");
        double resultado = Math.pow(2.5, 3);
        System.out.println(resultado);

        System.out.println("c)");
        int i = 1;
        while (i <= 20)  {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print("\t" );
            ++i;
        }

        System.out.println("d)");
        for (i = 1; i <= 20; i++) {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print("\t");
        }
    }
}
