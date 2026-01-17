package sorting;

import java.util.Arrays;

public class SelectionSort_ExamScores {
	public static void main(String[] args) {
		int[] marks = {98, 56, 33, 11, 86, 89, 90};
		System.out.println("Before sorting" + Arrays.toString(marks));
		marks = selection(marks);
		System.out.println("After sorting" + Arrays.toString(marks));
	}

	private static int[] selection(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			int min = i;
			for(int j=i+1; j<marks.length; j++) {
				if(marks[min] > marks[j]) min = j;
			}
			int temp = marks[i];
			marks[i] = marks[min];
			marks[min] = temp;
		}
		
		return marks;
	}
}
