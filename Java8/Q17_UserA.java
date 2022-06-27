package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q17_UserA {

	public static void main(String[] args) {

		List<Item> items = new ArrayList<>();

		items.add(new Item(1,"Laptop","computer assesories", 30000,"01/01/2021","01/01/2050"));
		items.add(new Item(2, "Sugar", "grocery", 45, "02/01/2020", "26/10/2022"));
		items.add(new Item(3, "Car", "vehicle",  500000, "22/10/2020", "11/05/2032"));
		items.add(new Item(4, "Milk", "dairy",  30, "15/04/2022", "18/04/2022"));
		items.add(new Item(5, "Paracetamol", "medicine", 60, "23/10/2021", "23/10/2023"));

		Scanner scan = new Scanner(System.in);
		System.out.println(
				" 1.to find item by cateory name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
		int ch = scan.nextInt();
		while (true) {
			switch (ch) {
			case 1:
				System.out.println("Enter category name");
				String category = scan.next();
				List<Item> i = items.stream().filter(e -> e.Category.contains(category))
						.collect(Collectors.toList());
				System.out.println(i);
				break;

			case 2:
				System.out.println("Enter item starting name");
				String itemname = scan.next();
				List<Item> ii = items.stream().filter(e -> e.ItemName.startsWith(itemname))
						.collect(Collectors.toList());
				ii.stream().forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter  date");
				String date = scan.next();
				List<Item> ii2 = items.stream()
						.filter(e -> e.DOE.contains(date) || e.DOM.contains(date))
						.collect(Collectors.toList());
				ii2.stream().forEach(System.out::println);
				break;
			case 4:
				System.out.println("Enter  max range");
				int maxrange = scan.nextInt();
				System.out.println("Enter  min range");
				int minrange = scan.nextInt();
				List<Item> iii = items.stream().filter(m -> m.Price > minrange && m.Price < maxrange)
						.collect(Collectors.toList());
				iii.stream().forEach(System.out::println);
				break;

			}
			
			System.out.println(
					" 1.to find item by cateory name\n 2.find item by starting name \n 3.find product on basis of date \n 4.find product by price range ");
			System.out.println("if want to exit press 5");
			ch = scan.nextInt();
			if (ch == 5) {
				break;
			}
		}

	}
}
