package ch.hslu.D1.List;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 
 * @author fabio
 *
 */

public class SimpleLinkedList<E> implements Iterable<E>{

	private Node<E> headNode;
	private int size;
	
	public SimpleLinkedList() {
		headNode = null;
		size = 0;
	}
	//2.3 b)
	public int getSize() {
        return this.size;
    }
	//add a new Object to the list
	public void add(E obj) {
		Node<E> newElement = new Node<E>(obj);
		Node<E> pointerNode = headNode;
		
		//If headNode = null ,first obj becomes head
		if(headNode ==null) {
			headNode = pointerNode;
		}else {
		//If there's a next Node, get the new "next" Node
			while(pointerNode.getNextNode() != null) {
				pointerNode.setNextNode(newElement);
			}
			//After there are no new Elements call Method "setNextNode".
			pointerNode.setNextNode(newElement);
			}
		//At the end increment the Listsize counter.
		this.size++;
		
	}
	
	//checks if the element exists
	public boolean exists(Object element) {
        Node<E> currentNode = headNode;
       
        if (headNode.getData().equals(element)) {
            return true;
        }
        //Iterates through all elements as long as the next element isn't empty
        while (currentNode.getNextNode() != null) {
            if (currentNode.getNextNode().getData().equals(element)) {
               return true;
            } else {
                
                currentNode = currentNode.getNextNode();
            }
        }
        // element doesn't exist:
        return false;
    }
	
	//removes the first value of the list and retunrs it.
	public Object removeFirst() {
		return remove(0);
	}
	
	 //returns the value of a selected element and removes it
	 public Object remove(int index) {
	        Node<E> selectedNode = headNode;
	        Node<E> nodetoDelete = null;

	        if (index == 0) {
	            //headNode gets "overwritten"
	            headNode = headNode.getNextNode();
	        } else if (index > size) {
	            //Problem if the Index is bigger than the actual size. Element is not available.
	        	System.out.println("Index is bigger than the actual list.");
	        	throw new NoSuchElementException();
	           	            
	        } else {
	            //iterates until one element before the selected one
	            for (int i = 1; i < index; i++) {
	                selectedNode = selectedNode.getNextNode();
	            }
	            nodetoDelete = selectedNode.getNextNode();
	            
	            if (selectedNode.getNextNode() != null)
	            {
	            	//
	            selectedNode.setNextNode(selectedNode.getNextNode().getNextNode());
	            }
	            else
	            {
	                selectedNode.setNextNode(null);
	            }
	        }
	        //reduce the size of the List
	        this.size--;
	        //
	        return "Following Node has been deleted:" + nodetoDelete;
	    }
	 
	 public Object get(int index){
			Node<E> pointerNode = headNode;
			for (int i =0; i<index; i++) {
				pointerNode = pointerNode.getNextNode();
			}
			return pointerNode.getData();
		}
		
	
	@Override
	//expandable....
	public String toString() {
		return "SimpleLinkedList [size=" + size + "]";
	}

	@Override
	public Iterator<E> iterator() {
		return new SimpleLinkedListIterator<>();
	}


}
