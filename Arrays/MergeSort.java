
public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = new int[]{3,5,1,2,4};
		
		sort(arr,0,arr.length - 1);

	}
	
	public static void sort(int[] arr,int left, int right) {
		
		if(left < right) {
			
			int mid = (left + (right - left))/2;
			
			sort(arr,left,mid);
			sort(arr,mid + 1,right);
			
			
			
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
	}

}
