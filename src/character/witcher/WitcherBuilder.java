package character.witcher;



public class WitcherBuilder {
	private String name;
	private int attack;
	private int defense;
	private int energy = 100;
	
	Weapon leftHand;
	Weapon rightHand;
	Necklace necklace;
	Signal signal;

	private void setWaeponAttribute(Weapon weapon) {
        if(weapon.getType().equalsIgnoreCase("Sword")) {
        	this.attack += 10;
        	this.defense += 5;
        }
        if(weapon.getType().equalsIgnoreCase("Shield")) {
        	this.defense += 10;
        }
	}

	public WitcherBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
    public WitcherBuilder inLeftHand(Weapon leftHand){
        this.leftHand = leftHand;
        this.setWaeponAttribute(leftHand);
        return this;
    }
    
    public WitcherBuilder inRightHand(Weapon rightHand){
        this.rightHand = rightHand;
        this.setWaeponAttribute(rightHand);
        return this;
    }

    public WitcherBuilder wearingNecklace(Necklace necklace){
        this.necklace = necklace;
        if(this.necklace.getType().equalsIgnoreCase("Healing")) {
        	this.energy += 10;
        }
        if(this.necklace.getType().equalsIgnoreCase("Protection")) {
        	this.attack += Math.round(this.attack * 0.15);
        }
        if(this.necklace.getType().equals("Strength")) {
        	this.attack += Math.round(this.attack * 0.10);
        }
        return this;
    }

    public WitcherBuilder withSignal(Signal signal){
        this.signal = signal;
        
        return this;
    }
    
       public Witcher build(){
    	Witcher witcher = new Witcher(
    			this.name,this.attack,
    			this.defense,
    			this.energy,
    			this.leftHand,
    			this.rightHand,
    			this.necklace,
    			this.signal
    		);
        return witcher;
    }
}
