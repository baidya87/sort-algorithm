package com.baidya.sort;

/**
 * Insertion sort. Complexity O(n2)
 * @author baidya
 *
 */
public class InsertionSort {
	
	private static int[] elements= {65, 25, 12, 22, 11};

	public static void main(String[] args) {
		InsertionSort insertionSort=new InsertionSort();
		System.out.println("Befor sort: ");
		insertionSort.printElements(elements);
		insertionSort.sortElements(elements);
		System.out.println("\nAfter sorting: ");
		insertionSort.printElements(elements);
	}
	
	public void sortElements(int[] elements) {
		for(int i=0; i<elements.length; i++) {
			for(int j=i; j>0; j--){
				if(elements[j]<elements[j-1]) {
					int temp=elements[j];
					elements[j]=elements[j-1];
					elements[j-1]=temp;
				}
			}
		}
	}
	
	private void printElements(int[] elements) {
		for (int element : elements) {
			System.out.print(element+" ");
		}
	}
}
