import java.util.Scanner;

public class StarHalfPyramidMirrored {
    
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer --> ");
        int number = sc.nextInt();
        
        for (int i = 1; i <= number; i++) {
			
            for (int j = number-i; j > 0; j--) {
                System.out.print(' ');  
            }
            
            for (int k = i; k > 0; k--) {
                System.out.print('*');
            }      
             System.out.println();    
			 
        }    
    }       
        
}