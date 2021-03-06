package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class InsertionSort {
	private int [] element;
	private int eSize;
	
	public InsertionSort(int size) {    // 7-15 construcktor
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];
		
		eSize = 0;    
	}
	
	public void insert(int e) {   //เติมข้อมูลเข้า array
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {   //เริ่มต้น i=0
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() { 
		int out, in, temp;
		
		for(out = 1; out < eSize; out++) {
			temp = this.element[out];
			for(in = out; in > 0 && this.element[in-1] >= temp; in--) {
				this.element[in] = this.element[in - 1];
			}
			this.element[in] = temp;
		}
	}
	

	
	public static void main(String[] args) {
		// 
		int max = 1000;
		InsertionSort insertionSort = new InsertionSort(max);
		

		for (int i=0;i<max;i++) {
			int A = (int)(Math.random()*max);
			insertionSort.insert(A);
		}
		long t0,t1;
		Calendar cal0 = Calendar.getInstance();
		t0 = cal0.getTime().getTime();
		insertionSort.sort();
		Calendar cal1 = Calendar.getInstance();
		t1 = cal1.getTimeInMillis();
		
		System.out.print("InsertionSort Variable:" + max + "\ntimet1\t"+(  t1)+"\ntimet2\t"+(   t0) +"\ntime is :"+(t1-t0)+" ms");



	}
	}

