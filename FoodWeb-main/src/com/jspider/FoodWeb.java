package com.jspider;

import java.util.Scanner;

public class FoodWeb {
double total_price ;
double item_price;
public int quantity;
int dosa=45;
int southThali=145;
int northThali=120;
int friedrice=120;
int frenchfries=130;
int ch1;
String name="veg";
String nextorder;
int biryani=450;
int chicken_roll=100;
Scanner sc=new Scanner(System.in);
public void display_menu() {
	System.out.println("**************************");
	System.out.println("------------------WELCOME TO FOODZONE------------------");
	System.out.println(" 1: DOSA:45");
	System.out.println(" 2: SouthThali:145");
	System.out.println(" 3: NorthThali:120");
	System.out.println(" 4: FriedRice:130");
    System.out.println(" 5: FrenchFries:45");
    System.out.println("***************************************");
}
public void display_menu_nonveg() {
		System.out.println("1: Biryani:450");
		System.out.println("2: Chicken_roll:100");
		System.out.println("****************************************");
}
public void bill_generate() {
	System.out.println();
	System.out.println("******************THANK YOU FOR THE ORDERING*************");
	System.out.println("Your bill is: "+total_price);
}
public void veg_food() {
	while(true) {
		ch1=sc.nextInt();
		switch(ch1) {
		case 1:System.out.println("You have selcted dosa!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*dosa; 
	    break;
		case 2:System.out.println("You have selcted southThali!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*southThali; 
	    break;
		case 3:System.out.println("You have selcted northThali!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*northThali; 
	    break;
		case 4:System.out.println("You have selcted friedrice!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*friedrice; 
	    break;
		case 5:System.out.println("You have selcted frenchfries!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*frenchfries; 
	    break;
		case 6:System.out.println("You have selcted biryani!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*biryani; 
	    break;
		case 7:System.out.println("You have selcted chicken_roll!!");
		System.out.println();
		System.out.println("Quantity");
		quantity=sc.nextInt();
	    total_price=total_price+quantity*chicken_roll; 
	    break;
	    default:
	    	System.out.println("oops!! invalid choice");
	    	break;
		}
		System.out.println();
		System.out.println("do you want to order more!!(true)(false)");
		nextorder=sc.next();
		if(nextorder.equalsIgnoreCase("no")) {
			bill_generate();
			System.exit(1);
		}
		
	}
}
}
