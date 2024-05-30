import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("N =" );
        int N = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
