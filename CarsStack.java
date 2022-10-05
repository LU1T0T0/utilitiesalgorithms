import java.lang.System;

public class CarsStack {
	
	//linked list creation
	private class Node{
		int curr; //indicates the current data 
		Node next; //pointer 
	}
	
	Node topStack; //global variable reference to the top
	
	/** constructor */
	CarsStack(){
		this.topStack = null;
	}
	
	/** Adding elements on top of the stack*/
	public void push(int element) {
		
		/*temporary node used for allocating the new element*/
		Node t = new Node(); 
		
		/*inserting the element*/
		t.curr = element; 
		t.next = topStack;
		topStack = t ;
		
		//printing the added element
		System.out.println(element + " is added");
		}//end of push();
	
	/** removing the last added element from the stack */
	public void pop() {
		
		//base case: Stack is empty.
		if (topStack == null) {
			System.exit(2); //exit and terminate the algorithm
		} else {
			//removing the element.
			System.out.println (topStack.curr + " is removed");
			topStack = topStack.next; 
		}
	}// end of pop();
	
	/**shows the status of the stack*/
	public void displayStack() {
		
		Node t = topStack; 
	
		/*base case: Stack is empty, thus, job finished */
		if (t == null) {
			System.out.println("End of the line");
		}else {
			while(t != null) {
				//prints the elements inside a stack
				System.out.println(t.curr);
				t = t.next;
			}
		}
	}//end of displayStack()
}//end of CarsStack
