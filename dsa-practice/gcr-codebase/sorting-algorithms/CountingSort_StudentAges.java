package sorting;

import java.util.Arrays;

public class CountingSort_StudentAges {
	public static void main(String[] args) {
		int[] marks = {10, 15, 12, 16, 18, 13, 17};
		System.out.println("Before sorting" + Arrays.toString(marks));
		marks = CountingSort(marks);
		System.out.println("After sorting" + Arrays.toString(marks));
	}

	private static int[] CountingSort(int[] marks) {
	    if (marks.length == 0) return marks;

	    int max = marks[0];
	    for (int mark : marks) {
	        if (mark > max) max = mark;
	    }

	    int[] count = new int[max + 1];
	    for (int mark : marks) {
	        count[mark]++;
	    }

	    int index = 0;
	    for (int i = 0; i <= max; i++) {
	        while (count[i] > 0) {
	            marks[index++] = i;
	            count[i]--;
	        }
	    }

	    return marks;
	}

}
