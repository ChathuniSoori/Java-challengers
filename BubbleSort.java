public class BubbleSort{
	public static void main(String[] args){
		int[] array={12,45,67,89,43,69,56,90,12,23,40,99};
		int bottom=array.length-2;
		int temp;
		boolean exchanged=true;


		while(exchanged){
			exchanged=false;
			for(int i=0;i<=bottom;i++){
				if(array[i]>array[i+1]){
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					exchanged=true;
				}
			}
			bottom--;
		}
		for(int num: array){
			System.out.print(num +"\t");
		}
	}
}