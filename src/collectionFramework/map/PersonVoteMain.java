package collectionFramework.map;
import java.util.*;
import java.util.Map.*;
public class PersonVoteMain {
	
	public static boolean checking(Entry<Integer,PersonVoteEligibilty> e){
		boolean flag = ( e.getValue()).getAge()<18;
		return flag;
	}
	

public static void main(String[] args) {
		
		Map<Integer,PersonVoteEligibilty> map = new HashMap<>();
		
		PersonVoteEligibilty p1 = new PersonVoteEligibilty(1,"Akshay",25);
		map.put(1,p1);
		
		PersonVoteEligibilty p2 = new PersonVoteEligibilty(2,"Chandan",14);
		map.put(2,p2);
		
		PersonVoteEligibilty p3 = new PersonVoteEligibilty(3,"Chandan",14);
		map.put(3,p3);
		
		
		Map<Integer,PersonVoteEligibilty> minors = new HashMap<>();
		Map<Integer,PersonVoteEligibilty> eligible = new HashMap<>();
		
		Set<Entry<Integer,PersonVoteEligibilty>> entrySet = map.entrySet();
		for(Entry<Integer,PersonVoteEligibilty> e : entrySet) {
			if(checking(e)) {
				minors.put(e.getKey(),e.getValue());
			} else {
				eligible.put(e.getKey(),e.getValue());
			}
		}
		
		Set<Entry<Integer,PersonVoteEligibilty>> entrySet1 = minors.entrySet();
		for(Entry<Integer,PersonVoteEligibilty> e : entrySet1) {

			System.out.println(e.toString());
			} 
		
		System.out.println("Eligible");
	
		Set<Entry<Integer,PersonVoteEligibilty>> entrySet2 = eligible.entrySet();
		for(Entry<Integer,PersonVoteEligibilty> e : entrySet2) {
			System.out.println(e.toString());
			} 
	}
		
}
