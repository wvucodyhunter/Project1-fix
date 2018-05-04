
import java.util.Scanner;

public class Resturaunt {
	static Scanner input = new Scanner(System.in);
	String name = null;
	String hours = null;
	String menu = null;
	String peakTime = null;
	String option = null;
	String happyHour = null;
	String area = null;
	
	
	
	
	
	
public void selectLocation(String location) {
		
		area = location;
		
		
				
		if(location.equalsIgnoreCase("University Town Center")) {
			System.out.println("What reasturant are you going to in University Town Center?");
			System.out.println("Red Lobster or Cheddars");
			name = input.nextLine();
			SelectUTCResturaunt(name);
		 
	}
		else if(location.equalsIgnoreCase("Suncrest Town Center")) {
			System.out.println("What reasturante are you going to in Suncrest Towne Centre?");
			System.out.println("Buffalo Wild Wings, Roosters, or Primanti Bros");
			name = input.nextLine();
			SelectSTCResturaunt(name);
			
			
	}	
	}
public void SelectUTCResturaunt(String name) {
	
	this.name = name;
	


if(name.equalsIgnoreCase("Red Lobster")){
	
	System.out.println("What do you want to know about "+name+"?");
	System.out.println("The information I have is hours, popular menu items, happy hour, and peak times");
	option=input.nextLine();
	
	if(option.equalsIgnoreCase("Peak Times")) 
		System.out.println("Peak times: 12 noon - 2pm and 5pm - 7pm" );
	
	else if(option.equalsIgnoreCase("Hours")) 
		System.out.println("The hours are 9am - 11pm");
	
	else if(option.equalsIgnoreCase("Popular menu items"))
		System.out.println(" Popular menu items for Red Lobster are:  \n Entrees: \n Steak and fries       $15 \n Burgers and chips      $20"
			+ " \n Appetizers: \n Cheesy fries     $8 \n Fried pickles     $7"
			+ " \n Desserts: \n Brownie A la Mode      $6 \n NY Cheesecake    $7");
	
	else if(option.equalsIgnoreCase("Happy Hour"))
		System.out.println("Happy hour is from 4pm - 7pm \n BOGO Bloomin' Onion"
				+ "\n $2 domestic bottles and drafts \n $3 mixed drinks");
}

else if(name.equalsIgnoreCase("Cheddars")) {
	
	System.out.println("What do you want to know about "+name+"?");
	System.out.println("The information I have is hours, popular menu items, happy hour and peak times");
	option=input.nextLine();

	
	if(option.equalsIgnoreCase("Peak Times") || option.equalsIgnoreCase("Peak Times ")) {
		System.out.println("Peak times: 11 am - 1pm and 6pm - 8pm" );
	}
	else if(option.equalsIgnoreCase("Hours")) {
		System.out.println("The hours are 10am - 10pm");
	}
	
	else if(option.equalsIgnoreCase("Popular menu items") || option.equalsIgnoreCase("Popular menu items ") ) {
		System.out.println(" Popular menu items for Cheddars are : \n Entrees: \n Chicken and shrimp      $12\n  Country fried steak   $10  "
			+ "\n Appetizers: \n Chips and queso    $5 \n  Baked potato skins   $8"
			+ "\n Desserts: \n Giant Cookie     $5\n Lava Cake     $6");	
		
	}
	else if(option.equalsIgnoreCase("Happy Hour")) {
		System.out.println("Happy Hour is from 5pm - 8pm" 
				+ "\n Half price Apps"
				+ "\n $3 All Drafts \n $3 Long Islands");
	}
	
	
}
		

		
}
public void SelectSTCResturaunt(String name) {
	this.name = name;
	
	
	if(name.equalsIgnoreCase("Buffalo Wild Wings")) {
		System.out.println("What do you want to know about "+name+"?");
		System.out.println("The information I have is hours, menu, happy hour and peak times");
		option=input.nextLine();
		
		if(option.equalsIgnoreCase("Peak Times")) 
			System.out.println("Peak times: 11:30 am - 1pm and 5:30pm - 9pm" );
		
		else if(option.equalsIgnoreCase("Hours")) 
			System.out.println("The hours are 11am - 12am");
		
		else if(option.equalsIgnoreCase("Popular menu items"))
			System.out.println(" popular menu items for Buffalo Wild Wings are: \n Entrees: \n  Cheese curd bacon burger  $13 \n  Buffalo mac n cheese   $10.99  "
				+ "\n Appetizers: \n Wilder wedges   $7.99 \n  Ultimate nachos   $10"
				+ "\n Desserts: \n Giant Cookie     $5\n Lava Cake     $6");	
		
		else if(option.equalsIgnoreCase("Happy Hour"))
			System.out.println("Happy Hour is from 5pm - 8pm" 
					+ "\n Half price wings on Tuesdays"
					+ "\n $2 domestic Drafts");
	}
	
	else if(name.equalsIgnoreCase("Primanti Bros")){
		System.out.println("What do you want to know about "+name+"?");
		System.out.println("The information I have is hours, menu, happy hour and peak times");
		option=input.nextLine();
		
		if(option.equalsIgnoreCase("Peak Times")) 
			System.out.println("Peak times: 6pm - 11pm" );
		
		else if(option.equalsIgnoreCase("Hours")) 
			System.out.println("The hours are 11am - 12am");
		
		else if(option.equalsIgnoreCase("Menu"))
			System.out.println(" Popular menu items for Primanti Brothers are: \n Entrees: \n Pitts-burger    $7.39\n  Brothers Burger   $10.69 "
				+ "\n Appetizers: \n Breaded Mozzarella Wedges   $5.99 \n  BLT Tots   $6"
				+ "\n Desserts: \n Giant Cookie     $5\n Lava Cake     $6");	
		
		else if(option.equalsIgnoreCase("Happy Hour"))
			System.out.println("Happy Hour is from 3pm - 7pm" 
					+ "\n Half price Apps and drinks");
	}
	
	else if(name.equalsIgnoreCase("Roosters")) {
		System.out.println("What do you want to know about "+name+"?");
		System.out.println("The information I have is hours, menu, happy hour and peak times");
		option=input.nextLine();
		
		if(option.equalsIgnoreCase("Peak Times")) 
			System.out.println("Peak times: 11 am - 1pm and 6pm - 8pm" );
		
		else if(option.equalsIgnoreCase("Hours")) 
			System.out.println("The hours are 10am - 10pm");
		
		else if(option.equalsIgnoreCase("Menu"))
			System.out.println(" The menu for Cheddars is: \n Entrees: \n Chicken and shrimp      $12\n  Country fried steak   $10  "
				+ "\n Appetizers: \n Chips and queso    $5 \n  Baked potato skins   $8"
				+ "\n Desserts: \n Giant Cookie     $5\n Lava Cake     $6");	
		
		else if(option.equalsIgnoreCase("Happy Hour"))
			System.out.println("Happy Hour is from 5pm - 8pm" 
					+ "\n Half price Apps"
					+ "\n $3 All Drafts \n $3 Long Islands");
	}
}

public static void main( String [] args) {
			String location;
			
			Resturaunt r = new Resturaunt();
			
			System.out.println("What area in Morgantown are you going to?");
			System.out.println("Suncrest town center, University town center");
			location=input.nextLine();
			
			r.selectLocation(location);
			
		}
	
	
}
