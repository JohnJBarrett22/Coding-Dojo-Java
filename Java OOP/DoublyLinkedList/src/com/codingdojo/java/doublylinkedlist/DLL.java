package com.codingdojo.java.doublylinkedlist;

public class DLL {
    public Node head;
    public Node tail;
    
    //Constructor
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    //Methods
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
  
    public void printValuesForward() {
        Node runner = this.head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    
    public void printValuesBackward() {
    	Node runner = this.tail;
    	while(runner != null) {
    		System.out.println(runner.value);
    		runner = runner.previous;
    	}
    }
    
    public Node pop() {
    	if(this.tail == null) {
    		System.out.println("No nodes!");
    	}
    	Node lastNode = this.tail;
    	this.tail = lastNode.previous;
    	return lastNode;    	
    }
    
	public boolean contains(Integer value) {
    	if(this.head == null ) {
    		System.out.println("No Nodes!");
    	Node runner = this.head;
    	while(runner != null);
    		if(runner.value == value) {
    			System.out.println("Value found!");
    			return true;
    		}
    		runner = runner.next;
    	}
		System.out.println("Value not found!");
		return false;
	}
		
	public int size() {
		if(this.head == null);
			System.out.println("No Nodes!");
		Node runner = this.head;
		int count = 0;
		while(runner != null) {
			count ++;
			runner = runner.next;
		}
		System.out.println("A total of " + count + " nodes found!");
		return count;
	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
  
    
    
    
    
    
    
    
    
}