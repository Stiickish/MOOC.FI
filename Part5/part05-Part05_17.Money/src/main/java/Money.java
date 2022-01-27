
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        double thisTotal = this.euros + this.cents / 100.0;
        double comparedTotal = compared.euros + compared.cents / 100.0;
        return thisTotal < comparedTotal;
    }

    public Money minus(Money decreaser) {

        int eurosDecreaser = this.euros - decreaser.euros;
        int centsDecreaser = this.cents - decreaser.cents;

        if (centsDecreaser < 0) {
            centsDecreaser = centsDecreaser + 100;
            eurosDecreaser = eurosDecreaser - 1;
        }
        if (eurosDecreaser < 0) { //If below 0, return 0,0. 
            return new Money(0, 0);
        }

        return new Money(eurosDecreaser, centsDecreaser);
    }

}
