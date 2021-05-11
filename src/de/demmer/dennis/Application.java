package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		ListUtil util = new ListUtil();
		
		util.printFrom(list, 0);
		
		
		
	}

}
