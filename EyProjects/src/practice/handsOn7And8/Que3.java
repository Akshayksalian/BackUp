package practice.handsOn7And8;

import java.util.Stack;

public class Que3 {
	public static void main(String[] args) {
		
		Stack<String> s =new Stack<>(); 
		
		s.push("One");
		s.push("Two");
		s.push("Three");
		s.push("Four");
		s.push("Five");
		
		System.out.println("---------Before poping---------");
		System.out.println(s);
		
		//  removes the last inserted element.
		s.pop();
		System.out.println("---------After poping---------");
		System.out.println(s);
	}
}
