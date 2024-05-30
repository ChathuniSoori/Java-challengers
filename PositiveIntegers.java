import java.util.Scanner;

public class PositiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        sc.nextLine(); // Consume newline character left in the buffer

        System.out.print("Enter a letter : ");
        String letter = sc.nextLine();

        
        System.out.print("output : " + letter.repeat(num));
        
    }
}
