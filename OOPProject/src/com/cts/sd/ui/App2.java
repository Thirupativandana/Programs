package com.cts.sd.ui;
import java.util.Arrays;

public class App2 {
	public static void main(String[] args) {
		int [] nums = {33,44,55,66,34,56,7,8,91};
		Arrays.stream(nums)
			.filter(n -> n%2 == 1)
			.sorted()
			.forEach(System.out::println);
	}

}
