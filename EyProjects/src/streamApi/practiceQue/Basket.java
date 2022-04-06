package streamApi.practiceQue;

import java.util.ArrayList;
import java.util.OptionalInt;

public class Basket {
	
	private long manufactureNo;
	private int qty;
	
	public Basket() {
		
	}
	
	public Basket(long manufactureNo, int qty) {
		super();
		this.manufactureNo = manufactureNo;
		this.qty = qty;
	}

	public long getManufactureNo() {
		return manufactureNo;
	}

	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Basket [manufactureNo=" + manufactureNo + ", qty=" + qty + "]";
	}
	
	public int getBasketWithHighestQuantity(ArrayList<Basket> list) {
		
		OptionalInt op = list.stream().mapToInt(b -> b.getQty()).max();
		return op.getAsInt();
		
	}
	
    public int getBasketWithLowestQuantity(ArrayList<Basket> list) {
    	
    	OptionalInt op = list.stream().mapToInt(b -> b.getQty()).min();
		return op.getAsInt();
    	
    }
    
    public int totalQtyOfAllBaskets(ArrayList<Basket> list) {
    	return list.stream().mapToInt(b->b.getQty()).sum();
    }

}
