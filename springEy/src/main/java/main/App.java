package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Map.*;
import payments.PayService;
import wiring.Item;
import wiring.Order;
import wiring.Order1;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

////		Using Constructor
//		PayService bean = context.getBean("payBean", PayService.class);
//		bean.performPayment();

		
////		Using Getter and Setter
//		PayService bean1 = context.getBean("payBean1", PayService.class);
//		bean1.performPayment();
		
//		using anotations
//		bean name will be the class name with first letter small
		PayService bean1 = context.getBean("payServiceImpl1", PayService.class);
		bean1.performPayment();
		
////		Collection Wiring - List,Custom_class_List,Set
//		Order orderBean = (Order) context.getBean("orderBean");
//		List<Item> itemList = orderBean.getItems();
//		for(Item i : itemList) {
//			System.out.println("Item from list = "+i.getName());
//			System.out.println("Item from list = "+i.getPrice());
//		}
//		
//		List<String> items = orderBean.getItemList();
//		for(String i : items) {
//			System.out.println("Item from List = "+i);
//		}
//		
//		Set<String> itemSet = orderBean.getItemSet();
//		for(String i : itemSet) {
//			System.out.println("Item from Set = "+i);
//		}
		
////		Collection Wiring - Map,Properties
//		Order1 orderBean1 = (Order1) context.getBean("orderBean1");
//		Map<String,Item> itemMap = orderBean1.getItemMap();
//		for(Map.Entry<String,Item> x : itemMap.entrySet()) {
//			System.out.println("Item from Map : "+x.getKey()+" "+x.getValue().getName()+" "+x.getValue().getPrice());
//		}
//		
//		Properties itemProp = orderBean1.getItemProp();
//		System.out.println("Items from Properties : "+itemProp);
		
		context.close();
		
	}
}
