package character.monster.factory;

import java.util.ArrayList;

import character.monster.Necrofalo;

public class NecrofaloFactory extends MonsterFactory {

	public static Necrofalo getNecrofalo() {
		int energy = generateEnergy();
		int attack = generateAttack();
		int defense = generateDefense();
		String[] possibleNames = {"Ghoul", "Necroso", "Nevoloso"};
		String name = generateName(possibleNames);
		String land = getLand(name);
		Necrofalo necrofalo = new Necrofalo(name, attack, defense, energy, land);

		return necrofalo;
	}

	public static ArrayList<Necrofalo> getMany(int amount){
		ArrayList<Necrofalo> necrofalos = new ArrayList<Necrofalo>();
		for (int i = 0; i < amount; i++) {
			necrofalos.add(getNecrofalo());
		}
		return necrofalos;
	}

	private static String getLand(String monsterName) {
		switch(monsterName) {
			case "Ghoul":
				return "Swamp";
			default:
				return "Forest";
		}
	}
}
