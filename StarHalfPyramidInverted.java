import java.util.Scanner;

public class StarHalfPyramidInverted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer --> ");
        int number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }       
        
}