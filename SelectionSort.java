public class SelectionSort{
	public static void main(String[] args){
		int[] array ={12,22,10,67,89,56,02,45,37,89,99};
		int minIndex,swap;
		for(int start=0;start<=array.length-1;start++){
			minIndex=start;
			for(int i=start+1;i<array.length-1;i++){
				if(array[i]<array[minIndex]){
					minIndex=i;
				}
			}
			swap=array[start];
			array[start]=array[minIndex];
			array[minIndex]=swap;
			
		}
		for(int num: array){
			System.out.print(num+"\t");
		}
	}
}