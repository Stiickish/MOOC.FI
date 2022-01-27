/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double result = 0;
        double maxHeartRate = 0;
        maxHeartRate = 206.3 - (0.711 * this.age);

        result = (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return result;
    }
}
