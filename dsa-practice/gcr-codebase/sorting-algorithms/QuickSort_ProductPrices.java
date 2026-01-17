package sorting;
import java.util.*;

public class QuickSort_ProductPrices {
	public static void main(String[] args) {
		int[] prices = {10,5,9,2,3,5,8};
		System.out.println("Before sorting: " + Arrays.toString(prices));
		quickSort(prices, 0, prices.length-1);
		System.out.println("After sorting: " + Arrays.toString(prices));
	}
	
	private static void quickSort(int[] prices, int low, int high) {
		if(low <= high) {
			int pivotIdx = partition(prices, low, high);
			
			quickSort(prices, low, pivotIdx-1);
			quickSort(prices, pivotIdx+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}		
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
}
