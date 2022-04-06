package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] multArr = {{2,3,4,5},{6,7,8,9},{10,11,12,13}};
		

		for(int i=0;i<multArr.length;i++) {
			for(int j=0;j<multArr[0].length;j++) {
				System.out.print(multArr[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Row size "+multArr.length);
		System.out.println("Coloumn size "+multArr[0].length);
		

	}

}
