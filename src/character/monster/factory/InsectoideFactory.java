package character.monster.factory;

import java.util.ArrayList;

import character.monster.Insectoide;

public class InsectoideFactory extends MonsterFactory {

	public static Insectoide getInsectoide() {
		int energy = generateEnergy();
		int attack = generateAttack();
		int defense = generateDefense();
		String[] possibleNames = { "Kikimora", "Harrisi", "Aracno" };
		String name = generateName(possibleNames);
		String land = getLand(name);
		Insectoide insectoide = new Insectoide(name, attack, defense, energy, land);

		return insectoide;
	}

	public static ArrayList<Insectoide> getMany(int amount){
		ArrayList<Insectoide> insectoides = new ArrayList<Insectoide>();
		for (int i = 0; i < amount; i++) {
			insectoides.add(getInsectoide());
		}
		return insectoides;
	}

	private static String getLand(String monsterName) {
		switch(monsterName) {
			case "Harrisi":
				return "Underground";
			default:
				return "Swamp";
		}
	}

}
