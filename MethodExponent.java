import java.util.Scanner;
public class MethodExponent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();

		System.out.println("Enter the exponent: ");
		int expo=sc.nextInt();

		int result=exponent(num,expo);
		System.out.println(result);
	}

	public static int exponent(int num,int expo){
		return (int) Math.pow(num,expo);
	}
}