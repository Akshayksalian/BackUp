package collectionFramework.generic;

public class GenericTwoParam <E,T> {
	
	private E a;
	private T b;
	
	public GenericTwoParam(E a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	void showType() {
		 System.out.println(a.getClass().getName());
		 System.out.println(b.getClass().getName());
	}

}
