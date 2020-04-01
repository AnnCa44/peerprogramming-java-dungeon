abstract class Adventurer {
    

    private String name;
    private int gold;

    public Adventurer(String name) {

        this.name = name;
        this.gold = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int newGold) {
        this.gold = newGold;
    }

    public abstract boolean open(Treasure treasure);
}