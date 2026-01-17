package sorting;

import java.util.Arrays;

public class MergeSort_MarksOfBooks {

	public static void main(String[] args) {
		int[] marks = {105, 109, 102, 101, 104, 103, 107, 106, 108};
		System.out.println("Before sorting: " + Arrays.toString(marks));
		marks = mergeSort(marks);
		System.out.println("After sorting: " + Arrays.toString(marks));
	}

	private static int[] mergeSort(int[] marks) {
		if(marks.length == 1) return marks;
		
		int mid = marks.length/2;
		
		int[] leftArray = Arrays.copyOfRange(marks,  0, mid);
		int[] rightArray = Arrays.copyOfRange(marks,  mid, marks.length);
		
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);
		
		return merge(leftArray, rightArray);
	}

	private static int[] merge(int[] leftArray, int[] rightArray) {
		int merged[] = new int[leftArray.length + rightArray.length];
		
		int i = 0, j = 0, k = 0;
		while(i < leftArray.length && j < rightArray.length) {
			if(leftArray[i] < rightArray[j]) {
				merged[k++] = leftArray[i++];
			} else {
				merged[k++] = rightArray[j++];
			}
		}
		
		while(i < leftArray.length) {
			merged[k++] = leftArray[i++];
		}
		
		while(j < rightArray.length) {
			merged[k++] = rightArray[j++];
		}
		
		return merged;
	}

}
