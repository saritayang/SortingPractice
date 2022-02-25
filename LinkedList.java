
public class LinkedList<T> {
	
	// Reference to head node of the singular linked list
	private LLNode<T> head;
	// Default size 10 of the singular linked list
	private int N = 10;
	
	
	// Constructor to create an empty linked list
	public LinkedList() {
		head = null;
	}
	
	
	// Method to link new node 
	public void add(T value) {
		// check linked list is empty or not
		if(head == null) { 
			head = new LLNode<>(value);
			return;
		}
		
		// set current Node as head node
		LLNode<T> currNode = head;
		// Iterate through the linked list to end
		while(currNode.getLink() != null) {
			// Next node
			currNode = currNode.getLink();
			}
		// Attach the new node at the end of linked list
		currNode.setLink(new LLNode<> (value));
	}
	
	
	// Print Original Order
	public void PrintOriginal() {
		LLNode<T> currNode = head;
		// Iterate through the linked list to the end
		while(currNode != null) {
			System.out.print(currNode.getInfo());
			
			// next node
			currNode = currNode.getLink();
			if(currNode != null) {	
				System.out.print("-> ");
			}		
		}
	}
	
	// Print Reverse Order
	public void PrintReverse() {
		LLNode<T> temp = head;
		
		// Use StringBuilder class to build the new string
		StringBuilder sb = new StringBuilder();
		// Iterate through the linked list to the end
		while(temp != null) {
			
			// offset is the first index of the storage that was used
			sb.insert(0, temp.getInfo());
			
			//next node
			temp = temp.getLink();
			if(temp != null) {
				sb.insert(0, "-> ");
			}			
		}
		// convert stringBuilder to String
		System.out.println(sb.toString());
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> letter = new LinkedList();
		letter.add("Bob");
		letter.add("Cathy");
		letter.add("Dave");
		letter.add("Sarita");
		letter.add("Alice");
		letter.add("Cindy");
		
		System.out.println("Original order: ");
		letter.PrintOriginal();
		
		System.out.println("\n");
		
		System.out.println("Reverse order: ");
		letter.PrintReverse();
		
		
	}

}
