import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
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
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == number) {
                return mid;
            }

            if (arr[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
