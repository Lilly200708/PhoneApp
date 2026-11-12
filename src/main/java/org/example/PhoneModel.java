package org.example;

import java.time.LocalTime;

public class PhoneModel implements ITelephone{
    private String number=""; // where we store the phone number. Like the phone's internal memory.

    private PhoneController pc;


    public PhoneModel(PhoneController pc) {
        this.pc = pc;
    }

    public void addDigit(String digit) {
        number=number+digit;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int makeCall(String number) { // this could just use the internal number variable. But we ... have to use the interface so lets pass it as a parameter
        int duration=0;
        if(number.matches("[0-9]+")&&number.length()>7){ // only 'dial' if a valid number
            Caller caller = new Caller(number,duration,pc);
            new Thread(caller).start();
        }else{
            System.out.println(LocalTime.now()+" ... Error");

            System.out.println("test");
        }
        return duration;
    }
}
