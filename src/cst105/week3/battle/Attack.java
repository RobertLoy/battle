package cst105.week3.battle;

public class Attack {
	
	//Munoz: added attack class to make class objects for the game to have more detail
	private String typeOfAttack;
	private String whereAttacked;

	public Attack(String typeOfAttack, String whereAttacked) {
		super();
		this.typeOfAttack = typeOfAttack;
		this.whereAttacked = whereAttacked;
		
	}
	public Attack() {
	}

	public String getTypeOfAttack() {
		return typeOfAttack;
	}

	public void setTypeOfAttack(String typeOfAttack) {
		this.typeOfAttack = typeOfAttack;
	}

	public String getWhereAttacked() {
		return whereAttacked;
	}

	public void setWhereAttacked(String whereAttacked) {
		this.whereAttacked = whereAttacked;
	}

	@Override
	public String toString() {
		return "a " + typeOfAttack + " to the " + whereAttacked;
	}

}
