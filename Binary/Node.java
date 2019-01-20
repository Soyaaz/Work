public class Node {
	int iDStd;
	String name,subject,grade;
	Node leftChild;
	Node rightChild;
	
	public void displayNode()
	{
     System.out.println("ID Student :"+this.iDStd+"\n Name : "+this.name
    		 +"\n Subject : "+this.subject+"\n Grade : "+this.grade);
	}


}