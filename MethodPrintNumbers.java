public class MethodPrintNumbers {
    public static void main(String[] args) {
        add();	
    }

    public static void add() {
        int N = 100;
        int sum = N * (N + 1) / 2;
        System.out.println("Sum of 1 to 100 is: " + sum);
    }
}
