package payments;

import org.springframework.stereotype.Component;

@Component
public class CCPayment implements Payment{

	public void executePayment(double amount) {

		System.out.println("Perform credit Card Payment "+ amount);
	}
	
}
