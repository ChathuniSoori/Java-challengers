public class BinarySearch{
	public static void main(String[] args){
		int[] array={12,23,34,45,56,67,78,89,90};
		int searchValue=45;
		int low=0 , high =array.length-1,mid=(low+high)/2;

		while(low<=high && array[mid]!= searchValue){
			if(array[mid]<searchValue){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
			mid =(low+high)/2;
		}
		if(low>high){
			System.out.println("Value is not found");
		}
		else{
			System.out.println("Value found in index: "+mid);
		}
	}
}