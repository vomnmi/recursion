import java.util.*;

public class BinSearchRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = {8, 9, 10, 11, 12, 13, 14};
        int start = 0;
        int end = arr.length - 1;

        System.out.print("Enter the number you wanna search -> ");
        int searchNumber = sc.nextInt();
        int result = binarySearch(arr, start, searchNumber, end);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int start, int number, int end) {
    	int mid;
        if(start <= end) {
        	mid = start + (end - start) / 2;

        if(arr[mid] == number) {
        	return mid;

        }else if(number > arr[mid]) {
        	return binarySearch(arr, mid + 1, number, end);

        	}else if(number < arr[mid]) {
        		return binarySearch(arr, start, number, mid - 1);
        	}
        	
    	}
        	return -1;
	}

}