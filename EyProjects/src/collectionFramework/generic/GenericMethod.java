package collectionFramework.generic;

public class GenericMethod {

	public static void main(String[] args) {
		
		GenericMethod gm = new GenericMethod();
		
		Integer a[] = {1,2,3,4,5,6};				// int a[] doesn't work it should be a Integer.
		Double b[] = {2.1,4.2,6.1,4.37};
		Character ch[] = {'A','B','C'};
		gm.printElement(a);
		gm.printElement(b);
		gm.printElement(ch);

	}
	
	public <T> void printElement(T[] a) {
		for(T x : a) {
			System.out.print(" "+x);
		}
		System.out.println(" ");
	}

}
