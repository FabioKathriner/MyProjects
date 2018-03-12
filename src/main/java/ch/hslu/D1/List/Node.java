package ch.hslu.D1.List;

/**
 * Die Klasse Node stellt Listenelemente einer einfachen Linked List dar.
 * @author fabio
 *
 * @param <E> ein Element der Liste
 */
public class Node<E> {
	private E data;
	private Node<E> nextNode;
	
	public Node(E data) {
		this.data = data;
	}
	
	public E getData() {
		return this.data;
	}
	
	public void setData(E data) {
		this.data = data;
	 }
	
	public Node<E> getNextNode() {
		return this.nextNode;
	}
	
	public void setNextNode(final Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
