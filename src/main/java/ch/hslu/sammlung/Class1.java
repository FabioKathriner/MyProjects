package ch.hslu.sammlung;

public class Class1 {

	public static boolean isOdd(final int n) {
		if (n==0) {
			return false;
		}else {
			return isEven(n-1);
		}
	}
	
	public static boolean isEven(final int n) {
		if (n==0) {
			return true;
		}else {
			return isOdd(n-1);
		}
	}
	
	private static void exchange(final char[] a, final int i, final int j) {
		char tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void permute(final char[] a, final int endIndex) {
		if(endIndex ==0) { //Rekursionsbasis
		//ansehen und reparieren	ausgabe(a);
		} else { //Rekursionsvorschrift
			for (int i=0; i <= endIndex -1 ; i++) {			
				exchange(a, i, endIndex);
				permute(a, endIndex - 1);
				exchange(a, i, endIndex);
				}
			permute(a, endIndex -1);
			}
		
	}
	
	public static void main(final String [] args) {
		char[] feld = {'A', 'B', 'C'};
		permute(feld, feld.length -1);
		}
	}
	

	

