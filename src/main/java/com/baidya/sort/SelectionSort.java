package com.baidya.sort;

/**
 * Selection sort. Complexity O(n2)
 * @author baidya
 *
 */
public class SelectionSort {
	
	private static int[] elements= {65, 25, 12, 22, 11};

	public static void main(String[] args) {
		SelectionSort selectionSort=new SelectionSort();
		System.out.println("Before sort->");
		selectionSort.printElements(elements);
		selectionSort.sortElements(elements);
		System.out.println("\nAfter sort->");
		selectionSort.printElements(elements);
	}
	
	private void printElements(int[] elements) {
		for (int element : elements) {
			System.out.print(element+" ");
		}
	}

	private void sortElements(int[] elements) {
		for(int i=0; i<elements.length; i++) {
			int min_index=i;
			for(int j=i; j<elements.length-1; j++) {
				if(elements[j]>elements[j+1]) {
					min_index=j+1;
				}
			}
			int temp=elements[i];
			elements[i]=elements[min_index];
			elements[min_index]=temp;
		}
	}
}
