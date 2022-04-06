package payments;

import org.springframework.stereotype.Component;

@Component
public class CashPayment implements Payment{

	public void executePayment(double amount) {

		System.out.println("Cash Payment"+amount);
	}
	
}
