package LinkList;

public class LinkedList {
	public Item first, last; //กำหนดตัวแปรfirst last

	public LinkedList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(Item newDataItem) {  //สร้างตัวแปรinsertfirst
		Item Newlink = newDataItem;  // newdataitem เท่ากัย newlink
		Newlink.next = this.first;   // กำหนด first ไปใส่ใน null first รอบแรกเป็นnull
		if (Newlink.next == null) {  //ถ้า newlink.next = null
			this.last = Newlink;     //newlink = null นำไปใส่ last last = null
		} else						 //อีกกรณี
			first.previous = Newlink; // newlink นำค่าไปใส่ first.previous

		this.first = Newlink;        // newlink = first
		last.next = this.first;      // first = last.next
	}

	public void deleteFirst(int key) { 
		Item Current = this.first;  // first = null = current
		Item Previous = this.first; // first = null = previous
		while (Current.Number != key) { //current.number ไม่เท่ากับ key
			if (Current.next == null)   
				System.out.println("null");
			else {
				Previous = Current;
				Current = Current.next;
			}
		}
		if (Current == this.first) {
			System.out.println("Just Delete number:" + Current.Number);
			this.first = Current.next;
			last.next = first;
			first.previous = null;
		} else if (Current == this.last) {
			System.out.println("Just Delete number:" + Current.Number);
			this.last = last.previous;
			this.last.next = this.first;

		}

		else {
			System.out.println("Just Delete number:" + Current.Number);
			Current.previous.next = Current.next;
			Current.next.previous = Current.previous;
		}
	}

	public void displayList() {
		System.out.println("Delete Number:");
		Item current = first;
		while (current != this.last) {
			System.out.println(current.toString());
			current = current.next;
		}
		System.out.println(current);
	}

}