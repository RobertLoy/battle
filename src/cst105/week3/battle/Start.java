package cst105.week3.battle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Start {
	
	//Munoz: to hold the type of attacks done in each round that cause HP damage
	static ArrayList <Attack> attacks = new ArrayList<>(); 

	static Scanner sc = new Scanner(System.in);

	// Hopefully this "special" method is sinking in!
	public static void main(String[] args) {

		// This is call to a static method in another class
		Arena.titleScreen();
		// This is call to a static method in another class
		Arena.startScreen();

		// This is call to a static method in this class
		battle();

	}

	public static void battle() {
		// We need Monsters to battle
		// These are NOT static so we need objects created
		
		//Munoz: added monster naming capabilities
		System.out.println("Enter a monsters name to enter the battle, or enter X to have one generated for you");
		String answer1 = sc.nextLine();
		//Munoz: adding attacks to the arraylist
		attacks.add(new Attack("kick", "chest"));
		attacks.add(new Attack("punch", "face"));
		attacks.add(new Attack("round house", "chest"));
		attacks.add(new Attack("kick", "arm"));
		attacks.add(new Attack("punch", "chest"));
		attacks.add(new Attack("round house", "face"));		
		attacks.add(new Attack("sweep", "leg"));
		
		//Munoz: created objects that are yet to be filled with data
		Monster m1 = new Monster(null, 0);
		Monster m2 = new Monster(null, 0);
		
		//Munoz: if, else -- depends on whether the user wants to name monsters or not
		if(answer1.contentEquals("X")|| answer1.contentEquals("x")) {
			m1.setName("Godzilla");
		}
		else {
			m1.setName(answer1);
		}
		
		// Use the static Math class method called random
		// which returns a double between 0 and .99999
		// Multiple it by 100 and add 1000 to get health
		// Also need to convert the double to an int
		// Notice the () grouping
		m1.setHp((int) (Math.random() * 100) + 500);

		System.out.println("Enter the second monsters name to enter the battle, or enter X to have one generated for you");
		String answer2 = sc.nextLine();
		
		if(answer2.contentEquals("X")||answer2.contentEquals("x")) {
			m2.setName("Rodan");
		}
		else {
			m2.setName(answer2);
		}
		// Use the static Math class method called random
		// which returns a double between 0 and .99999
		// Multiple it by 100 and add 1000 to get health
		// Also need to convert the double to an int
		// Notice the () grouping
		m2.setHp((int) (Math.random() * 100) + 500);

		//printout HP levels
		System.out.println("\nPlayer Name:" + m1.getName() + ", Player HP:" + m1.getHp());
		System.out.println("Player Name:" + m2.getName() + ", Player HP:" + m2.getHp() + "\n");
		
		// To keep track of rounds we need counter
		int round = 1;

		// Loop through our battle under one of the monsters
		// has hp less than 0. That means they lost!
		// We use a while loop because we do not know how many
		// round the battle will take.
		while (m1.getHp() >= 0 && m2.getHp() >= 0) {

			// Keep track of what ROUND we are in
			// Increment the round number AFTER printing it out
			System.out.println(">> ROUND #" + round++ + " Begin!");

			// m1 does some damage
			// Lets get how much damage
			// Also need to convert the double to an int
			// Notice the () grouping
			int dmg1 = (int) (Math.random() * 100);
			
			//Munoz: Picks a random number in the arraylist and later uses attacks.get(attackRand1)
			int attackRand1 = (int) (Math.random() * 7);
					//System.out.println(m1.getName() + attacks.get(attackRand1));
			System.out.println(m1.getName() + " does " + attacks.get(attackRand1) + " and does " + dmg1 + " points of damage");
			// Subtract the damage from m2
			m2.setHp(m2.getHp() - dmg1);

			// m2 does some damage -- Lets get how much damage -- Also need to convert the double to an int -- Notice the () grouping
			int attackRand2 = (int) (Math.random() * 7);
					//System.out.println(m2.getName() + attacks.get(attackRand2));
			int dmg2 = (int) (Math.random() * 100);
			System.out.println(m2.getName() + " does " + attacks.get(attackRand2) + " and does " + dmg2 + " points of damage");
			// Subtract the damage from m2
			m1.setHp(m1.getHp() - dmg2);

			// Print the health totals remaining
			System.out.println();
			System.out.println("==================");
			System.out.println(m1.getName() + ": " + m1.getHp());
			System.out.println(m2.getName() + ": " + m2.getHp());
			System.out.println("==================");
			System.out.println();
		}

		// Print out the winner
		// It is possible BOTH monsters died in the last round
		// so we need to check who is alive.
		
		//Munoz: calling the endScreen here will fix the problem of "someone won" and "everyone died" simultaneous sysouts.
		if (m1.getHp() > 0 || m2.getHp() > 0) {
		if (m1.getHp() > 0) {
			Arena.endScreen();
			System.out.println(m1.getName() + " WINS!");
		}
		
		else if (m2.getHp() > 0){
			Arena.endScreen();
			System.out.println(m2.getName() + " WINS!");
			}

		}
		else
			System.out.println("Game is over! Both monsters died in battle!");
	}

}
