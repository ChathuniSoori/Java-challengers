import java.util.Scanner;
public class Methods1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1= sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2= sc.nextInt();
		calcTotal(num1,num2);
	
	}
	public static void calcTotal(int num1,int num2){
		int result=num1+num2;
		System.out.println(result);
	}
}