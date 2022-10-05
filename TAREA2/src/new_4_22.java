public class new_4_22 {
    public static void main(String[] args) {
        int n=1;
        System.out.printf("%s\t %d%s\t %d%s\t %d%s\n\n", "N", n*10, "*N", n*100, "*N", n*1000, "*N");

        for (int a=1; a<6; a++){            
            System.out.printf("%d\t %d\t %d\t %d\n", n, n*10, n*100, n*1000);
            n++;
        }
    }
}
