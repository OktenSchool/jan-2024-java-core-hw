package org.okten.hw3.task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(5),
                new Drum(25),
                new Trumpet(20.0)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
