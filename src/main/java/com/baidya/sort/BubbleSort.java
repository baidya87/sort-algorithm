package com.baidya.sort;

/**
 * Bubble sort algorithm, O(n2) complexity.
 * @author baidya
 *
 */
public class BubbleSort {
	
	private static int[] elements= {65, 25, 12, 22, 11};
	
	public static void main(String[] args) {
		BubbleSort bubbleSort=new BubbleSort();
		System.out.println("Befor sort: ");
		bubbleSort.printElements(elements);
		bubbleSort.sortElement(elements);
		System.out.println("\nAfter sorting: ");
		bubbleSort.printElements(elements);
	}
	
	public void sortElement(int[] elements) {
		for(int i=0; i<elements.length; i++) {
			for(int j=0; j<elements.length-1; j++) {
				if(elements[j]>elements[j+1]) {
					int temp=elements[j];
					elements[j]=elements[j+1];
					elements[j+1]=temp;
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
