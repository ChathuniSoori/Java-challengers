public class NestedLoop4{
	public static void main(String[] args){
		int rows=5;
		for(int i=1;i<=rows;i++){
			for(int j=0;j<=rows;j++){
				System.out.print(" ");
			}
			for(int k=rows;k>=i;k--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}