package com.nms.iter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cities = Arrays.asList("Agra","Indore","Delhi","Bhopal","Jaipur","pune");
		
		List<String> upperCities = cities.stream()
				.filter(i->i.length() > 5)
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(upperCities);
		
		
		//mathmatical expression
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sumOfEvenNumbers = numbers.stream()
				.filter(i -> i %2 == 0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println(numbers +" " + sumOfEvenNumbers);
		
		
		/*List<Float> newPriceList = myProdList.stream()
				.filter(p->p.getPrice() > 45000f)
				.map(p->p.getprice())
				.collect(collectors.toList());
		System.out.println(newPriceList);*/
		
	}

}
