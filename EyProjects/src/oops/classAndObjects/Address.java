package oops.classAndObjects;

public class Address {
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private int pinCode;
	
	Address(String addLine1,String addLine2,String city,String state,int pinCode){
		this.addLine1 = addLine1;
		this.addLine2 =addLine2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public String getAddLine1() {
		return addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPinCode() {
		return pinCode;
	}
	
	public void displayAddress() {
		System.out.println("Address : \n"+getAddLine1()+"\n"+getAddLine2()+"\n"+getCity()+"\n"+getState()+"\n"+getPinCode()+"\n");
	}
}
