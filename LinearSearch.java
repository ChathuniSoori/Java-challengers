public class LinearSearch{
	public static void main(String[] args){

		int[] array={1,12,23,233,34,4,45,56,677};
		int searchValue = 233;
		int index =0;
		while(  index<array.length   &&    array[index] != searchValue){
			index++;
		}
		if(index== array.length){
			System.out.println("Value is not found");
		}
		else{
			System.out.println("Value found in index: "+index);
		}
	}
}