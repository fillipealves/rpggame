package character.monster.factory;

import java.util.ArrayList;

import character.monster.Relictio;

public class RelictioFactory extends MonsterFactory {

	public static Relictio getRelictio() {
		int energy = generateEnergy();
		int attack = generateAttack();
		int defense = generateDefense();
		String[] possibleNames = {"Silvano", "Kernun", "Doppler"};
		String name = generateName(possibleNames);
		String land = getLand(name);
		Relictio relictio = new Relictio(name, attack, defense, energy, land);

		return relictio;
	}

	public static ArrayList<Relictio> getMany(int amount){
		ArrayList<Relictio> relictios = new ArrayList<Relictio>();
		for (int i = 0; i < amount; i++) {
			relictios.add(getRelictio());
		}
		return relictios;
	}

	private static String getLand(String monsterName) {
		switch(monsterName) {
			default:
				return "Forest";
		}
	}
}
