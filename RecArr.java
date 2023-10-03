class RecArr {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
		int i = 0;

		printArray(arr, i);
	}

	public static void printArray(int[] arr, int index) {
		if(index < arr.length) {
		System.out.println(arr[index]);
		printArray(arr, (index+1));	

		}
	}



	// for (int i = 0; i < arr.length; i++) {
	// 	System.out.println(arr[i]);
	// 	}
}
