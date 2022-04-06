package collectionFramework.generic;

public class GenericSingle<E> {
	
	private E a;
	private E b;
	
	public void add(E a,E b) {
		this.a = a;
		this.b = b;
		System.out.println(this.a+" "+this.b);
	}
}
