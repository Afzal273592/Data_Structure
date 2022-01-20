package datastructure_and_algorithm;


// create Node Classs
// Create SimplyLink calass where we will add all method 
// 1. 	isEmpty
// 2.	InsertFirst
// 3.	DeleteFirst
// 4.	InsertLast
// 5. 	DeletrLast
//


class Nodee {
	
	public int data;
	public Nodee next;
	
	public void printData() {
		System.out.println(data + " ");
	}

}





class SinglyLinkedList{
	
	public Nodee head;
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	
	public void insertFirst(int data) {
		
		Nodee n = new Nodee();
		n.data = data;
		n.next = head;
		head = n;
		
	}

	
	
	public void printData() {
		
		Nodee temp = head;
		while(temp!=null) {
			
			temp.printData();
			temp = temp.next;
			
			
		}
		
	}
	
	

	
	public void deleteFirst() {
		 head = head.next;
	}
	
	public void insertLast(int data) {
		
		Nodee newNode = new Nodee();
		newNode.next = null;
		newNode.data = data;
		
		Nodee curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = newNode;
	}
	
	
	
	public void deleteLast() {
		
		Nodee temp = head;
		Nodee temp2 = temp.next;
		
		while (temp.next != null) {
			if(temp2.next == null) {
				temp.next = null;	
				break;
			}
			temp =  temp.next;
			temp2 = temp2.next;
			

		}


	}
}






public class SimplyLinkedListClass {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.insertFirst(400);
		sl.insertFirst(500);
		sl.insertFirst(100);
		sl.insertFirst(600);
		sl.insertFirst(900);
		
		sl.isEmpty();
		sl.printData();
		System.out.println("--------curren.next-----");
//		sl.printData2();
	
		sl.deleteFirst();
		System.out.println("--------curren.next-----");
//		sl.printData();
//		sl.printData2();
		

		
		sl.insertLast(1000);
		System.out.println("----insertLast---------");
		sl.printData();
		
		
		
		sl.deleteLast();
		System.out.println("-------deleteLast------");
		sl.printData();
		
	}

}
