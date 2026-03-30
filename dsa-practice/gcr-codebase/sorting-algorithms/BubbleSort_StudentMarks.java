package sorting;

import java.util.Arrays;

public class BubbleSort_StudentMarks {
	
	public static int[] bubble(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] marks = {98, 56, 33, 11, 86, 89, 90};
		System.out.println("Before sorting" + Arrays.toString(marks));
		marks = bubble(marks);
		System.out.println("After sorting" + Arrays.toString(marks));
		
	}

}
