package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithList {
	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();

		List<String> Natocountries = new ArrayList<>();
		Natocountries.add("France");
		Natocountries.add("Germany");
		Natocountries.add("United States");
		map.put("NATO", Natocountries);

		List<String> RussiaSuppcountries = new ArrayList<>();
		RussiaSuppcountries.add("North Korea");
		RussiaSuppcountries.add("China");
		RussiaSuppcountries.add("Iran");
		map.put("Russia Supporters", RussiaSuppcountries);

		List<String> Non_alignedcountries = new ArrayList<>();
		Non_alignedcountries.add("India");
		map.put("Non aligned Countries", Non_alignedcountries);

		Set<Entry<String, List<String>>> entrySet = map.entrySet();
		for (Entry<String, List<String>> ent : entrySet) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	}
}
