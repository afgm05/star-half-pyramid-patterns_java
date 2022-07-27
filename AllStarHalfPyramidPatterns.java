import java.util.Scanner;

public class AllStarHalfPyramidPatterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer --> ");
        int number = sc.nextInt();		
		
		//Star-half-pyramid
		        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();         
        }  

		System.out.println();

		//Star-half-pyramid-inverted
		
		for (int i = number; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
		
		System.out.println();
		
		//Star-half-pyramid-mirrored
		
		for (int i = 1; i <= number; i++) {
			
            for (int j = number-i; j > 0; j--) {
                System.out.print(' ');  
            }
            
            for (int k = i; k > 0; k--) {
                System.out.print('*');
            }      
             System.out.println();    
			 
        }   

		System.out.println();
		
		//Star-half-pyramid-inverted-mirrored
		
		for (int i = number; i > 0; i--) {
            
            for (int j = 0; j < number-i; j++) {           
                System.out.print(' '); 
            }
            
            for (int k = i; k > 0; k--) {
                System.out.print('*');
            }      
            
            System.out.println();       
        }   
		
		System.out.println();
	
	}
}