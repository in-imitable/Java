import java.util.Scanner;

public class Max_And_Min {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		if (x>y) {
//	
//		System.out.println(x+ " is greater than " +y);
//		
//		}
//		
//		else if (x<y) {
//			
//			System.out.println(x+ " is less than " +y);		
//			
//		}
//		
//		else {
//			
//			System.out.println("Both are equal.");
//		}
//		
		System.out.println("Maximum Value = " +Math.max(x, y));
		
		System.out.println("Minimux Value = " +Math.min(x, y));
		
	}

}
