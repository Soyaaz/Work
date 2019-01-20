
public class TreeStudent {
	private Node root;
	 
	TreeStudent(){
	}
	
	public void insert(int idStd, String name, String subject,String grade)
	{
	Node newNode = new Node(); 
	newNode.iDStd = idStd;
	newNode.name = name;
	newNode.subject = subject;
	newNode.grade = grade;
		if(getRoot() == null)
		setRoot(newNode);
		else
		{
			Node current = getRoot();
			Node parent;
			while(true)
			{
				parent = current;
				if(idStd<current.iDStd)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	
	public Node find(int key)
	{
	Node current = getRoot();
	  while(current.iDStd != key)
	  {
	   if(key< current.iDStd)
	             current = current.leftChild;
	    else
	         current = current.rightChild;
	   if(current == null)
		return null;
	}
	return current;
	}

   
	public boolean delete(int key)								//delete node with given key
	{															//(assumes non-empty list)
		Node current = getRoot();								//fix Getter root = current node  // getroot information to current
		Node parent = getRoot();
		boolean isLeftChild = true;

		while(current.iDStd != key)								// loop search for node
		{
			parent = current;
			if(key< current.iDStd)								// go left?
			{
				isLeftChild = true;
				current = current.leftChild;
			}
			else												// or go right?
			{
				isLeftChild = false;
				current = current.rightChild;
			}
			
		}
		
		if(current == null)									    // end of the line
			return false;									   // didn't find it
		//delete() continued...
		// if no children, simply delete it    // mai mee node luk delete  now
		if(current.leftChild==null && current.rightChild == null)
		{
			if(current == getRoot())						   // if root
				setRoot(null) ;								  // tree is empty
			else if (isLeftChild)
				parent.leftChild = null;					 // disconneect
			else 											// from parent
				parent.rightChild = null;
		}
		// continues..
		// if no right child, replace with left subtree    // error replace subtree left  
		else if (current.rightChild==null) {
			if(current==getRoot())
				setRoot(current.leftChild);
			else if (isLeftChild)						   // left child of parent
				parent.leftChild = current.leftChild;
			else                                           // right child of parent
				parent.rightChild = current.leftChild;
		}
		 // if no left child, replace with right subtree     // mai mee luk left replace right subtree
		else if (current.leftChild==null) {
				if(current==getRoot())
					setRoot(current.rightChild);
				else if(isLeftChild)						// left child of parent
					parent.leftChild = current.rightChild;
				else									    // right child of parent
					parent.rightChild = current.rightChild;
			}
		//delete node 2 body
		else   // two children, so replace with inorder successor      
	{
			//get successor of node to delete(current)   
			Node successor = getSuccessor(current);
			//connect parent of current to successor instead
			if(current == getRoot()) {
				setRoot(successor);
			//connect successor to current's left child
			    successor.leftChild = current.leftChild;       
			}
			else if(isLeftChild)
			parent.leftChild = successor;
			else {
				parent.rightChild = successor;
			//connect successor to current's left child
			    successor.leftChild = current.leftChild;
			}	//end else two children
		}
		return true;
		
	}//end delete
	//continued...
	//returns node with next-hignest value after delNode     
	//goes to right child, then right child's left descendants  
	private Node getSuccessor(Node delNode)
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;						//go to right child
		while(current != null)									//until no more
		{														//left children
			successorParent = successor;
			successor = current;
			current = current.leftChild;						//go to left child
		}
                                                                // if successor not
		if(successor!= delNode.rightChild)						// right child
		{									                    //make connections
			successorParent.leftChild = successor.rightChild;   
			successor.rightChild = delNode.rightChild;			
		}
		
		return successor;
		
	}
	
	public void Display(Node  localRoot)
	{
		if(localRoot != null)
		{
			Display(localRoot.leftChild);
	        localRoot.displayNode(); 
			Display(localRoot.rightChild);
		}
	}
	
	public boolean UpdateName(int key,String name) {

		Node current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.name = name;
		return true;
		
		
	}
	
	public boolean UpdateSubject(int key,String subject) {

		Node current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.subject = subject;
		return true;
		
		
	}
	
	public boolean UpdateGrade(int key,String grade) {

		Node current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.grade = grade;
		return true;
		
		
	}
	
	public boolean UpdateId(int key,int id) {

		Node current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.iDStd = id;
		return true;
		
		
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
   
	
	
		
	

	

}