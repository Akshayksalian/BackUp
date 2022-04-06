package practice.handsOn4;

public class Question5AccountClass {
	
	private long accountNum;
	private String name,email;
	private float amount;
	
	public Question5AccountClass(long accountNum, String name, String email, float amount) {
		this.accountNum = accountNum;
		this.name = name;
		this.email = email;
		this.amount = amount;
	}
	
	public Question5AccountClass() {
	}

	public long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return " accountNum=" + accountNum + ", name=" + name + ", email=" + email + ", amount="
				+ amount ;
	}
}
