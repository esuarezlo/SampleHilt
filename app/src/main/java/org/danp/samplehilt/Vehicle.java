package org.danp.samplehilt;

import javax.inject.Inject;


public class Vehicle {

    private Motor motorInf;
    @Inject
    public Vehicle(Motor motor){
        this.motorInf=motor;
    }

    public int getSpeed(){
        return motorInf.getSpeed();
    }
}
