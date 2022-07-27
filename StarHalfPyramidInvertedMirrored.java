import java.util.Scanner;

public class StarHalfPyramidInvertedMirrored {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer --> ");
        int number = sc.nextInt();
        
        for (int i = number; i > 0; i--) {
            
            for (int j = 0; j < number-i; j++) {           
                System.out.print(' '); 
            }
            
            for (int k = i; k > 0; k--) {
                System.out.print('*');
            }      
            
            System.out.println();       
        }    
    }       
       
}