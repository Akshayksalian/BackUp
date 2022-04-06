package configs;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import payments.CCPayment;
import payments.CashPayment;
import payments.PayService;
import payments.PayServiceImpl;
import payments.Payment;
import scope.Message;

@Configuration
public class appConfig {

	@Bean("BeanPay")
	public PayService payConService() {
		PayServiceImpl payServiceImpl = new PayServiceImpl(cashPayment(),4.56);
		return payServiceImpl;
	}

	@Bean
	public Payment ccPayment() {
		return new CCPayment();
	}
	
	@Bean
	public Payment cashPayment() {
		return new CashPayment();
	}
	
	@Bean("messageBean")
	@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Message getMessage() {
		return new Message();
	}
	
}
