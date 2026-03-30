package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort_Salary {
	public static void main(String[] args) {
		int[] employeeSalary = {105, 109, 102, 101, 104, 103, 107, 106, 108};
		System.out.println("Before sorting: " + Arrays.toString(employeeSalary));
		employeeSalary = HeapSort(employeeSalary);
		System.out.println("After sorting: " + Arrays.toString(employeeSalary));
	}

	private static int[] HeapSort(int[] employeeSalary) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int salary: employeeSalary) heap.add(salary);
		
		for(int i=0; i<employeeSalary.length; i++) {
			employeeSalary[i] = heap.poll();
		}
		
		return employeeSalary;
	}
}
