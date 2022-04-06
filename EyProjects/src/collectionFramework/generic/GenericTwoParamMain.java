package collectionFramework.generic;

public class GenericTwoParamMain {
	public static void main(String [] args) {
		
		GenericTwoParam<Integer, String> gt = new GenericTwoParam<>(10,"Akshay");
		gt.showType();
	}

}
