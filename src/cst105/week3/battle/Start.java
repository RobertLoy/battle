package cst105.week3.battle;

public class Start {

	// Hopefully this "special" method is sinking in!
	public static void main(String[] args) {
		
		// This is call to a static method in another class
		Arena.titleScreen();
		// This is call to a static method in another class
		Arena.startScreen();
		
		// This is call to a static method in this class
		battle();
		
		// This is call to a static method in another class
		Arena.endScreen();
	}
	
	
	public static void battle() {
		// We need Monsters to battle
		// These are NOT static so we need objects created
		Monster m1 = new Monster();
		Monster m2 = new Monster();
		
		// Because each monster is it's own object, they are unique
		// As such we can change it monster's attributes
		m1.name = "Godzilla";
		// Use the static Math class method called random
		// which returns a double between 0 and .99999
		// Multiple it by 100 and add 1000 to get health
		// Also need to convert the double to an int
		// Notice the () grouping
		m1.hp = (int)(Math.random() * 100) + 500;

		m2.name = "Rodan";
		// Use the static Math class method called random
		// which returns a double between 0 and .99999
		// Multiple it by 100 and add 1000 to get health
		// Also need to convert the double to an int
		// Notice the () grouping
		m2.hp = (int)(Math.random() * 100) + 500;
		
		// To keep track of rounds we need counter
		int round = 1;
		
		// Loop through our battle under one of the monsters
		// has hp less than 0.  That means they lost!
		// We use a while loop because we do not know how many 
		// round the battle will take.
		while (m1.hp >= 0 && m2.hp >= 0) {
			
			// Keep track of what ROUND we are in
			// Increment the round number AFTER printing it out
			System.out.println(">> ROUND #" + round++ + " Begin!");
			
			// m1 does some damage
			// Lets get how much damage
			// Also need to convert the double to an int
			// Notice the () grouping
			int dmg1 = (int)(Math.random() * 100);
			System.out.println(m1.name + " does " + dmg1);
			// Subtract the damage from m2
			m2.hp -= dmg1;
			
			// m2 does some damage
			// Lets get how much damage
			// Also need to convert the double to an int
			// Notice the () grouping
			int dmg2 = (int)(Math.random() * 100);
			System.out.println(m2.name + " does " + dmg2);
			// Subtract the damage from m2
			m1.hp -= dmg2;
			
			// Print the health totals remaining
			System.out.println();
			System.out.println("==================");
			System.out.println(m1.name + ": " + m1.hp);
			System.out.println(m2.name + ": " + m2.hp);
			System.out.println("==================");
			System.out.println();
		}
		
		// Print out the winner
		// It is possible BOTH monsters died in the last round
		// so we need to check who is alive.
		if (m1.hp > 0)
			System.out.println(m1.name + " WINS!");
		else if (m2.hp > 0)
			System.out.println(m2.name + " WINS!");
		else
			System.out.println("Both monsters died in battle!");
	}

}
