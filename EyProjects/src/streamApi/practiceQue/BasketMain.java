package streamApi.practiceQue;

import java.util.ArrayList;

public class BasketMain {

	public static void main(String[] args) {
		
		Basket b = new Basket();
		ArrayList<Basket> myList = createList();
		
		System.out.println("Basket With Highest Quantity = "+b.getBasketWithHighestQuantity(myList));
		System.out.println("Basket With Lowest Quantity = "+b.getBasketWithLowestQuantity(myList));
		System.out.println("Total Qty Of All Baskets = "+b.totalQtyOfAllBaskets(myList));

	}
	
	public static ArrayList<Basket> createList() {
		
		ArrayList<Basket> basketList = new ArrayList<>();
		
		Basket b1 = new Basket(545341,5);
		Basket b2 = new Basket(113544,15);
		Basket b3 = new Basket(863434,7);
		Basket b4 = new Basket(635545,24);
		Basket b5 = new Basket(734315,8);
		
		basketList.add(b1);
		basketList.add(b2);
		basketList.add(b3);
		basketList.add(b4);
		basketList.add(b5);
		
		return basketList;

	}
}
