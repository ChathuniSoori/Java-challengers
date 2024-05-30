public class MethodPrintNumbers2{
	public static void main(String[] args){
		int result=sum(100);
		System.out.println(result);
	}

	public static int sum(int num){
		if(num>0){
			return num + sum(num-1);
		}
		else{
			return 0;
		}
	}
}