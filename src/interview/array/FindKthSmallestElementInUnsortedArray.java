package interview.array;

import java.util.Arrays;

public class FindKthSmallestElementInUnsortedArray {

	public static void main(String[] args) {
		int unSortedArray[] = { 0, 10, 31, 19, 8 };
		findNumber(unSortedArray, 2);
	}

	private static void findNumber(int arr[], int k) {
		sortElement(arr); 
		Arrays.sort(arr); // or use sort method to sort elements.
		
		// Kth smallest will be k-1. Suppose K = 4 then in sorted array element on index
		// position 3 will be Kth element. i.e k-1 (because indexing starts from 0)
		System.out.println(arr[k - 1]);
	}

	private static int[] sortElement(int[] arr) { // insertion sort
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > element) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = element;
		}
		return arr;
	}
}
