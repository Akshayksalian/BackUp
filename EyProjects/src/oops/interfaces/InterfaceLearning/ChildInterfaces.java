package oops.interfaces.InterfaceLearning;

public class ChildInterfaces implements ParentInterface,SimpleParent{			// Any number of interfaces can be implemented.

	@Override
	public int add(int a, int b) {
		int c= a+b;
		
		return c;
	}

	@Override
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
