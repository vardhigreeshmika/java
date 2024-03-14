package greeshu;

import java.util.Scanner;

public class greeshmika {
    public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n%2 == 0){
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
        scanner.close();
		
    
    }
}
