

public class LinkedList {
    private DataItem first;
    private int ID  = 6;   //เลข6ตัวแปร
    
    
    public LinkedList() {
        first = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(DataItem newDataItem) {
        newDataItem.next = first;            
        first = newDataItem;
        first.Number = this.ID;
        ID--;
    }
    
    
    public DataItem deleteFirst() {
        DataItem temp = first;
        first = first.next;
        return temp;
    }
    
    public DataItem deleteFirst(int key) {
        DataItem temp = first.next;
        DataItem previous = first;        
        
        
        while (temp.Number == key) {
            
            if (temp.next == null) {                
                return null;}
            else {
                previous = temp;
                temp = temp.next;
                }
            }
        
        if(temp == first)
            first = first.next;
        else 
            previous.next = temp.next;
        
    
        
        return temp;
    
    }
    
    
    public int getID() {
        return this.ID;
    }
    
    public void setID() {
        DataItem current = first;
        ID = 0;        							//เรื่มจาก 0
        while( current != null ) {
            current.Number = ID;
            ID++;
            current = current.next;            
        }
        
            
        
    }
    
    public void displayList() {
        System.out.println("Delete Number:");
        DataItem current = first;
        while( current != null ) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
    
    public int getCount() { 
        DataItem current = first;
        int count = 0;
        while( current != null ) {
            count++;
            current = current.next;            
        }
        return count;
    } 
    
    

}