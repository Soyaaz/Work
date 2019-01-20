package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class SelectionSort {
	private int [] element;
	private int eSize;
	
	public SelectionSort(int size) {
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];
		
		eSize = 0;
	}
	
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in, min;
		
		for(out = 0; out < eSize-1; out++) {
			min = out;
			for(in = out+1; in < eSize; in++) {
				if(this.element[in] < this.element[min]) {
					min = in;
				}
			}
			this.swap(out, min);
		}
	}
	
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		// 
		int max = 1000;
		SelectionSort selection = new SelectionSort(max);
		
		for (int i=0;i<max;i++) {
			int A = (int)(Math.random()*max);
			selection.insert(A);
		}
		
		long t0,t1;
		Calendar cal0 = Calendar.getInstance();
		t0 = cal0.getTime().getTime();
		selection.sort();
		Calendar cal1 = Calendar.getInstance();
		t1 = cal1.getTimeInMillis();
		
		System.out.print("selectionSort Variable:" + max + "\ntimet1\t"+(  t1)+"\ntimet2\t"+(   t0) +"\ntime is :"+(t1-t0)+" ms");

	
	}
}
