import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        int factorial = 1; 

        for (int i = num; i >= 1; i--) { 
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
