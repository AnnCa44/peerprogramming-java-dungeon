import java.util.Random;

class Warrior extends Adventurer {

    private int strength; 

    public Warrior (String name) {
        
        super(name);
        Random randomGenerator = new Random();
        this.strength = randomGenerator.nextInt(10);
    }  

    public int getStrength() {

        return strength;
    }

    @Override
    public boolean open(Treasure treasure) {
        if (treasure.getPhysicalResistance() >= this.getStrength()) {
            return false;
        } else {
            this.setGold(this.getGold() + treasure.getGold());
            return true;
        }
    }

}
