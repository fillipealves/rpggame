package character.witcher;

import java.util.Random;

import character.Character;

public class Witcher extends Character {
	Weapon leftHand;
	Weapon rightHand;
	Necklace necklace;
	Signal signal;

	public Witcher(String name, int attack, int defense, int energy, Weapon leftHand, Weapon rightHand,
			Necklace necklace, Signal signal) {
		super(name, attack, defense, energy);
		this.leftHand = leftHand;
		this.rightHand = rightHand;
		this.necklace = necklace;
		this.signal = signal;
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
}
