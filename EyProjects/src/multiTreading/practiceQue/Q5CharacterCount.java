package multiTreading.practiceQue;

import java.util.*;
import java.util.Map.Entry;

public class Q5CharacterCount {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		if(s.hasNext()) {
			s.nextLine();
		}
		
		for (int i = 0; i < n; i++) {

			String str = s.nextLine();
			MyThread mt = new MyThread(str);
			Thread temp = new Thread(mt);
			temp.start();

		}
		s.close();

	}
}

class MyThread extends Thread {

	private String str;

	MyThread(String str) {
		this.str = str;
	}

	@Override
	public void run() {

		Map<Character, Integer> hm = new HashMap<>();

		char[] chArr = str.toCharArray();

		for (char x : chArr) {
			if (hm.containsKey(x)) {
				int i = hm.get(x) + 1;
				hm.put(x, i);
			} else {
				hm.put(x, 1);
			}
		}

		Set<Entry<Character, Integer>> entset = hm.entrySet();
		for (Entry<Character, Integer> ent : entset) {
			System.out.println(ent.getKey() + "" + ent.getValue());
		}
		System.out.println("");
	}

}
