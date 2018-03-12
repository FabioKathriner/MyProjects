package ch.hslu.D1.Stack;

/**
 * @author fabio
 */

public interface StackInterface {

	/**
	 * Puts a new element on the stack and returns it. It will be added on top of the stack.
	 * 
	 * @param newObject the new element that's being put on the stack.
	 * @return newObject the element that was added.
	 */
	public String push(String newObject);

	/**
	 * Returns the top element of the stack. The element gets removed from the stack while returning the element.
	 *
	 * @return the element
	 */
	public String pop();

	/**
	 * Checks if the stack is empty.
	 * 
	 * @return true: if the stack is empty, false: if it isn't
	 */
	boolean isEmpty();

	/**
	 * Check if the stack is full.
	 * 
	 * @return true: if the stack is full, false if there's still space left
	 */
	boolean isFull();

}
