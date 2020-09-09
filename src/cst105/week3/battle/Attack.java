package cst105.week3.battle;

public class Attack {
	private String typeOfAttack;
	private String whereAttacked;

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
		return "Attack [typeOfAttack=" + typeOfAttack + ", whereAttacked=" + whereAttacked + "]";
	}
}
