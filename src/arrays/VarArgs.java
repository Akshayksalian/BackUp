package arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		sum(2,3,4,5);
		names("Akshay","hey");

	}
	
	public static void sum(int ... a){
		int ans = 0;
		for(int x : a) {
			ans+=x;
		}
		System.out.println(ans);
	}
	
	public static void names(String ... s ) {
		String str= "";
		for(String x: s) {
			str+=x;
		}
		System.out.println(str);
	}
	
	

}
