package ch.hslu.D1.List;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * Work in Progress
 * Class SimpleLinkedList, implementing the List Interface
 * @author fabio
 * 
 */

public class SimpleLinkedListInterface_inProgress<E> implements List<E>{

	private Node<E> headNode = null;
		
	


	// Checks if the new value is the first one to add. If it isn't it adds it at the end of the List.
	@Override
	public boolean add(final E value) {
		if (headNode == null) {
			headNode = new Node<>(value);
		}else {
			//Checks if there is already a Node in place. As soon as there is no next entry the entered value will be set as the newnode.
			Node<E> newnode = headNode;
			while (newnode.getNextNode()!= null) {
				newnode = newnode.getNextNode();
			}
			
			newnode.setNextNode(new Node<>(value));
		}
		
		return true;
	}




	@Override
	public void add(int arg0, E arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
