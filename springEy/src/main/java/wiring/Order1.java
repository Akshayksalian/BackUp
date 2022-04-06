package wiring;

import java.util.Map;
import java.util.Properties;

public class Order1 {
	
	private String id;
	private Map<String,Item> itemMap;
	private Properties itemProp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, Item> getItemMap() {
		return itemMap;
	}
	public void setItemMap(Map<String, Item> itemMap) {
		this.itemMap = itemMap;
	}
	public Properties getItemProp() {
		return itemProp;
	}
	public void setItemProp(Properties itemProp) {
		this.itemProp = itemProp;
	}
	

}
