package de.demmer.dennis;

import java.util.List;

public class ListUtil {

	public void printFrom(List<Integer> list, int startIndex) {

		System.out.print("Index: " + startIndex + "- > ");
		if (startIndex >= list.size()) {
			return;
		}

		System.out.println(list.get(startIndex));

		startIndex = startIndex + 1;

		printFrom(list, startIndex);

	}

}
