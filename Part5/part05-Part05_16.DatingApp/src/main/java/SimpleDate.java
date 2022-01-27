
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
    Implement the method public void advance() that moves the day by one day.
    In this exercise we assume that each month has 30 day. 
     */
    public void advance() {

        if (this.day == 30) { //if day is day 30

            this.day = 1; //Then add 1 day

            if (this.month == 12) { //If month is equal to the 12th month
                this.year = this.year + 1;  //Add 1 year --> reset the year counter
                this.month = 1; //Start at month 1
            } else {
                this.month = this.month + 1; //If month isnt 12th month, then add 1 month
            }

        } else {
            this.day = this.day + 1;
        }

    }

    /*
    Implement the method public void advance(int howManyDays)that moves the date
    by the number of days that is given. Use the method advance() that you
    implemented in the previous section to help you in this. 
     */
    public void advance(int howManyDays) {
        //For loop to run through our parameter howManyDays. 
        //If i is less than howManyDays then it calls the method advance()
        //to increment days
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    /*
    Let's add the possibility to advance time to the SimpleDate class. Create the method
    public SimpleDate afterNumberOfDays(int days) for the class. 
    It creates a new SimpleDate object, whose date is the specified number of
    days greater than the object that the method was called on. You may still 
    assume that each month has 30 days. 
     */
    public SimpleDate afterNumberOfDays(int days) {
        //New SimpleDate object, that takes day,month and year in its parameters
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        //For loop goes through with days from method paramter
        //As long i is less than days, call advance method and return a new date
        for (int i = 0; i < days; i++) {
            newDate.advance();
        }

        return newDate;
    }
}
