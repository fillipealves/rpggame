  package battleField;

import java.util.ArrayList;
import character.Character;
import character.monster.Monster;
import character.witcher.Witcher;
import battleField.BattleFieldFactory;
import battleField.BattleField;


public abstract class BattleField {
	protected ArrayList<Monster> monsterList;
	protected int score;
	protected String land;
	protected Witcher witcher;

	public void battle() {
		int count = 1;
		int vida = this.witcher.getEnergy();
		System.out.println("Bruxo, nome: "+this.witcher.getName()+" Ataque: "+this.witcher.getAttack()+" Defesa: "+this.witcher.getDefense()+" Vida total: "+this.witcher.getEnergy());
		for (Monster monster : monsterList) {
			System.out.println("Monstro, nome: #"+count+" "+monster.getName()+" Ataque: "+monster.getAttack()+" Defesa: "+monster.getDefense()+" Vida total: "+monster.getEnergy());
			while(this.witcher.isAlive() && monster.isAlive()) {
				monster.defense(this.witcher.attack());
				System.out.println(monster.getName()+" ataca "+this.witcher.getName()+", vida restante de "+ this.witcher.getName()+": "+ this.witcher.getEnergy());
				if(this.witcher.isAlive()) {
					this.witcher.defense(monster.attack());
					if (monster.getEnergy() > 0) {
						System.out.println(this.witcher.getName()+" ataca "+monster.getName()+", vida restante do "+ monster.getName()+": "+ monster.getEnergy());
					}else {
						System.out.println(this.witcher.getName()+" ataca "+monster.getName()+", vida restante do "+monster.getName()+": 0");
					}
				}
			}
			if (!this.witcher.isAlive()) {
				System.out.println("\nO Bruxo "+this.witcher.getName()+" morreu!");
				return;

			} else	if (!monster.isAlive() && this.witcher.isAlive() ) {
				System.out.println("\nO Bruxo "+this.witcher.getName()+" venceu!\n");
			}
			count++;
		}
		//Relatorio
		System.out.println("Relatório:\n\nMonstros enfrentados: "+ (count-1)+
						"\nAtaque: "+this.witcher.getAttack()+
						"\nDefesa: "+this.witcher.getDefense()+
						"\nVida total: "+vida+
						"\nVida restante: "+ this.witcher.getEnergy()
				);
		
	}
	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}

	public void setMonsterList(ArrayList<Monster> monsterList) {
		this.monsterList = monsterList;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public Witcher getWitcher() {
		return witcher;
	}

	public void setWitcher(Witcher witcher) {
		this.witcher = witcher;
	}
}
