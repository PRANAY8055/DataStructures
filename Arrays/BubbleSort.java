public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[]{3,5,1,2,4};
		
//		int count = 0;
		
//		while(count < arr.length - 1) {
//			int i = 0, j = i + 1;
//			while(j < arr.length - count) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//				i++;
//				j++;
//			}
//			count++;
//		}
		
		boolean swapped;
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		while(count < arr.length - 1) {
//			
//			for (int i = 0; i < arr.length - count - 1; i++) {
//			    int j = i + 1;
//			    if (arr[i] > arr[j]) {
//			        int temp = arr[i];
//			        arr[i] = arr[j];
//			        arr[j] = temp;
//			    }
//			}
//		}
		
	}
	
}
