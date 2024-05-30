public class ArraySwap1{
	public static void main(String[] args){
		String[] array={"Alex","Max","Challie","Bob","Ada","Jim"};		int secondIndex=4;
		int fourthIndex=2;

		String swap1=array[secondIndex];
		array[secondIndex]=array[fourthIndex];
		array[fourthIndex]=swap1;

		for (String name : array) {
            		System.out.print(name+",");
        	}
	}
}