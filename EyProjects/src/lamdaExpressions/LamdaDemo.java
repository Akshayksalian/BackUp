package lamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LamdaDemo {
	public static void main(String[] args) {
		
		MaxFinder mf = (n1,n2) -> n1>n2?n1:n2;
		System.out.println(mf.maxOfTwoNum(2, 5));
		
		
		List<String> nameList = Arrays.asList("Akshay","sdsa","sdasas");
		nameList.forEach(s->System.out.println(s+"Ainljbk"));
	}
}
