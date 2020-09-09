package cst105.week3.battle;

public class Arena {

	// This is static so no need to create object before calling it
	// To access this method/function from another class, use
	// Arena.titleScreen()
	public static void titleScreen() {
		
		System.out.println("=======================");
		System.out.println("WELCOME TO TODAY'S MAIN EVENT!");
		System.out.println("=======================\n");
	}
	
	// This is static so no need to create object before calling it
	// To access this method/function from another class, use
	// Arena.startScreen()
	public static void startScreen() {
		
		System.out.println("THE BATTLE BEGINS IN ... ");
		
		// Count backwards from 5 to 0
		for (int x = 5; x >=  0; x --) {
			
			// Stay on  the same line for the next iteration
			System.out.print(x + " . . . ");
		}
		
		// end the countdown line and move the cursor to next line
		System.out.println(" BATTLE!\n");
	}
	
	// This is static so no need to create object before calling it
	// To access this method/function from another class, use
	// Arena.endScreen()
	public static void endScreen() {
		
		System.out.println("=======================");
		System.out.println("We have a winner!");
		System.out.println("=======================\n");
		
	}
}
