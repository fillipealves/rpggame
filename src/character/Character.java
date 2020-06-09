package character;

public abstract class Character {
	private String name;
	private int attack;
	private int defense;
	private int energy;

	public abstract void defense(int attackDamage);
	
	public abstract int attack();

	public boolean isAlive() {
		return this.getEnergy() > 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public Character(String name, int attack, int defense, int energy) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.energy = energy;
	}
}
