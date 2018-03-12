package ch.hslu.D1.List;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedListIterator<E> implements Iterator<E>{
	private Node<E> nextNode = null;

	@Override
	public boolean hasNext() {
		if (nextNode != null) {
			return true;
		}
		return false;
	}

	@Override
    public E next() {
        if (hasNext()) {
            Node<E> newNode = nextNode;
            nextNode = nextNode.getNextNode();
            return newNode.getData();
        }
        else {
            throw new NoSuchElementException();
        }
    }

	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}

}
