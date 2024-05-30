public class NestedLoop2{
	public static void main(String[] args){
		for(int i=2;i<=8;i+=2){
			for(int j=2;j<=i;j+=2){
				System.out.print(i);
				System.out.print(i);
			}
			System.out.println();
		}
	}
}