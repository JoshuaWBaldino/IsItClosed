import java.util.Scanner;
public class IsItClosed 
// this is a committ
{
	
	// to run(in my opinion): Create new Java project called test, Create new class called IsItClosed.java,
	//Delete all contents of the class, copy and paste code, run that baby!
	
	String nameBot;
	
	/*constructor*/
	IsItClosed(String name)
	{
		nameBot = name;
	}
	
	public static int counter = 0;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		IsItClosed closedBot = new IsItClosed("Closed Bot");
		String userName = null;
		if (counter == 0)
	{
		System.out.println("'Tap' 'Tap' 'Tap'...");
		System.out.println("Is anyone there? If so...");
		
		
	  while (true) 
	  {  
		counter ++;
		System.out.println("Please state your name for me.");
				userName = input.nextLine();	
		System.out.println("I do not know if I clearly heard you, did you say your name was " + userName + "?(Yes/No)");
		String firstAns = input.nextLine();
		
		if (firstAns.equalsIgnoreCase("yes"))
		{
			System.out.println("Alright sweet, nice to meet you " + userName + "!");
		    break;
		}
		
		else if (firstAns.equalsIgnoreCase("yeah"))
		{
			System.out.println("Alright sweet, nice to meet you " + userName + "!");
			break;
		}
		
		else if (firstAns.equalsIgnoreCase("no"))
		{
			System.out.println("Oh my bad.");
			continue;
		}
		
		else
		{ 
			System.out.println("what?");
			continue;
		}
		
	   }
		
		System.out.println("Well let me introduce myself, my name is Closed Bot!\nI am a Bot created by some random Cs 110 student"
				+ "\nin order to help people like you figure out if things are open or closed.");
		System.out.println("Though I was named Closed Bot, I actually do not like the name at all!\nHey I got an idea!"); 
		
	while (true)
	{
		System.out.println("Would you want to name me?");
		String secondAns = input.nextLine();
		if (secondAns.equalsIgnoreCase("Yes"))
		{
			System.out.println("Really? Thank you so much!");
			System.out.println("what was the name you were thinking of giving me?");
				String name = input.nextLine();
				closedBot = new IsItClosed(name);
				System.out.println("So you were thinkg of " + closedBot.nameBot + "." + " Hm... Ok!");
				System.out.println("I am so excited, I actually have a name now!"
						+ "\nThank you so much, alright now that you did me a favor I will do one for you."
						+ "\nYou tell me a dining location in Morgantown and I will try my best to let you know what times it is open for.");
				break;
		}
		
		else if (secondAns.equalsIgnoreCase("no"))
		{
			System.out.println("Thats ok, then lets get right into what you are here for!");
			break;
		}
		
		else
		{
			System.out.println("Huh?");
			continue;
		}
	}
	}
	else if (counter > 1)
	{
		
	}
	System.out.println("\rFor now I only know dining locations that are affiliated with West Virginia University."
			+ "\nHopefuly in the future the one who made me will actually add more locations, but he is really lazy.\nSo...");
		
	while (true)
	{
		System.out.println("\rWhat place in Morgantown are you wondering the opening hours for?\n"
				+ "If you have no more locations you want to know about just type 'done'.\n"
				+ "If you want a list of locations I know please enter 'list'."
				+ "Then you can search by the number!");
		String location = input.nextLine();
		if (location.equalsIgnoreCase("done"))
		{
			break;
		}
		
		else if (location.equalsIgnoreCase("list"))
		{
			while (true)
			{
				System.out.println("What campus dining location are you looking for?");
				String campus = input.nextLine();
			if  (campus.equalsIgnoreCase("Evansdale"))
			{
			System.out.println("Here is a list of the locations I can provide times for!\n"
					+ "0 Panini Pete's\n"
					+ "1 Juice Bar\n"
					+ "2 Little Donkey\n"
					+ "3 Hugh-Baby's\n"
					+ "4 Taziki's\n"
					+ "5 Two Birds"
					+ "13 Cafe Evansdale\n"
					+ "15 Cavanaugh's"
					+ "16 da Vinci's"
					+ "17 Park Place"
					+ "18 Bits & Bytes"
					+ "19 Brew'n Gold Cafe"
					+ "20 The Greenhouse"
					+ "21 Lyon's Den");
				break;
			}
			else if (campus.equalsIgnoreCase("downtown"))
			{
				System.out.println("Here is a list of the locations I can provide times for!\n"
						+ "4 Taziki's\n"
						+ "6 Burger King\n"
						+ "7 Chick-fil-a\n"
						+ "8 Hatfields\n"
						+ "9 Sabarro\n"
						+ "10 Saikou Sushi\n"
						+ "11 Which Wich\n"
						+ "12 Boreman Bistro\n"
						+ "14 Summit Cafe\n"
						+ "22 Suumit Grab'n Go"
						+ "24 Eliza's\n"
						+ "25 Terrace Room\n");
				break;
			}
			}
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Panini Pete's")) ||
		(location.equalsIgnoreCase("0")))
		{
			System.out.println("Known for their awesome Panini's and after 5 drafts,\n hours for this dining location are:\n"
					+ "Monday - Friday  7:30am - 9pm\r\n" + 
					"\r\n" + 
					"Saturday & Sunday  11:00am - 9pm\r\n" + 
					"\r\n" + 
					"Hours subject to seasonal change.\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Juice Bar")) ||
		(location.equalsIgnoreCase("1")))
		{ 
			System.out.println("Known for their healthy and organic choices for your lunch or dinner,"
					+ "\nthe opening hours for this location is:\r"
					+ "m – f  7:30 am – 9 pm\r\n" + 
					"sat  11 am – 9 pm\r\n" + 
					"sun  11 am  – 9 pm\r");
			continue;
			
		}
		else if ((location.equalsIgnoreCase("Little Donkey")) ||
		(location.equalsIgnoreCase("2")))
		{
			System.out.println("From nachos to tacos, Little Donkey is the go to for mexican cuisine.\n"
					+ "The opening hours for this location are:\r"
					+ "Sun-Thurs 11am-9:30pm\r"
					+ "Fri-Sat 11am-10:30pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Hugh-Baby's")) ||
		(location.equalsIgnoreCase("3")))
		{
			System.out.println("Know for their stellar BBQ and diner style burgers,\n"
					+ "this location's open hours are:\r"
					+ "11am-9pm, Seven Days a Week\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Taziki's")) ||
				(location.equalsIgnoreCase("4")))
		{
			System.out.println("For your mediterranean fix,\nthis location is open on the Evnsdale location:\r"
					+ "MON - SAT:	11:15 AM - 8:45 PM\r\n" + 
					"SUN:	12 PM - 8:45 PM\r\n" + 
					"\rFor the Downtown location:\r\n"+
					"MON - WED:	11:15 AM - 9:45 PM\r\n" + 
					"THU - SAT:	11:15 AM - 8:45 PM\r\n" + 
					"SUN:	2:15 PM - 8:45 PM\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Two Birds")) ||
				(location.equalsIgnoreCase("5")))
		{
			System.out.println("Craving that fried chicken?\nThis locations times are:\n\r"
					+ "Mon- Fri 7:30 to 9:00\r\n" + 
					"Sat & Sun 11:00 to 9:00\r");
			continue;
		}
		else if ((location.equalsIgnoreCase("Burger King")) ||
				(location.equalsIgnoreCase("6")))
		{
			System.out.println("Want McDonalds but do not want to go to Evensdale?\n"
					+ "Here are the times for this location:"
					+ "/nMonday - Friday\r\n" + 
					"7:30 am – 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon – 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"3:00 pm – 9:00 pm\n");
			continue;
		}
			
		else if ((location.equalsIgnoreCase("Chick-Fil-A")) ||
				(location.equalsIgnoreCase("7")))
		{
			System.out.println("mmmmmmmmmm... its good.\n"
					+ "This locations operating hours are:\n"
					+ "Monday - Friday\r\n" + 
					"7:30 am – 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon – 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"Closed\r");
			continue;
		}
		else if ((location.equalsIgnoreCase("Hatfields")) ||
				(location.equalsIgnoreCase("8")))
		{
			System.out.println("I had a chicken fried steak form here once, it was really good."
					+ "\n The hours of operation for this location are:"
					+ "Monday – Friday\r\n" + 
					"Breakfast: 7:15 am - 10:00 am\r\n" + 
					"Lunch: 11:00 am - 2:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Sabarro")) ||
				(location.equalsIgnoreCase("9")))
		{
			System.out.println("Are you in the mood for Italian?"
					+ "\n The hours that this location is open are:"
					+ "Monday - Thursday\r\n" + 
					"10:30 am – 10:00 pm\r\n" + 
					"Friday\r\n" + 
					"10:30 am – 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon – 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm – 9:00 pm");
			continue;
		}
		else if ((location.equalsIgnoreCase("Saikou Sushi")) ||
				(location.equalsIgnoreCase("10")))
		{
			System.out.println("Your place to get freshly made sushi!\n"
					+ "This locations operation hours are:\n"
					+ "Monday – Friday\r\n" + 
					"10:00 am - 7:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon - 7:00 pm\r\n" + 
					"Sunday\r\n" + 
					"Closed\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Which wich")) ||
				(location.equalsIgnoreCase("11")))
		{
			System.out.println("Wickeds are my personal favorite.\n"
					+ "This locations operating hours are:"
					+ "Monday - Thursday\r\n" + 
					"10:30 am – 10:00 pm\r\n" + 
					"Friday\r\n" + 
					"10:30 am – 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon – 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm – 9:00 pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Boreman Bistro")) ||
				(location.equalsIgnoreCase("12")))
		{
			System.out.println("Located downtown it is one of the four dining halls at WVU."
					+ "\nThe operating hours are:\n"
					+ "Monday - Friday\r\n" + 
					"11:00 am - 7:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"9:00 am - 7:00 pm/r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Cafe Evansdale")) ||
				(location.equalsIgnoreCase("13")))
		{
			System.out.println("From burgers, to pasta, to the special of the day this is never a bad choice.\n"
					+ "The operating hours for this location are:\r"
					+ "Monday - Thursday\r\n" + 
					"7:00 am – 8:00 pm\r\n" + 
					"Friday\r\n" + 
					"7:00 am – 6:30 pm\r\n" + 
					"Saturday & Holidays\r\n" + 
					"9:00 am – 6:30 pm\r\n" + 
					"Sunday\r\n" + 
					"9:00 am – 7:30 pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Summit Cafe")) ||
				(location.equalsIgnoreCase("14")))
		{
			System.out.println("Its got a brick pizza oven!"
					+ "The operating hours are:\n"
					+ "Monday – Friday\r\n" + 
					"7:00 am - 7:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"11:00 am - 6:30 pm\r");
		}
		
		else if ((location.equalsIgnoreCase("Terrace Room")) ||
				(location.equalsIgnoreCase("25")))
		{
			System.out.println("A hidden gem of WVU's Downtown Campus.\n"
					+ "The operating hours of this location are:\n"
					+ "Monday – Thursday\r\n" + 
					"11:00 am - 8:00 pm\r\n" + 
					"Friday\r\n" + 
					"11:00 am – 2:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"10:00am - 2:00pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("CAVANAUGH'S")) ||
				(location.equalsIgnoreCase("15")))
		{
			System.out.println("This is located on the medical campus.\n"
					+ "The operating hours of this location are:\r"
					+ "Monday - Friday\r\n" + 
					"7:00 am - 4:30 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Da Vinci's")) ||
				(location.equalsIgnoreCase("16")))
		{
			System.out.println("Small coffee shop located in the Evensdale library."
					+ "\nOperating hours:\n"
					+ "Monday – Thursday\r\n" + 
					"8:00 am - 9:00 pm\r\n" + 
					"Friday\r\n" + 
					"8:00 am – 2:00 pm\r\n" + 
					"Saturday & Holidays\r\n" + 
					"Closed\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm - 9:00 pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Park Place")) ||
				(location.equalsIgnoreCase("17")))
		{
			System.out.println("The go to place for Oakland residence that do not want to leave the comfort of their home.\n"
					+ "Operating hours are:\n"
					+ "Monday-Thursday\r\n" + 
					"7am - 9pm\r\n" + 
					"Friday \r\n" + 
					"7am - 7pm\r\n" + 
					"Saturday & Sunday\r\n" + 
					"11am - 7pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Bits & Bytes")) ||
				(location.equalsIgnoreCase("18")))
		{
			System.out.println("Engineers go to for a quick byte to eat.\n"
					+ "Operating hours are:\n"
					+ "Monday – Friday\r\n" + 
					"7:30 am - 4:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Brew 'N Gold Cafe")) ||
				(location.equalsIgnoreCase("19")))
		{
			System.out.println("Towers grab 'n go.\n"
					+ "Monday – Friday\r\n" + 
					"7:00 am - 9:00 pm\r");
			continue;
		}
		
		else if ((location.equalsIgnoreCase("The Greenhouse")) ||
				(location.equalsIgnoreCase("20")))
		{
			System.out.println("Located in the CPASS building over looking the out door rec fields.\n"
					+ "Operating hours are:\n"
					+ "Monday – Friday\r\n" + 
					"8:30 am - 3:00 pm\r");
				continue;
		}
		
		else if ((location.equalsIgnoreCase("Lyon's Den")) ||
				(location.equalsIgnoreCase("21")))
		{
			System.out.println("Evensdale residents late night snack grab.\n"
					+ "Operating hours:\n"
					+ "Sunday – Thursday\r\n" + 
					"7:00 pm - 1:00 am\r\n" + 
					"Friday, Saturday & Holidays\r\n" + 
					"Closed\r");
			   continue;
			}
			
			else if ((location.equalsIgnoreCase("Summit Grab 'N Go")) ||
					(location.equalsIgnoreCase("22")))
			{
				System.out.println("It's in the name.\n"
						+ "Operating hours are:\n"
						+ "Monday – Friday\r\n" + 
						"11 am - 9:00 pm\r\n" + 
						"Saturday, Sunday & Holidays\r\n" + 
						"Closed\r");
				continue;
			}
		
			else if ((location.equalsIgnoreCase("WaterFront Cafe")) ||
					(location.equalsIgnoreCase("23")))
			{
				System.out.println("WaterFront Cafe: Oof the page is litteraly blank. Gj you know this place, it is hidden within this code!\n\r");
			}
			
			else if ((location.equalsIgnoreCase("Eliza's")) ||
					(location.equalsIgnoreCase("24")))
			{
				System.out.println("A quick snack while in the downtown library.\n"
						+ "The time of operation for this location:\n"
						+ "Monday – Wednesday\r\n" + 
						"8:00 am - 12:00 am\r\n" + 
						"Thursday\r\n" + 
						"8:00 am – 9:00 pm\r\n" + 
						"Friday\r\n" + 
						"8:00 am – 2:00 pm\r\n" + 
						"Sunday\r\n" + 
						"3:00 pm - 12:00 am\r");
				continue;
			}
		
		else
		{
			System.out.println("I'm sorry but I do not know that location.\n"
					+ "Please check your spelling.\n"
					+ "Some locations need an exact name for me to understand.\n"
					+ "I also do not know everything,\nso there is a chance that the dude who made me missed a place and ill let him know\n"
					+ "(I actually can not sorry, he doesnt know how to program that).");
		}
	}
	
	System.out.println("Alright, so it seems we are done here. It was nice to meet you " + userName + "!\n"
			+ "If you ever have any more location times you want to know about come back anytime.\n"
			+ "I'll always be here, cause I really got no where else to go.\n"
			+ "Hope you have a great day, this is " + closedBot.nameBot + " signing off!");
	
  }
}


