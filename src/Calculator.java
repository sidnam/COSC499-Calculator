import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first Number: ");
		int x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		int y = sc.nextInt();
		
		System.out.println("The addition of the two numbers is: " + addition(x,y));
		System.out.println("The subraction of the two numbers is: " + subraction(x,y));
		
		
		sc.close();
		
		
	}
	
	public static int addition(int a, int b) { 
		
		int addResult = a +  b;		
		return addResult;
	}

	public static int subraction(int a, int b) { 
		
		int subResult = a - b;		
		return subResult;
	}

}
