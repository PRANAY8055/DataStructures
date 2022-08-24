
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Intialization
		
		/* Arrays can't be initialized with out knowing the size of the array
		 * and the value of the arrays. For that we need to use 
		 * Arraylist or List collection */
		
		// 1-D Array 
		
		int[] arr1 = new int[5];
		int[] arr2 = {1,2,3};
		
		// 2-D Array
		
		int [][] arr3 = new int[3][]; // No error
		//int [][] arr4 = new int[][2]; //Error
		int [][] arr5 = {{1,2,4,5,6,7,8},{9,10,11,12}};
		
//		System.out.println(arr1); // Get the address of array
//		System.out.println(arr2); // Get the address of array
		
		// Traversing the 1-d array
		
//		for(int i=0;i<arr2.length;i++) {
//			System.out.println(i);
//		}
		
		// Traversing the 2-d array
		
		for (int i=0;i<arr5.length;i++) {
			for (int j=0;j<arr5[i].length;j++) {
				System.out.print(arr5[i][j] +" ");
				/* System.out.print(arr5[i][j] +" "); If we write this code, 
				 * char ASCII value addition would be done 
				 */
			}
			System.out.println();
		}
		
		System.out.println(' ');
		System.out.println((int)' '); // Prints char ASCII value
		
		
	}

}
