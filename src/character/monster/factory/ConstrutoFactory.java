package character.monster.factory;

import java.util.ArrayList;

import character.monster.Construto;

public class ConstrutoFactory extends MonsterFactory {

	public static Construto getConstruto() {
		int energy = generateEnergy();
		int attack = generateAttack();
		int defense = generateDefense();
		String[] possibleNames = { "Djinn", "Golen", "Gargulá" };
		String name = generateName(possibleNames);
		String land = getLand(name);
		Construto construto = new Construto(name, attack, defense, energy, land);
		
		return construto;
	}

	public static ArrayList<Construto> getMany(int amount){
		ArrayList<Construto> construtos = new ArrayList<Construto>();
		for (int i = 0; i < amount; i++) {
			construtos.add(getConstruto());
		}
		return construtos;
	}

	private static String getLand(String monsterName) {
		switch(monsterName) {
			case "Djinn":
				return "Field";
			default:
				return "Underground";
		}
	}
}
