package LinkList;

public class Run {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		Item item1 = new Item(6);
		Item item2 = new Item(5);
		Item item3 = new Item(4);
		Item item4 = new Item(3);
		Item item5 = new Item(2);
		Item item6 = new Item(1);
		Item item7 = new Item(0);

		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);
		linkedList.insertFirst(item5);
		linkedList.insertFirst(item6);
		linkedList.insertFirst(item7);

		System.out.println("Number");
		linkedList.displayList();

		Item Current = linkedList.first;
		while (linkedList.first != linkedList.last) {
			for (int i = 1; i <= 4; i++) {
				Current = Current.next;

			}

			linkedList.deleteFirst(Current.Number);
			Current = Current.next;
			linkedList.displayList();
		}

	}

}
