//cap4 ejercicio 8
public class new_4_8 {
    public static void main(String[] args) {
        int c=0; //a
        while (c<=5){
            int producto=1;
            producto=(producto*c);
        }
        System.out.println("a)Errores: ");
        System.out.println("-Variables no inicializadas. \n-No se cerró el ciclo. \n-(*=) no se puede");
        //b
        int genero=1;
        if (genero == 1)
            System.out.println("Mujer");
        else
            System.out.println("Hombre");

        System.out.println("a)Errores: ");
        System.out.println("-Variables no inicializadas. \n-Sobran los dos puntos.");
    }


}
