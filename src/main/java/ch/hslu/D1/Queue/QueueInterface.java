package ch.hslu.D1.Queue;

/**
 * 
 * @author fabio
 *
 * @param <Q> 
 */

public interface QueueInterface<Q> {

	
	    /**
	     * Add a new element at the last position.
	     * @param newElement the new element to add
	     */
	    void add(final Q newElement);

	    /**
	     * Return the first element of the queue and remove it from the queue.
	     * @return the first element
	     */
	    Q poll();

	    /**
	     * Return if the queue is currently empty or not.
	     * @return true if the queue is empty (no elements in it), otherwise false
	     */
	    boolean isEmpty();
	}
