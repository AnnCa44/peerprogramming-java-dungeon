import java.util.Random;

class Thief extends Adventurer {

    private int dexterity; 
    
    public Thief(String name) {

        super(name);
        Random randomGenerator = new Random();
        this.dexterity = randomGenerator.nextInt(10); 
    }

    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public boolean open(Treasure treasure) {
        if (treasure.getPickResistance() >= this.getDexterity()) {
            return false;
        } else {
            this.setGold(this.getGold() + treasure.getGold());
            return true;
        }
    }

}