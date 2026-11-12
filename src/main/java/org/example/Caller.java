package org.example;

import javafx.concurrent.Task;

import java.time.LocalTime;

public class Caller extends Task {

    private String number;
    private int duration;
    private PhoneController pc;

    public Caller(String number, int duration, PhoneController pc) {
        this.number = number;
        this.duration = duration;
        this.pc = pc;
    }

    @Override
    protected Object call() throws Exception {
        System.out.println(LocalTime.now()+"... Dialling"+number);
        pc.setOnCall();
        duration=3000;
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//faking phone call time
        System.out.println(LocalTime.now()+"... Hanging up");

        return null;
    }
}
