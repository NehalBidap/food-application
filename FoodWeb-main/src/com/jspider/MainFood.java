package com.jspider;

import java.util.Scanner;

public class MainFood {
public static void main(String[] args) {
	System.out.println("************Have Anything But Pay the Bill!!!!*************");
	FoodWeb f=new FoodWeb();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your option");
	System.out.println("1.VEG\n2.NON-VEG");
	int choose=sc.nextInt();
	switch(choose) {
	case 1: System.out.println("WELCOME TO VEG RESTO!!!!");
	f.display_menu();
	f.veg_food();
	f.bill_generate();
	break;
	case 2:
		System.out.println("WELCOME TO NON-VEG RESTO!!!!");
		f.display_menu_nonveg();
		f.veg_food();
		f.bill_generate();
	break;
	default:
		System.out.println("INVALID");
	}	
}
}
