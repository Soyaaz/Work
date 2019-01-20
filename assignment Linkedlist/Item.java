package LinkList;

public class Item {
	public int 	Number; 			// data item: Number or ID
	public Item next; 			// next DataItem in list
	public Item previous;
	
	// Constructor
	public Item(int Number)
	{
		this.Number = Number; // initialize data
		
		
		// 'next' is automatically
		// set to null
	} 
	
	// Override: toString method
	public String toString() {
		return ("{"+ this.Number +"}" );
	}
}