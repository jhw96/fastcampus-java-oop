package fastcampus.java.oop.service;

import java.util.List;

import fastcampus.java.oop.logic.Sort;

public class SortService {

	private Sort<String> sort;

	public SortService(Sort<String> sort) {
		this.sort = sort;
		System.out.println("구현체: " + sort.getClass().getName());
	}

	public List<String> doSort(List<String> list) {
		return sort.sort(list);
	}
}
