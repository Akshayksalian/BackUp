package dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@Size(min=5,max=10,message="{firstName.size}")
	private String firstName;
	
	@NotNull
	@Size(min=5,max=10,message="{lastName.size}")
	private String lastName;

	@NotNull
	@Size(min=5,max=15,message="{password.size}")
	private String password;
	
	@NotNull
	@Email(message="{email.msg}")
	private String email;
	
	private boolean receiveNews;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isReceiveNews() {
		return receiveNews;
	}

	public void setReceiveNews(boolean receiveNews) {
		this.receiveNews = receiveNews;
	}
	
		
}
