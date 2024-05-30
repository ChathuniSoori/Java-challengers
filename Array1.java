import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[6];

		int sum=0;

		System.out.print("Enter the marks: ");
		for (int i = 0; i < marks.length; i++) {
           		 marks[i] = sc.nextInt();
        	}

		
		
		for(int x:marks){
			System.out.println(x);
			sum +=x;
		}

		double avg=(double)sum/marks.length;

		int failedCount = 0;
        	for (int x : marks) {
            		if (x < 40) {
                		failedCount++;
            		}
        	}
		System.out.println(sum);
		System.out.println("Average mark: " + avg);
		System.out.println("Number of students who failed: " + failedCount);

		if (avg<40){
			System.out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}
	}
}