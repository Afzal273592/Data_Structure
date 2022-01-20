package datastructure_and_algorithm;


class Satck{
	
	public int max = 20;
	public int top = -1;
	int [] data = new int[max];
	
	public void pushFirst(int d) {
	
	data[top+1] = d;
//	top = top +1;	
	top++;
	}
	
	public int pop() {
		
		
		if(isEmpty()) {
			return 0;
		}else {
			int temp = data[top];
//			top = top -1;
			top--;
			return temp;
			
		}

		
	}
	
	
	public int peek() {
		
		if(isEmpty()) {
			return 0;
		}else {

			return data[top];
		}
		
		

		
		
	}
	
	public void printData() {
		
		for (int i = 0; i <= top; i++) {
			System.out.println(data[i]);
			
		}
//		System.out.println(data[top]);
	}
	
	
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}



public class Stack_Class {

	public static void main(String[] args) {

		
		Satck st = new Satck();
		
		
		st.pushFirst(100);
		st.pushFirst(200);
		st.pushFirst(300);
		st.pushFirst(400);
		
		st.printData();
		
		st.pop();
		System.out.println("----Pop------");
		st.printData();
		
		st.peek();
		System.out.println("----peek------");
		System.out.println(st.peek());
	
		
		
	}

}
