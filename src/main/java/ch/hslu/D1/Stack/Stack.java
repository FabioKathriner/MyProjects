package ch.hslu.D1.Stack;

public class Stack implements StackInterface{
	
	
	//String array
    private String[] elements;
    private int size;
    private int counter;
    
    
    public Stack() {
        this(10);
    }
    
    public Stack(int size) {
        elements = new String[size];
        this.size = size;
        //counter current position in stack
        counter = 0;
    }
    
    

	@Override
	public String push(String newObject) {
		 try {
	            elements[counter] = newObject;
	            counter++;

	            return elements[counter - 1];

	        } catch (Exception stackisFull) {
	            throw stackisFull;
	        }
	    }

	@Override
	public String pop() {
		try {
            counter--;
            String newString = elements[counter];
            elements[counter]=null;
            return newString;
        } catch (Exception stackisEmpty) {
            throw stackisEmpty;
        }
    }

	@Override
	public boolean isEmpty() {
		return counter == 0;
    }

	@Override
	public boolean isFull() {
		 if (counter >= size) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	

}
