package sorting;

import java.util.Arrays;

public class InsertionSort_EmployeeIds {
	
	public static int[] insertion(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] employeeIds = {105, 109, 102, 101, 104, 103, 107, 106, 108};
		System.out.println("Before sorting: " + Arrays.toString(employeeIds));
		employeeIds = insertion(employeeIds);
		System.out.println("After sorting: " + Arrays.toString(employeeIds));		
	}

}
