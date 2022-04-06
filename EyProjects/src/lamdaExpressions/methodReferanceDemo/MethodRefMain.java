package lamdaExpressions.methodReferanceDemo;

public class MethodRefMain {

	public static void main(String[] args) {
		
		String[] strNames = {"Akshay","Bharath","Shivu","manoj","Rohan"};
		
//		Using lambda 					(SortClass is class name) (sortName is a method in that class)
//		InMyStringFun<String[],String[]> object = (i) ->SortClass.sortName(strNames);
		InMyStringFun<String[],String[]> obj = SortClass::sortName;
		
//		Calling stringFunc will refer to implementing method of sortName from the class SortClass . 
		String[] afterSorting = obj.stringFunc(strNames);
		
		for(String x : afterSorting) {
			System.out.println(x);
		}

	}

}
