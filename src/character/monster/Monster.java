package character.monster;

import java.util.Random;

import character.Character;

public abstract class Monster extends Character {
	private String land;

	public Monster(String name, int attack, int defense, int energy, String land) {
		super(name, attack, defense, energy);
		this.land = land;
	}

	@Override
	public void defense(int attackDamage) {
		int realDefense =  Math.round(this.getDefense() * this.getFactor());
		int damage = attackDamage - realDefense;
		if (damage < 0) {
			damage = 0;
		}
		System.out.print(" - Dano "+damage+" - ");
		this.setEnergy(this.getEnergy() - damage);
	}

	@Override
	public int attack() {
		return Math.round(this.getAttack() * this.getFactor());
	}

	private float getFactor() {
		float leftLimit = 0.5F;
	    float rightLimit = 1F;
		float factor = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);
		return factor;
	}
	
	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
	
}
