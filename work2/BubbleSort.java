package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class BubbleSort {
	private int [] element;
	private int eSize;
	
	public BubbleSort(int size) {
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
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in] > this.element[in + 1]) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
	
		int max = 1000;
		BubbleSort bubble = new BubbleSort(max);
		

		for (int i=0;i<max;i++) {
			int A = (int)(Math.random()*max);
			bubble.insert(A);
			
		}
		long t0,t1;
		Calendar cal0 = Calendar.getInstance();
		t0 = cal0.getTime().getTime();
		bubble.sort();
		Calendar cal1 = Calendar.getInstance();
		t1 = cal1.getTimeInMillis();
		
		System.out.print("Bubble Sort Variable:" + max + "\ntimet1\t"+(t1)+"\ntimet2\t"+(t0) +"\ntime is :"+(t1-t0)+" ms");

		
	}
}
