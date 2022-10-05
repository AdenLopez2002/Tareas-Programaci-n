import java.util.Scanner;
//cap2 ejercicio 34             Calculadora del crecimiento de la población mundial
public class new10 {
    public static void main(String[] args) {       
        // TASA DE CRECIMIENTO POBLACIONAL: 59,656,281;
        // POBLACIÓN MUNDIAL ACTUAL: 7,976,922,780;
        Scanner in= new Scanner(System.in); 
    
        System.out.println("Población mundial actual: ");
        float pob_mundial=in.nextFloat();
        System.out.println("Tasa de crecimiento anual: ");
        float tasa_anual=in.nextFloat();

        System.out.println("Población mundial estimada después de 1 año:" + (pob_mundial+tasa_anual));
        System.out.println("Población mundial estimada después de 2 años:" + (pob_mundial+(tasa_anual*2)));
        System.out.println("Población mundial estimada después de 3 años:" + (pob_mundial+(tasa_anual*3)));
        System.out.println("Población mundial estimada después de 4 años:" + (pob_mundial+(tasa_anual*4)));
        System.out.println("Población mundial estimada después de 5 años:" + (pob_mundial+(tasa_anual*5)));
        in.close();
    }
}
