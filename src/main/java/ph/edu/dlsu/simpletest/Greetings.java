/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.simpletest;

/**
 *
 * @author cobalt
 */
public class Greetings {

    String message;

    public void setMorningGreet(String message) {
        this.message = message;
    }

    public String getMorningGreet() {
        return message;
    }

    public void setAfternoonGreet(String message) {
        this.message = message;
    }

    public String getAfternoonGreet() {
        return message;
    }

    public void setNightGreet(String message) {
        this.message = message;
    }

    public String getNightGreet() {
        return message;
    }
}
