public class UserInterface {

    
    public static void howManyChest(int nbOfChest) {  
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nWell done, you beat the dragon, now serve yourself among these " + nbOfChest + " chests !\n");
    }
    
    public static void presentYourself(Adventurer adventurer) {  
        
        System.out.println("\n" +"My name is " + adventurer.getName() + ", i belong to the " + adventurer.getClass() + "." + "\n");
    }

    public static void getCurrentGold(Adventurer adventurer) {

        System.out.println("\n" + adventurer.getName() + " has a total of " + adventurer.getGold() + " gold coins !  \\☻/\n" );
    }

    public static void howMuchMoney(Adventurer adventurer, Treasure treasure) {

        System.out.println("\n" + adventurer.getName() + " picked up : " + treasure.getGold() + " gold coins.\n" );
    }
       
    public static void tryAgain(Adventurer adventurer) {

        System.out.println("\n" + adventurer.getName() + " you failed to open the chest !\n" );
        
    }
}
