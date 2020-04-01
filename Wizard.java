import java.util.Random;

class Wizard extends Adventurer {
    
    private  int intelligence;

    public Wizard (String name) {
        
        super(name);
        Random randomGenerator = new Random();
        this.intelligence = randomGenerator.nextInt(10);
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    
    @Override
    public boolean open(Treasure treasure) {
        if (treasure.getSpellResistance() >= this.getIntelligence()) {
            return false;
        } else {
            this.setGold(this.getGold() + treasure.getGold());
            return true;
        }
    }
}