package payments;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl1 implements PayService{				//,InitializingBean,DisposableBean

	@Autowired
	@Qualifier("cashPayment")
	private Payment payment;
	@Value("3588.56")
	private double amount;
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("In setup");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("In Destroy method");
	}
	
	@Override
	public void performPayment() {
		payment.executePayment(amount);
	}
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

}
