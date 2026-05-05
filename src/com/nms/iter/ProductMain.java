package com.nms.iter;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;
//import java.util.Comparator;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> myProdList = new ArrayList<Product>();
		
		myProdList.add(new Product(1,"Hp Laptop",25000f));
		myProdList.add(new Product(2,"Dell Laptop",27000f));
		myProdList.add(new Product(3,"Lenavo Laptop",37000f));
		myProdList.add(new Product(4,"MacAir Laptop",75000f));
		
		List<Float> pricelist = new ArrayList<Float>();
		
		
		for(Product prod : myProdList) {
			System.out.println(prod);
			if(prod.getPrice() <45000f) {
				pricelist.add(prod.getPrice());
			}
		}
		System.out.println(pricelist);
		
		//filtering item in the list using stream
		
		List<Float> newPriceList = myProdList.stream()
				.filter(p->p.getPrice() > 45000f)
				.map(p->p.getPrice())
				.collect(Collectors.toList());
		System.out.println(newPriceList);
		
	//finding product with minimu price	
		Product minPriceProd = myProdList.stream()
				.min((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
				.get();
		
		System.out.println(minPriceProd);

	}

}
