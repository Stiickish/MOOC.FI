/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class Timer {

    private ClockHand hundredthsSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsSecond.advance();

        if (this.hundredthsSecond.value() == 0) {
            this.seconds.advance();

        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsSecond;
    }
}
