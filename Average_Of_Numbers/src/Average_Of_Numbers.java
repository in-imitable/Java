import java.util.Scanner;

public class Average_Of_Numbers {

	public static void main(String[] args) {
		
		int j, k, l, m, n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		
		j = sc.nextInt();
		k = sc.nextInt();
		l = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		
		double average = j+k+l+m+n/5;
		
		System.out.println("Average of the numbers = " +average);
		

	}

}
