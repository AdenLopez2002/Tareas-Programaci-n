public class new_5_24 {
    public static void main(String[] args) {
        //parte de arriba
        for (int a=0; a<=3; a++) {
            System.out.print("\n");
            //espacios
            for (int b=4; b>=a; b--) {
                System.out.print(" ");
            }//atreriscos
            for (int b = 0; b<=(2*a); b++) {
                System.out.print("*");
            } 
            
        }
        //parte de abajo
        for (int a=0; a<=4; a++) {
                    System.out.print("\n");
                    //espacios
                    for (int b = 0; b<=(a); b++) {
                        System.out.print(" ");
                    }//atreriscos
                    for (int b=8; b>=(2*a); b--) {
                        System.out.print("*");
                    }
                }
    }
}
