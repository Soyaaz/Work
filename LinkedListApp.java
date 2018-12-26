import java.util.Scanner;

public class LinkedListApp {

    public LinkedListApp() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Put Variable Enter n: " );
        int n = input.nextInt();
        System.out.println("Put Variable Enter m: " );
        int m = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertFirst(new DataItem("Number :" +i));


        }
        while (list.getCount()>3) {
            list.deleteFirst(m);
            list.setID();
            list.displayList();
        }
        list.deleteFirst(1);
		list.setID();
		list.displayList();
		
		list.deleteFirst();
		list.setID();
		list.displayList();
		
    }

}