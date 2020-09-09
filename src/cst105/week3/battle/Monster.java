package cst105.week3.battle;

public class Monster {

	// Class level Attributes
	private String name;
	private int hp;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.setHp(hp);
	}
	public Monster() {
	
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
