package th.ac.utcc.eng.cpe.nc252.sorting;

public class BubbleSort {
	private Subject [] element;  //
	private int eSize;
	
	public BubbleSort(int size) {
		if(size > 0)
			this.element = new Subject[size];
		else
			// default element.length == 10
			this.element = new Subject[10];
		
		eSize = 0;
	}
	
	public void insert(Subject e) {   //
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {	//
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in].getCourseUnit() > this.element[in + 1].getCourseUnit()) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int left, int right) {
		Subject temp = this.element[left];  //
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		// 
		int max = 20;
		BubbleSort bubble = new BubbleSort(max);
		
		Subject z1 = new Subject("CC111","Java 1", 3.0f,"A");
		Subject z2 = new Subject("CC112","Java 2", 1.0f,"D");
		Subject z3 = new Subject("CC113","Java 3", 2.0f,"B");
		Subject z4 = new Subject("CC114","Java 4", 2.0f,"B");
		
		bubble.insert(z1);
		bubble.insert(z2);
		bubble.insert(z3);
		bubble.insert(z4);

		// show original order
		System.out.print("Original Order: ");
		bubble.show();
		
		// sort and then show the result
		bubble.sort();
				
		System.out.print("Sorted Order: ");
		bubble.show();
	}
}
