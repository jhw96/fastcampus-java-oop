package fastcampus.java.oop;

import java.util.Arrays;

import fastcampus.java.oop.logic.BubbleSort;
import fastcampus.java.oop.logic.Sort;


public class Main {

	public static void main(String[] args) {
		Sort<String> sort = new BubbleSort<>();
		
		System.out.println("[result] " + sort.sort(Arrays.asList(args)));
	}

}
