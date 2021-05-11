package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		
		list.add(58);
		list.add(1);
		list.add(88);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(9);
	

		ListUtil util = new ListUtil();
		
		util.printFrom(list, 0);
		
		
		
	}

}
