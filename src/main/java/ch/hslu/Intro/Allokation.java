package ch.hslu.Intro;


/**
 * 
 * @author fabio
 *
 */


public final class Allokation implements Comparable<Allokation>{

	
	private final int address;
	private final int size;


	public Allokation(final int address, final int size) {
		this.address = address;
		this.size = size;
	}


	public int getAddress() {
		return address;
	}
	
	public int getSize() {
		return size;
	}
	

	@Override
	public int compareTo(final Allokation e) {
		return Integer.compare(this.address, e.address);
	}
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address;
		result = prime * result + size;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Allokation)) {
			return false;
		}
		Allokation other = (Allokation) obj;
		if (address != other.address) {
			return false;
		}
		if (size != other.size) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "Allokation [address=" + address + ", size=" + size + "]";
	}
}
