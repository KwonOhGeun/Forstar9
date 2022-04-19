public class Forstar9 {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //*********
        //*********
        // *******
        //  *****
        //   ***
        //    *
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
