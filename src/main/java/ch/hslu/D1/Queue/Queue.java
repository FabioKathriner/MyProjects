package ch.hslu.D1.Queue;

import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.NoSuchElementException;
	
	/**
	 * @author fabio
	 * @param <E> Type of the Elements
	 */
	public class Queue<E> implements QueueInterface<E> {
	    private int size =10 ;
	    private Object[] queuearray;
	    private int head = -1;
	    private int tail = -1;
	    private int anzahlElemente = 0;

	    /**
	     * New queue with a size of 10.
	     */
	    public Queue() {
	        queuearray = new Object[size];
	    }

	    /**
	     * Instantiate a new queue with a given size
	     * @param size 
	     */
	    public Queue(int size) {
	        queuearray = new Object[size];
	    }

	    @Override
	    public void add(final E element) {
	        if (head + 1 > queuearray.length - 1) {
	            // rotiert ans andere Ende des Array
	            if (tail == 0) {
	                // Wenn der Tail 0 ist, darf nicht rotiert werden ansonsten wird der head überhohlt.
	                throw new BufferOverflowException();
	            }
	            head = -1;
	        }
	        else {
	            if (head + 1 == tail) {
	                throw new BufferOverflowException();
	            }
	        }
	        //head wird zuerst incrementiert und dann hinzugefügt.
	        queuearray[++head] = element;
	        anzahlElemente++;
	        if (tail == -1) {
	            tail = 0;
	        }
	    }

	    @Override
	    public E poll() {
	    	//if there's no element to be pulled, throw Exception
	        if (isEmpty()) {
	            throw new NoSuchElementException();
	        }
	        // 
	        if (tail == queuearray.length) {
	            tail = 0;
	        }
	        boolean isLastElement = false;
	        if (tail == head) {
	            isLastElement = true;
	        }
	        @SuppressWarnings("unchecked")
	        //
			E returnElement = (E) queuearray[tail++];
	        queuearray[tail - 1] = null;
	        anzahlElemente--;
	        if (isLastElement) {
	            tail = -1;
	            head = -1;
	        }
	        return returnElement;
	    }

	    @Override
	    public boolean isEmpty() {
	        return anzahlElemente < 1 ? true : false;
	    }
	    
	    @Override
	    public String toString() {
			return "Inhalt of Array: "+ Arrays.toString(this.queuearray);
	    	
	    }
}
