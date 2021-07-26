package Arrays;

public class BinarySearch {
	//Binary Search is better than Linear search for sorting and searching large or ordered arrays
	/*How Binary Search works:
	 * 1) If key < middle element, search for the key in only the first half of the array
	 * 2) If key == middle element, search ends with a match (key is found)
	 * 3) If key > middle element search for key in only the second half of the array*/
	
	public static int binarySearch(int[] list, int key) {
		//NOTE: Time Complexity is O(N) as time increases with respect to the size of the data structure (the array)
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
			 
		} //end while loop
		return -low - 1; //high < low, key not found

	} //end binarySearch()
//...........................................................
	
	public static void main(String[] args) {
		System.out.println("BINARY SEARCH");
		
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		int i = BinarySearch.binarySearch(list, 11); //Create variable to call method from static reference
		System.out.println(i);
	} //end main()
	
} //end class binarySearch
