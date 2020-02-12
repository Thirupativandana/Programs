package com.cts.sd.ui;
import java.util.Arrays;

public class App1 {
	public static void main(String[] args) {
		int [] nums = {33,44,55,66,34,56,7,8,91};
		double avg = Arrays.stream(nums)
					.average()					
					.getAsDouble();				
		System.out.println(avg);
		
		
		double evenAverage = Arrays.stream(nums)
							.filter(n -> n%2 == 0)		
							.average()
							.getAsDouble();				
		System.out.println(evenAverage);
		
		
	}

}
