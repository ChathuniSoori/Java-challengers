import java.util.Scanner;
public class Square{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = s.nextInt();
		double y= Math.sqrt(x);
		System.out.println("Square root number is: "+ y);
	}
}