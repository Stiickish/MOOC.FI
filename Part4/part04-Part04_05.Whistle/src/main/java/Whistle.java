/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yelon
 */
public class Whistle {      //New class called Whistle

    private String sound;   //Has a private String variabel called sound

    public Whistle(String whistleSound) {   //Constructor of Whistle, with a String whistleSound as parameter
        this.sound = whistleSound;
    }

    public void sound() {       //Class sound, which is void. returns nothing. Only prints the sound
        System.out.println(sound);
    }

}
