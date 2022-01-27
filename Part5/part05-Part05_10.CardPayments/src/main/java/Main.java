
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);

        //part2 PaymentTerminal unicafeExactum = new PaymentTerminal();
        //part3 PaymentTerminal unicafeExactum = new PaymentTerminal();
        //part2 double change = unicafeExactum.eatAffordably(10);
        //part2 System.out.println("remaining change " + change);
        //part3 double change = unicafeExactum.eatAffordably(10);
        //part3 System.out.println("remaining change " + change);
        //part3 PaymentCard annesCard = new PaymentCard(7);
        //part3 boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 System.out.println(unicafeExactum);
        //part2 change = unicafeExactum.eatAffordably(5);
        //part2 System.out.println("remaining change " + change);
        //part2 change = unicafeExactum.eatHeartily(4.3);
        //part2 System.out.println("remaining change " + change);
        //part2 System.out.println(unicafeExactum);
        //part1 PaymentCard petesCard = new PaymentCard(10);
        //part1 System.out.println("money " + petesCard.balance());
        //part1 boolean wasSuccessful = petesCard.takeMoney(8);
        //part1 System.out.println("successfully withdrew: " + wasSuccessful);
        //part1 System.out.println("money " + petesCard.balance());
        //part1 wasSuccessful = petesCard.takeMoney(4);
        //part1 System.out.println("successfully withdrew: " + wasSuccessful);
        //part1 System.out.println("money " + petesCard.balance());
    }
}
