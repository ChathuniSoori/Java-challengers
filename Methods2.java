import java.util.Scanner;
public class Methods2{
	public static void main(String[] args){
		System.out.println( """
		**********
		   MENU
		**********
		1.- Addition
		2.- Subtraction
		0.- Quit Please select an option:
		""");
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the option(1,2,or 0):");
		int select=sc.nextInt();

		
		System.out.println("Enter the first number:");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2=sc.nextDouble();

		if (select == 1) {
            		add(num1, num2);
        	} else if (select == 2) {
            		sub(num1, num2);
        	} else if (select == 0) {
            		System.out.println("Quitting...");
            		return;
        	} else {
            		System.out.println("Invalid option selected.");
        	}
	}

	public static void add(double num1, double num2){
			double sum=num1+num2;
			System.out.println("sum is: "+ sum);
			
	}
	
	
	public static void sub(double num1, double num2){
			double sub=num1-num2;
			System.out.println("substraction is: "+ sub);
		
	}
}