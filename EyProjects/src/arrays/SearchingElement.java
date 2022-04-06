package arrays;
import java.util.*;
public class SearchingElement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,10};
		
		int num = s.nextInt();
		boolean flag = true;
		s.close();
		for(int i=0;i<arr.length;i++) {
			if(num!=arr[i]) {
				continue;
			} else {
				System.out.println("Found in position "+i);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("Not found");
		}

	}

}
