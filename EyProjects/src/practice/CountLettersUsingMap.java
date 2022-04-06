package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountLettersUsingMap {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Map<Character, Integer> map = new HashMap<>();

		String str = s.nextLine().toUpperCase().trim().replace(" ", "");
		s.close();

		for (Character ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "; ");
		}

	}
}
