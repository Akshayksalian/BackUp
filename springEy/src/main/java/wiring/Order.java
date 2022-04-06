package wiring;

import java.util.List;
import java.util.Set;

public class Order {
	
	private String id;
	private List<String> itemList;
	private List<Item> items;
	private Set<String> itemSet;
	
	public String getId() {
		return id;
	}
	public Set<String> getItemSet() {
		return itemSet;
	}
	public void setItemSet(Set<String> itemSet) {
		this.itemSet = itemSet;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getItemList() {
		return itemList;
	}
	public void setItemList(List<String> itemList) {
		this.itemList = itemList;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
