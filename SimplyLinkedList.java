package datastructure_and_algorithm;




	

	
class Node{
	
	public int data;
	public Node next;
	
	public  void printData() {
		System.out.println(data + "- ");
	}
}
	
	
class SingleLinkedList{	
	
	public Node head;
	
	public boolean isEmpty(){	
		return (head==null);
			
	}
	
	public void inserFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	
	}
	
	public Node deleteFirst() {
		
		return head = head.next;
//		return head;
	}
	
	public void printallElement() 
	{
//		Node curr = head;
//		while(curr != null) {
//			
//			curr.printData();
//			curr = curr.next;
//			
//		}
//		

		
		
	}
	
	
	
	
	
}
	
public class SimplyLinkedList {	

	public static void main(String[] args) {

		SingleLinkedList obj = new SingleLinkedList();
		
		obj.inserFirst(99);
		obj.inserFirst(44);
		obj.inserFirst(45);
		obj.inserFirst(32);
		
		obj.printallElement();
		
		obj.deleteFirst();
		
		System.out.println("-----");
		obj.printallElement();
	
	}

}
